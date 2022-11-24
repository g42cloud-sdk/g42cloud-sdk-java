package com.g42cloud.sdk.evs.v2;

import com.g42cloud.sdk.evs.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class EvsAsyncClient {

    protected HcClient hcClient;

    public EvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EvsAsyncClient::new);
    }

    public CompletableFuture<BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsync(
        BatchCreateVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    public AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsyncInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>(request,
            EvsMeta.batchCreateVolumeTags, hcClient);
    }

    public CompletableFuture<BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsync(
        BatchDeleteVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    public AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsyncInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>(request,
            EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    public CompletableFuture<CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferAsync(
        CinderAcceptVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderAcceptVolumeTransfer);
    }

    public AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferAsyncInvoker(
        CinderAcceptVolumeTransferRequest request) {
        return new AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>(request,
            EvsMeta.cinderAcceptVolumeTransfer, hcClient);
    }

    public CompletableFuture<CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferAsync(
        CinderCreateVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderCreateVolumeTransfer);
    }

    public AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferAsyncInvoker(
        CinderCreateVolumeTransferRequest request) {
        return new AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>(request,
            EvsMeta.cinderCreateVolumeTransfer, hcClient);
    }

    public CompletableFuture<CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferAsync(
        CinderDeleteVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderDeleteVolumeTransfer);
    }

    public AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferAsyncInvoker(
        CinderDeleteVolumeTransferRequest request) {
        return new AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>(request,
            EvsMeta.cinderDeleteVolumeTransfer, hcClient);
    }

    public CompletableFuture<CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsync(
        CinderListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    public AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsyncInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>(request,
            EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    public CompletableFuture<CinderListQuotasResponse> cinderListQuotasAsync(CinderListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    public AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasAsyncInvoker(
        CinderListQuotasRequest request) {
        return new AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>(request, EvsMeta.cinderListQuotas,
            hcClient);
    }

    public CompletableFuture<CinderListVolumeTransfersResponse> cinderListVolumeTransfersAsync(
        CinderListVolumeTransfersRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTransfers);
    }

    public AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfersAsyncInvoker(
        CinderListVolumeTransfersRequest request) {
        return new AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>(request,
            EvsMeta.cinderListVolumeTransfers, hcClient);
    }

    public CompletableFuture<CinderListVolumeTypesResponse> cinderListVolumeTypesAsync(
        CinderListVolumeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    public AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesAsyncInvoker(
        CinderListVolumeTypesRequest request) {
        return new AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>(request,
            EvsMeta.cinderListVolumeTypes, hcClient);
    }

    public CompletableFuture<CinderShowVolumeTransferResponse> cinderShowVolumeTransferAsync(
        CinderShowVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderShowVolumeTransfer);
    }

    public AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransferAsyncInvoker(
        CinderShowVolumeTransferRequest request) {
        return new AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>(request,
            EvsMeta.cinderShowVolumeTransfer, hcClient);
    }

    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, EvsMeta.createSnapshot,
            hcClient);
    }

    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createVolume);
    }

    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, EvsMeta.createVolume, hcClient);
    }

    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, EvsMeta.deleteSnapshot,
            hcClient);
    }

    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, EvsMeta.deleteVolume, hcClient);
    }

    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, EvsMeta.listSnapshots, hcClient);
    }

    public CompletableFuture<ListVolumeTagsResponse> listVolumeTagsAsync(ListVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    public AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsAsyncInvoker(
        ListVolumeTagsRequest request) {
        return new AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>(request, EvsMeta.listVolumeTags,
            hcClient);
    }

    public CompletableFuture<ListVolumesResponse> listVolumesAsync(ListVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumes);
    }

    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, EvsMeta.listVolumes, hcClient);
    }

    public CompletableFuture<ListVolumesByTagsResponse> listVolumesByTagsAsync(ListVolumesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    public AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsAsyncInvoker(
        ListVolumesByTagsRequest request) {
        return new AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>(request, EvsMeta.listVolumesByTags,
            hcClient);
    }

    public CompletableFuture<ResizeVolumeResponse> resizeVolumeAsync(ResizeVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    public AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeAsyncInvoker(
        ResizeVolumeRequest request) {
        return new AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>(request, EvsMeta.resizeVolume, hcClient);
    }

    public CompletableFuture<RollbackSnapshotResponse> rollbackSnapshotAsync(RollbackSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    public AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotAsyncInvoker(
        RollbackSnapshotRequest request) {
        return new AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>(request, EvsMeta.rollbackSnapshot,
            hcClient);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showJob);
    }

    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EvsMeta.showJob, hcClient);
    }

    public CompletableFuture<ShowSnapshotResponse> showSnapshotAsync(ShowSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    public AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotAsyncInvoker(
        ShowSnapshotRequest request) {
        return new AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>(request, EvsMeta.showSnapshot, hcClient);
    }

    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolume);
    }

    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, EvsMeta.showVolume, hcClient);
    }

    public CompletableFuture<ShowVolumeTagsResponse> showVolumeTagsAsync(ShowVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    public AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsAsyncInvoker(
        ShowVolumeTagsRequest request) {
        return new AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>(request, EvsMeta.showVolumeTags,
            hcClient);
    }

    public CompletableFuture<UpdateSnapshotResponse> updateSnapshotAsync(UpdateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    public AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotAsyncInvoker(
        UpdateSnapshotRequest request) {
        return new AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>(request, EvsMeta.updateSnapshot,
            hcClient);
    }

    public CompletableFuture<UpdateVolumeResponse> updateVolumeAsync(UpdateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateVolume);
    }

    public AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeAsyncInvoker(
        UpdateVolumeRequest request) {
        return new AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>(request, EvsMeta.updateVolume, hcClient);
    }

    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVersions);
    }

    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, EvsMeta.listVersions, hcClient);
    }

    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVersion);
    }

    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, EvsMeta.showVersion, hcClient);
    }

}
