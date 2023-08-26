package com.g42cloud.sdk.sms.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.sms.v3.model.CheckNetAclRequest;
import com.g42cloud.sdk.sms.v3.model.CheckNetAclResponse;
import com.g42cloud.sdk.sms.v3.model.CollectLogRequest;
import com.g42cloud.sdk.sms.v3.model.CollectLogResponse;
import com.g42cloud.sdk.sms.v3.model.CreateMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.CreateMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.CreateTaskRequest;
import com.g42cloud.sdk.sms.v3.model.CreateTaskResponse;
import com.g42cloud.sdk.sms.v3.model.CreateTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.CreateTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteServerRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteServerResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteServersRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteServersResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTaskRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTaskResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTasksRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTasksResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplatesRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplatesResponse;
import com.g42cloud.sdk.sms.v3.model.ListErrorServersRequest;
import com.g42cloud.sdk.sms.v3.model.ListErrorServersResponse;
import com.g42cloud.sdk.sms.v3.model.ListMigprojectsRequest;
import com.g42cloud.sdk.sms.v3.model.ListMigprojectsResponse;
import com.g42cloud.sdk.sms.v3.model.ListServersRequest;
import com.g42cloud.sdk.sms.v3.model.ListServersResponse;
import com.g42cloud.sdk.sms.v3.model.ListTasksRequest;
import com.g42cloud.sdk.sms.v3.model.ListTasksResponse;
import com.g42cloud.sdk.sms.v3.model.ListTemplatesRequest;
import com.g42cloud.sdk.sms.v3.model.ListTemplatesResponse;
import com.g42cloud.sdk.sms.v3.model.RegisterServerRequest;
import com.g42cloud.sdk.sms.v3.model.RegisterServerResponse;
import com.g42cloud.sdk.sms.v3.model.ShowCertKeyRequest;
import com.g42cloud.sdk.sms.v3.model.ShowCertKeyResponse;
import com.g42cloud.sdk.sms.v3.model.ShowCommandRequest;
import com.g42cloud.sdk.sms.v3.model.ShowCommandResponse;
import com.g42cloud.sdk.sms.v3.model.ShowConfigRequest;
import com.g42cloud.sdk.sms.v3.model.ShowConfigResponse;
import com.g42cloud.sdk.sms.v3.model.ShowConfigSettingRequest;
import com.g42cloud.sdk.sms.v3.model.ShowConfigSettingResponse;
import com.g42cloud.sdk.sms.v3.model.ShowMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.ShowMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.ShowOverviewRequest;
import com.g42cloud.sdk.sms.v3.model.ShowOverviewResponse;
import com.g42cloud.sdk.sms.v3.model.ShowPassphraseRequest;
import com.g42cloud.sdk.sms.v3.model.ShowPassphraseResponse;
import com.g42cloud.sdk.sms.v3.model.ShowServerRequest;
import com.g42cloud.sdk.sms.v3.model.ShowServerResponse;
import com.g42cloud.sdk.sms.v3.model.ShowSha256Request;
import com.g42cloud.sdk.sms.v3.model.ShowSha256Response;
import com.g42cloud.sdk.sms.v3.model.ShowTargetPasswordRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTargetPasswordResponse;
import com.g42cloud.sdk.sms.v3.model.ShowTaskRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTaskResponse;
import com.g42cloud.sdk.sms.v3.model.ShowTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.ShowsSpeedLimitsRequest;
import com.g42cloud.sdk.sms.v3.model.ShowsSpeedLimitsResponse;
import com.g42cloud.sdk.sms.v3.model.UnlockTargetEcsRequest;
import com.g42cloud.sdk.sms.v3.model.UnlockTargetEcsResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateCommandResultRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateCommandResultResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateCopyStateRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateCopyStateResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateDefaultMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateDefaultMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateDiskInfoRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateDiskInfoResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateNetworkCheckInfoRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateNetworkCheckInfoResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateServerNameRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateServerNameResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateSpeedRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateSpeedResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskSpeedRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskSpeedResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskStatusRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskStatusResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingRequest;
import com.g42cloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingResponse;

import java.util.concurrent.CompletableFuture;

public class SmsAsyncClient {

