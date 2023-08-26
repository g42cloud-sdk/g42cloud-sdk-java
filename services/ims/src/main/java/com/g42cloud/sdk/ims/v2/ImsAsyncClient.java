package com.g42cloud.sdk.ims.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class ImsAsyncClient {

    protected HcClient hcClient;

    public ImsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsAsyncClient> newBuilder() {
        ClientBuilder<ImsAsyncClient> clientBuilder = new ClientBuilder<>(ImsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AddImageTagResponse> addImageTagAsync(AddImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.addImageTag);
    }

    public AsyncInvoker<AddImageTagRequest, AddImageTagResponse> addImageTagAsyncInvoker(AddImageTagRequest request) {
        return new AsyncInvoker<AddImageTagRequest, AddImageTagResponse>(request, ImsMeta.addImageTag, hcClient);
    }

    public CompletableFuture<BatchAddMembersResponse> batchAddMembersAsync(BatchAddMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    public AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembersAsyncInvoker(
        BatchAddMembersRequest request) {
        return new AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>(request, ImsMeta.batchAddMembers,
            hcClient);
    }

    public CompletableFuture<BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsync(
        BatchAddOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddOrDeleteTags);
    }

    public AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsyncInvoker(
        BatchAddOrDeleteTagsRequest request) {
        return new AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>(request,
            ImsMeta.batchAddOrDeleteTags, hcClient);
    }

    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    public AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersAsyncInvoker(
        BatchDeleteMembersRequest request) {
        return new AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request,
            ImsMeta.batchDeleteMembers, hcClient);
    }

    public CompletableFuture<BatchUpdateMembersResponse> batchUpdateMembersAsync(BatchUpdateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    public AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersAsyncInvoker(
        BatchUpdateMembersRequest request) {
        return new AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>(request,
            ImsMeta.batchUpdateMembers, hcClient);
    }

    public CompletableFuture<CopyImageCrossRegionResponse> copyImageCrossRegionAsync(
        CopyImageCrossRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    public AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegionAsyncInvoker(
        CopyImageCrossRegionRequest request) {
        return new AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>(request,
            ImsMeta.copyImageCrossRegion, hcClient);
    }

    public CompletableFuture<CopyImageInRegionResponse> copyImageInRegionAsync(CopyImageInRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    public AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegionAsyncInvoker(
        CopyImageInRegionRequest request) {
        return new AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>(request, ImsMeta.copyImageInRegion,
            hcClient);
    }

    public CompletableFuture<CreateDataImageResponse> createDataImageAsync(CreateDataImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createDataImage);
    }

    public AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse> createDataImageAsyncInvoker(
        CreateDataImageRequest request) {
        return new AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse>(request, ImsMeta.createDataImage,
            hcClient);
    }

    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createImage);
    }

    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<CreateImageRequest, CreateImageResponse>(request, ImsMeta.createImage, hcClient);
    }

    public CompletableFuture<CreateOrUpdateTagsResponse> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    public AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTagsAsyncInvoker(
        CreateOrUpdateTagsRequest request) {
        return new AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>(request,
            ImsMeta.createOrUpdateTags, hcClient);
    }

    public CompletableFuture<CreateWholeImageResponse> createWholeImageAsync(CreateWholeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    public AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImageAsyncInvoker(
        CreateWholeImageRequest request) {
        return new AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>(request, ImsMeta.createWholeImage,
            hcClient);
    }

    public CompletableFuture<DeleteImageTagResponse> deleteImageTagAsync(DeleteImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.deleteImageTag);
    }

    public AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTagAsyncInvoker(
        DeleteImageTagRequest request) {
        return new AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>(request, ImsMeta.deleteImageTag,
            hcClient);
    }

    public CompletableFuture<ExportImageResponse> exportImageAsync(ExportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.exportImage);
    }

    public AsyncInvoker<ExportImageRequest, ExportImageResponse> exportImageAsyncInvoker(ExportImageRequest request) {
        return new AsyncInvoker<ExportImageRequest, ExportImageResponse>(request, ImsMeta.exportImage, hcClient);
    }

    public CompletableFuture<ImportImageQuickResponse> importImageQuickAsync(ImportImageQuickRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    public AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuickAsyncInvoker(
        ImportImageQuickRequest request) {
        return new AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>(request, ImsMeta.importImageQuick,
            hcClient);
    }

    public CompletableFuture<ListImageByTagsResponse> listImageByTagsAsync(ListImageByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageByTags);
    }

    public AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTagsAsyncInvoker(
        ListImageByTagsRequest request) {
        return new AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>(request, ImsMeta.listImageByTags,
            hcClient);
    }

    public CompletableFuture<ListImageTagsResponse> listImageTagsAsync(ListImageTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageTags);
    }

    public AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse> listImageTagsAsyncInvoker(
        ListImageTagsRequest request) {
        return new AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse>(request, ImsMeta.listImageTags, hcClient);
    }

    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImages);
    }

    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, ImsMeta.listImages, hcClient);
    }

    public CompletableFuture<ListImagesTagsResponse> listImagesTagsAsync(ListImagesTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImagesTags);
    }

    public AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTagsAsyncInvoker(
        ListImagesTagsRequest request) {
        return new AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>(request, ImsMeta.listImagesTags,
            hcClient);
    }

    public CompletableFuture<ListOsVersionsResponse> listOsVersionsAsync(ListOsVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    public AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersionsAsyncInvoker(
        ListOsVersionsRequest request) {
        return new AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>(request, ImsMeta.listOsVersions,
            hcClient);
    }

    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listTags);
    }

    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, ImsMeta.listTags, hcClient);
    }

    public CompletableFuture<RegisterImageResponse> registerImageAsync(RegisterImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.registerImage);
    }

    public AsyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageAsyncInvoker(
        RegisterImageRequest request) {
        return new AsyncInvoker<RegisterImageRequest, RegisterImageResponse>(request, ImsMeta.registerImage, hcClient);
    }

    public CompletableFuture<ShowImageQuotaResponse> showImageQuotaAsync(ShowImageQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    public AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuotaAsyncInvoker(
        ShowImageQuotaRequest request) {
        return new AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>(request, ImsMeta.showImageQuota,
            hcClient);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJob);
    }

    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, ImsMeta.showJob, hcClient);
    }

    public CompletableFuture<ShowJobProgressResponse> showJobProgressAsync(ShowJobProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJobProgress);
    }

    public AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressAsyncInvoker(
        ShowJobProgressRequest request) {
        return new AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>(request, ImsMeta.showJobProgress,
            hcClient);
    }

    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.updateImage);
    }

    public AsyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageAsyncInvoker(UpdateImageRequest request) {
        return new AsyncInvoker<UpdateImageRequest, UpdateImageResponse>(request, ImsMeta.updateImage, hcClient);
    }

    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listVersions);
    }

    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, ImsMeta.listVersions, hcClient);
    }

    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showVersion);
    }

    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, ImsMeta.showVersion, hcClient);
    }

    public CompletableFuture<GlanceAddImageMemberResponse> glanceAddImageMemberAsync(
        GlanceAddImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    public AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMemberAsyncInvoker(
        GlanceAddImageMemberRequest request) {
        return new AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>(request,
            ImsMeta.glanceAddImageMember, hcClient);
    }

    public CompletableFuture<GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsync(
        GlanceCreateImageMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    public AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsyncInvoker(
        GlanceCreateImageMetadataRequest request) {
        return new AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>(request,
            ImsMeta.glanceCreateImageMetadata, hcClient);
    }

    public CompletableFuture<GlanceCreateTagResponse> glanceCreateTagAsync(GlanceCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    public AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTagAsyncInvoker(
        GlanceCreateTagRequest request) {
        return new AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>(request, ImsMeta.glanceCreateTag,
            hcClient);
    }

    public CompletableFuture<GlanceDeleteImageResponse> glanceDeleteImageAsync(GlanceDeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    public AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImageAsyncInvoker(
        GlanceDeleteImageRequest request) {
        return new AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>(request, ImsMeta.glanceDeleteImage,
            hcClient);
    }

    public CompletableFuture<GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsync(
        GlanceDeleteImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    public AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsyncInvoker(
        GlanceDeleteImageMemberRequest request) {
        return new AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>(request,
            ImsMeta.glanceDeleteImageMember, hcClient);
    }

    public CompletableFuture<GlanceDeleteTagResponse> glanceDeleteTagAsync(GlanceDeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    public AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTagAsyncInvoker(
        GlanceDeleteTagRequest request) {
        return new AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>(request, ImsMeta.glanceDeleteTag,
            hcClient);
    }

    public CompletableFuture<GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsync(
        GlanceListImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    public AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsyncInvoker(
        GlanceListImageMemberSchemasRequest request) {
        return new AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>(request,
            ImsMeta.glanceListImageMemberSchemas, hcClient);
    }

    public CompletableFuture<GlanceListImageMembersResponse> glanceListImageMembersAsync(
        GlanceListImageMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    public AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembersAsyncInvoker(
        GlanceListImageMembersRequest request) {
        return new AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>(request,
            ImsMeta.glanceListImageMembers, hcClient);
    }

    public CompletableFuture<GlanceListImageSchemasResponse> glanceListImageSchemasAsync(
        GlanceListImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    public AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemasAsyncInvoker(
        GlanceListImageSchemasRequest request) {
        return new AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>(request,
            ImsMeta.glanceListImageSchemas, hcClient);
    }

    public CompletableFuture<GlanceListImagesResponse> glanceListImagesAsync(GlanceListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    public AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImagesAsyncInvoker(
        GlanceListImagesRequest request) {
        return new AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>(request, ImsMeta.glanceListImages,
            hcClient);
    }

    public CompletableFuture<GlanceShowImageResponse> glanceShowImageAsync(GlanceShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    public AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImageAsyncInvoker(
        GlanceShowImageRequest request) {
        return new AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>(request, ImsMeta.glanceShowImage,
            hcClient);
    }

    public CompletableFuture<GlanceShowImageMemberResponse> glanceShowImageMemberAsync(
        GlanceShowImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    public AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMemberAsyncInvoker(
        GlanceShowImageMemberRequest request) {
        return new AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>(request,
            ImsMeta.glanceShowImageMember, hcClient);
    }

    public CompletableFuture<GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsync(
        GlanceShowImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    public AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsyncInvoker(
        GlanceShowImageMemberSchemasRequest request) {
        return new AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>(request,
            ImsMeta.glanceShowImageMemberSchemas, hcClient);
    }

    public CompletableFuture<GlanceShowImageSchemasResponse> glanceShowImageSchemasAsync(
        GlanceShowImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    public AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemasAsyncInvoker(
        GlanceShowImageSchemasRequest request) {
        return new AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>(request,
            ImsMeta.glanceShowImageSchemas, hcClient);
    }

    public CompletableFuture<GlanceUpdateImageResponse> glanceUpdateImageAsync(GlanceUpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    public AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImageAsyncInvoker(
        GlanceUpdateImageRequest request) {
        return new AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>(request, ImsMeta.glanceUpdateImage,
            hcClient);
    }

    public CompletableFuture<GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsync(
        GlanceUpdateImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

    public AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsyncInvoker(
        GlanceUpdateImageMemberRequest request) {
        return new AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>(request,
            ImsMeta.glanceUpdateImageMember, hcClient);
    }

}
