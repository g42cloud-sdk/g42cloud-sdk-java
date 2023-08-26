package com.g42cloud.sdk.er.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
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

public class ErClient {

    protected HcClient hcClient;

    public ErClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ErClient> newBuilder() {
        ClientBuilder<ErClient> clientBuilder = new ClientBuilder<>(ErClient::new);
        return clientBuilder;
    }

    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.associateRouteTable);
    }

    public SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableInvoker(
        AssociateRouteTableRequest request) {
        return new SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            ErMeta.associateRouteTable, hcClient);
    }

    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.disassociateRouteTable);
    }

    public SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableInvoker(
        DisassociateRouteTableRequest request) {
        return new SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            ErMeta.disassociateRouteTable, hcClient);
    }

    public ListAssociationsResponse listAssociations(ListAssociationsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAssociations);
    }

    public SyncInvoker<ListAssociationsRequest, ListAssociationsResponse> listAssociationsInvoker(
        ListAssociationsRequest request) {
        return new SyncInvoker<ListAssociationsRequest, ListAssociationsResponse>(request, ErMeta.listAssociations,
            hcClient);
    }

    public ListAttachmentsResponse listAttachments(ListAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAttachments);
    }

    public SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsInvoker(
        ListAttachmentsRequest request) {
        return new SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>(request, ErMeta.listAttachments,
            hcClient);
    }

    public ShowAttachmentResponse showAttachment(ShowAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showAttachment);
    }

    public SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentInvoker(
        ShowAttachmentRequest request) {
        return new SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>(request, ErMeta.showAttachment, hcClient);
    }

    public UpdateAttachmentResponse updateAttachment(UpdateAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateAttachment);
    }

    public SyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachmentInvoker(
        UpdateAttachmentRequest request) {
        return new SyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>(request, ErMeta.updateAttachment,
            hcClient);
    }

    public ListAvailabilityZoneResponse listAvailabilityZone(ListAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAvailabilityZone);
    }

    public SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneInvoker(
        ListAvailabilityZoneRequest request) {
        return new SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>(request,
            ErMeta.listAvailabilityZone, hcClient);
    }

    public ChangeAvailabilityZoneResponse changeAvailabilityZone(ChangeAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.changeAvailabilityZone);
    }

    public SyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZoneInvoker(
        ChangeAvailabilityZoneRequest request) {
        return new SyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>(request,
            ErMeta.changeAvailabilityZone, hcClient);
    }

    public CreateEnterpriseRouterResponse createEnterpriseRouter(CreateEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createEnterpriseRouter);
    }

    public SyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouterInvoker(
        CreateEnterpriseRouterRequest request) {
        return new SyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>(request,
            ErMeta.createEnterpriseRouter, hcClient);
    }

    public DeleteEnterpriseRouterResponse deleteEnterpriseRouter(DeleteEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteEnterpriseRouter);
    }

    public SyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> deleteEnterpriseRouterInvoker(
        DeleteEnterpriseRouterRequest request) {
        return new SyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>(request,
            ErMeta.deleteEnterpriseRouter, hcClient);
    }

    public ListEnterpriseRoutersResponse listEnterpriseRouters(ListEnterpriseRoutersRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listEnterpriseRouters);
    }

    public SyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRoutersInvoker(
        ListEnterpriseRoutersRequest request) {
        return new SyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>(request,
            ErMeta.listEnterpriseRouters, hcClient);
    }

    public ShowEnterpriseRouterResponse showEnterpriseRouter(ShowEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showEnterpriseRouter);
    }

    public SyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouterInvoker(
        ShowEnterpriseRouterRequest request) {
        return new SyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>(request,
            ErMeta.showEnterpriseRouter, hcClient);
    }

    public UpdateEnterpriseRouterResponse updateEnterpriseRouter(UpdateEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateEnterpriseRouter);
    }

    public SyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouterInvoker(
        UpdateEnterpriseRouterRequest request) {
        return new SyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>(request,
            ErMeta.updateEnterpriseRouter, hcClient);
    }

    public DisablePropagationResponse disablePropagation(DisablePropagationRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.disablePropagation);
    }

    public SyncInvoker<DisablePropagationRequest, DisablePropagationResponse> disablePropagationInvoker(
        DisablePropagationRequest request) {
        return new SyncInvoker<DisablePropagationRequest, DisablePropagationResponse>(request,
            ErMeta.disablePropagation, hcClient);
    }

    public EnablePropagationResponse enablePropagation(EnablePropagationRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.enablePropagation);
    }

    public SyncInvoker<EnablePropagationRequest, EnablePropagationResponse> enablePropagationInvoker(
        EnablePropagationRequest request) {
        return new SyncInvoker<EnablePropagationRequest, EnablePropagationResponse>(request, ErMeta.enablePropagation,
            hcClient);
    }

    public ListPropagationsResponse listPropagations(ListPropagationsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listPropagations);
    }

    public SyncInvoker<ListPropagationsRequest, ListPropagationsResponse> listPropagationsInvoker(
        ListPropagationsRequest request) {
        return new SyncInvoker<ListPropagationsRequest, ListPropagationsResponse>(request, ErMeta.listPropagations,
            hcClient);
    }

    public CreateStaticRouteResponse createStaticRoute(CreateStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createStaticRoute);
    }

    public SyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRouteInvoker(
        CreateStaticRouteRequest request) {
        return new SyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>(request, ErMeta.createStaticRoute,
            hcClient);
    }

    public DeleteStaticRouteResponse deleteStaticRoute(DeleteStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteStaticRoute);
    }

    public SyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse> deleteStaticRouteInvoker(
        DeleteStaticRouteRequest request) {
        return new SyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>(request, ErMeta.deleteStaticRoute,
            hcClient);
    }

    public ListEffectiveRoutesResponse listEffectiveRoutes(ListEffectiveRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listEffectiveRoutes);
    }

    public SyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutesInvoker(
        ListEffectiveRoutesRequest request) {
        return new SyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>(request,
            ErMeta.listEffectiveRoutes, hcClient);
    }

    public ListStaticRoutesResponse listStaticRoutes(ListStaticRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listStaticRoutes);
    }

    public SyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutesInvoker(
        ListStaticRoutesRequest request) {
        return new SyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>(request, ErMeta.listStaticRoutes,
            hcClient);
    }

    public ShowStaticRouteResponse showStaticRoute(ShowStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showStaticRoute);
    }

    public SyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRouteInvoker(
        ShowStaticRouteRequest request) {
        return new SyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>(request, ErMeta.showStaticRoute,
            hcClient);
    }

    public UpdateStaticRouteResponse updateStaticRoute(UpdateStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateStaticRoute);
    }

    public SyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRouteInvoker(
        UpdateStaticRouteRequest request) {
        return new SyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>(request, ErMeta.updateStaticRoute,
            hcClient);
    }

    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createRouteTable);
    }

    public SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableInvoker(
        CreateRouteTableRequest request) {
        return new SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, ErMeta.createRouteTable,
            hcClient);
    }

    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteRouteTable);
    }

    public SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableInvoker(
        DeleteRouteTableRequest request) {
        return new SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, ErMeta.deleteRouteTable,
            hcClient);
    }

    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listRouteTables);
    }

    public SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesInvoker(
        ListRouteTablesRequest request) {
        return new SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, ErMeta.listRouteTables,
            hcClient);
    }

    public ShowRouteTableResponse showRouteTable(ShowRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showRouteTable);
    }

    public SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableInvoker(
        ShowRouteTableRequest request) {
        return new SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, ErMeta.showRouteTable, hcClient);
    }

    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateRouteTable);
    }

    public SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableInvoker(
        UpdateRouteTableRequest request) {
        return new SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, ErMeta.updateRouteTable,
            hcClient);
    }

    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createResourceTag);
    }

    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, ErMeta.createResourceTag,
            hcClient);
    }

    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteResourceTag);
    }

    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, ErMeta.deleteResourceTag,
            hcClient);
    }

    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listProjectTags);
    }

    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, ErMeta.listProjectTags,
            hcClient);
    }

    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showResourceTag);
    }

    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, ErMeta.showResourceTag,
            hcClient);
    }

    public CreateVpcAttachmentResponse createVpcAttachment(CreateVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createVpcAttachment);
    }

    public SyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachmentInvoker(
        CreateVpcAttachmentRequest request) {
        return new SyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>(request,
            ErMeta.createVpcAttachment, hcClient);
    }

    public DeleteVpcAttachmentResponse deleteVpcAttachment(DeleteVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteVpcAttachment);
    }

    public SyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> deleteVpcAttachmentInvoker(
        DeleteVpcAttachmentRequest request) {
        return new SyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>(request,
            ErMeta.deleteVpcAttachment, hcClient);
    }

    public ListVpcAttachmentsResponse listVpcAttachments(ListVpcAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listVpcAttachments);
    }

    public SyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachmentsInvoker(
        ListVpcAttachmentsRequest request) {
        return new SyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>(request,
            ErMeta.listVpcAttachments, hcClient);
    }

    public ShowVpcAttachmentResponse showVpcAttachment(ShowVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showVpcAttachment);
    }

    public SyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachmentInvoker(
        ShowVpcAttachmentRequest request) {
        return new SyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>(request, ErMeta.showVpcAttachment,
            hcClient);
    }

    public UpdateVpcAttachmentResponse updateVpcAttachment(UpdateVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateVpcAttachment);
    }

    public SyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachmentInvoker(
        UpdateVpcAttachmentRequest request) {
        return new SyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>(request,
            ErMeta.updateVpcAttachment, hcClient);
    }

}
