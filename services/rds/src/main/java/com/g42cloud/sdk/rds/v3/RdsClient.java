package com.g42cloud.sdk.rds.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.rds.v3.model.AllowDbPrivilegeRequest;
import com.g42cloud.sdk.rds.v3.model.AllowDbPrivilegeResponse;
import com.g42cloud.sdk.rds.v3.model.AllowDbUserPrivilegeRequest;
import com.g42cloud.sdk.rds.v3.model.AllowDbUserPrivilegeResponse;
import com.g42cloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeRequest;
import com.g42cloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeResponse;
import com.g42cloud.sdk.rds.v3.model.ApplyConfigurationAsyncRequest;
import com.g42cloud.sdk.rds.v3.model.ApplyConfigurationAsyncResponse;
import com.g42cloud.sdk.rds.v3.model.AttachEipRequest;
import com.g42cloud.sdk.rds.v3.model.AttachEipResponse;
import com.g42cloud.sdk.rds.v3.model.BatchTagAddActionRequest;
import com.g42cloud.sdk.rds.v3.model.BatchTagAddActionResponse;
import com.g42cloud.sdk.rds.v3.model.BatchTagDelActionRequest;
import com.g42cloud.sdk.rds.v3.model.BatchTagDelActionResponse;
import com.g42cloud.sdk.rds.v3.model.ChangeFailoverModeRequest;
import com.g42cloud.sdk.rds.v3.model.ChangeFailoverModeResponse;
import com.g42cloud.sdk.rds.v3.model.ChangeFailoverStrategyRequest;
import com.g42cloud.sdk.rds.v3.model.ChangeFailoverStrategyResponse;
import com.g42cloud.sdk.rds.v3.model.ChangeOpsWindowRequest;
import com.g42cloud.sdk.rds.v3.model.ChangeOpsWindowResponse;
import com.g42cloud.sdk.rds.v3.model.ChangeProxyScaleRequest;
import com.g42cloud.sdk.rds.v3.model.ChangeProxyScaleResponse;
import com.g42cloud.sdk.rds.v3.model.ChangeTheDelayThresholdRequest;
import com.g42cloud.sdk.rds.v3.model.ChangeTheDelayThresholdResponse;
import com.g42cloud.sdk.rds.v3.model.CreateConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.CreateConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.CreateDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.CreateDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.CreateDbUserRequest;
import com.g42cloud.sdk.rds.v3.model.CreateDbUserResponse;
import com.g42cloud.sdk.rds.v3.model.CreateDnsNameRequest;
import com.g42cloud.sdk.rds.v3.model.CreateDnsNameResponse;
import com.g42cloud.sdk.rds.v3.model.CreateInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.CreateInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.CreateManualBackupRequest;
import com.g42cloud.sdk.rds.v3.model.CreateManualBackupResponse;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaRequest;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaResponse;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDbUserRequest;
import com.g42cloud.sdk.rds.v3.model.CreatePostgresqlDbUserResponse;
import com.g42cloud.sdk.rds.v3.model.CreateRestoreInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.CreateRestoreInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.CreateSqlserverDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.CreateSqlserverDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.CreateSqlserverDbUserRequest;
import com.g42cloud.sdk.rds.v3.model.CreateSqlserverDbUserResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteDbUserRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteDbUserResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteManualBackupRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteManualBackupResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDbUserRequest;
import com.g42cloud.sdk.rds.v3.model.DeleteSqlserverDbUserResponse;
import com.g42cloud.sdk.rds.v3.model.DownloadSlowlogRequest;
import com.g42cloud.sdk.rds.v3.model.DownloadSlowlogResponse;
import com.g42cloud.sdk.rds.v3.model.EnableConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.EnableConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.ListApiVersionNewRequest;
import com.g42cloud.sdk.rds.v3.model.ListApiVersionNewResponse;
import com.g42cloud.sdk.rds.v3.model.ListApiVersionRequest;
import com.g42cloud.sdk.rds.v3.model.ListApiVersionResponse;
import com.g42cloud.sdk.rds.v3.model.ListAuditlogsRequest;
import com.g42cloud.sdk.rds.v3.model.ListAuditlogsResponse;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedDatabasesRequest;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedDatabasesResponse;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedDbUsersRequest;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedDbUsersResponse;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersRequest;
import com.g42cloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersResponse;
import com.g42cloud.sdk.rds.v3.model.ListBackupsRequest;
import com.g42cloud.sdk.rds.v3.model.ListBackupsResponse;
import com.g42cloud.sdk.rds.v3.model.ListCollationsRequest;
import com.g42cloud.sdk.rds.v3.model.ListCollationsResponse;
import com.g42cloud.sdk.rds.v3.model.ListConfigurationsRequest;
import com.g42cloud.sdk.rds.v3.model.ListConfigurationsResponse;
import com.g42cloud.sdk.rds.v3.model.ListDatabasesRequest;
import com.g42cloud.sdk.rds.v3.model.ListDatabasesResponse;
import com.g42cloud.sdk.rds.v3.model.ListDatastoresRequest;
import com.g42cloud.sdk.rds.v3.model.ListDatastoresResponse;
import com.g42cloud.sdk.rds.v3.model.ListDbUsersRequest;
import com.g42cloud.sdk.rds.v3.model.ListDbUsersResponse;
import com.g42cloud.sdk.rds.v3.model.ListErrorLogsNewRequest;
import com.g42cloud.sdk.rds.v3.model.ListErrorLogsNewResponse;
import com.g42cloud.sdk.rds.v3.model.ListErrorLogsRequest;
import com.g42cloud.sdk.rds.v3.model.ListErrorLogsResponse;
import com.g42cloud.sdk.rds.v3.model.ListFlavorsRequest;
import com.g42cloud.sdk.rds.v3.model.ListFlavorsResponse;
import com.g42cloud.sdk.rds.v3.model.ListInstancesRequest;
import com.g42cloud.sdk.rds.v3.model.ListInstancesResponse;
import com.g42cloud.sdk.rds.v3.model.ListJobInfoDetailRequest;
import com.g42cloud.sdk.rds.v3.model.ListJobInfoDetailResponse;
import com.g42cloud.sdk.rds.v3.model.ListJobInfoRequest;
import com.g42cloud.sdk.rds.v3.model.ListJobInfoResponse;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteBackupsRequest;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteBackupsResponse;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteInstancesRequest;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteInstancesResponse;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteRestoreTimesRequest;
import com.g42cloud.sdk.rds.v3.model.ListOffSiteRestoreTimesResponse;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasRequest;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasResponse;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDatabasesRequest;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDatabasesResponse;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedRequest;
import com.g42cloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedResponse;
import com.g42cloud.sdk.rds.v3.model.ListProjectTagsRequest;
import com.g42cloud.sdk.rds.v3.model.ListProjectTagsResponse;
import com.g42cloud.sdk.rds.v3.model.ListRestoreTimesRequest;
import com.g42cloud.sdk.rds.v3.model.ListRestoreTimesResponse;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogFileRequest;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogFileResponse;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogsNewRequest;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogsNewResponse;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogsRequest;
import com.g42cloud.sdk.rds.v3.model.ListSlowLogsResponse;
import com.g42cloud.sdk.rds.v3.model.ListSlowlogStatisticsRequest;
import com.g42cloud.sdk.rds.v3.model.ListSlowlogStatisticsResponse;
import com.g42cloud.sdk.rds.v3.model.ListSqlserverDatabasesRequest;
import com.g42cloud.sdk.rds.v3.model.ListSqlserverDatabasesResponse;
import com.g42cloud.sdk.rds.v3.model.ListSqlserverDbUsersRequest;
import com.g42cloud.sdk.rds.v3.model.ListSqlserverDbUsersResponse;
import com.g42cloud.sdk.rds.v3.model.ListStorageTypesRequest;
import com.g42cloud.sdk.rds.v3.model.ListStorageTypesResponse;
import com.g42cloud.sdk.rds.v3.model.MigrateFollowerRequest;
import com.g42cloud.sdk.rds.v3.model.MigrateFollowerResponse;
import com.g42cloud.sdk.rds.v3.model.ResetPwdRequest;
import com.g42cloud.sdk.rds.v3.model.ResetPwdResponse;
import com.g42cloud.sdk.rds.v3.model.RestoreExistInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.RestoreExistInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.RestoreTablesRequest;
import com.g42cloud.sdk.rds.v3.model.RestoreTablesResponse;
import com.g42cloud.sdk.rds.v3.model.RestoreToExistingInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.RestoreToExistingInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.RevokeRequest;
import com.g42cloud.sdk.rds.v3.model.RevokeResponse;
import com.g42cloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeRequest;
import com.g42cloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeResponse;
import com.g42cloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsRequest;
import com.g42cloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsResponse;
import com.g42cloud.sdk.rds.v3.model.SearchQueryScaleFlavorsRequest;
import com.g42cloud.sdk.rds.v3.model.SearchQueryScaleFlavorsResponse;
import com.g42cloud.sdk.rds.v3.model.SetAuditlogPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.SetAuditlogPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.SetBackupPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.SetBackupPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.SetBinlogClearPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.SetBinlogClearPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.SetDbUserPwdRequest;
import com.g42cloud.sdk.rds.v3.model.SetDbUserPwdResponse;
import com.g42cloud.sdk.rds.v3.model.SetOffSiteBackupPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.SetOffSiteBackupPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdRequest;
import com.g42cloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdResponse;
import com.g42cloud.sdk.rds.v3.model.SetSecurityGroupRequest;
import com.g42cloud.sdk.rds.v3.model.SetSecurityGroupResponse;
import com.g42cloud.sdk.rds.v3.model.ShowApiVersionRequest;
import com.g42cloud.sdk.rds.v3.model.ShowApiVersionResponse;
import com.g42cloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkRequest;
import com.g42cloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkResponse;
import com.g42cloud.sdk.rds.v3.model.ShowAuditlogPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.ShowAuditlogPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.ShowBackupDownloadLinkRequest;
import com.g42cloud.sdk.rds.v3.model.ShowBackupDownloadLinkResponse;
import com.g42cloud.sdk.rds.v3.model.ShowBackupPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.ShowBackupPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.ShowBinlogClearPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.ShowBinlogClearPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.ShowConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.ShowConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.ShowDrReplicaStatusRequest;
import com.g42cloud.sdk.rds.v3.model.ShowDrReplicaStatusResponse;
import com.g42cloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyRequest;
import com.g42cloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyResponse;
import com.g42cloud.sdk.rds.v3.model.ShowInstanceConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.ShowInstanceConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyRequest;
import com.g42cloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyResponse;
import com.g42cloud.sdk.rds.v3.model.ShowQuotasRequest;
import com.g42cloud.sdk.rds.v3.model.ShowQuotasResponse;
import com.g42cloud.sdk.rds.v3.model.StartDatabaseProxyRequest;
import com.g42cloud.sdk.rds.v3.model.StartDatabaseProxyResponse;
import com.g42cloud.sdk.rds.v3.model.StartFailoverRequest;
import com.g42cloud.sdk.rds.v3.model.StartFailoverResponse;
import com.g42cloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionRequest;
import com.g42cloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionResponse;
import com.g42cloud.sdk.rds.v3.model.StartInstanceRestartActionRequest;
import com.g42cloud.sdk.rds.v3.model.StartInstanceRestartActionResponse;
import com.g42cloud.sdk.rds.v3.model.StartInstanceSingleToHaActionRequest;
import com.g42cloud.sdk.rds.v3.model.StartInstanceSingleToHaActionResponse;
import com.g42cloud.sdk.rds.v3.model.StartRecyclePolicyRequest;
import com.g42cloud.sdk.rds.v3.model.StartRecyclePolicyResponse;
import com.g42cloud.sdk.rds.v3.model.StartResizeFlavorActionRequest;
import com.g42cloud.sdk.rds.v3.model.StartResizeFlavorActionResponse;
import com.g42cloud.sdk.rds.v3.model.StartupInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.StartupInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.StopDatabaseProxyRequest;
import com.g42cloud.sdk.rds.v3.model.StopDatabaseProxyResponse;
import com.g42cloud.sdk.rds.v3.model.StopInstanceRequest;
import com.g42cloud.sdk.rds.v3.model.StopInstanceResponse;
import com.g42cloud.sdk.rds.v3.model.SwitchSslRequest;
import com.g42cloud.sdk.rds.v3.model.SwitchSslResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateDataIpRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateDataIpResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateDatabaseRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateDatabaseResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateDnsNameRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateDnsNameResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceConfigurationRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceConfigurationResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceNameRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateInstanceNameResponse;
import com.g42cloud.sdk.rds.v3.model.UpdatePortRequest;
import com.g42cloud.sdk.rds.v3.model.UpdatePortResponse;
import com.g42cloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasRequest;
import com.g42cloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasResponse;
import com.g42cloud.sdk.rds.v3.model.UpdateReadWeightRequest;
import com.g42cloud.sdk.rds.v3.model.UpdateReadWeightResponse;
import com.g42cloud.sdk.rds.v3.model.UpgradeDbVersionRequest;
import com.g42cloud.sdk.rds.v3.model.UpgradeDbVersionResponse;

