package com.google.zetasql.toolkit.catalog.flink;

import com.google.zetasql.Constant;
import com.google.zetasql.SimpleCatalog;
import com.google.zetasql.SimpleTable;
import com.google.zetasql.ZetaSQLBuiltinFunctionOptions;
import com.google.zetasql.resolvedast.ResolvedCreateStatementEnums.CreateMode;
import com.google.zetasql.resolvedast.ResolvedCreateStatementEnums.CreateScope;
import com.google.zetasql.toolkit.catalog.CatalogOperations;
import com.google.zetasql.toolkit.catalog.CatalogWrapper;
import com.google.zetasql.toolkit.catalog.FunctionInfo;
import com.google.zetasql.toolkit.catalog.ProcedureInfo;
import com.google.zetasql.toolkit.catalog.TVFInfo;
import com.google.zetasql.toolkit.catalog.options.FlinkLanguageOptions;
import java.util.List;

public class FlinkCatalog implements CatalogWrapper {

  private final FlinkResourceProvider flinkResourceProvider;
  private final SimpleCatalog catalog;

  public FlinkCatalog(FlinkResourceProvider flinkResourceProvider) {
    this.flinkResourceProvider = flinkResourceProvider;
    this.catalog = new SimpleCatalog("catalog");
    this.catalog.addZetaSQLFunctionsAndTypes(
        new ZetaSQLBuiltinFunctionOptions(FlinkLanguageOptions.get()));
    registerTvfsAndUdfs();
    // TODO: Flink built-ins
  }

  private void registerTvfsAndUdfs() {}

  public FlinkCatalog(FlinkResourceProvider flinkResourceProvider, SimpleCatalog catalog) {
    this.flinkResourceProvider = flinkResourceProvider;
    this.catalog = catalog;
  }

  public void addAllTablesInDatabase() {
    this.flinkResourceProvider
        .getAllTablesInDatabase()
        .forEach(
            table ->
                this.register(
                    table, CreateMode.CREATE_OR_REPLACE, CreateScope.CREATE_DEFAULT_SCOPE));
  }

  @Override
  public void register(SimpleTable table, CreateMode createMode, CreateScope createScope) {
    CatalogOperations.createTableInCatalog(this.catalog, table.getFullName(), table, createMode);
  }

  @Override
  public void register(FunctionInfo function, CreateMode createMode, CreateScope createScope) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void register(TVFInfo tvfInfo, CreateMode createMode, CreateScope createScope) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void register(
      ProcedureInfo procedureInfo, CreateMode createMode, CreateScope createScope) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void register(Constant constant) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void removeTable(String table) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void removeFunction(String function) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void removeTVF(String function) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void removeProcedure(String procedure) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void addTables(List<String> tables) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void addFunctions(List<String> functions) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void addTVFs(List<String> functions) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public void addProcedures(List<String> procedures) {
    throw new UnsupportedOperationException("Not supported.");
  }

  @Override
  public FlinkCatalog copy() {
    return new FlinkCatalog(
        this.flinkResourceProvider, CatalogOperations.copyCatalog(this.catalog));
  }

  @Override
  public SimpleCatalog getZetaSQLCatalog() {
    return this.catalog;
  }
}
