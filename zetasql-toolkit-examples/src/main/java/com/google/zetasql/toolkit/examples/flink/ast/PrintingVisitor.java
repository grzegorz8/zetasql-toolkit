package com.google.zetasql.toolkit.examples.flink.ast;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import com.google.zetasql.Column;
import com.google.zetasql.Type;
import com.google.zetasql.resolvedast.ResolvedColumn;
import com.google.zetasql.resolvedast.ResolvedNodes;
import java.util.List;

public class PrintingVisitor extends ReturningVisitor<String> {

  private final ValueReturningVisitor<String> visitor = new ValueReturningVisitor<>(this);

  private String visitColumn(ResolvedNodes.ResolvedOutputColumn column) {
    return format("%s AS `%s`", visitColumn(column.getColumn()), column.getName());
  }

  private String visitColumn(ResolvedColumn column) {
    return format("`%s`.`%s`", column.getTableName(), column.getName());
  }

  private String visitColumn(Column column) {
    return format("`%s`", column.getFullName());
  }

  @Override
  public String visit(ResolvedNodes.ResolvedQueryStmt node) {
    // TODO: add pretty printer https://github.com/vertical-blank/sql-formatter
    String selectItems =
        node.getOutputColumnList().stream().map(this::visitColumn).collect(joining(",\n"));
    node.getQuery().accept(visitor);
    String innerQuery = visitor.getReturnValue();

    return "SELECT\n" + selectItems + "\n" + "FROM (\n" + innerQuery + "\n" + ")";
  }

  @Override
  public String visit(ResolvedNodes.ResolvedProjectScan node) {
    // TODO: add pretty printer https://github.com/vertical-blank/sql-formatter
    String selectItems =
        node.getColumnList().stream().map(this::visitColumn).collect(joining(",\n"));
    node.getInputScan().accept(visitor);
    String innerQuery = visitor.getReturnValue();

    return "SELECT\n" + selectItems + "\n" + "FROM (\n" + innerQuery + "\n" + ")";
  }

  @Override
  public String visit(ResolvedNodes.ResolvedFilterScan node) {
    String selectItems =
        node.getColumnList().stream().map(this::visitColumn).collect(joining(",\n"));

    node.getInputScan().accept(visitor);
    String fromPart = visitor.getReturnValue();

    node.getFilterExpr().accept(visitor);
    String filterPart = visitor.getReturnValue();

    return "SELECT\n"
        + selectItems
        + "\n"
        + "FROM (\n"
        + fromPart
        + "\n"
        + ")\n"
        + "WHERE\n"
        + filterPart;
  }

  @Override
  public String visit(ResolvedNodes.ResolvedTableScan node) {
    if (node.getAlias() != null) {
      return format("SELECT * FROM `%s`", node.getTable().getFullName());
    } else {
      return format("SELECT * FROM `%s` AS `%s`", node.getTable().getFullName(), node.getAlias());
    }
  }

  @Override
  public String visit(ResolvedNodes.ResolvedFunctionCall node) {
    // FIXME: resolve fun type
    List<String> argStrings =
        node.getArgumentList().stream()
            .map(
                arg -> {
                  arg.accept(visitor);
                  return visitor.getReturnValue();
                })
            .collect(toList());
    return format("%s <> %s", argStrings.get(0), argStrings.get(1));
  }

  @Override
  public String visit(ResolvedNodes.ResolvedColumnRef node) {
    return visitColumn(node.getColumn());
  }

  @Override
  public String visit(ResolvedNodes.ResolvedCatalogColumnRef node) {
    return visitColumn(node.getColumn());
  }

  @Override
  public String visit(ResolvedNodes.ResolvedLiteral node) {
    Type nodeType = node.getType();
    if (nodeType.isString()) {
      return format("'%s'", node.getValue().getStringValue());
    } else {
      throw new UnsupportedOperationException("not implemented.");
    }
  }
}