public class RdsClient {

    protected HcClient hcClient;

    public RdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsClient> newBuilder() {
        ClientBuilder<RdsClient> clientBuilder = new ClientBuilder<>(RdsClient::new);
        return clientBuilder;
    }

    public ApplyConfigurationAsyncResponse applyConfigurationAsync(ApplyConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    public SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>(request,
            RdsMeta.applyConfigurationAsync, hcClient);
    }

    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.attachEip);
    }

    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    public BatchTagAddActionResponse batchTagAddAction(BatchTagAddActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    public SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionInvoker(
        BatchTagAddActionRequest request) {
        return new SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction,
            hcClient);
    }

    public BatchTagDelActionResponse batchTagDelAction(BatchTagDelActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    public SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionInvoker(
        BatchTagDelActionRequest request) {
        return new SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction,
            hcClient);
    }

    public ChangeFailoverModeResponse changeFailoverMode(ChangeFailoverModeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    public SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeInvoker(
        ChangeFailoverModeRequest request) {
        return new SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request,
            RdsMeta.changeFailoverMode, hcClient);
    }

    public ChangeFailoverStrategyResponse changeFailoverStrategy(ChangeFailoverStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    public SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyInvoker(
        ChangeFailoverStrategyRequest request) {
        return new SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request,
            RdsMeta.changeFailoverStrategy, hcClient);
    }

    public ChangeOpsWindowResponse changeOpsWindow(ChangeOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(
        ChangeOpsWindowRequest request) {
        return new SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow,
            hcClient);
    }

    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            RdsMeta.createConfiguration, hcClient);
    }

    public CreateDnsNameResponse createDnsName(CreateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDnsName);
    }

    public SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameInvoker(CreateDnsNameRequest request) {
        return new SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createInstance);
    }

    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance,
            hcClient);
    }

    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            RdsMeta.createManualBackup, hcClient);
    }

    public CreateRestoreInstanceResponse createRestoreInstance(CreateRestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    public SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceInvoker(
        CreateRestoreInstanceRequest request) {
        return new SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request,
            RdsMeta.createRestoreInstance, hcClient);
    }

    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            RdsMeta.deleteConfiguration, hcClient);
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance,
            hcClient);
    }

    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            RdsMeta.deleteManualBackup, hcClient);
    }

    public DownloadSlowlogResponse downloadSlowlog(DownloadSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(
        DownloadSlowlogRequest request) {
        return new SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog,
            hcClient);
    }

    public EnableConfigurationResponse enableConfiguration(EnableConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    public SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationInvoker(
        EnableConfigurationRequest request) {
        return new SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request,
            RdsMeta.enableConfiguration, hcClient);
    }

    public ListAuditlogsResponse listAuditlogs(ListAuditlogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listBackups);
    }

    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    public ListCollationsResponse listCollations(ListCollationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listCollations);
    }

    public SyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsInvoker(
        ListCollationsRequest request) {
        return new SyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations,
            hcClient);
    }

    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            RdsMeta.listConfigurations, hcClient);
    }

    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatastores);
    }

    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores,
            hcClient);
    }

    public ListErrorLogsResponse listErrorLogs(ListErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    public ListErrorLogsNewResponse listErrorLogsNew(ListErrorLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    public SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewInvoker(
        ListErrorLogsNewRequest request) {
        return new SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>(request, RdsMeta.listErrorLogsNew,
            hcClient);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listFlavors);
    }

    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstances);
    }

    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    public ListJobInfoResponse listJobInfo(ListJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    public SyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoInvoker(ListJobInfoRequest request) {
        return new SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    public ListJobInfoDetailResponse listJobInfoDetail(ListJobInfoDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    public SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailInvoker(
        ListJobInfoDetailRequest request) {
        return new SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail,
            hcClient);
    }

    public ListOffSiteBackupsResponse listOffSiteBackups(ListOffSiteBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    public SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsInvoker(
        ListOffSiteBackupsRequest request) {
        return new SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request,
            RdsMeta.listOffSiteBackups, hcClient);
    }

    public ListOffSiteInstancesResponse listOffSiteInstances(ListOffSiteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    public SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesInvoker(
        ListOffSiteInstancesRequest request) {
        return new SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request,
            RdsMeta.listOffSiteInstances, hcClient);
    }

    public ListOffSiteRestoreTimesResponse listOffSiteRestoreTimes(ListOffSiteRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    public SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request,
            RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags,
            hcClient);
    }

    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes,
            hcClient);
    }

    public ListSlowLogFileResponse listSlowLogFile(ListSlowLogFileRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    public SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileInvoker(
        ListSlowLogFileRequest request) {
        return new SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>(request, RdsMeta.listSlowLogFile,
            hcClient);
    }

    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    public ListSlowLogsNewResponse listSlowLogsNew(ListSlowLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    public SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewInvoker(
        ListSlowLogsNewRequest request) {
        return new SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>(request, RdsMeta.listSlowLogsNew,
            hcClient);
    }

    public ListSlowlogStatisticsResponse listSlowlogStatistics(ListSlowlogStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    public SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsInvoker(
        ListSlowlogStatisticsRequest request) {
        return new SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request,
            RdsMeta.listSlowlogStatistics, hcClient);
    }

    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes,
            hcClient);
    }

    public MigrateFollowerResponse migrateFollower(MigrateFollowerRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    public SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerInvoker(
        MigrateFollowerRequest request) {
        return new SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower,
            hcClient);
    }

    public RestoreExistInstanceResponse restoreExistInstance(RestoreExistInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    public SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceInvoker(
        RestoreExistInstanceRequest request) {
        return new SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>(request,
            RdsMeta.restoreExistInstance, hcClient);
    }

    public RestoreTablesResponse restoreTables(RestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreTables);
    }

    public SyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesInvoker(RestoreTablesRequest request) {
        return new SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    public RestoreToExistingInstanceResponse restoreToExistingInstance(RestoreToExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    public SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceInvoker(
        RestoreToExistingInstanceRequest request) {
        return new SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request,
            RdsMeta.restoreToExistingInstance, hcClient);
    }

    public SetAuditlogPolicyResponse setAuditlogPolicy(SetAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(
        SetAuditlogPolicyRequest request) {
        return new SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy,
            hcClient);
    }

    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy,
            hcClient);
    }

    public SetBinlogClearPolicyResponse setBinlogClearPolicy(SetBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    public SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyInvoker(
        SetBinlogClearPolicyRequest request) {
        return new SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>(request,
            RdsMeta.setBinlogClearPolicy, hcClient);
    }

    public SetOffSiteBackupPolicyResponse setOffSiteBackupPolicy(SetOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    public SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request,
            RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    public SetSecurityGroupResponse setSecurityGroup(SetSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    public SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupInvoker(
        SetSecurityGroupRequest request) {
        return new SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup,
            hcClient);
    }

    public ShowAuditlogDownloadLinkResponse showAuditlogDownloadLink(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    public SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request,
            RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    public ShowAuditlogPolicyResponse showAuditlogPolicy(ShowAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(
        ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            RdsMeta.showAuditlogPolicy, hcClient);
    }

    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            RdsMeta.showBackupDownloadLink, hcClient);
    }

    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy,
            hcClient);
    }

    public ShowBinlogClearPolicyResponse showBinlogClearPolicy(ShowBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    public SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>(request,
            RdsMeta.showBinlogClearPolicy, hcClient);
    }

    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(
        ShowConfigurationRequest request) {
        return new SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration,
            hcClient);
    }

    public ShowDrReplicaStatusResponse showDrReplicaStatus(ShowDrReplicaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    public SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusInvoker(
        ShowDrReplicaStatusRequest request) {
        return new SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>(request,
            RdsMeta.showDrReplicaStatus, hcClient);
    }

    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            RdsMeta.showInstanceConfiguration, hcClient);
    }

    public ShowOffSiteBackupPolicyResponse showOffSiteBackupPolicy(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    public SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request,
            RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showQuotas);
    }

    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    public StartFailoverResponse startFailover(StartFailoverRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startFailover);
    }

    public SyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverInvoker(StartFailoverRequest request) {
        return new SyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    public StartInstanceEnlargeVolumeActionResponse startInstanceEnlargeVolumeAction(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    public SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(
            request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    public StartInstanceRestartActionResponse startInstanceRestartAction(StartInstanceRestartActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    public SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionInvoker(
        StartInstanceRestartActionRequest request) {
        return new SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request,
            RdsMeta.startInstanceRestartAction, hcClient);
    }

    public StartInstanceSingleToHaActionResponse startInstanceSingleToHaAction(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    public SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request,
            RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    public StartRecyclePolicyResponse startRecyclePolicy(StartRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    public SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyInvoker(
        StartRecyclePolicyRequest request) {
        return new SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request,
            RdsMeta.startRecyclePolicy, hcClient);
    }

    public StartResizeFlavorActionResponse startResizeFlavorAction(StartResizeFlavorActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    public SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionInvoker(
        StartResizeFlavorActionRequest request) {
        return new SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request,
            RdsMeta.startResizeFlavorAction, hcClient);
    }

    public StartupInstanceResponse startupInstance(StartupInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startupInstance);
    }

    public SyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceInvoker(
        StartupInstanceRequest request) {
        return new SyncInvoker<StartupInstanceRequest, StartupInstanceResponse>(request, RdsMeta.startupInstance,
            hcClient);
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopInstance);
    }

    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, RdsMeta.stopInstance, hcClient);
    }

    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.switchSsl);
    }

    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            RdsMeta.updateConfiguration, hcClient);
    }

    public UpdateDataIpResponse updateDataIp(UpdateDataIpRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    public SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpInvoker(UpdateDataIpRequest request) {
        return new SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    public UpdateDnsNameResponse updateDnsName(UpdateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    public SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameInvoker(UpdateDnsNameRequest request) {
        return new SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            RdsMeta.updateInstanceConfiguration, hcClient);
    }

    public UpdateInstanceConfigurationAsyncResponse updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    public SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>(
            request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
    }

    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            RdsMeta.updateInstanceName, hcClient);
    }

    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePort);
    }

    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    public UpdatePostgresqlInstanceAliasResponse updatePostgresqlInstanceAlias(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    public SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request,
            RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    public UpgradeDbVersionResponse upgradeDbVersion(UpgradeDbVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    public SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionInvoker(
        UpgradeDbVersionRequest request) {
        return new SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request, RdsMeta.upgradeDbVersion,
            hcClient);
    }

    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, RdsMeta.listApiVersion,
            hcClient);
    }

    public ListApiVersionNewResponse listApiVersionNew(ListApiVersionNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    public SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewInvoker(
        ListApiVersionNewRequest request) {
        return new SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>(request, RdsMeta.listApiVersionNew,
            hcClient);
    }

    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, RdsMeta.showApiVersion,
            hcClient);
    }

    public AllowDbUserPrivilegeResponse allowDbUserPrivilege(AllowDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    public SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request,
            RdsMeta.allowDbUserPrivilege, hcClient);
    }

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDatabase);
    }

    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase,
            hcClient);
    }

    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDbUser);
    }

    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase,
            hcClient);
    }

    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    public ListAuthorizedDatabasesResponse listAuthorizedDatabases(ListAuthorizedDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    public SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request,
            RdsMeta.listAuthorizedDatabases, hcClient);
    }

    public ListAuthorizedDbUsersResponse listAuthorizedDbUsers(ListAuthorizedDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    public SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request,
            RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatabases);
    }

    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.resetPwd);
    }

    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    public RevokeResponse revoke(RevokeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revoke);
    }

    public SyncInvoker<RevokeRequest, RevokeResponse> revokeInvoker(RevokeRequest request) {
        return new SyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    public SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseInvoker(
        UpdateDatabaseRequest request) {
        return new SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, RdsMeta.updateDatabase,
            hcClient);
    }

    public AllowDbPrivilegeResponse allowDbPrivilege(AllowDbPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    public SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeInvoker(
        AllowDbPrivilegeRequest request) {
        return new SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege,
            hcClient);
    }

    public ChangeProxyScaleResponse changeProxyScale(ChangeProxyScaleRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    public SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleInvoker(
        ChangeProxyScaleRequest request) {
        return new SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>(request, RdsMeta.changeProxyScale,
            hcClient);
    }

    public ChangeTheDelayThresholdResponse changeTheDelayThreshold(ChangeTheDelayThresholdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    public SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>(request,
            RdsMeta.changeTheDelayThreshold, hcClient);
    }

    public CreatePostgresqlDatabaseResponse createPostgresqlDatabase(CreatePostgresqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    public SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request,
            RdsMeta.createPostgresqlDatabase, hcClient);
    }

    public CreatePostgresqlDatabaseSchemaResponse createPostgresqlDatabaseSchema(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    public SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request,
            RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    public CreatePostgresqlDbUserResponse createPostgresqlDbUser(CreatePostgresqlDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    public SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request,
            RdsMeta.createPostgresqlDbUser, hcClient);
    }

    public ListPostgresqlDatabaseSchemasResponse listPostgresqlDatabaseSchemas(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    public SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request,
            RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    public ListPostgresqlDatabasesResponse listPostgresqlDatabases(ListPostgresqlDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    public SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request,
            RdsMeta.listPostgresqlDatabases, hcClient);
    }

    public ListPostgresqlDbUserPaginatedResponse listPostgresqlDbUserPaginated(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    public SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request,
            RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    public SearchQueryScaleComputeFlavorsResponse searchQueryScaleComputeFlavors(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    public SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>(request,
            RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    public SearchQueryScaleFlavorsResponse searchQueryScaleFlavors(SearchQueryScaleFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    public SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>(request,
            RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    public SetPostgresqlDbUserPwdResponse setPostgresqlDbUserPwd(SetPostgresqlDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    public SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request,
            RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    public ShowInformationAboutDatabaseProxyResponse showInformationAboutDatabaseProxy(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    public SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>(
            request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    public StartDatabaseProxyResponse startDatabaseProxy(StartDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    public SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyInvoker(
        StartDatabaseProxyRequest request) {
        return new SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>(request,
            RdsMeta.startDatabaseProxy, hcClient);
    }

    public StopDatabaseProxyResponse stopDatabaseProxy(StopDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    public SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyInvoker(
        StopDatabaseProxyRequest request) {
        return new SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>(request, RdsMeta.stopDatabaseProxy,
            hcClient);
    }

    public UpdateReadWeightResponse updateReadWeight(UpdateReadWeightRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    public SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightInvoker(
        UpdateReadWeightRequest request) {
        return new SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>(request, RdsMeta.updateReadWeight,
            hcClient);
    }

    public AllowSqlserverDbUserPrivilegeResponse allowSqlserverDbUserPrivilege(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    public SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    public CreateSqlserverDatabaseResponse createSqlserverDatabase(CreateSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    public SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request,
            RdsMeta.createSqlserverDatabase, hcClient);
    }

    public CreateSqlserverDbUserResponse createSqlserverDbUser(CreateSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    public SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserInvoker(
        CreateSqlserverDbUserRequest request) {
        return new SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request,
            RdsMeta.createSqlserverDbUser, hcClient);
    }

    public DeleteSqlserverDatabaseResponse deleteSqlserverDatabase(DeleteSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    public SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request,
            RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    public DeleteSqlserverDatabaseExResponse deleteSqlserverDatabaseEx(DeleteSqlserverDatabaseExRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    public SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>(request,
            RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    public DeleteSqlserverDbUserResponse deleteSqlserverDbUser(DeleteSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    public SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request,
            RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    public ListAuthorizedSqlserverDbUsersResponse listAuthorizedSqlserverDbUsers(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    public SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request,
            RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    public ListSqlserverDatabasesResponse listSqlserverDatabases(ListSqlserverDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    public SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesInvoker(
        ListSqlserverDatabasesRequest request) {
        return new SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request,
            RdsMeta.listSqlserverDatabases, hcClient);
    }

    public ListSqlserverDbUsersResponse listSqlserverDbUsers(ListSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    public SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersInvoker(
        ListSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request,
            RdsMeta.listSqlserverDbUsers, hcClient);
    }

    public RevokeSqlserverDbUserPrivilegeResponse revokeSqlserverDbUserPrivilege(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    public SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

}
