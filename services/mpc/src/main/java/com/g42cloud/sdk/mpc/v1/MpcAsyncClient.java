package com.g42cloud.sdk.mpc.v1;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.mpc.v1.model.CancelRemuxTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CancelRemuxTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateAgenciesTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateAgenciesTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateEditingJobRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateEditingJobResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateEncryptTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateEncryptTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateExtractTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateExtractTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateMbTasksReportRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateMbTasksReportResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateMediaProcessTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateMediaProcessTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateMergeChannelsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateMergeChannelsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateMpeCallBackRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateMpeCallBackResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateRemuxTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateRemuxTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateResetTracksTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateResetTracksTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateRetryRemuxTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateRetryRemuxTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateTemplateGroupRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateTemplateGroupResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateThumbnailsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateThumbnailsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateTransTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateTransTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateTranscodingTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateTranscodingTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.CreateWatermarkTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.CreateWatermarkTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteEditingJobRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteEditingJobResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteEncryptTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteEncryptTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteExtractTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteExtractTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteMediaProcessTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteMediaProcessTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteRemuxTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteRemuxTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteResetTracksTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteResetTracksTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteTemplateGroupRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteTemplateGroupResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteThumbnailsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteThumbnailsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteTranscodingTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteTranscodingTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.DeleteWatermarkTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.DeleteWatermarkTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.ListAllBucketsRequest;
import com.g42cloud.sdk.mpc.v1.model.ListAllBucketsResponse;
import com.g42cloud.sdk.mpc.v1.model.ListAllObsObjListRequest;
import com.g42cloud.sdk.mpc.v1.model.ListAllObsObjListResponse;
import com.g42cloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListEditingJobRequest;
import com.g42cloud.sdk.mpc.v1.model.ListEditingJobResponse;
import com.g42cloud.sdk.mpc.v1.model.ListEncryptTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListEncryptTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListExtractTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListExtractTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListMediaProcessTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListMediaProcessTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListMergeChannelsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListMergeChannelsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListNotifyEventRequest;
import com.g42cloud.sdk.mpc.v1.model.ListNotifyEventResponse;
import com.g42cloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigRequest;
import com.g42cloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigResponse;
import com.g42cloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.ListRemuxTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListRemuxTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListResetTracksTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListResetTracksTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListStatSummaryRequest;
import com.g42cloud.sdk.mpc.v1.model.ListStatSummaryResponse;
import com.g42cloud.sdk.mpc.v1.model.ListTemplateGroupRequest;
import com.g42cloud.sdk.mpc.v1.model.ListTemplateGroupResponse;
import com.g42cloud.sdk.mpc.v1.model.ListTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.ListTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.ListThumbnailsTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListThumbnailsTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListTranscodeDetailRequest;
import com.g42cloud.sdk.mpc.v1.model.ListTranscodeDetailResponse;
import com.g42cloud.sdk.mpc.v1.model.ListTranscodingTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ListTranscodingTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.ListWatermarkTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.ListWatermarkTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.NotifySmnTopicConfigRequest;
import com.g42cloud.sdk.mpc.v1.model.NotifySmnTopicConfigResponse;
import com.g42cloud.sdk.mpc.v1.model.ShowAgenciesTaskRequest;
import com.g42cloud.sdk.mpc.v1.model.ShowAgenciesTaskResponse;
import com.g42cloud.sdk.mpc.v1.model.UpdateBucketAuthorizedRequest;
import com.g42cloud.sdk.mpc.v1.model.UpdateBucketAuthorizedResponse;
import com.g42cloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.UpdateTemplateGroupRequest;
import com.g42cloud.sdk.mpc.v1.model.UpdateTemplateGroupResponse;
import com.g42cloud.sdk.mpc.v1.model.UpdateTransTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.UpdateTransTemplateResponse;
import com.g42cloud.sdk.mpc.v1.model.UpdateWatermarkTemplateRequest;
import com.g42cloud.sdk.mpc.v1.model.UpdateWatermarkTemplateResponse;

import java.util.concurrent.CompletableFuture;

public class MpcAsyncClient {

    protected HcClient hcClient;

