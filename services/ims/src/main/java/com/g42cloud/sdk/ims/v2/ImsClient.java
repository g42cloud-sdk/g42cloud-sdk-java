package com.g42cloud.sdk.ims.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.ims.v2.model.AddImageTagRequest;
import com.g42cloud.sdk.ims.v2.model.AddImageTagResponse;
import com.g42cloud.sdk.ims.v2.model.BatchAddMembersRequest;
import com.g42cloud.sdk.ims.v2.model.BatchAddMembersResponse;
import com.g42cloud.sdk.ims.v2.model.BatchAddOrDeleteTagsRequest;
import com.g42cloud.sdk.ims.v2.model.BatchAddOrDeleteTagsResponse;
import com.g42cloud.sdk.ims.v2.model.BatchDeleteMembersRequest;
import com.g42cloud.sdk.ims.v2.model.BatchDeleteMembersResponse;
import com.g42cloud.sdk.ims.v2.model.BatchUpdateMembersRequest;
import com.g42cloud.sdk.ims.v2.model.BatchUpdateMembersResponse;
import com.g42cloud.sdk.ims.v2.model.CopyImageCrossRegionRequest;
import com.g42cloud.sdk.ims.v2.model.CopyImageCrossRegionResponse;
import com.g42cloud.sdk.ims.v2.model.CopyImageInRegionRequest;
import com.g42cloud.sdk.ims.v2.model.CopyImageInRegionResponse;
import com.g42cloud.sdk.ims.v2.model.CreateDataImageRequest;
import com.g42cloud.sdk.ims.v2.model.CreateDataImageResponse;
import com.g42cloud.sdk.ims.v2.model.CreateImageRequest;
import com.g42cloud.sdk.ims.v2.model.CreateImageResponse;
import com.g42cloud.sdk.ims.v2.model.CreateOrUpdateTagsRequest;
import com.g42cloud.sdk.ims.v2.model.CreateOrUpdateTagsResponse;
import com.g42cloud.sdk.ims.v2.model.CreateWholeImageRequest;
import com.g42cloud.sdk.ims.v2.model.CreateWholeImageResponse;
import com.g42cloud.sdk.ims.v2.model.DeleteImageTagRequest;
import com.g42cloud.sdk.ims.v2.model.DeleteImageTagResponse;
import com.g42cloud.sdk.ims.v2.model.ExportImageRequest;
import com.g42cloud.sdk.ims.v2.model.ExportImageResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceAddImageMemberRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceAddImageMemberResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceCreateImageMetadataRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceCreateImageMetadataResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceCreateTagRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceCreateTagResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteImageMemberRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteImageMemberResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteImageRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteImageResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteTagRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceDeleteTagResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageMemberSchemasRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageMemberSchemasResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageMembersRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageMembersResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageSchemasRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceListImageSchemasResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceListImagesRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceListImagesResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageMemberRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageMemberResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageMemberSchemasRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageMemberSchemasResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageSchemasRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceShowImageSchemasResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceUpdateImageMemberRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceUpdateImageMemberResponse;
import com.g42cloud.sdk.ims.v2.model.GlanceUpdateImageRequest;
import com.g42cloud.sdk.ims.v2.model.GlanceUpdateImageResponse;
import com.g42cloud.sdk.ims.v2.model.ImportImageQuickRequest;
import com.g42cloud.sdk.ims.v2.model.ImportImageQuickResponse;
import com.g42cloud.sdk.ims.v2.model.ListImageByTagsRequest;
import com.g42cloud.sdk.ims.v2.model.ListImageByTagsResponse;
import com.g42cloud.sdk.ims.v2.model.ListImageTagsRequest;
import com.g42cloud.sdk.ims.v2.model.ListImageTagsResponse;
import com.g42cloud.sdk.ims.v2.model.ListImagesRequest;
import com.g42cloud.sdk.ims.v2.model.ListImagesResponse;
import com.g42cloud.sdk.ims.v2.model.ListImagesTagsRequest;
import com.g42cloud.sdk.ims.v2.model.ListImagesTagsResponse;
import com.g42cloud.sdk.ims.v2.model.ListOsVersionsRequest;
import com.g42cloud.sdk.ims.v2.model.ListOsVersionsResponse;
import com.g42cloud.sdk.ims.v2.model.ListTagsRequest;
import com.g42cloud.sdk.ims.v2.model.ListTagsResponse;
import com.g42cloud.sdk.ims.v2.model.ListVersionsRequest;
import com.g42cloud.sdk.ims.v2.model.ListVersionsResponse;
import com.g42cloud.sdk.ims.v2.model.RegisterImageRequest;
import com.g42cloud.sdk.ims.v2.model.RegisterImageResponse;
import com.g42cloud.sdk.ims.v2.model.ShowImageQuotaRequest;
import com.g42cloud.sdk.ims.v2.model.ShowImageQuotaResponse;
import com.g42cloud.sdk.ims.v2.model.ShowJobProgressRequest;
import com.g42cloud.sdk.ims.v2.model.ShowJobProgressResponse;
import com.g42cloud.sdk.ims.v2.model.ShowJobRequest;
import com.g42cloud.sdk.ims.v2.model.ShowJobResponse;
import com.g42cloud.sdk.ims.v2.model.ShowVersionRequest;
import com.g42cloud.sdk.ims.v2.model.ShowVersionResponse;
import com.g42cloud.sdk.ims.v2.model.UpdateImageRequest;
import com.g42cloud.sdk.ims.v2.model.UpdateImageResponse;

