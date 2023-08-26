package com.g42cloud.sdk.rds.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class RdsAsyncClient {

    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        ClientBuilder<RdsAsyncClient> clientBuilder = new ClientBuilder<>(RdsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsync(
        ApplyConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    public AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>(request,
            RdsMeta.applyConfigurationAsync, hcClient);
    }

    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.attachEip);
    }

    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    public CompletableFuture<BatchTagAddActionResponse> batchTagAddActionAsync(BatchTagAddActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    public AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionAsyncInvoker(
        BatchTagAddActionRequest request) {
        return new AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction,
            hcClient);
    }

    public CompletableFuture<BatchTagDelActionResponse> batchTagDelActionAsync(BatchTagDelActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    public AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionAsyncInvoker(
        BatchTagDelActionRequest request) {
        return new AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction,
            hcClient);
    }

    public CompletableFuture<ChangeFailoverModeResponse> changeFailoverModeAsync(ChangeFailoverModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    public AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeAsyncInvoker(
        ChangeFailoverModeRequest request) {
        return new AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request,
            RdsMeta.changeFailoverMode, hcClient);
    }

    public CompletableFuture<ChangeFailoverStrategyResponse> changeFailoverStrategyAsync(
        ChangeFailoverStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    public AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyAsyncInvoker(
        ChangeFailoverStrategyRequest request) {
        return new AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request,
            RdsMeta.changeFailoverStrategy, hcClient);
    }

    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(
        ChangeOpsWindowRequest request) {
        return new AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow,
            hcClient);
    }

    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            RdsMeta.createConfiguration, hcClient);
    }

    public CompletableFuture<CreateDnsNameResponse> createDnsNameAsync(CreateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDnsName);
    }

    public AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameAsyncInvoker(
        CreateDnsNameRequest request) {
        return new AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance,
            hcClient);
    }

    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            RdsMeta.createManualBackup, hcClient);
    }

    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(
        CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(
        CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request,
            RdsMeta.createRestoreInstance, hcClient);
    }

    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            RdsMeta.deleteConfiguration, hcClient);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance,
            hcClient);
    }

    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            RdsMeta.deleteManualBackup, hcClient);
    }

    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(
        DownloadSlowlogRequest request) {
        return new AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog,
            hcClient);
    }

    public CompletableFuture<EnableConfigurationResponse> enableConfigurationAsync(EnableConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    public AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationAsyncInvoker(
        EnableConfigurationRequest request) {
        return new AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request,
            RdsMeta.enableConfiguration, hcClient);
    }

    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(
        ListAuditlogsRequest request) {
        return new AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    public AsyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsAsyncInvoker(
        ListCollationsRequest request) {
        return new AsyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations,
            hcClient);
    }

    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            RdsMeta.listConfigurations, hcClient);
    }

    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores,
            hcClient);
    }

    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(
        ListErrorLogsRequest request) {
        return new AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    public CompletableFuture<ListErrorLogsNewResponse> listErrorLogsNewAsync(ListErrorLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    public AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewAsyncInvoker(
        ListErrorLogsNewRequest request) {
        return new AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>(request, RdsMeta.listErrorLogsNew,
            hcClient);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    public CompletableFuture<ListJobInfoResponse> listJobInfoAsync(ListJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    public AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoAsyncInvoker(ListJobInfoRequest request) {
        return new AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    public CompletableFuture<ListJobInfoDetailResponse> listJobInfoDetailAsync(ListJobInfoDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    public AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailAsyncInvoker(
        ListJobInfoDetailRequest request) {
        return new AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail,
            hcClient);
    }

    public CompletableFuture<ListOffSiteBackupsResponse> listOffSiteBackupsAsync(ListOffSiteBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    public AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsAsyncInvoker(
        ListOffSiteBackupsRequest request) {
        return new AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request,
            RdsMeta.listOffSiteBackups, hcClient);
    }

    public CompletableFuture<ListOffSiteInstancesResponse> listOffSiteInstancesAsync(
        ListOffSiteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    public AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesAsyncInvoker(
        ListOffSiteInstancesRequest request) {
        return new AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request,
            RdsMeta.listOffSiteInstances, hcClient);
    }

    public CompletableFuture<ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsync(
        ListOffSiteRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    public AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsyncInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request,
            RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags,
            hcClient);
    }

    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes,
            hcClient);
    }

    public CompletableFuture<ListSlowLogFileResponse> listSlowLogFileAsync(ListSlowLogFileRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    public AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileAsyncInvoker(
        ListSlowLogFileRequest request) {
        return new AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>(request, RdsMeta.listSlowLogFile,
            hcClient);
    }

    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    public CompletableFuture<ListSlowLogsNewResponse> listSlowLogsNewAsync(ListSlowLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    public AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewAsyncInvoker(
        ListSlowLogsNewRequest request) {
        return new AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>(request, RdsMeta.listSlowLogsNew,
            hcClient);
    }

    public CompletableFuture<ListSlowlogStatisticsResponse> listSlowlogStatisticsAsync(
        ListSlowlogStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    public AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsAsyncInvoker(
        ListSlowlogStatisticsRequest request) {
        return new AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request,
            RdsMeta.listSlowlogStatistics, hcClient);
    }

    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes,
            hcClient);
    }

    public CompletableFuture<MigrateFollowerResponse> migrateFollowerAsync(MigrateFollowerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    public AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerAsyncInvoker(
        MigrateFollowerRequest request) {
        return new AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower,
            hcClient);
    }

    public CompletableFuture<RestoreExistInstanceResponse> restoreExistInstanceAsync(
        RestoreExistInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    public AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceAsyncInvoker(
        RestoreExistInstanceRequest request) {
        return new AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>(request,
            RdsMeta.restoreExistInstance, hcClient);
    }

    public CompletableFuture<RestoreTablesResponse> restoreTablesAsync(RestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTables);
    }

    public AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesAsyncInvoker(
        RestoreTablesRequest request) {
        return new AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    public CompletableFuture<RestoreToExistingInstanceResponse> restoreToExistingInstanceAsync(
        RestoreToExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    public AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceAsyncInvoker(
        RestoreToExistingInstanceRequest request) {
        return new AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request,
            RdsMeta.restoreToExistingInstance, hcClient);
    }

    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(
        SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy,
            hcClient);
    }

    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy,
            hcClient);
    }

    public CompletableFuture<SetBinlogClearPolicyResponse> setBinlogClearPolicyAsync(
        SetBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    public AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyAsyncInvoker(
        SetBinlogClearPolicyRequest request) {
        return new AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>(request,
            RdsMeta.setBinlogClearPolicy, hcClient);
    }

    public CompletableFuture<SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsync(
        SetOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    public AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsyncInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request,
            RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    public CompletableFuture<SetSecurityGroupResponse> setSecurityGroupAsync(SetSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    public AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupAsyncInvoker(
        SetSecurityGroupRequest request) {
        return new AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup,
            hcClient);
    }

    public CompletableFuture<ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsync(
        ShowAuditlogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    public AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsyncInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request,
            RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(
        ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            RdsMeta.showAuditlogPolicy, hcClient);
    }

    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(
        ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            RdsMeta.showBackupDownloadLink, hcClient);
    }

    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy,
            hcClient);
    }

    public CompletableFuture<ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsync(
        ShowBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    public AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsyncInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>(request,
            RdsMeta.showBinlogClearPolicy, hcClient);
    }

    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(
        ShowConfigurationRequest request) {
        return new AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration,
            hcClient);
    }

    public CompletableFuture<ShowDrReplicaStatusResponse> showDrReplicaStatusAsync(ShowDrReplicaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    public AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusAsyncInvoker(
        ShowDrReplicaStatusRequest request) {
        return new AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>(request,
            RdsMeta.showDrReplicaStatus, hcClient);
    }

    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            RdsMeta.showInstanceConfiguration, hcClient);
    }

    public CompletableFuture<ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsync(
        ShowOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    public AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsyncInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request,
            RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showQuotas);
    }

    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    public CompletableFuture<StartFailoverResponse> startFailoverAsync(StartFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startFailover);
    }

    public AsyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverAsyncInvoker(
        StartFailoverRequest request) {
        return new AsyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    public CompletableFuture<StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsync(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    public AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsyncInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(
            request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    public CompletableFuture<StartInstanceRestartActionResponse> startInstanceRestartActionAsync(
        StartInstanceRestartActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    public AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionAsyncInvoker(
        StartInstanceRestartActionRequest request) {
        return new AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request,
            RdsMeta.startInstanceRestartAction, hcClient);
    }

    public CompletableFuture<StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsync(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    public AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsyncInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request,
            RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    public CompletableFuture<StartRecyclePolicyResponse> startRecyclePolicyAsync(StartRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    public AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyAsyncInvoker(
        StartRecyclePolicyRequest request) {
        return new AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request,
            RdsMeta.startRecyclePolicy, hcClient);
    }

    public CompletableFuture<StartResizeFlavorActionResponse> startResizeFlavorActionAsync(
        StartResizeFlavorActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    public AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionAsyncInvoker(
        StartResizeFlavorActionRequest request) {
        return new AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request,
            RdsMeta.startResizeFlavorAction, hcClient);
    }

    public CompletableFuture<StartupInstanceResponse> startupInstanceAsync(StartupInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startupInstance);
    }

    public AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceAsyncInvoker(
        StartupInstanceRequest request) {
        return new AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse>(request, RdsMeta.startupInstance,
            hcClient);
    }

    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopInstance);
    }

    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, RdsMeta.stopInstance, hcClient);
    }

    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSsl);
    }

    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            RdsMeta.updateConfiguration, hcClient);
    }

    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    public AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpAsyncInvoker(
        UpdateDataIpRequest request) {
        return new AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    public CompletableFuture<UpdateDnsNameResponse> updateDnsNameAsync(UpdateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    public AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameAsyncInvoker(
        UpdateDnsNameRequest request) {
        return new AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            RdsMeta.updateInstanceConfiguration, hcClient);
    }

    public CompletableFuture<UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    public AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>(
            request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
    }

    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            RdsMeta.updateInstanceName, hcClient);
    }

    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    public CompletableFuture<UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsync(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    public AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsyncInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request,
            RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    public CompletableFuture<UpgradeDbVersionResponse> upgradeDbVersionAsync(UpgradeDbVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    public AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionAsyncInvoker(
        UpgradeDbVersionRequest request) {
        return new AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request, RdsMeta.upgradeDbVersion,
            hcClient);
    }

    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, RdsMeta.listApiVersion,
            hcClient);
    }

    public CompletableFuture<ListApiVersionNewResponse> listApiVersionNewAsync(ListApiVersionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    public AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewAsyncInvoker(
        ListApiVersionNewRequest request) {
        return new AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>(request, RdsMeta.listApiVersionNew,
            hcClient);
    }

    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, RdsMeta.showApiVersion,
            hcClient);
    }

    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(
        AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    public AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsyncInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request,
            RdsMeta.allowDbUserPrivilege, hcClient);
    }

    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase,
            hcClient);
    }

    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase,
            hcClient);
    }

    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    public CompletableFuture<ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsync(
        ListAuthorizedDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    public AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsyncInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request,
            RdsMeta.listAuthorizedDatabases, hcClient);
    }

    public CompletableFuture<ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsync(
        ListAuthorizedDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    public AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsyncInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request,
            RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabases);
    }

    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    public CompletableFuture<RevokeResponse> revokeAsync(RevokeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revoke);
    }

    public AsyncInvoker<RevokeRequest, RevokeResponse> revokeAsyncInvoker(RevokeRequest request) {
        return new AsyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(
        SetDbUserPwdRequest request) {
        return new AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    public CompletableFuture<UpdateDatabaseResponse> updateDatabaseAsync(UpdateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    public AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseAsyncInvoker(
        UpdateDatabaseRequest request) {
        return new AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, RdsMeta.updateDatabase,
            hcClient);
    }

    public CompletableFuture<AllowDbPrivilegeResponse> allowDbPrivilegeAsync(AllowDbPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    public AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeAsyncInvoker(
        AllowDbPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege,
            hcClient);
    }

    public CompletableFuture<ChangeProxyScaleResponse> changeProxyScaleAsync(ChangeProxyScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    public AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleAsyncInvoker(
        ChangeProxyScaleRequest request) {
        return new AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>(request, RdsMeta.changeProxyScale,
            hcClient);
    }

    public CompletableFuture<ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsync(
        ChangeTheDelayThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    public AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsyncInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>(request,
            RdsMeta.changeTheDelayThreshold, hcClient);
    }

    public CompletableFuture<CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsync(
        CreatePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    public AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsyncInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request,
            RdsMeta.createPostgresqlDatabase, hcClient);
    }

    public CompletableFuture<CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsync(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    public AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsyncInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request,
            RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    public CompletableFuture<CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsync(
        CreatePostgresqlDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    public AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsyncInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request,
            RdsMeta.createPostgresqlDbUser, hcClient);
    }

    public CompletableFuture<ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsync(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    public AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsyncInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request,
            RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    public CompletableFuture<ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsync(
        ListPostgresqlDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    public AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsyncInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request,
            RdsMeta.listPostgresqlDatabases, hcClient);
    }

    public CompletableFuture<ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsync(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    public AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsyncInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request,
            RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    public CompletableFuture<SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsync(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    public AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsyncInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>(request,
            RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    public CompletableFuture<SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsync(
        SearchQueryScaleFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    public AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsyncInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>(request,
            RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    public CompletableFuture<SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsync(
        SetPostgresqlDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    public AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsyncInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request,
            RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    public CompletableFuture<ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsync(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    public AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsyncInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>(
            request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    public CompletableFuture<StartDatabaseProxyResponse> startDatabaseProxyAsync(StartDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    public AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyAsyncInvoker(
        StartDatabaseProxyRequest request) {
        return new AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>(request,
            RdsMeta.startDatabaseProxy, hcClient);
    }

    public CompletableFuture<StopDatabaseProxyResponse> stopDatabaseProxyAsync(StopDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    public AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyAsyncInvoker(
        StopDatabaseProxyRequest request) {
        return new AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>(request, RdsMeta.stopDatabaseProxy,
            hcClient);
    }

    public CompletableFuture<UpdateReadWeightResponse> updateReadWeightAsync(UpdateReadWeightRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    public AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightAsyncInvoker(
        UpdateReadWeightRequest request) {
        return new AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>(request, RdsMeta.updateReadWeight,
            hcClient);
    }

    public CompletableFuture<AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsync(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    public AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsyncInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    public CompletableFuture<CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsync(
        CreateSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    public AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsyncInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request,
            RdsMeta.createSqlserverDatabase, hcClient);
    }

    public CompletableFuture<CreateSqlserverDbUserResponse> createSqlserverDbUserAsync(
        CreateSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    public AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserAsyncInvoker(
        CreateSqlserverDbUserRequest request) {
        return new AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request,
            RdsMeta.createSqlserverDbUser, hcClient);
    }

    public CompletableFuture<DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsync(
        DeleteSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    public AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsyncInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request,
            RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    public CompletableFuture<DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsync(
        DeleteSqlserverDatabaseExRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    public AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsyncInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>(request,
            RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    public CompletableFuture<DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsync(
        DeleteSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    public AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsyncInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request,
            RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    public CompletableFuture<ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsync(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    public AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsyncInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request,
            RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    public CompletableFuture<ListSqlserverDatabasesResponse> listSqlserverDatabasesAsync(
        ListSqlserverDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    public AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesAsyncInvoker(
        ListSqlserverDatabasesRequest request) {
        return new AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request,
            RdsMeta.listSqlserverDatabases, hcClient);
    }

    public CompletableFuture<ListSqlserverDbUsersResponse> listSqlserverDbUsersAsync(
        ListSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    public AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersAsyncInvoker(
        ListSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request,
            RdsMeta.listSqlserverDbUsers, hcClient);
    }

    public CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsync(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    public AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsyncInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

}
