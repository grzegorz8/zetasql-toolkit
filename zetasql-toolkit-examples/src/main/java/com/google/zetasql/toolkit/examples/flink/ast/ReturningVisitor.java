package com.google.zetasql.toolkit.examples.flink.ast;

import com.google.zetasql.resolvedast.ResolvedNode;
import com.google.zetasql.resolvedast.ResolvedNodes;

public abstract class ReturningVisitor<T> {

  protected T defaultVisit(ResolvedNode node) {
    throw new UnsupportedOperationException("not implemented");
  }

  public T visit(ResolvedNodes.ResolvedLiteral node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedParameter node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExpressionColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCatalogColumnRef node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedColumnRef node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGroupingSetMultiColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedConstant node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSystemVariable node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedInlineLambda node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSequence node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFilterFieldArg node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFilterField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFunctionCall node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAggregateFunctionCall node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAnalyticFunctionCall node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExtendedCastElement node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExtendedCast node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCast node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedMakeStruct node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedMakeProto node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedMakeProtoField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGetStructField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGetProtoField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGetJsonField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFlatten node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFlattenedArg node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedReplaceFieldItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedReplaceField node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGetProtoOneof node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSubqueryExpr node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWithExpr node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExecuteAsRoleScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedModel node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedConnection node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDescriptor node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSingleRowScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedTableScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedJoinScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedArrayScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedColumnHolder node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFilterScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGroupingCall node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGroupingSet node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRollup node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCube node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAggregateScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAnonymizedAggregateScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDifferentialPrivacyAggregateScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAggregationThresholdAggregateScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetOperationItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetOperationScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedOrderByScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedLimitOffsetScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWithRefScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAnalyticScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSampleScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedComputedColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDeferredComputedColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedOrderByItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedColumnAnnotations node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGeneratedColumnInfo node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedColumnDefaultValue node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedColumnDefinition node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedPrimaryKey node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedForeignKey node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCheckConstraint node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedOutputColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedProjectScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedTVFScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGroupRowsScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFunctionArgument node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExplainStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedQueryStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateDatabaseStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedIndexItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUnnestItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateIndexStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateSchemaStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateExternalSchemaStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateTableAsSelectStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateModelAliasedQuery node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateModelStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWithPartitionColumns node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateSnapshotTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateExternalTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExportModelStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExportDataStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExportMetadataStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDefineTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDescribeStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedShowStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedBeginStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetTransactionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCommitStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRollbackStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedStartBatchStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRunBatchStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAbortBatchStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropMaterializedViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropSnapshotTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRecursiveRefScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRecursionDepthModifier node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRecursiveScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWithScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWithEntry node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedOption node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWindowPartitioning node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWindowOrdering node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWindowFrame node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAnalyticFunctionGroup node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedWindowFrameExpr node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDMLValue node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDMLDefault node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAssertStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAssertRowsModified node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedInsertRow node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedInsertStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDeleteStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUpdateItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUpdateArrayItem node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUpdateStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedMergeWhen node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedMergeStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedTruncateStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedObjectUnit node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedPrivilege node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGrantStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRevokeStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterDatabaseStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterMaterializedViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterApproxViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterSchemaStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterExternalSchemaStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterModelStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterTableStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetOptionsAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterSubEntityAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAddSubEntityAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropSubEntityAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAddColumnAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAddConstraintAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropConstraintAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropPrimaryKeyAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnOptionsAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnDropNotNullAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnDropGeneratedAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnSetDataTypeAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnSetDefaultAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterColumnDropDefaultAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropColumnAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRenameColumnAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetAsAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedSetCollateClause node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterTableSetOptionsStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRenameStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreatePrivilegeRestrictionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateRowAccessPolicyStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropPrivilegeRestrictionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropRowAccessPolicyStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropIndexStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedGrantToAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRestrictToAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAddToRestricteeListAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRemoveFromRestricteeListAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFilterUsingAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRevokeFromAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRenameToAction node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterPrivilegeRestrictionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterRowAccessPolicyStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterAllRowAccessPoliciesStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateConstantStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateFunctionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedArgumentDef node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedArgumentRef node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateTableFunctionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedRelationArgumentScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedArgumentList node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedFunctionSignatureHolder node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropFunctionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedDropTableFunctionStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCallStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedImportStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedModuleStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAggregateHavingModifier node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateMaterializedViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateApproxViewStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateProcedureStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExecuteImmediateArgument node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedExecuteImmediateStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAssignmentStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCreateEntityStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAlterEntityStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedPivotColumn node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedPivotScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedReturningClause node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUnpivotArg node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUnpivotScan node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedCloneDataStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedTableAndColumnInfo node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAnalyzeStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAuxLoadDataPartitionFilter node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedAuxLoadDataStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedUndropStmt node) {
    return defaultVisit(node);
  }

  public T visit(ResolvedNodes.ResolvedIdentityColumnInfo node) {
    return defaultVisit(node);
  }
}
