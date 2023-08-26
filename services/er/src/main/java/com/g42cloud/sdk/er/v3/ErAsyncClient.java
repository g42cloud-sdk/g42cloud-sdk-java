package com.g42cloud.sdk.er.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.er.v3.model.AssociateRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.AssociateRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.ChangeAvailabilityZoneRequest;
import com.g42cloud.sdk.er.v3.model.ChangeAvailabilityZoneResponse;
import com.g42cloud.sdk.er.v3.model.CreateEnterpriseRouterRequest;
import com.g42cloud.sdk.er.v3.model.CreateEnterpriseRouterResponse;
import com.g42cloud.sdk.er.v3.model.CreateResourceTagRequest;
import com.g42cloud.sdk.er.v3.model.CreateResourceTagResponse;
import com.g42cloud.sdk.er.v3.model.CreateRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.CreateRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.CreateStaticRouteRequest;
import com.g42cloud.sdk.er.v3.model.CreateStaticRouteResponse;
import com.g42cloud.sdk.er.v3.model.CreateVpcAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.CreateVpcAttachmentResponse;
import com.g42cloud.sdk.er.v3.model.DeleteEnterpriseRouterRequest;
import com.g42cloud.sdk.er.v3.model.DeleteEnterpriseRouterResponse;
import com.g42cloud.sdk.er.v3.model.DeleteResourceTagRequest;
import com.g42cloud.sdk.er.v3.model.DeleteResourceTagResponse;
import com.g42cloud.sdk.er.v3.model.DeleteRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.DeleteRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.DeleteStaticRouteRequest;
import com.g42cloud.sdk.er.v3.model.DeleteStaticRouteResponse;
import com.g42cloud.sdk.er.v3.model.DeleteVpcAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.DeleteVpcAttachmentResponse;
import com.g42cloud.sdk.er.v3.model.DisablePropagationRequest;
import com.g42cloud.sdk.er.v3.model.DisablePropagationResponse;
import com.g42cloud.sdk.er.v3.model.DisassociateRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.DisassociateRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.EnablePropagationRequest;
import com.g42cloud.sdk.er.v3.model.EnablePropagationResponse;
import com.g42cloud.sdk.er.v3.model.ListAssociationsRequest;
import com.g42cloud.sdk.er.v3.model.ListAssociationsResponse;
import com.g42cloud.sdk.er.v3.model.ListAttachmentsRequest;
import com.g42cloud.sdk.er.v3.model.ListAttachmentsResponse;
import com.g42cloud.sdk.er.v3.model.ListAvailabilityZoneRequest;
import com.g42cloud.sdk.er.v3.model.ListAvailabilityZoneResponse;
import com.g42cloud.sdk.er.v3.model.ListEffectiveRoutesRequest;
import com.g42cloud.sdk.er.v3.model.ListEffectiveRoutesResponse;
import com.g42cloud.sdk.er.v3.model.ListEnterpriseRoutersRequest;
import com.g42cloud.sdk.er.v3.model.ListEnterpriseRoutersResponse;
import com.g42cloud.sdk.er.v3.model.ListProjectTagsRequest;
import com.g42cloud.sdk.er.v3.model.ListProjectTagsResponse;
import com.g42cloud.sdk.er.v3.model.ListPropagationsRequest;
import com.g42cloud.sdk.er.v3.model.ListPropagationsResponse;
import com.g42cloud.sdk.er.v3.model.ListRouteTablesRequest;
import com.g42cloud.sdk.er.v3.model.ListRouteTablesResponse;
import com.g42cloud.sdk.er.v3.model.ListStaticRoutesRequest;
import com.g42cloud.sdk.er.v3.model.ListStaticRoutesResponse;
import com.g42cloud.sdk.er.v3.model.ListVpcAttachmentsRequest;
import com.g42cloud.sdk.er.v3.model.ListVpcAttachmentsResponse;
import com.g42cloud.sdk.er.v3.model.ShowAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.ShowAttachmentResponse;
import com.g42cloud.sdk.er.v3.model.ShowEnterpriseRouterRequest;
import com.g42cloud.sdk.er.v3.model.ShowEnterpriseRouterResponse;
import com.g42cloud.sdk.er.v3.model.ShowResourceTagRequest;
import com.g42cloud.sdk.er.v3.model.ShowResourceTagResponse;
import com.g42cloud.sdk.er.v3.model.ShowRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.ShowRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.ShowStaticRouteRequest;
import com.g42cloud.sdk.er.v3.model.ShowStaticRouteResponse;
import com.g42cloud.sdk.er.v3.model.ShowVpcAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.ShowVpcAttachmentResponse;
import com.g42cloud.sdk.er.v3.model.UpdateAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.UpdateAttachmentResponse;
import com.g42cloud.sdk.er.v3.model.UpdateEnterpriseRouterRequest;
import com.g42cloud.sdk.er.v3.model.UpdateEnterpriseRouterResponse;
import com.g42cloud.sdk.er.v3.model.UpdateRouteTableRequest;
import com.g42cloud.sdk.er.v3.model.UpdateRouteTableResponse;
import com.g42cloud.sdk.er.v3.model.UpdateStaticRouteRequest;
import com.g42cloud.sdk.er.v3.model.UpdateStaticRouteResponse;
import com.g42cloud.sdk.er.v3.model.UpdateVpcAttachmentRequest;
import com.g42cloud.sdk.er.v3.model.UpdateVpcAttachmentResponse;