    public MpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcAsyncClient> newBuilder() {
        ClientBuilder<MpcAsyncClient> clientBuilder = new ClientBuilder<>(MpcAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskAsync(
        CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    public AsyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskAsyncInvoker(
        CreateAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>(request,
            MpcMeta.createAnimatedGraphicsTask, hcClient);
    }

    public CompletableFuture<DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskAsync(
        DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    public AsyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskAsyncInvoker(
        DeleteAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>(request,
            MpcMeta.deleteAnimatedGraphicsTask, hcClient);
    }

    public CompletableFuture<ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskAsync(
        ListAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    public AsyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskAsyncInvoker(
        ListAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>(request,
            MpcMeta.listAnimatedGraphicsTask, hcClient);
    }

    public CompletableFuture<CreateAgenciesTaskResponse> createAgenciesTaskAsync(CreateAgenciesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createAgenciesTask);
    }

    public AsyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTaskAsyncInvoker(
        CreateAgenciesTaskRequest request) {
        return new AsyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse>(request,
            MpcMeta.createAgenciesTask, hcClient);
    }

    public CompletableFuture<ListAllBucketsResponse> listAllBucketsAsync(ListAllBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    public AsyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse> listAllBucketsAsyncInvoker(
        ListAllBucketsRequest request) {
        return new AsyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse>(request, MpcMeta.listAllBuckets,
            hcClient);
    }

    public CompletableFuture<ListAllObsObjListResponse> listAllObsObjListAsync(ListAllObsObjListRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    public AsyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse> listAllObsObjListAsyncInvoker(
        ListAllObsObjListRequest request) {
        return new AsyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse>(request, MpcMeta.listAllObsObjList,
            hcClient);
    }

    public CompletableFuture<ListNotifyEventResponse> listNotifyEventAsync(ListNotifyEventRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    public AsyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEventAsyncInvoker(
        ListNotifyEventRequest request) {
        return new AsyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse>(request, MpcMeta.listNotifyEvent,
            hcClient);
    }

    public CompletableFuture<ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigAsync(
        ListNotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    public AsyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigAsyncInvoker(
        ListNotifySmnTopicConfigRequest request) {
        return new AsyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse>(request,
            MpcMeta.listNotifySmnTopicConfig, hcClient);
    }

    public CompletableFuture<NotifySmnTopicConfigResponse> notifySmnTopicConfigAsync(
        NotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    public AsyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> notifySmnTopicConfigAsyncInvoker(
        NotifySmnTopicConfigRequest request) {
        return new AsyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse>(request,
            MpcMeta.notifySmnTopicConfig, hcClient);
    }

    public CompletableFuture<ShowAgenciesTaskResponse> showAgenciesTaskAsync(ShowAgenciesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.showAgenciesTask);
    }

    public AsyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTaskAsyncInvoker(
        ShowAgenciesTaskRequest request) {
        return new AsyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse>(request, MpcMeta.showAgenciesTask,
            hcClient);
    }

    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(
        UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    public AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsyncInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request,
            MpcMeta.updateBucketAuthorized, hcClient);
    }

    public CompletableFuture<CreateEditingJobResponse> createEditingJobAsync(CreateEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEditingJob);
    }

    public AsyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJobAsyncInvoker(
        CreateEditingJobRequest request) {
        return new AsyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>(request, MpcMeta.createEditingJob,
            hcClient);
    }

    public CompletableFuture<DeleteEditingJobResponse> deleteEditingJobAsync(DeleteEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEditingJob);
    }

    public AsyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJobAsyncInvoker(
        DeleteEditingJobRequest request) {
        return new AsyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>(request, MpcMeta.deleteEditingJob,
            hcClient);
    }

    public CompletableFuture<ListEditingJobResponse> listEditingJobAsync(ListEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEditingJob);
    }

    public AsyncInvoker<ListEditingJobRequest, ListEditingJobResponse> listEditingJobAsyncInvoker(
        ListEditingJobRequest request) {
        return new AsyncInvoker<ListEditingJobRequest, ListEditingJobResponse>(request, MpcMeta.listEditingJob,
            hcClient);
    }

    public CompletableFuture<CreateEncryptTaskResponse> createEncryptTaskAsync(CreateEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    public AsyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTaskAsyncInvoker(
        CreateEncryptTaskRequest request) {
        return new AsyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>(request, MpcMeta.createEncryptTask,
            hcClient);
    }

    public CompletableFuture<DeleteEncryptTaskResponse> deleteEncryptTaskAsync(DeleteEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    public AsyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTaskAsyncInvoker(
        DeleteEncryptTaskRequest request) {
        return new AsyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>(request, MpcMeta.deleteEncryptTask,
            hcClient);
    }

    public CompletableFuture<ListEncryptTaskResponse> listEncryptTaskAsync(ListEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    public AsyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTaskAsyncInvoker(
        ListEncryptTaskRequest request) {
        return new AsyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>(request, MpcMeta.listEncryptTask,
            hcClient);
    }

    public CompletableFuture<CreateExtractTaskResponse> createExtractTaskAsync(CreateExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    public AsyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTaskAsyncInvoker(
        CreateExtractTaskRequest request) {
        return new AsyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>(request, MpcMeta.createExtractTask,
            hcClient);
    }

    public CompletableFuture<DeleteExtractTaskResponse> deleteExtractTaskAsync(DeleteExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    public AsyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTaskAsyncInvoker(
        DeleteExtractTaskRequest request) {
        return new AsyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>(request, MpcMeta.deleteExtractTask,
            hcClient);
    }

    public CompletableFuture<ListExtractTaskResponse> listExtractTaskAsync(ListExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    public AsyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTaskAsyncInvoker(
        ListExtractTaskRequest request) {
        return new AsyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>(request, MpcMeta.listExtractTask,
            hcClient);
    }

    public CompletableFuture<CreateMbTasksReportResponse> createMbTasksReportAsync(CreateMbTasksReportRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMbTasksReport);
    }

    public AsyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReportAsyncInvoker(
        CreateMbTasksReportRequest request) {
        return new AsyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>(request,
            MpcMeta.createMbTasksReport, hcClient);
    }

    public CompletableFuture<CreateMergeChannelsTaskResponse> createMergeChannelsTaskAsync(
        CreateMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMergeChannelsTask);
    }

    public AsyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTaskAsyncInvoker(
        CreateMergeChannelsTaskRequest request) {
        return new AsyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>(request,
            MpcMeta.createMergeChannelsTask, hcClient);
    }

    public CompletableFuture<CreateResetTracksTaskResponse> createResetTracksTaskAsync(
        CreateResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createResetTracksTask);
    }

    public AsyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTaskAsyncInvoker(
        CreateResetTracksTaskRequest request) {
        return new AsyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>(request,
            MpcMeta.createResetTracksTask, hcClient);
    }

    public CompletableFuture<DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskAsync(
        DeleteMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteMergeChannelsTask);
    }

    public AsyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskAsyncInvoker(
        DeleteMergeChannelsTaskRequest request) {
        return new AsyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>(request,
            MpcMeta.deleteMergeChannelsTask, hcClient);
    }

    public CompletableFuture<DeleteResetTracksTaskResponse> deleteResetTracksTaskAsync(
        DeleteResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteResetTracksTask);
    }

    public AsyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTaskAsyncInvoker(
        DeleteResetTracksTaskRequest request) {
        return new AsyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>(request,
            MpcMeta.deleteResetTracksTask, hcClient);
    }

    public CompletableFuture<ListMergeChannelsTaskResponse> listMergeChannelsTaskAsync(
        ListMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listMergeChannelsTask);
    }

    public AsyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTaskAsyncInvoker(
        ListMergeChannelsTaskRequest request) {
        return new AsyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>(request,
            MpcMeta.listMergeChannelsTask, hcClient);
    }

    public CompletableFuture<ListResetTracksTaskResponse> listResetTracksTaskAsync(ListResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listResetTracksTask);
    }

    public AsyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTaskAsyncInvoker(
        ListResetTracksTaskRequest request) {
        return new AsyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>(request,
            MpcMeta.listResetTracksTask, hcClient);
    }

    public CompletableFuture<CreateMediaProcessTaskResponse> createMediaProcessTaskAsync(
        CreateMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMediaProcessTask);
    }

    public AsyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTaskAsyncInvoker(
        CreateMediaProcessTaskRequest request) {
        return new AsyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>(request,
            MpcMeta.createMediaProcessTask, hcClient);
    }

    public CompletableFuture<DeleteMediaProcessTaskResponse> deleteMediaProcessTaskAsync(
        DeleteMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteMediaProcessTask);
    }

    public AsyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTaskAsyncInvoker(
        DeleteMediaProcessTaskRequest request) {
        return new AsyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>(request,
            MpcMeta.deleteMediaProcessTask, hcClient);
    }

    public CompletableFuture<ListMediaProcessTaskResponse> listMediaProcessTaskAsync(
        ListMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listMediaProcessTask);
    }

