package com.g42cloud.sdk.smn.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.smn.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class SmnAsyncClient {

    protected HcClient hcClient;

    public SmnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnAsyncClient> newBuilder() {
        return new ClientBuilder<>(SmnAsyncClient::new);
    }

    public CompletableFuture<AddSubscriptionResponse> addSubscriptionAsync(AddSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.addSubscription);
    }

    public AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionAsyncInvoker(
        AddSubscriptionRequest request) {
        return new AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>(request, SmnMeta.addSubscription,
            hcClient);
    }

    public CompletableFuture<BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsAsync(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.batchCreateOrDeleteResourceTags);
    }

    public AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsAsyncInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>(
            request, SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    public CompletableFuture<CancelSubscriptionResponse> cancelSubscriptionAsync(CancelSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.cancelSubscription);
    }

    public AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionAsyncInvoker(
        CancelSubscriptionRequest request) {
        return new AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>(request,
            SmnMeta.cancelSubscription, hcClient);
    }

    public CompletableFuture<CreateLogtankResponse> createLogtankAsync(CreateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createLogtank);
    }

    public AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankAsyncInvoker(
        CreateLogtankRequest request) {
        return new AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse>(request, SmnMeta.createLogtank, hcClient);
    }

    public CompletableFuture<CreateMessageTemplateResponse> createMessageTemplateAsync(
        CreateMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createMessageTemplate);
    }

    public AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateAsyncInvoker(
        CreateMessageTemplateRequest request) {
        return new AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>(request,
            SmnMeta.createMessageTemplate, hcClient);
    }

    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createResourceTag);
    }

    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, SmnMeta.createResourceTag,
            hcClient);
    }

    public CompletableFuture<CreateTopicResponse> createTopicAsync(CreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createTopic);
    }

    public AsyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicAsyncInvoker(CreateTopicRequest request) {
        return new AsyncInvoker<CreateTopicRequest, CreateTopicResponse>(request, SmnMeta.createTopic, hcClient);
    }

    public CompletableFuture<DeleteLogtankResponse> deleteLogtankAsync(DeleteLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteLogtank);
    }

    public AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankAsyncInvoker(
        DeleteLogtankRequest request) {
        return new AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>(request, SmnMeta.deleteLogtank, hcClient);
    }

    public CompletableFuture<DeleteMessageTemplateResponse> deleteMessageTemplateAsync(
        DeleteMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteMessageTemplate);
    }

    public AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateAsyncInvoker(
        DeleteMessageTemplateRequest request) {
        return new AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>(request,
            SmnMeta.deleteMessageTemplate, hcClient);
    }

    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteResourceTag);
    }

    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, SmnMeta.deleteResourceTag,
            hcClient);
    }

    public CompletableFuture<DeleteTopicResponse> deleteTopicAsync(DeleteTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopic);
    }

    public AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicAsyncInvoker(DeleteTopicRequest request) {
        return new AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>(request, SmnMeta.deleteTopic, hcClient);
    }

    public CompletableFuture<DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameAsync(
        DeleteTopicAttributeByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopicAttributeByName);
    }

    public AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameAsyncInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>(request,
            SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    public CompletableFuture<DeleteTopicAttributesResponse> deleteTopicAttributesAsync(
        DeleteTopicAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopicAttributes);
    }

    public AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesAsyncInvoker(
        DeleteTopicAttributesRequest request) {
        return new AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>(request,
            SmnMeta.deleteTopicAttributes, hcClient);
    }

    public CompletableFuture<ListLogtankResponse> listLogtankAsync(ListLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listLogtank);
    }

    public AsyncInvoker<ListLogtankRequest, ListLogtankResponse> listLogtankAsyncInvoker(ListLogtankRequest request) {
        return new AsyncInvoker<ListLogtankRequest, ListLogtankResponse>(request, SmnMeta.listLogtank, hcClient);
    }

    public CompletableFuture<ListMessageTemplateDetailsResponse> listMessageTemplateDetailsAsync(
        ListMessageTemplateDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listMessageTemplateDetails);
    }

    public AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsAsyncInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>(request,
            SmnMeta.listMessageTemplateDetails, hcClient);
    }

    public CompletableFuture<ListMessageTemplatesResponse> listMessageTemplatesAsync(
        ListMessageTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listMessageTemplates);
    }

    public AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesAsyncInvoker(
        ListMessageTemplatesRequest request) {
        return new AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>(request,
            SmnMeta.listMessageTemplates, hcClient);
    }

    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listProjectTags);
    }

    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, SmnMeta.listProjectTags,
            hcClient);
    }

    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listResourceInstances);
    }

    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            SmnMeta.listResourceInstances, hcClient);
    }

    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listResourceTags);
    }

    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, SmnMeta.listResourceTags,
            hcClient);
    }

    public CompletableFuture<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listSubscriptions);
    }

    public AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsAsyncInvoker(
        ListSubscriptionsRequest request) {
        return new AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, SmnMeta.listSubscriptions,
            hcClient);
    }

    public CompletableFuture<ListSubscriptionsByTopicResponse> listSubscriptionsByTopicAsync(
        ListSubscriptionsByTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listSubscriptionsByTopic);
    }

    public AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicAsyncInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>(request,
            SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    public CompletableFuture<ListTopicAttributesResponse> listTopicAttributesAsync(ListTopicAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopicAttributes);
    }

    public AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesAsyncInvoker(
        ListTopicAttributesRequest request) {
        return new AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>(request,
            SmnMeta.listTopicAttributes, hcClient);
    }

    public CompletableFuture<ListTopicDetailsResponse> listTopicDetailsAsync(ListTopicDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopicDetails);
    }

    public AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsAsyncInvoker(
        ListTopicDetailsRequest request) {
        return new AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>(request, SmnMeta.listTopicDetails,
            hcClient);
    }

    public CompletableFuture<ListTopicsResponse> listTopicsAsync(ListTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopics);
    }

    public AsyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsAsyncInvoker(ListTopicsRequest request) {
        return new AsyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, SmnMeta.listTopics, hcClient);
    }

    public CompletableFuture<ListVersionResponse> listVersionAsync(ListVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listVersion);
    }

    public AsyncInvoker<ListVersionRequest, ListVersionResponse> listVersionAsyncInvoker(ListVersionRequest request) {
        return new AsyncInvoker<ListVersionRequest, ListVersionResponse>(request, SmnMeta.listVersion, hcClient);
    }

    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listVersions);
    }

    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, SmnMeta.listVersions, hcClient);
    }

    public CompletableFuture<PublishMessageResponse> publishMessageAsync(PublishMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishMessage);
    }

    public AsyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageAsyncInvoker(
        PublishMessageRequest request) {
        return new AsyncInvoker<PublishMessageRequest, PublishMessageResponse>(request, SmnMeta.publishMessage,
            hcClient);
    }

    public CompletableFuture<UpdateLogtankResponse> updateLogtankAsync(UpdateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateLogtank);
    }

    public AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankAsyncInvoker(
        UpdateLogtankRequest request) {
        return new AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>(request, SmnMeta.updateLogtank, hcClient);
    }

    public CompletableFuture<UpdateMessageTemplateResponse> updateMessageTemplateAsync(
        UpdateMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateMessageTemplate);
    }

    public AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateAsyncInvoker(
        UpdateMessageTemplateRequest request) {
        return new AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>(request,
            SmnMeta.updateMessageTemplate, hcClient);
    }

    public CompletableFuture<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateSubscription);
    }

    public AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionAsyncInvoker(
        UpdateSubscriptionRequest request) {
        return new AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>(request,
            SmnMeta.updateSubscription, hcClient);
    }

    public CompletableFuture<UpdateTopicResponse> updateTopicAsync(UpdateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateTopic);
    }

    public AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicAsyncInvoker(UpdateTopicRequest request) {
        return new AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>(request, SmnMeta.updateTopic, hcClient);
    }

    public CompletableFuture<UpdateTopicAttributeResponse> updateTopicAttributeAsync(
        UpdateTopicAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateTopicAttribute);
    }

    public AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeAsyncInvoker(
        UpdateTopicAttributeRequest request) {
        return new AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>(request,
            SmnMeta.updateTopicAttribute, hcClient);
    }

    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplication);
    }

    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, SmnMeta.createApplication,
            hcClient);
    }

    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, SmnMeta.deleteApplication,
            hcClient);
    }

    public CompletableFuture<ListApplicationAttributesResponse> listApplicationAttributesAsync(
        ListApplicationAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    public AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesAsyncInvoker(
        ListApplicationAttributesRequest request) {
        return new AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>(request,
            SmnMeta.listApplicationAttributes, hcClient);
    }

    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplications);
    }

    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, SmnMeta.listApplications,
            hcClient);
    }

    public CompletableFuture<PublishAppMessageResponse> publishAppMessageAsync(PublishAppMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    public AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageAsyncInvoker(
        PublishAppMessageRequest request) {
        return new AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>(request, SmnMeta.publishAppMessage,
            hcClient);
    }

    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplication);
    }

    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>(request, SmnMeta.updateApplication,
            hcClient);
    }

    public CompletableFuture<CreateApplicationEndpointResponse> createApplicationEndpointAsync(
        CreateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    public AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointAsyncInvoker(
        CreateApplicationEndpointRequest request) {
        return new AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>(request,
            SmnMeta.createApplicationEndpoint, hcClient);
    }

    public CompletableFuture<DeleteApplicationEndpointResponse> deleteApplicationEndpointAsync(
        DeleteApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    public AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointAsyncInvoker(
        DeleteApplicationEndpointRequest request) {
        return new AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>(request,
            SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    public CompletableFuture<ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsync(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    public AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsyncInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>(
            request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    public CompletableFuture<ListApplicationEndpointsResponse> listApplicationEndpointsAsync(
        ListApplicationEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    public AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsAsyncInvoker(
        ListApplicationEndpointsRequest request) {
        return new AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>(request,
            SmnMeta.listApplicationEndpoints, hcClient);
    }

    public CompletableFuture<UpdateApplicationEndpointResponse> updateApplicationEndpointAsync(
        UpdateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    public AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointAsyncInvoker(
        UpdateApplicationEndpointRequest request) {
        return new AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>(request,
            SmnMeta.updateApplicationEndpoint, hcClient);
    }

}