import java.util.concurrent.CompletableFuture;

public class ErAsyncClient {

    protected HcClient hcClient;

    public ErAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ErAsyncClient> newBuilder() {
        ClientBuilder<ErAsyncClient> clientBuilder = new ClientBuilder<>(ErAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AssociateRouteTableResponse> associateRouteTableAsync(AssociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.associateRouteTable);
    }

    public AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableAsyncInvoker(
        AssociateRouteTableRequest request) {
        return new AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            ErMeta.associateRouteTable, hcClient);
    }

    public CompletableFuture<DisassociateRouteTableResponse> disassociateRouteTableAsync(
        DisassociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.disassociateRouteTable);
    }

    public AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableAsyncInvoker(
        DisassociateRouteTableRequest request) {
        return new AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            ErMeta.disassociateRouteTable, hcClient);
    }

    public CompletableFuture<ListAssociationsResponse> listAssociationsAsync(ListAssociationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAssociations);
    }

    public AsyncInvoker<ListAssociationsRequest, ListAssociationsResponse> listAssociationsAsyncInvoker(
        ListAssociationsRequest request) {
        return new AsyncInvoker<ListAssociationsRequest, ListAssociationsResponse>(request, ErMeta.listAssociations,
            hcClient);
    }

    public CompletableFuture<ListAttachmentsResponse> listAttachmentsAsync(ListAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAttachments);
    }

    public AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsAsyncInvoker(
        ListAttachmentsRequest request) {
        return new AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>(request, ErMeta.listAttachments,
            hcClient);
    }

    public CompletableFuture<ShowAttachmentResponse> showAttachmentAsync(ShowAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showAttachment);
    }

    public AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentAsyncInvoker(
        ShowAttachmentRequest request) {
        return new AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>(request, ErMeta.showAttachment,
            hcClient);
    }

    public CompletableFuture<UpdateAttachmentResponse> updateAttachmentAsync(UpdateAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateAttachment);
    }

    public AsyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachmentAsyncInvoker(
        UpdateAttachmentRequest request) {
        return new AsyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>(request, ErMeta.updateAttachment,
            hcClient);
    }

    public CompletableFuture<ListAvailabilityZoneResponse> listAvailabilityZoneAsync(
        ListAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAvailabilityZone);
    }

    public AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneAsyncInvoker(
        ListAvailabilityZoneRequest request) {
        return new AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>(request,
            ErMeta.listAvailabilityZone, hcClient);
    }

    public CompletableFuture<ChangeAvailabilityZoneResponse> changeAvailabilityZoneAsync(
        ChangeAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.changeAvailabilityZone);
    }

    public AsyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZoneAsyncInvoker(
        ChangeAvailabilityZoneRequest request) {
        return new AsyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>(request,
            ErMeta.changeAvailabilityZone, hcClient);
    }

    public CompletableFuture<CreateEnterpriseRouterResponse> createEnterpriseRouterAsync(
        CreateEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createEnterpriseRouter);
    }

    public AsyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouterAsyncInvoker(
        CreateEnterpriseRouterRequest request) {
        return new AsyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>(request,
            ErMeta.createEnterpriseRouter, hcClient);
    }

    public CompletableFuture<DeleteEnterpriseRouterResponse> deleteEnterpriseRouterAsync(
        DeleteEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteEnterpriseRouter);
    }

    public AsyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> deleteEnterpriseRouterAsyncInvoker(
        DeleteEnterpriseRouterRequest request) {
        return new AsyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>(request,
            ErMeta.deleteEnterpriseRouter, hcClient);
    }

    public CompletableFuture<ListEnterpriseRoutersResponse> listEnterpriseRoutersAsync(
        ListEnterpriseRoutersRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listEnterpriseRouters);
    }

    public AsyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRoutersAsyncInvoker(
        ListEnterpriseRoutersRequest request) {
        return new AsyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>(request,
            ErMeta.listEnterpriseRouters, hcClient);
    }

    public CompletableFuture<ShowEnterpriseRouterResponse> showEnterpriseRouterAsync(
        ShowEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showEnterpriseRouter);
    }

    public AsyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouterAsyncInvoker(
        ShowEnterpriseRouterRequest request) {
        return new AsyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>(request,
            ErMeta.showEnterpriseRouter, hcClient);
    }

    public CompletableFuture<UpdateEnterpriseRouterResponse> updateEnterpriseRouterAsync(
        UpdateEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateEnterpriseRouter);
    }

    public AsyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouterAsyncInvoker(
        UpdateEnterpriseRouterRequest request) {
        return new AsyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>(request,
            ErMeta.updateEnterpriseRouter, hcClient);
    }

    public CompletableFuture<DisablePropagationResponse> disablePropagationAsync(DisablePropagationRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.disablePropagation);
    }

    public AsyncInvoker<DisablePropagationRequest, DisablePropagationResponse> disablePropagationAsyncInvoker(
        DisablePropagationRequest request) {
        return new AsyncInvoker<DisablePropagationRequest, DisablePropagationResponse>(request,
            ErMeta.disablePropagation, hcClient);
    }

    public CompletableFuture<EnablePropagationResponse> enablePropagationAsync(EnablePropagationRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.enablePropagation);
    }

    public AsyncInvoker<EnablePropagationRequest, EnablePropagationResponse> enablePropagationAsyncInvoker(
        EnablePropagationRequest request) {
        return new AsyncInvoker<EnablePropagationRequest, EnablePropagationResponse>(request, ErMeta.enablePropagation,
            hcClient);
    }

    public CompletableFuture<ListPropagationsResponse> listPropagationsAsync(ListPropagationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listPropagations);
    }

    public AsyncInvoker<ListPropagationsRequest, ListPropagationsResponse> listPropagationsAsyncInvoker(
        ListPropagationsRequest request) {
        return new AsyncInvoker<ListPropagationsRequest, ListPropagationsResponse>(request, ErMeta.listPropagations,
            hcClient);
    }

    public CompletableFuture<CreateStaticRouteResponse> createStaticRouteAsync(CreateStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createStaticRoute);
    }

    public AsyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRouteAsyncInvoker(
        CreateStaticRouteRequest request) {
        return new AsyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>(request, ErMeta.createStaticRoute,
            hcClient);
    }

    public CompletableFuture<DeleteStaticRouteResponse> deleteStaticRouteAsync(DeleteStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteStaticRoute);
    }

    public AsyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse> deleteStaticRouteAsyncInvoker(
        DeleteStaticRouteRequest request) {
        return new AsyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>(request, ErMeta.deleteStaticRoute,
            hcClient);
    }

    public CompletableFuture<ListEffectiveRoutesResponse> listEffectiveRoutesAsync(ListEffectiveRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listEffectiveRoutes);
    }

    public AsyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutesAsyncInvoker(
        ListEffectiveRoutesRequest request) {
        return new AsyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>(request,
            ErMeta.listEffectiveRoutes, hcClient);
    }

    public CompletableFuture<ListStaticRoutesResponse> listStaticRoutesAsync(ListStaticRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listStaticRoutes);
    }

    public AsyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutesAsyncInvoker(
        ListStaticRoutesRequest request) {
        return new AsyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>(request, ErMeta.listStaticRoutes,
            hcClient);
    }

    public CompletableFuture<ShowStaticRouteResponse> showStaticRouteAsync(ShowStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showStaticRoute);
    }

    public AsyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRouteAsyncInvoker(
        ShowStaticRouteRequest request) {
        return new AsyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>(request, ErMeta.showStaticRoute,
            hcClient);
    }

    public CompletableFuture<UpdateStaticRouteResponse> updateStaticRouteAsync(UpdateStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateStaticRoute);
    }

    public AsyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRouteAsyncInvoker(
        UpdateStaticRouteRequest request) {
        return new AsyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>(request, ErMeta.updateStaticRoute,
            hcClient);
    }

    public CompletableFuture<CreateRouteTableResponse> createRouteTableAsync(CreateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createRouteTable);
    }

    public AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableAsyncInvoker(
        CreateRouteTableRequest request) {
        return new AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, ErMeta.createRouteTable,
            hcClient);
    }

    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTableAsync(DeleteRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteRouteTable);
    }

    public AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableAsyncInvoker(
        DeleteRouteTableRequest request) {
        return new AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, ErMeta.deleteRouteTable,
            hcClient);
    }

    public CompletableFuture<ListRouteTablesResponse> listRouteTablesAsync(ListRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listRouteTables);
    }

    public AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesAsyncInvoker(
        ListRouteTablesRequest request) {
        return new AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, ErMeta.listRouteTables,
            hcClient);
    }

    public CompletableFuture<ShowRouteTableResponse> showRouteTableAsync(ShowRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showRouteTable);
    }

    public AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableAsyncInvoker(
        ShowRouteTableRequest request) {
        return new AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, ErMeta.showRouteTable,
            hcClient);
    }

    public CompletableFuture<UpdateRouteTableResponse> updateRouteTableAsync(UpdateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateRouteTable);
    }

    public AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableAsyncInvoker(
        UpdateRouteTableRequest request) {
        return new AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, ErMeta.updateRouteTable,
            hcClient);
    }

    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createResourceTag);
    }

    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, ErMeta.createResourceTag,
            hcClient);
    }

    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteResourceTag);
    }

    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, ErMeta.deleteResourceTag,
            hcClient);
    }

    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listProjectTags);
    }

    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, ErMeta.listProjectTags,
            hcClient);
    }

    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showResourceTag);
    }

    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, ErMeta.showResourceTag,
            hcClient);
    }

    public CompletableFuture<CreateVpcAttachmentResponse> createVpcAttachmentAsync(CreateVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createVpcAttachment);
    }

    public AsyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachmentAsyncInvoker(
        CreateVpcAttachmentRequest request) {
        return new AsyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>(request,
            ErMeta.createVpcAttachment, hcClient);
    }

    public CompletableFuture<DeleteVpcAttachmentResponse> deleteVpcAttachmentAsync(DeleteVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteVpcAttachment);
    }

    public AsyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> deleteVpcAttachmentAsyncInvoker(
        DeleteVpcAttachmentRequest request) {
        return new AsyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>(request,
            ErMeta.deleteVpcAttachment, hcClient);
    }

    public CompletableFuture<ListVpcAttachmentsResponse> listVpcAttachmentsAsync(ListVpcAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listVpcAttachments);
    }

    public AsyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachmentsAsyncInvoker(
        ListVpcAttachmentsRequest request) {
        return new AsyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>(request,
            ErMeta.listVpcAttachments, hcClient);
    }

    public CompletableFuture<ShowVpcAttachmentResponse> showVpcAttachmentAsync(ShowVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showVpcAttachment);
    }

    public AsyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachmentAsyncInvoker(
        ShowVpcAttachmentRequest request) {
        return new AsyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>(request, ErMeta.showVpcAttachment,
            hcClient);
    }

    public CompletableFuture<UpdateVpcAttachmentResponse> updateVpcAttachmentAsync(UpdateVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateVpcAttachment);
    }

    public AsyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachmentAsyncInvoker(
        UpdateVpcAttachmentRequest request) {
        return new AsyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>(request,
            ErMeta.updateVpcAttachment, hcClient);
    }

}
