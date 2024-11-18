package com.google.zetasql.toolkit.examples.flink;

import com.google.zetasql.AnalyzerOptions;
import com.google.zetasql.LanguageOptions;
import com.google.zetasql.toolkit.AnalyzedStatement;
import com.google.zetasql.toolkit.ZetaSQLToolkitAnalyzer;
import com.google.zetasql.toolkit.catalog.flink.FlinkCatalog;
import com.google.zetasql.toolkit.catalog.flink.FlinkResourceProviderImpl;
import com.google.zetasql.toolkit.examples.flink.ast.PrintingVisitor;
import com.google.zetasql.toolkit.examples.flink.ast.ValueReturningVisitor;
import java.util.Iterator;

public class TestFlink {

  public static void main(String[] args) {
    String query = "SELECT int_col FROM test WHERE string_col != 'Dummy value';";
    //    String query = "FROM test |> WHERE string_col != 'Dummy value';";
    System.out.printf("ZetaSQL query: " + query);
    FlinkCatalog catalog = new FlinkCatalog(new FlinkResourceProviderImpl());

    catalog.addAllTablesInDatabase();

    // Step 4: Define the LanguageOptions and AnalyzerOptions to configure the ZetaSQL analyzer
    //
    // LanguageOptions are ZetaSQL's way of customizing the SQL dialect the analyzer accepts.
    // This toolkit includes properly configured LanguageOptions for Cloud Spanner.
    //
    // AnalyzerOptions are ZetaSQL's way of customizing the analyzer itself
    // Usually, setting the LanguageOptions is the only configuration required; but they can
    // be customized for more advanced use cases.
    LanguageOptions languageOptions = new LanguageOptions().enableMaximumLanguageFeatures();
    languageOptions.setSupportsAllStatementKinds();
    AnalyzerOptions analyzerOptions = new AnalyzerOptions();
    analyzerOptions.setLanguageOptions(languageOptions);

    // Step 5: Run the analysis
    ZetaSQLToolkitAnalyzer analyzer = new ZetaSQLToolkitAnalyzer(analyzerOptions);
    Iterator<AnalyzedStatement> analyzedStatements = analyzer.analyzeStatements(query, catalog);
    analyzedStatements.forEachRemaining(
        statement -> statement.getResolvedStatement().ifPresent(System.out::println));

    ValueReturningVisitor<String> result = new ValueReturningVisitor<>(new PrintingVisitor());
    analyzer.analyzeStatements(query, catalog).next().getResolvedStatement().get().accept(result);
    System.out.println(result.getReturnValue());
  }
}
