package com.g42cloud.sdk.smn.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.smn.v2.model.AddSubscriptionRequest;
import com.g42cloud.sdk.smn.v2.model.AddSubscriptionResponse;
import com.g42cloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsRequest;
import com.g42cloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsResponse;
import com.g42cloud.sdk.smn.v2.model.CancelSubscriptionRequest;
import com.g42cloud.sdk.smn.v2.model.CancelSubscriptionResponse;
import com.g42cloud.sdk.smn.v2.model.CreateApplicationEndpointRequest;
import com.g42cloud.sdk.smn.v2.model.CreateApplicationEndpointResponse;
import com.g42cloud.sdk.smn.v2.model.CreateApplicationRequest;
import com.g42cloud.sdk.smn.v2.model.CreateApplicationResponse;
import com.g42cloud.sdk.smn.v2.model.CreateLogtankRequest;
import com.g42cloud.sdk.smn.v2.model.CreateLogtankResponse;
import com.g42cloud.sdk.smn.v2.model.CreateMessageTemplateRequest;
import com.g42cloud.sdk.smn.v2.model.CreateMessageTemplateResponse;
import com.g42cloud.sdk.smn.v2.model.CreateResourceTagRequest;
import com.g42cloud.sdk.smn.v2.model.CreateResourceTagResponse;
import com.g42cloud.sdk.smn.v2.model.CreateTopicRequest;
import com.g42cloud.sdk.smn.v2.model.CreateTopicResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteApplicationEndpointRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteApplicationEndpointResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteApplicationRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteApplicationResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteLogtankRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteLogtankResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteMessageTemplateRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteMessageTemplateResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteResourceTagRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteResourceTagResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicAttributeByNameRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicAttributeByNameResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicAttributesRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicAttributesResponse;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicRequest;
import com.g42cloud.sdk.smn.v2.model.DeleteTopicResponse;
import com.g42cloud.sdk.smn.v2.model.ListApplicationAttributesRequest;
import com.g42cloud.sdk.smn.v2.model.ListApplicationAttributesResponse;
import com.g42cloud.sdk.smn.v2.model.ListApplicationEndpointAttributesRequest;
import com.g42cloud.sdk.smn.v2.model.ListApplicationEndpointAttributesResponse;
import com.g42cloud.sdk.smn.v2.model.ListApplicationEndpointsRequest;
import com.g42cloud.sdk.smn.v2.model.ListApplicationEndpointsResponse;
import com.g42cloud.sdk.smn.v2.model.ListApplicationsRequest;
import com.g42cloud.sdk.smn.v2.model.ListApplicationsResponse;
import com.g42cloud.sdk.smn.v2.model.ListLogtankRequest;
import com.g42cloud.sdk.smn.v2.model.ListLogtankResponse;
import com.g42cloud.sdk.smn.v2.model.ListMessageTemplateDetailsRequest;
import com.g42cloud.sdk.smn.v2.model.ListMessageTemplateDetailsResponse;
import com.g42cloud.sdk.smn.v2.model.ListMessageTemplatesRequest;
import com.g42cloud.sdk.smn.v2.model.ListMessageTemplatesResponse;
import com.g42cloud.sdk.smn.v2.model.ListProjectTagsRequest;
import com.g42cloud.sdk.smn.v2.model.ListProjectTagsResponse;
import com.g42cloud.sdk.smn.v2.model.ListResourceInstancesRequest;
import com.g42cloud.sdk.smn.v2.model.ListResourceInstancesResponse;
import com.g42cloud.sdk.smn.v2.model.ListResourceTagsRequest;
import com.g42cloud.sdk.smn.v2.model.ListResourceTagsResponse;
import com.g42cloud.sdk.smn.v2.model.ListSubscriptionsByTopicRequest;
import com.g42cloud.sdk.smn.v2.model.ListSubscriptionsByTopicResponse;
import com.g42cloud.sdk.smn.v2.model.ListSubscriptionsRequest;
import com.g42cloud.sdk.smn.v2.model.ListSubscriptionsResponse;
import com.g42cloud.sdk.smn.v2.model.ListTopicAttributesRequest;
import com.g42cloud.sdk.smn.v2.model.ListTopicAttributesResponse;
import com.g42cloud.sdk.smn.v2.model.ListTopicDetailsRequest;
import com.g42cloud.sdk.smn.v2.model.ListTopicDetailsResponse;
import com.g42cloud.sdk.smn.v2.model.ListTopicsRequest;
import com.g42cloud.sdk.smn.v2.model.ListTopicsResponse;
import com.g42cloud.sdk.smn.v2.model.ListVersionRequest;
import com.g42cloud.sdk.smn.v2.model.ListVersionResponse;
import com.g42cloud.sdk.smn.v2.model.ListVersionsRequest;
import com.g42cloud.sdk.smn.v2.model.ListVersionsResponse;
import com.g42cloud.sdk.smn.v2.model.PublishAppMessageRequest;
import com.g42cloud.sdk.smn.v2.model.PublishAppMessageResponse;
import com.g42cloud.sdk.smn.v2.model.PublishMessageRequest;
import com.g42cloud.sdk.smn.v2.model.PublishMessageResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateApplicationEndpointRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateApplicationEndpointResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateApplicationRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateApplicationResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateLogtankRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateLogtankResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateMessageTemplateRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateMessageTemplateResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateSubscriptionRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateSubscriptionResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateTopicAttributeRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateTopicAttributeResponse;
import com.g42cloud.sdk.smn.v2.model.UpdateTopicRequest;
import com.g42cloud.sdk.smn.v2.model.UpdateTopicResponse;

