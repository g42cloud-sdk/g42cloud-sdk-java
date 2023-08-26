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
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class BmsAsyncClient {

    protected HcClient hcClient;

    public BmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsAsyncClient> newBuilder() {
        ClientBuilder<BmsAsyncClient> clientBuilder = new ClientBuilder<>(BmsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsync(
        AttachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    public AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsyncInvoker(
        AttachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>(request,
            BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    public CompletableFuture<BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsync(
        BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    public AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsyncInvoker(
        BatchCreateBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>(request,
            BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    public CompletableFuture<BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsync(
        BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    public AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsyncInvoker(
        BatchDeleteBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>(request,
            BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    public CompletableFuture<BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsync(
        BatchRebootBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    public AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsyncInvoker(
        BatchRebootBaremetalServersRequest request) {
        return new AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>(request,
            BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    public CompletableFuture<BatchStartBaremetalServersResponse> batchStartBaremetalServersAsync(
        BatchStartBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    public AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersAsyncInvoker(
        BatchStartBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>(request,
            BmsMeta.batchStartBaremetalServers, hcClient);
    }

    public CompletableFuture<BatchStopBaremetalServersResponse> batchStopBaremetalServersAsync(
        BatchStopBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    public AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersAsyncInvoker(
        BatchStopBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>(request,
            BmsMeta.batchStopBaremetalServers, hcClient);
    }

    public CompletableFuture<ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsync(
        ChangeBaremetalServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    public AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsyncInvoker(
        ChangeBaremetalServerNameRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>(request,
            BmsMeta.changeBaremetalServerName, hcClient);
    }

    public CompletableFuture<ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsync(
        ChangeBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    public AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsyncInvoker(
        ChangeBaremetalServerOsRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>(request,
            BmsMeta.changeBaremetalServerOs, hcClient);
    }

    public CompletableFuture<CreateBareMetalServersResponse> createBareMetalServersAsync(
        CreateBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    public AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersAsyncInvoker(
        CreateBareMetalServersRequest request) {
        return new AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>(request,
            BmsMeta.createBareMetalServers, hcClient);
    }

    public CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsync(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    public AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsyncInvoker(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return new AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>(
            request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    public CompletableFuture<DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsync(
        DetachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    public AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsyncInvoker(
        DetachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>(request,
            BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    public CompletableFuture<ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsync(
        ListBareMetalServerDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    public AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsyncInvoker(
        ListBareMetalServerDetailsRequest request) {
        return new AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>(request,
            BmsMeta.listBareMetalServerDetails, hcClient);
    }

    public CompletableFuture<ListBareMetalServersResponse> listBareMetalServersAsync(
        ListBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    public AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersAsyncInvoker(
        ListBareMetalServersRequest request) {
        return new AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>(request,
            BmsMeta.listBareMetalServers, hcClient);
    }

    public CompletableFuture<ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsync(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    public AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsyncInvoker(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return new AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>(
            request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    public CompletableFuture<ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsync(
        ReinstallBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    public AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsyncInvoker(
        ReinstallBaremetalServerOsRequest request) {
        return new AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>(request,
            BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    public CompletableFuture<ResetPwdOneClickResponse> resetPwdOneClickAsync(ResetPwdOneClickRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    public AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickAsyncInvoker(
        ResetPwdOneClickRequest request) {
        return new AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>(request, BmsMeta.resetPwdOneClick,
            hcClient);
    }

    public CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsync(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    public AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsyncInvoker(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>(
            request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    public CompletableFuture<ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsync(
        ShowBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    public AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsyncInvoker(
        ShowBaremetalServerTagsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>(request,
            BmsMeta.showBaremetalServerTags, hcClient);
    }

    public CompletableFuture<ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsync(
        ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    public AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsyncInvoker(
        ShowBaremetalServerVolumeInfoRequest request) {
        return new AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>(request,
            BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    public CompletableFuture<ShowResetPwdResponse> showResetPwdAsync(ShowResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    public AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdAsyncInvoker(
        ShowResetPwdRequest request) {
        return new AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>(request, BmsMeta.showResetPwd, hcClient);
    }

    public CompletableFuture<ShowTenantQuotaResponse> showTenantQuotaAsync(ShowTenantQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    public AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaAsyncInvoker(
        ShowTenantQuotaRequest request) {
        return new AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>(request, BmsMeta.showTenantQuota,
            hcClient);
    }

    public CompletableFuture<ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsync(
        ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    public AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsyncInvoker(
        ShowWindowsBaremetalServerPwdRequest request) {
        return new AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>(request,
            BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    public CompletableFuture<UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsync(
        UpdateBaremetalServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    public AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsyncInvoker(
        UpdateBaremetalServerMetadataRequest request) {
        return new AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>(request,
            BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    public CompletableFuture<ShowSpecifiedVersionResponse> showSpecifiedVersionAsync(
        ShowSpecifiedVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    public AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionAsyncInvoker(
        ShowSpecifiedVersionRequest request) {
        return new AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>(request,
            BmsMeta.showSpecifiedVersion, hcClient);
    }

    public CompletableFuture<ShowVersionsInfoResponse> showVersionsInfoAsync(ShowVersionsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showVersionsInfo);
    }

    public AsyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse> showVersionsInfoAsyncInvoker(
        ShowVersionsInfoRequest request) {
        return new AsyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse>(request, BmsMeta.showVersionsInfo,
            hcClient);
    }

    public CompletableFuture<ShowJobInfosResponse> showJobInfosAsync(ShowJobInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    public AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosAsyncInvoker(
        ShowJobInfosRequest request) {
        return new AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>(request, BmsMeta.showJobInfos, hcClient);
    }

}