    protected HcClient hcClient;

    public SmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmsAsyncClient> newBuilder() {
        ClientBuilder<SmsAsyncClient> clientBuilder = new ClientBuilder<>(SmsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    public CompletableFuture<CheckNetAclResponse> checkNetAclAsync(CheckNetAclRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.checkNetAcl);
    }

    public AsyncInvoker<CheckNetAclRequest, CheckNetAclResponse> checkNetAclAsyncInvoker(CheckNetAclRequest request) {
        return new AsyncInvoker<CheckNetAclRequest, CheckNetAclResponse>(request, SmsMeta.checkNetAcl, hcClient);
    }

    public CompletableFuture<CollectLogResponse> collectLogAsync(CollectLogRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.collectLog);
    }

    public AsyncInvoker<CollectLogRequest, CollectLogResponse> collectLogAsyncInvoker(CollectLogRequest request) {
        return new AsyncInvoker<CollectLogRequest, CollectLogResponse>(request, SmsMeta.collectLog, hcClient);
    }

    public CompletableFuture<CreateMigprojectResponse> createMigprojectAsync(CreateMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createMigproject);
    }

    public AsyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse> createMigprojectAsyncInvoker(
        CreateMigprojectRequest request) {
        return new AsyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse>(request, SmsMeta.createMigproject,
            hcClient);
    }

    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createTask);
    }

    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, SmsMeta.createTask, hcClient);
    }

    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.createTemplate);
    }

    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, SmsMeta.createTemplate,
            hcClient);
    }

    public CompletableFuture<DeleteMigprojectResponse> deleteMigprojectAsync(DeleteMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteMigproject);
    }

    public AsyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigprojectAsyncInvoker(
        DeleteMigprojectRequest request) {
        return new AsyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse>(request, SmsMeta.deleteMigproject,
            hcClient);
    }

    public CompletableFuture<DeleteServerResponse> deleteServerAsync(DeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteServer);
    }

    public AsyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerAsyncInvoker(
        DeleteServerRequest request) {
        return new AsyncInvoker<DeleteServerRequest, DeleteServerResponse>(request, SmsMeta.deleteServer, hcClient);
    }

    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteServers);
    }

    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(
        DeleteServersRequest request) {
        return new AsyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, SmsMeta.deleteServers, hcClient);
    }

    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTask);
    }

    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, SmsMeta.deleteTask, hcClient);
    }

    public CompletableFuture<DeleteTasksResponse> deleteTasksAsync(DeleteTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTasks);
    }

    public AsyncInvoker<DeleteTasksRequest, DeleteTasksResponse> deleteTasksAsyncInvoker(DeleteTasksRequest request) {
        return new AsyncInvoker<DeleteTasksRequest, DeleteTasksResponse>(request, SmsMeta.deleteTasks, hcClient);
    }

    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTemplate);
    }

    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, SmsMeta.deleteTemplate,
            hcClient);
    }

    public CompletableFuture<DeleteTemplatesResponse> deleteTemplatesAsync(DeleteTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.deleteTemplates);
    }

    public AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesAsyncInvoker(
        DeleteTemplatesRequest request) {
        return new AsyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>(request, SmsMeta.deleteTemplates,
            hcClient);
    }

    public CompletableFuture<ListErrorServersResponse> listErrorServersAsync(ListErrorServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listErrorServers);
    }

    public AsyncInvoker<ListErrorServersRequest, ListErrorServersResponse> listErrorServersAsyncInvoker(
        ListErrorServersRequest request) {
        return new AsyncInvoker<ListErrorServersRequest, ListErrorServersResponse>(request, SmsMeta.listErrorServers,
            hcClient);
    }

    public CompletableFuture<ListMigprojectsResponse> listMigprojectsAsync(ListMigprojectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listMigprojects);
    }

    public AsyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojectsAsyncInvoker(
        ListMigprojectsRequest request) {
        return new AsyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse>(request, SmsMeta.listMigprojects,
            hcClient);
    }

    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listServers);
    }

    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<ListServersRequest, ListServersResponse>(request, SmsMeta.listServers, hcClient);
    }

    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listTasks);
    }

    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, SmsMeta.listTasks, hcClient);
    }

    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.listTemplates);
    }

    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, SmsMeta.listTemplates, hcClient);
    }

    public CompletableFuture<RegisterServerResponse> registerServerAsync(RegisterServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.registerServer);
    }

    public AsyncInvoker<RegisterServerRequest, RegisterServerResponse> registerServerAsyncInvoker(
        RegisterServerRequest request) {
        return new AsyncInvoker<RegisterServerRequest, RegisterServerResponse>(request, SmsMeta.registerServer,
            hcClient);
    }

    public CompletableFuture<ShowCertKeyResponse> showCertKeyAsync(ShowCertKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showCertKey);
    }

    public AsyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse> showCertKeyAsyncInvoker(ShowCertKeyRequest request) {
        return new AsyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse>(request, SmsMeta.showCertKey, hcClient);
    }

    public CompletableFuture<ShowCommandResponse> showCommandAsync(ShowCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showCommand);
    }

    public AsyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandAsyncInvoker(ShowCommandRequest request) {
        return new AsyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, SmsMeta.showCommand, hcClient);
    }

    public CompletableFuture<ShowConfigSettingResponse> showConfigSettingAsync(ShowConfigSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showConfigSetting);
    }

    public AsyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse> showConfigSettingAsyncInvoker(
        ShowConfigSettingRequest request) {
        return new AsyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse>(request, SmsMeta.showConfigSetting,
            hcClient);
    }

    public CompletableFuture<ShowMigprojectResponse> showMigprojectAsync(ShowMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showMigproject);
    }

    public AsyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse> showMigprojectAsyncInvoker(
        ShowMigprojectRequest request) {
        return new AsyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse>(request, SmsMeta.showMigproject,
            hcClient);
    }

    public CompletableFuture<ShowOverviewResponse> showOverviewAsync(ShowOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showOverview);
    }

    public AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewAsyncInvoker(
        ShowOverviewRequest request) {
        return new AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, SmsMeta.showOverview, hcClient);
    }

    public CompletableFuture<ShowPassphraseResponse> showPassphraseAsync(ShowPassphraseRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showPassphrase);
    }

    public AsyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse> showPassphraseAsyncInvoker(
        ShowPassphraseRequest request) {
        return new AsyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse>(request, SmsMeta.showPassphrase,
            hcClient);
    }

    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showServer);
    }

    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<ShowServerRequest, ShowServerResponse>(request, SmsMeta.showServer, hcClient);
    }

    public CompletableFuture<ShowSha256Response> showSha256Async(ShowSha256Request request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showSha256);
    }

    public AsyncInvoker<ShowSha256Request, ShowSha256Response> showSha256AsyncInvoker(ShowSha256Request request) {
        return new AsyncInvoker<ShowSha256Request, ShowSha256Response>(request, SmsMeta.showSha256, hcClient);
    }

    public CompletableFuture<ShowTargetPasswordResponse> showTargetPasswordAsync(ShowTargetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTargetPassword);
    }

    public AsyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse> showTargetPasswordAsyncInvoker(
        ShowTargetPasswordRequest request) {
        return new AsyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse>(request,
            SmsMeta.showTargetPassword, hcClient);
    }

    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTask);
    }

    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, SmsMeta.showTask, hcClient);
    }

    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showTemplate);
    }

    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, SmsMeta.showTemplate, hcClient);
    }

    public CompletableFuture<ShowsSpeedLimitsResponse> showsSpeedLimitsAsync(ShowsSpeedLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showsSpeedLimits);
    }

    public AsyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimitsAsyncInvoker(
        ShowsSpeedLimitsRequest request) {
        return new AsyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse>(request, SmsMeta.showsSpeedLimits,
            hcClient);
    }

    public CompletableFuture<UnlockTargetEcsResponse> unlockTargetEcsAsync(UnlockTargetEcsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.unlockTargetEcs);
    }

    public AsyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse> unlockTargetEcsAsyncInvoker(
        UnlockTargetEcsRequest request) {
        return new AsyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse>(request, SmsMeta.unlockTargetEcs,
            hcClient);
    }

    public CompletableFuture<UpdateCommandResultResponse> updateCommandResultAsync(UpdateCommandResultRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateCommandResult);
    }

    public AsyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResultAsyncInvoker(
        UpdateCommandResultRequest request) {
        return new AsyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse>(request,
            SmsMeta.updateCommandResult, hcClient);
    }

    public CompletableFuture<UpdateCopyStateResponse> updateCopyStateAsync(UpdateCopyStateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateCopyState);
    }

    public AsyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyStateAsyncInvoker(
        UpdateCopyStateRequest request) {
        return new AsyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse>(request, SmsMeta.updateCopyState,
            hcClient);
    }

    public CompletableFuture<UpdateDefaultMigprojectResponse> updateDefaultMigprojectAsync(
        UpdateDefaultMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateDefaultMigproject);
    }

    public AsyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigprojectAsyncInvoker(
        UpdateDefaultMigprojectRequest request) {
        return new AsyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse>(request,
            SmsMeta.updateDefaultMigproject, hcClient);
    }

    public CompletableFuture<UpdateDiskInfoResponse> updateDiskInfoAsync(UpdateDiskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateDiskInfo);
    }

    public AsyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfoAsyncInvoker(
        UpdateDiskInfoRequest request) {
        return new AsyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse>(request, SmsMeta.updateDiskInfo,
            hcClient);
    }

    public CompletableFuture<UpdateMigprojectResponse> updateMigprojectAsync(UpdateMigprojectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateMigproject);
    }

    public AsyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigprojectAsyncInvoker(
        UpdateMigprojectRequest request) {
        return new AsyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse>(request, SmsMeta.updateMigproject,
            hcClient);
    }

    public CompletableFuture<UpdateNetworkCheckInfoResponse> updateNetworkCheckInfoAsync(
        UpdateNetworkCheckInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateNetworkCheckInfo);
    }

    public AsyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> updateNetworkCheckInfoAsyncInvoker(
        UpdateNetworkCheckInfoRequest request) {
        return new AsyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse>(request,
            SmsMeta.updateNetworkCheckInfo, hcClient);
    }

    public CompletableFuture<UpdateServerNameResponse> updateServerNameAsync(UpdateServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateServerName);
    }

    public AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameAsyncInvoker(
        UpdateServerNameRequest request) {
        return new AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, SmsMeta.updateServerName,
            hcClient);
    }

    public CompletableFuture<UpdateSpeedResponse> updateSpeedAsync(UpdateSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateSpeed);
    }

    public AsyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeedAsyncInvoker(UpdateSpeedRequest request) {
        return new AsyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse>(request, SmsMeta.updateSpeed, hcClient);
    }

    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTask);
    }

    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, SmsMeta.updateTask, hcClient);
    }

    public CompletableFuture<UpdateTaskSpeedResponse> updateTaskSpeedAsync(UpdateTaskSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTaskSpeed);
    }

    public AsyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeedAsyncInvoker(
        UpdateTaskSpeedRequest request) {
        return new AsyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse>(request, SmsMeta.updateTaskSpeed,
            hcClient);
    }

    public CompletableFuture<UpdateTaskStatusResponse> updateTaskStatusAsync(UpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTaskStatus);
    }

    public AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusAsyncInvoker(
        UpdateTaskStatusRequest request) {
        return new AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, SmsMeta.updateTaskStatus,
            hcClient);
    }

    public CompletableFuture<UpdateTemplateResponse> updateTemplateAsync(UpdateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.updateTemplate);
    }

    public AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateAsyncInvoker(
        UpdateTemplateRequest request) {
        return new AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, SmsMeta.updateTemplate,
            hcClient);
    }

    public CompletableFuture<UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSettingAsync(
        UploadSpecialConfigurationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.uploadSpecialConfigurationSetting);
    }

    public AsyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSettingAsyncInvoker(
        UploadSpecialConfigurationSettingRequest request) {
        return new AsyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse>(
            request, SmsMeta.uploadSpecialConfigurationSetting, hcClient);
    }

    public CompletableFuture<ShowConfigResponse> showConfigAsync(ShowConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SmsMeta.showConfig);
    }

    public AsyncInvoker<ShowConfigRequest, ShowConfigResponse> showConfigAsyncInvoker(ShowConfigRequest request) {
        return new AsyncInvoker<ShowConfigRequest, ShowConfigResponse>(request, SmsMeta.showConfig, hcClient);
    }

}
