package com.google.zetasql.toolkit.catalog.flink;

import com.google.zetasql.SimpleColumn;
import com.google.zetasql.SimpleTable;
import com.google.zetasql.TypeFactory;
import com.google.zetasql.ZetaSQLType.TypeKind;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlinkResourceProviderImpl implements FlinkResourceProvider {
  @Override
  public List<SimpleTable> getTables(List<String> tableNames) {
    return tableNames.stream()
        .map(
            name ->
                new SimpleTable(
                    name,
                    Arrays.asList(
                        new SimpleColumn(
                            name, "int_col", TypeFactory.createSimpleType(TypeKind.TYPE_INT32)),
                        new SimpleColumn(
                            name,
                            "timestamp_col",
                            TypeFactory.createSimpleType(TypeKind.TYPE_INTERVAL)),
                        new SimpleColumn(
                            name,
                            "string_col",
                            TypeFactory.createSimpleType(TypeKind.TYPE_STRING)))))
        .collect(Collectors.toList());
  }

  @Override
  public List<SimpleTable> getAllTablesInDatabase() {
    return Collections.singletonList(
        new SimpleTable(
            "test",
            Arrays.asList(
                new SimpleColumn(
                    "test", "int_col", TypeFactory.createSimpleType(TypeKind.TYPE_INT32)),
                new SimpleColumn(
                    "test", "timestamp_col", TypeFactory.createSimpleType(TypeKind.TYPE_TIMESTAMP)),
                new SimpleColumn(
                    "test", "string_col", TypeFactory.createSimpleType(TypeKind.TYPE_STRING)))));
  }
}
