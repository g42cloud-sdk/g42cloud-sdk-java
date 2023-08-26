package com.g42cloud.sdk.bms.v1;

import com.g42cloud.sdk.bms.v1.model.AttachBaremetalServerVolumeRequest;
import com.g42cloud.sdk.bms.v1.model.AttachBaremetalServerVolumeResponse;
import com.g42cloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsRequest;
import com.g42cloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsResponse;
import com.g42cloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsRequest;
import com.g42cloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsResponse;
import com.g42cloud.sdk.bms.v1.model.BatchRebootBaremetalServersRequest;
import com.g42cloud.sdk.bms.v1.model.BatchRebootBaremetalServersResponse;
import com.g42cloud.sdk.bms.v1.model.BatchStartBaremetalServersRequest;
import com.g42cloud.sdk.bms.v1.model.BatchStartBaremetalServersResponse;
import com.g42cloud.sdk.bms.v1.model.BatchStopBaremetalServersRequest;
import com.g42cloud.sdk.bms.v1.model.BatchStopBaremetalServersResponse;
import com.g42cloud.sdk.bms.v1.model.ChangeBaremetalServerNameRequest;
import com.g42cloud.sdk.bms.v1.model.ChangeBaremetalServerNameResponse;
import com.g42cloud.sdk.bms.v1.model.ChangeBaremetalServerOsRequest;
import com.g42cloud.sdk.bms.v1.model.ChangeBaremetalServerOsResponse;
import com.g42cloud.sdk.bms.v1.model.CreateBareMetalServersRequest;
import com.g42cloud.sdk.bms.v1.model.CreateBareMetalServersResponse;
import com.g42cloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordRequest;
import com.g42cloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordResponse;
import com.g42cloud.sdk.bms.v1.model.DetachBaremetalServerVolumeRequest;
import com.g42cloud.sdk.bms.v1.model.DetachBaremetalServerVolumeResponse;
import com.g42cloud.sdk.bms.v1.model.ListBareMetalServerDetailsRequest;
import com.g42cloud.sdk.bms.v1.model.ListBareMetalServerDetailsResponse;
import com.g42cloud.sdk.bms.v1.model.ListBareMetalServersRequest;
import com.g42cloud.sdk.bms.v1.model.ListBareMetalServersResponse;
import com.g42cloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsRequest;
import com.g42cloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsResponse;
import com.g42cloud.sdk.bms.v1.model.ReinstallBaremetalServerOsRequest;
import com.g42cloud.sdk.bms.v1.model.ReinstallBaremetalServerOsResponse;
import com.g42cloud.sdk.bms.v1.model.ResetPwdOneClickRequest;
import com.g42cloud.sdk.bms.v1.model.ResetPwdOneClickResponse;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsRequest;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsResponse;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerTagsRequest;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerTagsResponse;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoRequest;
import com.g42cloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoResponse;
import com.g42cloud.sdk.bms.v1.model.ShowJobInfosRequest;
import com.g42cloud.sdk.bms.v1.model.ShowJobInfosResponse;
import com.g42cloud.sdk.bms.v1.model.ShowResetPwdRequest;
import com.g42cloud.sdk.bms.v1.model.ShowResetPwdResponse;
import com.g42cloud.sdk.bms.v1.model.ShowSpecifiedVersionRequest;
import com.g42cloud.sdk.bms.v1.model.ShowSpecifiedVersionResponse;
import com.g42cloud.sdk.bms.v1.model.ShowTenantQuotaRequest;
import com.g42cloud.sdk.bms.v1.model.ShowTenantQuotaResponse;
import com.g42cloud.sdk.bms.v1.model.ShowVersionsInfoRequest;
import com.g42cloud.sdk.bms.v1.model.ShowVersionsInfoResponse;
import com.g42cloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdRequest;
import com.g42cloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdResponse;
import com.g42cloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataRequest;
import com.g42cloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataResponse;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;

public class BmsClient {

    protected HcClient hcClient;

    public BmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsClient> newBuilder() {
        ClientBuilder<BmsClient> clientBuilder = new ClientBuilder<>(BmsClient::new);
        return clientBuilder;
    }