public class ImsClient {

    protected HcClient hcClient;

    public ImsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsClient> newBuilder() {
        ClientBuilder<ImsClient> clientBuilder = new ClientBuilder<>(ImsClient::new);
        return clientBuilder;
    }

    public AddImageTagResponse addImageTag(AddImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.addImageTag);
    }

    public SyncInvoker<AddImageTagRequest, AddImageTagResponse> addImageTagInvoker(AddImageTagRequest request) {
        return new SyncInvoker<AddImageTagRequest, AddImageTagResponse>(request, ImsMeta.addImageTag, hcClient);
    }

    public BatchAddMembersResponse batchAddMembers(BatchAddMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    public SyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembersInvoker(
        BatchAddMembersRequest request) {
        return new SyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>(request, ImsMeta.batchAddMembers,
            hcClient);
    }

    public BatchAddOrDeleteTagsResponse batchAddOrDeleteTags(BatchAddOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddOrDeleteTags);
    }

    public SyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsInvoker(
        BatchAddOrDeleteTagsRequest request) {
        return new SyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>(request,
            ImsMeta.batchAddOrDeleteTags, hcClient);
    }

    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    public SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersInvoker(
        BatchDeleteMembersRequest request) {
        return new SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request,
            ImsMeta.batchDeleteMembers, hcClient);
    }

    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    public SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersInvoker(
        BatchUpdateMembersRequest request) {
        return new SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>(request,
            ImsMeta.batchUpdateMembers, hcClient);
    }

    public CopyImageCrossRegionResponse copyImageCrossRegion(CopyImageCrossRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    public SyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegionInvoker(
        CopyImageCrossRegionRequest request) {
        return new SyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>(request,
            ImsMeta.copyImageCrossRegion, hcClient);
    }

    public CopyImageInRegionResponse copyImageInRegion(CopyImageInRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    public SyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegionInvoker(
        CopyImageInRegionRequest request) {
        return new SyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>(request, ImsMeta.copyImageInRegion,
            hcClient);
    }

    public CreateDataImageResponse createDataImage(CreateDataImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createDataImage);
    }

    public SyncInvoker<CreateDataImageRequest, CreateDataImageResponse> createDataImageInvoker(
        CreateDataImageRequest request) {
        return new SyncInvoker<CreateDataImageRequest, CreateDataImageResponse>(request, ImsMeta.createDataImage,
            hcClient);
    }

    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createImage);
    }

    public SyncInvoker<CreateImageRequest, CreateImageResponse> createImageInvoker(CreateImageRequest request) {
        return new SyncInvoker<CreateImageRequest, CreateImageResponse>(request, ImsMeta.createImage, hcClient);
    }

    public CreateOrUpdateTagsResponse createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    public SyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTagsInvoker(
        CreateOrUpdateTagsRequest request) {
        return new SyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>(request,
            ImsMeta.createOrUpdateTags, hcClient);
    }

    public CreateWholeImageResponse createWholeImage(CreateWholeImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    public SyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImageInvoker(
        CreateWholeImageRequest request) {
        return new SyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>(request, ImsMeta.createWholeImage,
            hcClient);
    }

    public DeleteImageTagResponse deleteImageTag(DeleteImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.deleteImageTag);
    }

    public SyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTagInvoker(
        DeleteImageTagRequest request) {
        return new SyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>(request, ImsMeta.deleteImageTag,
            hcClient);
    }

    public ExportImageResponse exportImage(ExportImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.exportImage);
    }

    public SyncInvoker<ExportImageRequest, ExportImageResponse> exportImageInvoker(ExportImageRequest request) {
        return new SyncInvoker<ExportImageRequest, ExportImageResponse>(request, ImsMeta.exportImage, hcClient);
    }

    public ImportImageQuickResponse importImageQuick(ImportImageQuickRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    public SyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuickInvoker(
        ImportImageQuickRequest request) {
        return new SyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>(request, ImsMeta.importImageQuick,
            hcClient);
    }

    public ListImageByTagsResponse listImageByTags(ListImageByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImageByTags);
    }

    public SyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTagsInvoker(
        ListImageByTagsRequest request) {
        return new SyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>(request, ImsMeta.listImageByTags,
            hcClient);
    }

    public ListImageTagsResponse listImageTags(ListImageTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImageTags);
    }

    public SyncInvoker<ListImageTagsRequest, ListImageTagsResponse> listImageTagsInvoker(ListImageTagsRequest request) {
        return new SyncInvoker<ListImageTagsRequest, ListImageTagsResponse>(request, ImsMeta.listImageTags, hcClient);
    }

    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImages);
    }

    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<ListImagesRequest, ListImagesResponse>(request, ImsMeta.listImages, hcClient);
    }

    public ListImagesTagsResponse listImagesTags(ListImagesTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImagesTags);
    }

    public SyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTagsInvoker(
        ListImagesTagsRequest request) {
        return new SyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>(request, ImsMeta.listImagesTags,
            hcClient);
    }

    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    public SyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersionsInvoker(
        ListOsVersionsRequest request) {
        return new SyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>(request, ImsMeta.listOsVersions,
            hcClient);
    }

    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listTags);
    }

    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, ImsMeta.listTags, hcClient);
    }

    public RegisterImageResponse registerImage(RegisterImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.registerImage);
    }

    public SyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageInvoker(RegisterImageRequest request) {
        return new SyncInvoker<RegisterImageRequest, RegisterImageResponse>(request, ImsMeta.registerImage, hcClient);
    }

    public ShowImageQuotaResponse showImageQuota(ShowImageQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    public SyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuotaInvoker(
        ShowImageQuotaRequest request) {
        return new SyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>(request, ImsMeta.showImageQuota,
            hcClient);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJob);
    }

    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, ImsMeta.showJob, hcClient);
    }

    public ShowJobProgressResponse showJobProgress(ShowJobProgressRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJobProgress);
    }

    public SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressInvoker(
        ShowJobProgressRequest request) {
        return new SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>(request, ImsMeta.showJobProgress,
            hcClient);
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.updateImage);
    }

    public SyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageInvoker(UpdateImageRequest request) {
        return new SyncInvoker<UpdateImageRequest, UpdateImageResponse>(request, ImsMeta.updateImage, hcClient);
    }

    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listVersions);
    }

    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, ImsMeta.listVersions, hcClient);
    }

    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showVersion);
    }

    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, ImsMeta.showVersion, hcClient);
    }

    public GlanceAddImageMemberResponse glanceAddImageMember(GlanceAddImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    public SyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMemberInvoker(
        GlanceAddImageMemberRequest request) {
        return new SyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>(request,
            ImsMeta.glanceAddImageMember, hcClient);
    }

    public GlanceCreateImageMetadataResponse glanceCreateImageMetadata(GlanceCreateImageMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    public SyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadataInvoker(
        GlanceCreateImageMetadataRequest request) {
        return new SyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>(request,
            ImsMeta.glanceCreateImageMetadata, hcClient);
    }

    public GlanceCreateTagResponse glanceCreateTag(GlanceCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    public SyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTagInvoker(
        GlanceCreateTagRequest request) {
        return new SyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>(request, ImsMeta.glanceCreateTag,
            hcClient);
    }

    public GlanceDeleteImageResponse glanceDeleteImage(GlanceDeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    public SyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImageInvoker(
        GlanceDeleteImageRequest request) {
        return new SyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>(request, ImsMeta.glanceDeleteImage,
            hcClient);
    }

    public GlanceDeleteImageMemberResponse glanceDeleteImageMember(GlanceDeleteImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    public SyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMemberInvoker(
        GlanceDeleteImageMemberRequest request) {
        return new SyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>(request,
            ImsMeta.glanceDeleteImageMember, hcClient);
    }

    public GlanceDeleteTagResponse glanceDeleteTag(GlanceDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    public SyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTagInvoker(
        GlanceDeleteTagRequest request) {
        return new SyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>(request, ImsMeta.glanceDeleteTag,
            hcClient);
    }

    public GlanceListImageMemberSchemasResponse glanceListImageMemberSchemas(
        GlanceListImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    public SyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasInvoker(
        GlanceListImageMemberSchemasRequest request) {
        return new SyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>(request,
            ImsMeta.glanceListImageMemberSchemas, hcClient);
    }

    public GlanceListImageMembersResponse glanceListImageMembers(GlanceListImageMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    public SyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembersInvoker(
        GlanceListImageMembersRequest request) {
        return new SyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>(request,
            ImsMeta.glanceListImageMembers, hcClient);
    }

    public GlanceListImageSchemasResponse glanceListImageSchemas(GlanceListImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    public SyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemasInvoker(
        GlanceListImageSchemasRequest request) {
        return new SyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>(request,
            ImsMeta.glanceListImageSchemas, hcClient);
    }

    public GlanceListImagesResponse glanceListImages(GlanceListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    public SyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImagesInvoker(
        GlanceListImagesRequest request) {
        return new SyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>(request, ImsMeta.glanceListImages,
            hcClient);
    }

    public GlanceShowImageResponse glanceShowImage(GlanceShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    public SyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImageInvoker(
        GlanceShowImageRequest request) {
        return new SyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>(request, ImsMeta.glanceShowImage,
            hcClient);
    }

    public GlanceShowImageMemberResponse glanceShowImageMember(GlanceShowImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    public SyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMemberInvoker(
        GlanceShowImageMemberRequest request) {
        return new SyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>(request,
            ImsMeta.glanceShowImageMember, hcClient);
    }

    public GlanceShowImageMemberSchemasResponse glanceShowImageMemberSchemas(
        GlanceShowImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    public SyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasInvoker(
        GlanceShowImageMemberSchemasRequest request) {
        return new SyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>(request,
            ImsMeta.glanceShowImageMemberSchemas, hcClient);
    }

    public GlanceShowImageSchemasResponse glanceShowImageSchemas(GlanceShowImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    public SyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemasInvoker(
        GlanceShowImageSchemasRequest request) {
        return new SyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>(request,
            ImsMeta.glanceShowImageSchemas, hcClient);
    }

    public GlanceUpdateImageResponse glanceUpdateImage(GlanceUpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    public SyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImageInvoker(
        GlanceUpdateImageRequest request) {
        return new SyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>(request, ImsMeta.glanceUpdateImage,
            hcClient);
    }

    public GlanceUpdateImageMemberResponse glanceUpdateImageMember(GlanceUpdateImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

    public SyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMemberInvoker(
        GlanceUpdateImageMemberRequest request) {
        return new SyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>(request,
            ImsMeta.glanceUpdateImageMember, hcClient);
    }

}
