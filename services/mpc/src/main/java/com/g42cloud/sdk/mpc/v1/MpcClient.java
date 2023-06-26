package com.g42cloud.sdk.mpc.v1;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.mpc.v1.model.*;

public class MpcClient {

    protected HcClient hcClient;

    public MpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcClient> newBuilder() {
        return new ClientBuilder<>(MpcClient::new);
    }

    public CreateAnimatedGraphicsTaskResponse createAnimatedGraphicsTask(CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    public SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskInvoker(
        CreateAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>(request,
            MpcMeta.createAnimatedGraphicsTask, hcClient);
    }

    public DeleteAnimatedGraphicsTaskResponse deleteAnimatedGraphicsTask(DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    public SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskInvoker(
        DeleteAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>(request,
            MpcMeta.deleteAnimatedGraphicsTask, hcClient);
    }

    public ListAnimatedGraphicsTaskResponse listAnimatedGraphicsTask(ListAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    public SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskInvoker(
        ListAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>(request,
            MpcMeta.listAnimatedGraphicsTask, hcClient);
    }

    public CreateAgenciesTaskResponse createAgenciesTask(CreateAgenciesTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAgenciesTask);
    }

    public SyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTaskInvoker(
        CreateAgenciesTaskRequest request) {
        return new SyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse>(request,
            MpcMeta.createAgenciesTask, hcClient);
    }

    public ListAllBucketsResponse listAllBuckets(ListAllBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    public SyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse> listAllBucketsInvoker(
        ListAllBucketsRequest request) {
        return new SyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse>(request, MpcMeta.listAllBuckets,
            hcClient);
    }

    public ListAllObsObjListResponse listAllObsObjList(ListAllObsObjListRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    public SyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse> listAllObsObjListInvoker(
        ListAllObsObjListRequest request) {
        return new SyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse>(request, MpcMeta.listAllObsObjList,
            hcClient);
    }

    public ListNotifyEventResponse listNotifyEvent(ListNotifyEventRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    public SyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEventInvoker(
        ListNotifyEventRequest request) {
        return new SyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse>(request, MpcMeta.listNotifyEvent,
            hcClient);
    }

    public ListNotifySmnTopicConfigResponse listNotifySmnTopicConfig(ListNotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    public SyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigInvoker(
        ListNotifySmnTopicConfigRequest request) {
        return new SyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse>(request,
            MpcMeta.listNotifySmnTopicConfig, hcClient);
    }

    public NotifySmnTopicConfigResponse notifySmnTopicConfig(NotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    public SyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> notifySmnTopicConfigInvoker(
        NotifySmnTopicConfigRequest request) {
        return new SyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse>(request,
            MpcMeta.notifySmnTopicConfig, hcClient);
    }

    public ShowAgenciesTaskResponse showAgenciesTask(ShowAgenciesTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.showAgenciesTask);
    }

    public SyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTaskInvoker(
        ShowAgenciesTaskRequest request) {
        return new SyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse>(request, MpcMeta.showAgenciesTask,
            hcClient);
    }

    public UpdateBucketAuthorizedResponse updateBucketAuthorized(UpdateBucketAuthorizedRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    public SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request,
            MpcMeta.updateBucketAuthorized, hcClient);
    }

    public CreateEditingJobResponse createEditingJob(CreateEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEditingJob);
    }

    public SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJobInvoker(
        CreateEditingJobRequest request) {
        return new SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>(request, MpcMeta.createEditingJob,
            hcClient);
    }

    public DeleteEditingJobResponse deleteEditingJob(DeleteEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEditingJob);
    }

    public SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJobInvoker(
        DeleteEditingJobRequest request) {
        return new SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>(request, MpcMeta.deleteEditingJob,
            hcClient);
    }

    public ListEditingJobResponse listEditingJob(ListEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEditingJob);
    }

    public SyncInvoker<ListEditingJobRequest, ListEditingJobResponse> listEditingJobInvoker(
        ListEditingJobRequest request) {
        return new SyncInvoker<ListEditingJobRequest, ListEditingJobResponse>(request, MpcMeta.listEditingJob,
            hcClient);
    }

    public CreateEncryptTaskResponse createEncryptTask(CreateEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    public SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTaskInvoker(
        CreateEncryptTaskRequest request) {
        return new SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>(request, MpcMeta.createEncryptTask,
            hcClient);
    }

    public DeleteEncryptTaskResponse deleteEncryptTask(DeleteEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    public SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTaskInvoker(
        DeleteEncryptTaskRequest request) {
        return new SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>(request, MpcMeta.deleteEncryptTask,
            hcClient);
    }

    public ListEncryptTaskResponse listEncryptTask(ListEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    public SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTaskInvoker(
        ListEncryptTaskRequest request) {
        return new SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>(request, MpcMeta.listEncryptTask,
            hcClient);
    }

    public CreateExtractTaskResponse createExtractTask(CreateExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    public SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTaskInvoker(
        CreateExtractTaskRequest request) {
        return new SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>(request, MpcMeta.createExtractTask,
            hcClient);
    }

    public DeleteExtractTaskResponse deleteExtractTask(DeleteExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    public SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTaskInvoker(
        DeleteExtractTaskRequest request) {
        return new SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>(request, MpcMeta.deleteExtractTask,
            hcClient);
    }

    public ListExtractTaskResponse listExtractTask(ListExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    public SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTaskInvoker(
        ListExtractTaskRequest request) {
        return new SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>(request, MpcMeta.listExtractTask,
            hcClient);
    }

    public CreateMbTasksReportResponse createMbTasksReport(CreateMbTasksReportRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMbTasksReport);
    }

    public SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReportInvoker(
        CreateMbTasksReportRequest request) {
        return new SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>(request,
            MpcMeta.createMbTasksReport, hcClient);
    }

    public CreateMergeChannelsTaskResponse createMergeChannelsTask(CreateMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMergeChannelsTask);
    }

    public SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTaskInvoker(
        CreateMergeChannelsTaskRequest request) {
        return new SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>(request,
            MpcMeta.createMergeChannelsTask, hcClient);
    }

    public CreateResetTracksTaskResponse createResetTracksTask(CreateResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createResetTracksTask);
    }

    public SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTaskInvoker(
        CreateResetTracksTaskRequest request) {
        return new SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>(request,
            MpcMeta.createResetTracksTask, hcClient);
    }

    public DeleteMergeChannelsTaskResponse deleteMergeChannelsTask(DeleteMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteMergeChannelsTask);
    }

    public SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskInvoker(
        DeleteMergeChannelsTaskRequest request) {
        return new SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>(request,
            MpcMeta.deleteMergeChannelsTask, hcClient);
    }

    public DeleteResetTracksTaskResponse deleteResetTracksTask(DeleteResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteResetTracksTask);
    }

    public SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTaskInvoker(
        DeleteResetTracksTaskRequest request) {
        return new SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>(request,
            MpcMeta.deleteResetTracksTask, hcClient);
    }

    public ListMergeChannelsTaskResponse listMergeChannelsTask(ListMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listMergeChannelsTask);
    }

    public SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTaskInvoker(
        ListMergeChannelsTaskRequest request) {
        return new SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>(request,
            MpcMeta.listMergeChannelsTask, hcClient);
    }

    public ListResetTracksTaskResponse listResetTracksTask(ListResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listResetTracksTask);
    }

    public SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTaskInvoker(
        ListResetTracksTaskRequest request) {
        return new SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>(request,
            MpcMeta.listResetTracksTask, hcClient);
    }

    public CreateMediaProcessTaskResponse createMediaProcessTask(CreateMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMediaProcessTask);
    }