public class SmnClient {

    protected HcClient hcClient;

    public SmnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnClient> newBuilder() {
        ClientBuilder<SmnClient> clientBuilder = new ClientBuilder<>(SmnClient::new);
        return clientBuilder;
    }

    public AddSubscriptionResponse addSubscription(AddSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.addSubscription);
    }

    public SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionInvoker(
        AddSubscriptionRequest request) {
        return new SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>(request, SmnMeta.addSubscription,
            hcClient);
    }

    public BatchCreateOrDeleteResourceTagsResponse batchCreateOrDeleteResourceTags(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchCreateOrDeleteResourceTags);
    }

    public SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>(request,
            SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    public CancelSubscriptionResponse cancelSubscription(CancelSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.cancelSubscription);
    }

    public SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionInvoker(
        CancelSubscriptionRequest request) {
        return new SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>(request,
            SmnMeta.cancelSubscription, hcClient);
    }

    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createLogtank);
    }

    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>(request, SmnMeta.createLogtank, hcClient);
    }

    public CreateMessageTemplateResponse createMessageTemplate(CreateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createMessageTemplate);
    }

    public SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateInvoker(
        CreateMessageTemplateRequest request) {
        return new SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>(request,
            SmnMeta.createMessageTemplate, hcClient);
    }

    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createResourceTag);
    }

    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, SmnMeta.createResourceTag,
            hcClient);
    }

    public CreateTopicResponse createTopic(CreateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createTopic);
    }

    public SyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicInvoker(CreateTopicRequest request) {
        return new SyncInvoker<CreateTopicRequest, CreateTopicResponse>(request, SmnMeta.createTopic, hcClient);
    }

    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteLogtank);
    }

    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>(request, SmnMeta.deleteLogtank, hcClient);
    }

    public DeleteMessageTemplateResponse deleteMessageTemplate(DeleteMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteMessageTemplate);
    }

    public SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateInvoker(
        DeleteMessageTemplateRequest request) {
        return new SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>(request,
            SmnMeta.deleteMessageTemplate, hcClient);
    }

    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteResourceTag);
    }

    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, SmnMeta.deleteResourceTag,
            hcClient);
    }

    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopic);
    }

    public SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicInvoker(DeleteTopicRequest request) {
        return new SyncInvoker<DeleteTopicRequest, DeleteTopicResponse>(request, SmnMeta.deleteTopic, hcClient);
    }

    public DeleteTopicAttributeByNameResponse deleteTopicAttributeByName(DeleteTopicAttributeByNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributeByName);
    }

    public SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>(request,
            SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    public DeleteTopicAttributesResponse deleteTopicAttributes(DeleteTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributes);
    }

    public SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesInvoker(
        DeleteTopicAttributesRequest request) {
        return new SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>(request,
            SmnMeta.deleteTopicAttributes, hcClient);
    }

    public ListLogtankResponse listLogtank(ListLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listLogtank);
    }

    public SyncInvoker<ListLogtankRequest, ListLogtankResponse> listLogtankInvoker(ListLogtankRequest request) {
        return new SyncInvoker<ListLogtankRequest, ListLogtankResponse>(request, SmnMeta.listLogtank, hcClient);
    }

    public ListMessageTemplateDetailsResponse listMessageTemplateDetails(ListMessageTemplateDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplateDetails);
    }

    public SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>(request,
            SmnMeta.listMessageTemplateDetails, hcClient);
    }

    public ListMessageTemplatesResponse listMessageTemplates(ListMessageTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplates);
    }

    public SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesInvoker(
        ListMessageTemplatesRequest request) {
        return new SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>(request,
            SmnMeta.listMessageTemplates, hcClient);
    }

    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listProjectTags);
    }

    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, SmnMeta.listProjectTags,
            hcClient);
    }

    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceInstances);
    }

    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            SmnMeta.listResourceInstances, hcClient);
    }

    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceTags);
    }

    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, SmnMeta.listResourceTags,
            hcClient);
    }

    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptions);
    }

    public SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsInvoker(
        ListSubscriptionsRequest request) {
        return new SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, SmnMeta.listSubscriptions,
            hcClient);
    }

    public ListSubscriptionsByTopicResponse listSubscriptionsByTopic(ListSubscriptionsByTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptionsByTopic);
    }

    public SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>(request,
            SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    public ListTopicAttributesResponse listTopicAttributes(ListTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicAttributes);
    }

    public SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesInvoker(
        ListTopicAttributesRequest request) {
        return new SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>(request,
            SmnMeta.listTopicAttributes, hcClient);
    }

    public ListTopicDetailsResponse listTopicDetails(ListTopicDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicDetails);
    }

    public SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsInvoker(
        ListTopicDetailsRequest request) {
        return new SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>(request, SmnMeta.listTopicDetails,
            hcClient);
    }

    public ListTopicsResponse listTopics(ListTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopics);
    }

    public SyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsInvoker(ListTopicsRequest request) {
        return new SyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, SmnMeta.listTopics, hcClient);
    }

    public ListVersionResponse listVersion(ListVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersion);
    }

    public SyncInvoker<ListVersionRequest, ListVersionResponse> listVersionInvoker(ListVersionRequest request) {
        return new SyncInvoker<ListVersionRequest, ListVersionResponse>(request, SmnMeta.listVersion, hcClient);
    }

    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersions);
    }

    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, SmnMeta.listVersions, hcClient);
    }

    public PublishMessageResponse publishMessage(PublishMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishMessage);
    }

    public SyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageInvoker(
        PublishMessageRequest request) {
        return new SyncInvoker<PublishMessageRequest, PublishMessageResponse>(request, SmnMeta.publishMessage,
            hcClient);
    }

    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateLogtank);
    }

    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>(request, SmnMeta.updateLogtank, hcClient);
    }

    public UpdateMessageTemplateResponse updateMessageTemplate(UpdateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateMessageTemplate);
    }

    public SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateInvoker(
        UpdateMessageTemplateRequest request) {
        return new SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>(request,
            SmnMeta.updateMessageTemplate, hcClient);
    }

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateSubscription);
    }

    public SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionInvoker(
        UpdateSubscriptionRequest request) {
        return new SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>(request,
            SmnMeta.updateSubscription, hcClient);
    }

    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopic);
    }

    public SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicInvoker(UpdateTopicRequest request) {
        return new SyncInvoker<UpdateTopicRequest, UpdateTopicResponse>(request, SmnMeta.updateTopic, hcClient);
    }

    public UpdateTopicAttributeResponse updateTopicAttribute(UpdateTopicAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopicAttribute);
    }

    public SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeInvoker(
        UpdateTopicAttributeRequest request) {
        return new SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>(request,
            SmnMeta.updateTopicAttribute, hcClient);
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplication);
    }

    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, SmnMeta.createApplication,
            hcClient);
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, SmnMeta.deleteApplication,
            hcClient);
    }

    public ListApplicationAttributesResponse listApplicationAttributes(ListApplicationAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    public SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesInvoker(
        ListApplicationAttributesRequest request) {
        return new SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>(request,
            SmnMeta.listApplicationAttributes, hcClient);
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplications);
    }

    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, SmnMeta.listApplications,
            hcClient);
    }

    public PublishAppMessageResponse publishAppMessage(PublishAppMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    public SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageInvoker(
        PublishAppMessageRequest request) {
        return new SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>(request, SmnMeta.publishAppMessage,
            hcClient);
    }

    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplication);
    }

    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>(request, SmnMeta.updateApplication,
            hcClient);
    }

    public CreateApplicationEndpointResponse createApplicationEndpoint(CreateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    public SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointInvoker(
        CreateApplicationEndpointRequest request) {
        return new SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>(request,
            SmnMeta.createApplicationEndpoint, hcClient);
    }

    public DeleteApplicationEndpointResponse deleteApplicationEndpoint(DeleteApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    public SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointInvoker(
        DeleteApplicationEndpointRequest request) {
        return new SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>(request,
            SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    public ListApplicationEndpointAttributesResponse listApplicationEndpointAttributes(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    public SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>(
            request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    public ListApplicationEndpointsResponse listApplicationEndpoints(ListApplicationEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    public SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsInvoker(
        ListApplicationEndpointsRequest request) {
        return new SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>(request,
            SmnMeta.listApplicationEndpoints, hcClient);
    }

    public UpdateApplicationEndpointResponse updateApplicationEndpoint(UpdateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    public SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointInvoker(
        UpdateApplicationEndpointRequest request) {
        return new SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>(request,
            SmnMeta.updateApplicationEndpoint, hcClient);
    }

}
