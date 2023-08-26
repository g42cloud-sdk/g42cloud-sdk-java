package com.g42cloud.sdk.sms.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
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

public class SmsClient {

    protected HcClient hcClient;

    public SmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmsClient> newBuilder() {
        ClientBuilder<SmsClient> clientBuilder = new ClientBuilder<>(SmsClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    public CheckNetAclResponse checkNetAcl(CheckNetAclRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.checkNetAcl);
    }

    public SyncInvoker<CheckNetAclRequest, CheckNetAclResponse> checkNetAclInvoker(CheckNetAclRequest request) {
        return new SyncInvoker<CheckNetAclRequest, CheckNetAclResponse>(request, SmsMeta.checkNetAcl, hcClient);
    }

    public CollectLogResponse collectLog(CollectLogRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.collectLog);
    }

    public SyncInvoker<CollectLogRequest, CollectLogResponse> collectLogInvoker(CollectLogRequest request) {
        return new SyncInvoker<CollectLogRequest, CollectLogResponse>(request, SmsMeta.collectLog, hcClient);
    }

    public CreateMigprojectResponse createMigproject(CreateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createMigproject);
    }

    public SyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse> createMigprojectInvoker(
        CreateMigprojectRequest request) {
        return new SyncInvoker<CreateMigprojectRequest, CreateMigprojectResponse>(request, SmsMeta.createMigproject,
            hcClient);
    }

    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTask);
    }

    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, SmsMeta.createTask, hcClient);
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.createTemplate);
    }

    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, SmsMeta.createTemplate,
            hcClient);
    }

    public DeleteMigprojectResponse deleteMigproject(DeleteMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteMigproject);
    }

    public SyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigprojectInvoker(
        DeleteMigprojectRequest request) {
        return new SyncInvoker<DeleteMigprojectRequest, DeleteMigprojectResponse>(request, SmsMeta.deleteMigproject,
            hcClient);
    }

    public DeleteServerResponse deleteServer(DeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServer);
    }

    public SyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerInvoker(DeleteServerRequest request) {
        return new SyncInvoker<DeleteServerRequest, DeleteServerResponse>(request, SmsMeta.deleteServer, hcClient);
    }

    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteServers);
    }

    public SyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersInvoker(DeleteServersRequest request) {
        return new SyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, SmsMeta.deleteServers, hcClient);
    }

    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTask);
    }

    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, SmsMeta.deleteTask, hcClient);
    }

    public DeleteTasksResponse deleteTasks(DeleteTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTasks);
    }

    public SyncInvoker<DeleteTasksRequest, DeleteTasksResponse> deleteTasksInvoker(DeleteTasksRequest request) {
        return new SyncInvoker<DeleteTasksRequest, DeleteTasksResponse>(request, SmsMeta.deleteTasks, hcClient);
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplate);
    }

    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, SmsMeta.deleteTemplate,
            hcClient);
    }

    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.deleteTemplates);
    }

    public SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplatesInvoker(
        DeleteTemplatesRequest request) {
        return new SyncInvoker<DeleteTemplatesRequest, DeleteTemplatesResponse>(request, SmsMeta.deleteTemplates,
            hcClient);
    }

    public ListErrorServersResponse listErrorServers(ListErrorServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listErrorServers);
    }

    public SyncInvoker<ListErrorServersRequest, ListErrorServersResponse> listErrorServersInvoker(
        ListErrorServersRequest request) {
        return new SyncInvoker<ListErrorServersRequest, ListErrorServersResponse>(request, SmsMeta.listErrorServers,
            hcClient);
    }

    public ListMigprojectsResponse listMigprojects(ListMigprojectsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listMigprojects);
    }

    public SyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojectsInvoker(
        ListMigprojectsRequest request) {
        return new SyncInvoker<ListMigprojectsRequest, ListMigprojectsResponse>(request, SmsMeta.listMigprojects,
            hcClient);
    }

    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listServers);
    }

    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<ListServersRequest, ListServersResponse>(request, SmsMeta.listServers, hcClient);
    }

    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listTasks);
    }

    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<ListTasksRequest, ListTasksResponse>(request, SmsMeta.listTasks, hcClient);
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.listTemplates);
    }

    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, SmsMeta.listTemplates, hcClient);
    }

    public RegisterServerResponse registerServer(RegisterServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.registerServer);
    }

    public SyncInvoker<RegisterServerRequest, RegisterServerResponse> registerServerInvoker(
        RegisterServerRequest request) {
        return new SyncInvoker<RegisterServerRequest, RegisterServerResponse>(request, SmsMeta.registerServer,
            hcClient);
    }

    public ShowCertKeyResponse showCertKey(ShowCertKeyRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showCertKey);
    }

    public SyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse> showCertKeyInvoker(ShowCertKeyRequest request) {
        return new SyncInvoker<ShowCertKeyRequest, ShowCertKeyResponse>(request, SmsMeta.showCertKey, hcClient);
    }

    public ShowCommandResponse showCommand(ShowCommandRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showCommand);
    }

    public SyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandInvoker(ShowCommandRequest request) {
        return new SyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, SmsMeta.showCommand, hcClient);
    }

    public ShowConfigSettingResponse showConfigSetting(ShowConfigSettingRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showConfigSetting);
    }

    public SyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse> showConfigSettingInvoker(
        ShowConfigSettingRequest request) {
        return new SyncInvoker<ShowConfigSettingRequest, ShowConfigSettingResponse>(request, SmsMeta.showConfigSetting,
            hcClient);
    }

    public ShowMigprojectResponse showMigproject(ShowMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showMigproject);
    }

    public SyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse> showMigprojectInvoker(
        ShowMigprojectRequest request) {
        return new SyncInvoker<ShowMigprojectRequest, ShowMigprojectResponse>(request, SmsMeta.showMigproject,
            hcClient);
    }

    public ShowOverviewResponse showOverview(ShowOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showOverview);
    }

    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, SmsMeta.showOverview, hcClient);
    }

    public ShowPassphraseResponse showPassphrase(ShowPassphraseRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showPassphrase);
    }

    public SyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse> showPassphraseInvoker(
        ShowPassphraseRequest request) {
        return new SyncInvoker<ShowPassphraseRequest, ShowPassphraseResponse>(request, SmsMeta.showPassphrase,
            hcClient);
    }

    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showServer);
    }

    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<ShowServerRequest, ShowServerResponse>(request, SmsMeta.showServer, hcClient);
    }

    public ShowSha256Response showSha256(ShowSha256Request request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showSha256);
    }

    public SyncInvoker<ShowSha256Request, ShowSha256Response> showSha256Invoker(ShowSha256Request request) {
        return new SyncInvoker<ShowSha256Request, ShowSha256Response>(request, SmsMeta.showSha256, hcClient);
    }

    public ShowTargetPasswordResponse showTargetPassword(ShowTargetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTargetPassword);
    }

    public SyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse> showTargetPasswordInvoker(
        ShowTargetPasswordRequest request) {
        return new SyncInvoker<ShowTargetPasswordRequest, ShowTargetPasswordResponse>(request,
            SmsMeta.showTargetPassword, hcClient);
    }

    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTask);
    }

    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, SmsMeta.showTask, hcClient);
    }

    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showTemplate);
    }

    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, SmsMeta.showTemplate, hcClient);
    }

    public ShowsSpeedLimitsResponse showsSpeedLimits(ShowsSpeedLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showsSpeedLimits);
    }

    public SyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimitsInvoker(
        ShowsSpeedLimitsRequest request) {
        return new SyncInvoker<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse>(request, SmsMeta.showsSpeedLimits,
            hcClient);
    }

    public UnlockTargetEcsResponse unlockTargetEcs(UnlockTargetEcsRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.unlockTargetEcs);
    }

    public SyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse> unlockTargetEcsInvoker(
        UnlockTargetEcsRequest request) {
        return new SyncInvoker<UnlockTargetEcsRequest, UnlockTargetEcsResponse>(request, SmsMeta.unlockTargetEcs,
            hcClient);
    }

    public UpdateCommandResultResponse updateCommandResult(UpdateCommandResultRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateCommandResult);
    }

    public SyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResultInvoker(
        UpdateCommandResultRequest request) {
        return new SyncInvoker<UpdateCommandResultRequest, UpdateCommandResultResponse>(request,
            SmsMeta.updateCommandResult, hcClient);
    }

    public UpdateCopyStateResponse updateCopyState(UpdateCopyStateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateCopyState);
    }

    public SyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyStateInvoker(
        UpdateCopyStateRequest request) {
        return new SyncInvoker<UpdateCopyStateRequest, UpdateCopyStateResponse>(request, SmsMeta.updateCopyState,
            hcClient);
    }

    public UpdateDefaultMigprojectResponse updateDefaultMigproject(UpdateDefaultMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateDefaultMigproject);
    }

    public SyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigprojectInvoker(
        UpdateDefaultMigprojectRequest request) {
        return new SyncInvoker<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse>(request,
            SmsMeta.updateDefaultMigproject, hcClient);
    }

    public UpdateDiskInfoResponse updateDiskInfo(UpdateDiskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateDiskInfo);
    }

    public SyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfoInvoker(
        UpdateDiskInfoRequest request) {
        return new SyncInvoker<UpdateDiskInfoRequest, UpdateDiskInfoResponse>(request, SmsMeta.updateDiskInfo,
            hcClient);
    }

    public UpdateMigprojectResponse updateMigproject(UpdateMigprojectRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateMigproject);
    }

    public SyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigprojectInvoker(
        UpdateMigprojectRequest request) {
        return new SyncInvoker<UpdateMigprojectRequest, UpdateMigprojectResponse>(request, SmsMeta.updateMigproject,
            hcClient);
    }

    public UpdateNetworkCheckInfoResponse updateNetworkCheckInfo(UpdateNetworkCheckInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateNetworkCheckInfo);
    }

    public SyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> updateNetworkCheckInfoInvoker(
        UpdateNetworkCheckInfoRequest request) {
        return new SyncInvoker<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse>(request,
            SmsMeta.updateNetworkCheckInfo, hcClient);
    }

    public UpdateServerNameResponse updateServerName(UpdateServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateServerName);
    }

    public SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameInvoker(
        UpdateServerNameRequest request) {
        return new SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, SmsMeta.updateServerName,
            hcClient);
    }

    public UpdateSpeedResponse updateSpeed(UpdateSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateSpeed);
    }

    public SyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeedInvoker(UpdateSpeedRequest request) {
        return new SyncInvoker<UpdateSpeedRequest, UpdateSpeedResponse>(request, SmsMeta.updateSpeed, hcClient);
    }

    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTask);
    }

    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, SmsMeta.updateTask, hcClient);
    }

    public UpdateTaskSpeedResponse updateTaskSpeed(UpdateTaskSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTaskSpeed);
    }

    public SyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeedInvoker(
        UpdateTaskSpeedRequest request) {
        return new SyncInvoker<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse>(request, SmsMeta.updateTaskSpeed,
            hcClient);
    }

    public UpdateTaskStatusResponse updateTaskStatus(UpdateTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTaskStatus);
    }

    public SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusInvoker(
        UpdateTaskStatusRequest request) {
        return new SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, SmsMeta.updateTaskStatus,
            hcClient);
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.updateTemplate);
    }

    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, SmsMeta.updateTemplate,
            hcClient);
    }

    public UploadSpecialConfigurationSettingResponse uploadSpecialConfigurationSetting(
        UploadSpecialConfigurationSettingRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.uploadSpecialConfigurationSetting);
    }

    public SyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSettingInvoker(
        UploadSpecialConfigurationSettingRequest request) {
        return new SyncInvoker<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse>(
            request, SmsMeta.uploadSpecialConfigurationSetting, hcClient);
    }

    public ShowConfigResponse showConfig(ShowConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SmsMeta.showConfig);
    }

    public SyncInvoker<ShowConfigRequest, ShowConfigResponse> showConfigInvoker(ShowConfigRequest request) {
        return new SyncInvoker<ShowConfigRequest, ShowConfigResponse>(request, SmsMeta.showConfig, hcClient);
    }

}