    public AttachBaremetalServerVolumeResponse attachBaremetalServerVolume(AttachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    public SyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeInvoker(
        AttachBaremetalServerVolumeRequest request) {
        return new SyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>(request,
            BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    public BatchCreateBaremetalServerTagsResponse batchCreateBaremetalServerTags(
        BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    public SyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsInvoker(
        BatchCreateBaremetalServerTagsRequest request) {
        return new SyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>(request,
            BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    public BatchDeleteBaremetalServerTagsResponse batchDeleteBaremetalServerTags(
        BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    public SyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsInvoker(
        BatchDeleteBaremetalServerTagsRequest request) {
        return new SyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>(request,
            BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    public BatchRebootBaremetalServersResponse batchRebootBaremetalServers(BatchRebootBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    public SyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersInvoker(
        BatchRebootBaremetalServersRequest request) {
        return new SyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>(request,
            BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    public BatchStartBaremetalServersResponse batchStartBaremetalServers(BatchStartBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    public SyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersInvoker(
        BatchStartBaremetalServersRequest request) {
        return new SyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>(request,
            BmsMeta.batchStartBaremetalServers, hcClient);
    }

    public BatchStopBaremetalServersResponse batchStopBaremetalServers(BatchStopBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    public SyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersInvoker(
        BatchStopBaremetalServersRequest request) {
        return new SyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>(request,
            BmsMeta.batchStopBaremetalServers, hcClient);
    }

    public ChangeBaremetalServerNameResponse changeBaremetalServerName(ChangeBaremetalServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    public SyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameInvoker(
        ChangeBaremetalServerNameRequest request) {
        return new SyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>(request,
            BmsMeta.changeBaremetalServerName, hcClient);
    }

    public ChangeBaremetalServerOsResponse changeBaremetalServerOs(ChangeBaremetalServerOsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    public SyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsInvoker(
        ChangeBaremetalServerOsRequest request) {
        return new SyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>(request,
            BmsMeta.changeBaremetalServerOs, hcClient);
    }

    public CreateBareMetalServersResponse createBareMetalServers(CreateBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    public SyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersInvoker(
        CreateBareMetalServersRequest request) {
        return new SyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>(request,
            BmsMeta.createBareMetalServers, hcClient);
    }

    public DeleteWindowsBareMetalServerPasswordResponse deleteWindowsBareMetalServerPassword(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    public SyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordInvoker(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return new SyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>(
            request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    public DetachBaremetalServerVolumeResponse detachBaremetalServerVolume(DetachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    public SyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeInvoker(
        DetachBaremetalServerVolumeRequest request) {
        return new SyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>(request,
            BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    public ListBareMetalServerDetailsResponse listBareMetalServerDetails(ListBareMetalServerDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    public SyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsInvoker(
        ListBareMetalServerDetailsRequest request) {
        return new SyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>(request,
            BmsMeta.listBareMetalServerDetails, hcClient);
    }

    public ListBareMetalServersResponse listBareMetalServers(ListBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    public SyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersInvoker(
        ListBareMetalServersRequest request) {
        return new SyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>(request,
            BmsMeta.listBareMetalServers, hcClient);
    }

    public ListBaremetalFlavorDetailExtendsResponse listBaremetalFlavorDetailExtends(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    public SyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsInvoker(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return new SyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>(
            request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    public ReinstallBaremetalServerOsResponse reinstallBaremetalServerOs(ReinstallBaremetalServerOsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    public SyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsInvoker(
        ReinstallBaremetalServerOsRequest request) {
        return new SyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>(request,
            BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    public ResetPwdOneClickResponse resetPwdOneClick(ResetPwdOneClickRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    public SyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickInvoker(
        ResetPwdOneClickRequest request) {
        return new SyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>(request, BmsMeta.resetPwdOneClick,
            hcClient);
    }

    public ShowBaremetalServerInterfaceAttachmentsResponse showBaremetalServerInterfaceAttachments(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    public SyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsInvoker(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new SyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>(
            request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    public ShowBaremetalServerTagsResponse showBaremetalServerTags(ShowBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    public SyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsInvoker(
        ShowBaremetalServerTagsRequest request) {
        return new SyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>(request,
            BmsMeta.showBaremetalServerTags, hcClient);
    }

    public ShowBaremetalServerVolumeInfoResponse showBaremetalServerVolumeInfo(
        ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    public SyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoInvoker(
        ShowBaremetalServerVolumeInfoRequest request) {
        return new SyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>(request,
            BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    public ShowResetPwdResponse showResetPwd(ShowResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    public SyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdInvoker(ShowResetPwdRequest request) {
        return new SyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>(request, BmsMeta.showResetPwd, hcClient);
    }

    public ShowTenantQuotaResponse showTenantQuota(ShowTenantQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    public SyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaInvoker(
        ShowTenantQuotaRequest request) {
        return new SyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>(request, BmsMeta.showTenantQuota,
            hcClient);
    }

    public ShowWindowsBaremetalServerPwdResponse showWindowsBaremetalServerPwd(
        ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    public SyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdInvoker(
        ShowWindowsBaremetalServerPwdRequest request) {
        return new SyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>(request,
            BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    public UpdateBaremetalServerMetadataResponse updateBaremetalServerMetadata(
        UpdateBaremetalServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    public SyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataInvoker(
        UpdateBaremetalServerMetadataRequest request) {
        return new SyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>(request,
            BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    public ShowSpecifiedVersionResponse showSpecifiedVersion(ShowSpecifiedVersionRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    public SyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionInvoker(
        ShowSpecifiedVersionRequest request) {
        return new SyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>(request,
            BmsMeta.showSpecifiedVersion, hcClient);
    }

    public ShowVersionsInfoResponse showVersionsInfo(ShowVersionsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showVersionsInfo);
    }

    public SyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse> showVersionsInfoInvoker(
        ShowVersionsInfoRequest request) {
        return new SyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse>(request, BmsMeta.showVersionsInfo,
            hcClient);
    }

    public ShowJobInfosResponse showJobInfos(ShowJobInfosRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    public SyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosInvoker(ShowJobInfosRequest request) {
        return new SyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>(request, BmsMeta.showJobInfos, hcClient);
    }

}
