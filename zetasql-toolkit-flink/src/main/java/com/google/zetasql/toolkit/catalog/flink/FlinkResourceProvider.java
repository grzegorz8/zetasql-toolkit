package com.google.zetasql.toolkit.catalog.flink;

import com.google.zetasql.SimpleTable;
import java.util.List;

public interface FlinkResourceProvider {
  /**
   * Gets a set of Flink tables or views and returns them as {@link SimpleTable}s
   *
   * @param tableNames The names of the tables that should be retrieved.
   * @return The list of SimpleTables representing the requested Flink tables and views.
   */
  List<SimpleTable> getTables(List<String> tableNames);

  /**
   * Gets a all Flink tables and views in the Flink database and returns them as {@link
   * SimpleTable}s
   *
   * @return The list of SimpleTables representing the Flink tables and views.
   */
  List<SimpleTable> getAllTablesInDatabase();
}
