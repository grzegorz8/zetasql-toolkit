package com.google.zetasql.toolkit.examples.flink.ast;

import com.google.zetasql.resolvedast.ResolvedNodes;

public class ValueReturningVisitor<T> extends ResolvedNodes.Visitor {

  private final ReturningVisitor<T> visitor;
  private T returnValue;

  public ValueReturningVisitor(ReturningVisitor<T> visitor) {
    this.visitor = visitor;
  }

  public T getReturnValue() {
    return returnValue;
  }

  public void clean() {
    returnValue = null;
  }

  public void visit(ResolvedNodes.ResolvedLiteral node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedParameter node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExpressionColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCatalogColumnRef node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedColumnRef node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGroupingSetMultiColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedConstant node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSystemVariable node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedInlineLambda node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSequence node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFilterFieldArg node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFilterField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFunctionCall node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAggregateFunctionCall node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAnalyticFunctionCall node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExtendedCastElement node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExtendedCast node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCast node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedMakeStruct node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedMakeProto node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedMakeProtoField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGetStructField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGetProtoField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGetJsonField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFlatten node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFlattenedArg node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedReplaceFieldItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedReplaceField node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGetProtoOneof node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSubqueryExpr node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWithExpr node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExecuteAsRoleScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedModel node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedConnection node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDescriptor node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSingleRowScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedTableScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedJoinScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedArrayScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedColumnHolder node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFilterScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGroupingCall node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGroupingSet node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRollup node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCube node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAggregateScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAnonymizedAggregateScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDifferentialPrivacyAggregateScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAggregationThresholdAggregateScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetOperationItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetOperationScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedOrderByScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedLimitOffsetScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWithRefScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAnalyticScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSampleScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedComputedColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDeferredComputedColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedOrderByItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedColumnAnnotations node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGeneratedColumnInfo node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedColumnDefaultValue node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedColumnDefinition node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedPrimaryKey node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedForeignKey node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCheckConstraint node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedOutputColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedProjectScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedTVFScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGroupRowsScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFunctionArgument node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExplainStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedQueryStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateDatabaseStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedIndexItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUnnestItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateIndexStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateSchemaStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateExternalSchemaStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateTableAsSelectStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateModelAliasedQuery node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateModelStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWithPartitionColumns node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateSnapshotTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateExternalTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExportModelStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExportDataStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExportMetadataStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDefineTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDescribeStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedShowStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedBeginStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetTransactionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCommitStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRollbackStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedStartBatchStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRunBatchStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAbortBatchStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropMaterializedViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropSnapshotTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRecursiveRefScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRecursionDepthModifier node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRecursiveScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWithScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWithEntry node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedOption node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWindowPartitioning node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWindowOrdering node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWindowFrame node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAnalyticFunctionGroup node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedWindowFrameExpr node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDMLValue node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDMLDefault node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAssertStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAssertRowsModified node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedInsertRow node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedInsertStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDeleteStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUpdateItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUpdateArrayItem node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUpdateStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedMergeWhen node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedMergeStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedTruncateStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedObjectUnit node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedPrivilege node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGrantStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRevokeStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterDatabaseStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterMaterializedViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterApproxViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterSchemaStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterExternalSchemaStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterModelStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterTableStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetOptionsAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterSubEntityAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAddSubEntityAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropSubEntityAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAddColumnAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAddConstraintAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropConstraintAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropPrimaryKeyAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnOptionsAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnDropNotNullAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnDropGeneratedAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnSetDataTypeAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnSetDefaultAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterColumnDropDefaultAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropColumnAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRenameColumnAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetAsAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedSetCollateClause node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterTableSetOptionsStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRenameStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreatePrivilegeRestrictionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateRowAccessPolicyStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropPrivilegeRestrictionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropRowAccessPolicyStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropIndexStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedGrantToAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRestrictToAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAddToRestricteeListAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRemoveFromRestricteeListAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFilterUsingAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRevokeFromAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRenameToAction node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterPrivilegeRestrictionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterRowAccessPolicyStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterAllRowAccessPoliciesStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateConstantStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateFunctionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedArgumentDef node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedArgumentRef node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateTableFunctionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedRelationArgumentScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedArgumentList node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedFunctionSignatureHolder node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropFunctionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedDropTableFunctionStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCallStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedImportStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedModuleStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAggregateHavingModifier node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateMaterializedViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateApproxViewStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateProcedureStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExecuteImmediateArgument node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedExecuteImmediateStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAssignmentStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCreateEntityStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAlterEntityStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedPivotColumn node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedPivotScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedReturningClause node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUnpivotArg node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUnpivotScan node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedCloneDataStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedTableAndColumnInfo node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAnalyzeStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAuxLoadDataPartitionFilter node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedAuxLoadDataStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedUndropStmt node) {
    this.returnValue = visitor.visit(node);
  }

  public void visit(ResolvedNodes.ResolvedIdentityColumnInfo node) {
    this.returnValue = visitor.visit(node);
  }
}