    public SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTaskInvoker(
        CreateMediaProcessTaskRequest request) {
        return new SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>(request,
            MpcMeta.createMediaProcessTask, hcClient);
    }

    public DeleteMediaProcessTaskResponse deleteMediaProcessTask(DeleteMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteMediaProcessTask);
    }

    public SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTaskInvoker(
        DeleteMediaProcessTaskRequest request) {
        return new SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>(request,
            MpcMeta.deleteMediaProcessTask, hcClient);
    }

    public ListMediaProcessTaskResponse listMediaProcessTask(ListMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listMediaProcessTask);
    }

    public SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTaskInvoker(
        ListMediaProcessTaskRequest request) {
        return new SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>(request,
            MpcMeta.listMediaProcessTask, hcClient);
    }

    public CreateMpeCallBackResponse createMpeCallBack(CreateMpeCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMpeCallBack);
    }

    public SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBackInvoker(
        CreateMpeCallBackRequest request) {
        return new SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>(request, MpcMeta.createMpeCallBack,
            hcClient);
    }

    public CreateQualityEnhanceTemplateResponse createQualityEnhanceTemplate(
        CreateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    public SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateInvoker(
        CreateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>(request,
            MpcMeta.createQualityEnhanceTemplate, hcClient);
    }

    public DeleteQualityEnhanceTemplateResponse deleteQualityEnhanceTemplate(
        DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    public SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateInvoker(
        DeleteQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>(request,
            MpcMeta.deleteQualityEnhanceTemplate, hcClient);
    }

    public ListQualityEnhanceDefaultTemplateResponse listQualityEnhanceDefaultTemplate(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    public SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateInvoker(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return new SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>(
            request, MpcMeta.listQualityEnhanceDefaultTemplate, hcClient);
    }

    public UpdateQualityEnhanceTemplateResponse updateQualityEnhanceTemplate(
        UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    public SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateInvoker(
        UpdateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>(request,
            MpcMeta.updateQualityEnhanceTemplate, hcClient);
    }

    public ListTranscodeDetailResponse listTranscodeDetail(ListTranscodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    public SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetailInvoker(
        ListTranscodeDetailRequest request) {
        return new SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>(request,
            MpcMeta.listTranscodeDetail, hcClient);
    }

    public CancelRemuxTaskResponse cancelRemuxTask(CancelRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    public SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTaskInvoker(
        CancelRemuxTaskRequest request) {
        return new SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>(request, MpcMeta.cancelRemuxTask,
            hcClient);
    }

    public CreateRemuxTaskResponse createRemuxTask(CreateRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    public SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTaskInvoker(
        CreateRemuxTaskRequest request) {
        return new SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>(request, MpcMeta.createRemuxTask,
            hcClient);
    }

    public CreateRetryRemuxTaskResponse createRetryRemuxTask(CreateRetryRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    public SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTaskInvoker(
        CreateRetryRemuxTaskRequest request) {
        return new SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>(request,
            MpcMeta.createRetryRemuxTask, hcClient);
    }

    public DeleteRemuxTaskResponse deleteRemuxTask(DeleteRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    public SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTaskInvoker(
        DeleteRemuxTaskRequest request) {
        return new SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>(request, MpcMeta.deleteRemuxTask,
            hcClient);
    }

    public ListRemuxTaskResponse listRemuxTask(ListRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    public SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTaskInvoker(ListRemuxTaskRequest request) {
        return new SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>(request, MpcMeta.listRemuxTask, hcClient);
    }

    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    public SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupInvoker(
        CreateTemplateGroupRequest request) {
        return new SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            MpcMeta.createTemplateGroup, hcClient);
    }

    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    public SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupInvoker(
        DeleteTemplateGroupRequest request) {
        return new SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            MpcMeta.deleteTemplateGroup, hcClient);
    }

    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    public SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupInvoker(
        ListTemplateGroupRequest request) {
        return new SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, MpcMeta.listTemplateGroup,
            hcClient);
    }

    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    public SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupInvoker(
        UpdateTemplateGroupRequest request) {
        return new SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
            MpcMeta.updateTemplateGroup, hcClient);
    }

    public CreateThumbnailsTaskResponse createThumbnailsTask(CreateThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    public SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTaskInvoker(
        CreateThumbnailsTaskRequest request) {
        return new SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>(request,
            MpcMeta.createThumbnailsTask, hcClient);
    }

    public DeleteThumbnailsTaskResponse deleteThumbnailsTask(DeleteThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    public SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTaskInvoker(
        DeleteThumbnailsTaskRequest request) {
        return new SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>(request,
            MpcMeta.deleteThumbnailsTask, hcClient);
    }

    public ListThumbnailsTaskResponse listThumbnailsTask(ListThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    public SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTaskInvoker(
        ListThumbnailsTaskRequest request) {
        return new SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>(request,
            MpcMeta.listThumbnailsTask, hcClient);
    }

    public CreateTranscodingTaskResponse createTranscodingTask(CreateTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    public SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTaskInvoker(
        CreateTranscodingTaskRequest request) {
        return new SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>(request,
            MpcMeta.createTranscodingTask, hcClient);
    }

    public DeleteTranscodingTaskResponse deleteTranscodingTask(DeleteTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    public SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTaskInvoker(
        DeleteTranscodingTaskRequest request) {
        return new SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>(request,
            MpcMeta.deleteTranscodingTask, hcClient);
    }

    public DeleteTranscodingTaskByConsoleResponse deleteTranscodingTaskByConsole(
        DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    public SyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleInvoker(
        DeleteTranscodingTaskByConsoleRequest request) {
        return new SyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse>(request,
            MpcMeta.deleteTranscodingTaskByConsole, hcClient);
    }

    public ListStatSummaryResponse listStatSummary(ListStatSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    public SyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummaryInvoker(
        ListStatSummaryRequest request) {
        return new SyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse>(request, MpcMeta.listStatSummary,
            hcClient);
    }

    public ListTranscodingTaskResponse listTranscodingTask(ListTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    public SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTaskInvoker(
        ListTranscodingTaskRequest request) {
        return new SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>(request,
            MpcMeta.listTranscodingTask, hcClient);
    }

    public CreateTransTemplateResponse createTransTemplate(CreateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    public SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplateInvoker(
        CreateTransTemplateRequest request) {
        return new SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>(request,
            MpcMeta.createTransTemplate, hcClient);
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MpcMeta.deleteTemplate,
            hcClient);
    }

    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplate);
    }

    public SyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateInvoker(ListTemplateRequest request) {
        return new SyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, MpcMeta.listTemplate, hcClient);
    }

    public UpdateTransTemplateResponse updateTransTemplate(UpdateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    public SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplateInvoker(
        UpdateTransTemplateRequest request) {
        return new SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>(request,
            MpcMeta.updateTransTemplate, hcClient);
    }

    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    public SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateInvoker(
        CreateWatermarkTemplateRequest request) {
        return new SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            MpcMeta.createWatermarkTemplate, hcClient);
    }

    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    public SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            MpcMeta.deleteWatermarkTemplate, hcClient);
    }

    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    public SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateInvoker(
        ListWatermarkTemplateRequest request) {
        return new SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            MpcMeta.listWatermarkTemplate, hcClient);
    }

    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

    public SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            MpcMeta.updateWatermarkTemplate, hcClient);
    }

}