    public AsyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTaskAsyncInvoker(
        ListMediaProcessTaskRequest request) {
        return new AsyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>(request,
            MpcMeta.listMediaProcessTask, hcClient);
    }

    public CompletableFuture<CreateMpeCallBackResponse> createMpeCallBackAsync(CreateMpeCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMpeCallBack);
    }

    public AsyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBackAsyncInvoker(
        CreateMpeCallBackRequest request) {
        return new AsyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>(request, MpcMeta.createMpeCallBack,
            hcClient);
    }

    public CompletableFuture<CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateAsync(
        CreateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    public AsyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateAsyncInvoker(
        CreateQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>(request,
            MpcMeta.createQualityEnhanceTemplate, hcClient);
    }

    public CompletableFuture<DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateAsync(
        DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    public AsyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateAsyncInvoker(
        DeleteQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>(request,
            MpcMeta.deleteQualityEnhanceTemplate, hcClient);
    }

    public CompletableFuture<ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateAsync(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    public AsyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateAsyncInvoker(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return new AsyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>(
            request, MpcMeta.listQualityEnhanceDefaultTemplate, hcClient);
    }

    public CompletableFuture<UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateAsync(
        UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    public AsyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateAsyncInvoker(
        UpdateQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>(request,
            MpcMeta.updateQualityEnhanceTemplate, hcClient);
    }

    public CompletableFuture<ListTranscodeDetailResponse> listTranscodeDetailAsync(ListTranscodeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    public AsyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetailAsyncInvoker(
        ListTranscodeDetailRequest request) {
        return new AsyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>(request,
            MpcMeta.listTranscodeDetail, hcClient);
    }

    public CompletableFuture<CancelRemuxTaskResponse> cancelRemuxTaskAsync(CancelRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    public AsyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTaskAsyncInvoker(
        CancelRemuxTaskRequest request) {
        return new AsyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>(request, MpcMeta.cancelRemuxTask,
            hcClient);
    }

    public CompletableFuture<CreateRemuxTaskResponse> createRemuxTaskAsync(CreateRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    public AsyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTaskAsyncInvoker(
        CreateRemuxTaskRequest request) {
        return new AsyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>(request, MpcMeta.createRemuxTask,
            hcClient);
    }

    public CompletableFuture<CreateRetryRemuxTaskResponse> createRetryRemuxTaskAsync(
        CreateRetryRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    public AsyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTaskAsyncInvoker(
        CreateRetryRemuxTaskRequest request) {
        return new AsyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>(request,
            MpcMeta.createRetryRemuxTask, hcClient);
    }

    public CompletableFuture<DeleteRemuxTaskResponse> deleteRemuxTaskAsync(DeleteRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    public AsyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTaskAsyncInvoker(
        DeleteRemuxTaskRequest request) {
        return new AsyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>(request, MpcMeta.deleteRemuxTask,
            hcClient);
    }

    public CompletableFuture<ListRemuxTaskResponse> listRemuxTaskAsync(ListRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    public AsyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTaskAsyncInvoker(
        ListRemuxTaskRequest request) {
        return new AsyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>(request, MpcMeta.listRemuxTask, hcClient);
    }

    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    public AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupAsyncInvoker(
        CreateTemplateGroupRequest request) {
        return new AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            MpcMeta.createTemplateGroup, hcClient);
    }

    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    public AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupAsyncInvoker(
        DeleteTemplateGroupRequest request) {
        return new AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            MpcMeta.deleteTemplateGroup, hcClient);
    }

    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    public AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupAsyncInvoker(
        ListTemplateGroupRequest request) {
        return new AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, MpcMeta.listTemplateGroup,
            hcClient);
    }

    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    public AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupAsyncInvoker(
        UpdateTemplateGroupRequest request) {
        return new AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
            MpcMeta.updateTemplateGroup, hcClient);
    }

    public CompletableFuture<CreateThumbnailsTaskResponse> createThumbnailsTaskAsync(
        CreateThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    public AsyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTaskAsyncInvoker(
        CreateThumbnailsTaskRequest request) {
        return new AsyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>(request,
            MpcMeta.createThumbnailsTask, hcClient);
    }

    public CompletableFuture<DeleteThumbnailsTaskResponse> deleteThumbnailsTaskAsync(
        DeleteThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    public AsyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTaskAsyncInvoker(
        DeleteThumbnailsTaskRequest request) {
        return new AsyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>(request,
            MpcMeta.deleteThumbnailsTask, hcClient);
    }

    public CompletableFuture<ListThumbnailsTaskResponse> listThumbnailsTaskAsync(ListThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    public AsyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTaskAsyncInvoker(
        ListThumbnailsTaskRequest request) {
        return new AsyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>(request,
            MpcMeta.listThumbnailsTask, hcClient);
    }

    public CompletableFuture<CreateTranscodingTaskResponse> createTranscodingTaskAsync(
        CreateTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    public AsyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTaskAsyncInvoker(
        CreateTranscodingTaskRequest request) {
        return new AsyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>(request,
            MpcMeta.createTranscodingTask, hcClient);
    }

    public CompletableFuture<DeleteTranscodingTaskResponse> deleteTranscodingTaskAsync(
        DeleteTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    public AsyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTaskAsyncInvoker(
        DeleteTranscodingTaskRequest request) {
        return new AsyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>(request,
            MpcMeta.deleteTranscodingTask, hcClient);
    }

    public CompletableFuture<DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleAsync(
        DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    public AsyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleAsyncInvoker(
        DeleteTranscodingTaskByConsoleRequest request) {
        return new AsyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse>(request,
            MpcMeta.deleteTranscodingTaskByConsole, hcClient);
    }

    public CompletableFuture<ListStatSummaryResponse> listStatSummaryAsync(ListStatSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    public AsyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummaryAsyncInvoker(
        ListStatSummaryRequest request) {
        return new AsyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse>(request, MpcMeta.listStatSummary,
            hcClient);
    }

    public CompletableFuture<ListTranscodingTaskResponse> listTranscodingTaskAsync(ListTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    public AsyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTaskAsyncInvoker(
        ListTranscodingTaskRequest request) {
        return new AsyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>(request,
            MpcMeta.listTranscodingTask, hcClient);
    }

    public CompletableFuture<CreateTransTemplateResponse> createTransTemplateAsync(CreateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    public AsyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplateAsyncInvoker(
        CreateTransTemplateRequest request) {
        return new AsyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>(request,
            MpcMeta.createTransTemplate, hcClient);
    }

    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MpcMeta.deleteTemplate,
            hcClient);
    }

    public CompletableFuture<ListTemplateResponse> listTemplateAsync(ListTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplate);
    }

    public AsyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateAsyncInvoker(
        ListTemplateRequest request) {
        return new AsyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, MpcMeta.listTemplate, hcClient);
    }

    public CompletableFuture<UpdateTransTemplateResponse> updateTransTemplateAsync(UpdateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    public AsyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplateAsyncInvoker(
        UpdateTransTemplateRequest request) {
        return new AsyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>(request,
            MpcMeta.updateTransTemplate, hcClient);
    }

    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(
        CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    public AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateAsyncInvoker(
        CreateWatermarkTemplateRequest request) {
        return new AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            MpcMeta.createWatermarkTemplate, hcClient);
    }

    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(
        DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    public AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsyncInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            MpcMeta.deleteWatermarkTemplate, hcClient);
    }

    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(
        ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    public AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateAsyncInvoker(
        ListWatermarkTemplateRequest request) {
        return new AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            MpcMeta.listWatermarkTemplate, hcClient);
    }

    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(
        UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

    public AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsyncInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            MpcMeta.updateWatermarkTemplate, hcClient);
    }

}
