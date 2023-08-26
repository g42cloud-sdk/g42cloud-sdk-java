package com.g42cloud.sdk.ecs.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.ecs.v2.model.AddServerGroupMemberRequest;
import com.g42cloud.sdk.ecs.v2.model.AddServerGroupMemberResponse;
import com.g42cloud.sdk.ecs.v2.model.AssociateServerVirtualIpRequest;
import com.g42cloud.sdk.ecs.v2.model.AssociateServerVirtualIpResponse;
import com.g42cloud.sdk.ecs.v2.model.AttachServerVolumeRequest;
import com.g42cloud.sdk.ecs.v2.model.AttachServerVolumeResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchAddServerNicsRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchAddServerNicsResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchAttachSharableVolumesRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchAttachSharableVolumesResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchCreateServerTagsRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchCreateServerTagsResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchDeleteServerNicsRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchDeleteServerNicsResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchDeleteServerTagsRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchDeleteServerTagsResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchResetServersPasswordRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchResetServersPasswordResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.g42cloud.sdk.ecs.v2.model.BatchUpdateServersNameRequest;
import com.g42cloud.sdk.ecs.v2.model.BatchUpdateServersNameResponse;
import com.g42cloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequest;
import com.g42cloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitResponse;
import com.g42cloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequest;
import com.g42cloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitResponse;
import com.g42cloud.sdk.ecs.v2.model.CreatePostPaidServersRequest;
import com.g42cloud.sdk.ecs.v2.model.CreatePostPaidServersResponse;
import com.g42cloud.sdk.ecs.v2.model.CreateServerGroupRequest;
import com.g42cloud.sdk.ecs.v2.model.CreateServerGroupResponse;
import com.g42cloud.sdk.ecs.v2.model.CreateServersRequest;
import com.g42cloud.sdk.ecs.v2.model.CreateServersResponse;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerGroupMemberRequest;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerGroupMemberResponse;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerGroupRequest;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerGroupResponse;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerMetadataRequest;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerMetadataResponse;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerPasswordRequest;
import com.g42cloud.sdk.ecs.v2.model.DeleteServerPasswordResponse;
import com.g42cloud.sdk.ecs.v2.model.DeleteServersRequest;
import com.g42cloud.sdk.ecs.v2.model.DeleteServersResponse;
import com.g42cloud.sdk.ecs.v2.model.DetachServerVolumeRequest;
import com.g42cloud.sdk.ecs.v2.model.DetachServerVolumeResponse;
import com.g42cloud.sdk.ecs.v2.model.DisassociateServerVirtualIpRequest;
import com.g42cloud.sdk.ecs.v2.model.DisassociateServerVirtualIpResponse;
import com.g42cloud.sdk.ecs.v2.model.ListFlavorsRequest;
import com.g42cloud.sdk.ecs.v2.model.ListFlavorsResponse;
import com.g42cloud.sdk.ecs.v2.model.ListResizeFlavorsRequest;
import com.g42cloud.sdk.ecs.v2.model.ListResizeFlavorsResponse;
import com.g42cloud.sdk.ecs.v2.model.ListServerBlockDevicesRequest;
import com.g42cloud.sdk.ecs.v2.model.ListServerBlockDevicesResponse;
import com.g42cloud.sdk.ecs.v2.model.ListServerGroupsRequest;
import com.g42cloud.sdk.ecs.v2.model.ListServerGroupsResponse;
import com.g42cloud.sdk.ecs.v2.model.ListServerInterfacesRequest;
import com.g42cloud.sdk.ecs.v2.model.ListServerInterfacesResponse;
import com.g42cloud.sdk.ecs.v2.model.ListServerTagsRequest;
import com.g42cloud.sdk.ecs.v2.model.ListServerTagsResponse;
import com.g42cloud.sdk.ecs.v2.model.ListServersDetailsRequest;
import com.g42cloud.sdk.ecs.v2.model.ListServersDetailsResponse;
import com.g42cloud.sdk.ecs.v2.model.MigrateServerRequest;
import com.g42cloud.sdk.ecs.v2.model.MigrateServerResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaAttachInterfaceRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaAttachInterfaceResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaCreateKeypairRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaCreateKeypairResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaCreateServersRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaCreateServersResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaDeleteKeypairRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaDeleteKeypairResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaDeleteServerRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaDeleteServerResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaListAvailabilityZonesRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaListAvailabilityZonesResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaListKeypairsRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaListKeypairsResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaListServersDetailsRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaListServersDetailsResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaShowKeypairRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaShowKeypairResponse;
import com.g42cloud.sdk.ecs.v2.model.NovaShowServerRequest;
import com.g42cloud.sdk.ecs.v2.model.NovaShowServerResponse;
import com.g42cloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryRequest;
import com.g42cloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryResponse;
import com.g42cloud.sdk.ecs.v2.model.RegisterServerMonitorRequest;
import com.g42cloud.sdk.ecs.v2.model.RegisterServerMonitorResponse;
import com.g42cloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitRequest;
import com.g42cloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitResponse;
import com.g42cloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitRequest;
import com.g42cloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitResponse;
import com.g42cloud.sdk.ecs.v2.model.ResetServerPasswordRequest;
import com.g42cloud.sdk.ecs.v2.model.ResetServerPasswordResponse;
import com.g42cloud.sdk.ecs.v2.model.ResizePostPaidServerRequest;
import com.g42cloud.sdk.ecs.v2.model.ResizePostPaidServerResponse;
import com.g42cloud.sdk.ecs.v2.model.ResizeServerRequest;
import com.g42cloud.sdk.ecs.v2.model.ResizeServerResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowJobRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowJobResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowResetPasswordFlagRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowResetPasswordFlagResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerAutoRecoveryRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerAutoRecoveryResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerBlockDeviceRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerBlockDeviceResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerGroupRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerGroupResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerLimitsRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerLimitsResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerPasswordRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerPasswordResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerRemoteConsoleRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerRemoteConsoleResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerResponse;
import com.g42cloud.sdk.ecs.v2.model.ShowServerTagsRequest;
import com.g42cloud.sdk.ecs.v2.model.ShowServerTagsResponse;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequest;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeResponse;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerMetadataRequest;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerMetadataResponse;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerRequest;
import com.g42cloud.sdk.ecs.v2.model.UpdateServerResponse;

public class EcsClient {

    protected HcClient hcClient;

    public EcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsClient> newBuilder() {
        ClientBuilder<EcsClient> clientBuilder = new ClientBuilder<>(EcsClient::new);
        return clientBuilder;
    }

    public AddServerGroupMemberResponse addServerGroupMember(AddServerGroupMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    public SyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberInvoker(
        AddServerGroupMemberRequest request) {
        return new SyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>(request,
            EcsMeta.addServerGroupMember, hcClient);
    }

    public AssociateServerVirtualIpResponse associateServerVirtualIp(AssociateServerVirtualIpRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.associateServerVirtualIp);
    }

    public SyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIpInvoker(
        AssociateServerVirtualIpRequest request) {
        return new SyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>(request,
            EcsMeta.associateServerVirtualIp, hcClient);
    }

    public AttachServerVolumeResponse attachServerVolume(AttachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    public SyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeInvoker(
        AttachServerVolumeRequest request) {
        return new SyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>(request,
            EcsMeta.attachServerVolume, hcClient);
    }

    public BatchAddServerNicsResponse batchAddServerNics(BatchAddServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    public SyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsInvoker(
        BatchAddServerNicsRequest request) {
        return new SyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>(request,
            EcsMeta.batchAddServerNics, hcClient);
    }

    public BatchAttachSharableVolumesResponse batchAttachSharableVolumes(BatchAttachSharableVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchAttachSharableVolumes);
    }

    public SyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumesInvoker(
        BatchAttachSharableVolumesRequest request) {
        return new SyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>(request,
            EcsMeta.batchAttachSharableVolumes, hcClient);
    }

    public BatchCreateServerTagsResponse batchCreateServerTags(BatchCreateServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    public SyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsInvoker(
        BatchCreateServerTagsRequest request) {
        return new SyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>(request,
            EcsMeta.batchCreateServerTags, hcClient);
    }

    public BatchDeleteServerNicsResponse batchDeleteServerNics(BatchDeleteServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    public SyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsInvoker(
        BatchDeleteServerNicsRequest request) {
        return new SyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>(request,
            EcsMeta.batchDeleteServerNics, hcClient);
    }

    public BatchDeleteServerTagsResponse batchDeleteServerTags(BatchDeleteServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    public SyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsInvoker(
        BatchDeleteServerTagsRequest request) {
        return new SyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>(request,
            EcsMeta.batchDeleteServerTags, hcClient);
    }

    public BatchRebootServersResponse batchRebootServers(BatchRebootServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    public SyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersInvoker(
        BatchRebootServersRequest request) {
        return new SyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>(request,
            EcsMeta.batchRebootServers, hcClient);
    }

    public BatchResetServersPasswordResponse batchResetServersPassword(BatchResetServersPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchResetServersPassword);
    }

    public SyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPasswordInvoker(
        BatchResetServersPasswordRequest request) {
        return new SyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>(request,
            EcsMeta.batchResetServersPassword, hcClient);
    }

    public BatchStartServersResponse batchStartServers(BatchStartServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    public SyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersInvoker(
        BatchStartServersRequest request) {
        return new SyncInvoker<BatchStartServersRequest, BatchStartServersResponse>(request, EcsMeta.batchStartServers,
            hcClient);
    }

    public BatchStopServersResponse batchStopServers(BatchStopServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    public SyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersInvoker(
        BatchStopServersRequest request) {
        return new SyncInvoker<BatchStopServersRequest, BatchStopServersResponse>(request, EcsMeta.batchStopServers,
            hcClient);
    }

    public BatchUpdateServersNameResponse batchUpdateServersName(BatchUpdateServersNameRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchUpdateServersName);
    }

    public SyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersNameInvoker(
        BatchUpdateServersNameRequest request) {
        return new SyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>(request,
            EcsMeta.batchUpdateServersName, hcClient);
    }

    public ChangeServerOsWithCloudInitResponse changeServerOsWithCloudInit(ChangeServerOsWithCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    public SyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitInvoker(
        ChangeServerOsWithCloudInitRequest request) {
        return new SyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>(request,
            EcsMeta.changeServerOsWithCloudInit, hcClient);
    }

    public ChangeServerOsWithoutCloudInitResponse changeServerOsWithoutCloudInit(
        ChangeServerOsWithoutCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.changeServerOsWithoutCloudInit);
    }

    public SyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitInvoker(
        ChangeServerOsWithoutCloudInitRequest request) {
        return new SyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>(request,
            EcsMeta.changeServerOsWithoutCloudInit, hcClient);
    }

    public CreatePostPaidServersResponse createPostPaidServers(CreatePostPaidServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    public SyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersInvoker(
        CreatePostPaidServersRequest request) {
        return new SyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>(request,
            EcsMeta.createPostPaidServers, hcClient);
    }

    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    public SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupInvoker(
        CreateServerGroupRequest request) {
        return new SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request, EcsMeta.createServerGroup,
            hcClient);
    }

    public CreateServersResponse createServers(CreateServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createServers);
    }

    public SyncInvoker<CreateServersRequest, CreateServersResponse> createServersInvoker(CreateServersRequest request) {
        return new SyncInvoker<CreateServersRequest, CreateServersResponse>(request, EcsMeta.createServers, hcClient);
    }

    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    public SyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupInvoker(
        DeleteServerGroupRequest request) {
        return new SyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>(request, EcsMeta.deleteServerGroup,
            hcClient);
    }

    public DeleteServerGroupMemberResponse deleteServerGroupMember(DeleteServerGroupMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    public SyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberInvoker(
        DeleteServerGroupMemberRequest request) {
        return new SyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>(request,
            EcsMeta.deleteServerGroupMember, hcClient);
    }

    public DeleteServerMetadataResponse deleteServerMetadata(DeleteServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    public SyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataInvoker(
        DeleteServerMetadataRequest request) {
        return new SyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>(request,
            EcsMeta.deleteServerMetadata, hcClient);
    }

    public DeleteServerPasswordResponse deleteServerPassword(DeleteServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerPassword);
    }

    public SyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPasswordInvoker(
        DeleteServerPasswordRequest request) {
        return new SyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>(request,
            EcsMeta.deleteServerPassword, hcClient);
    }

    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServers);
    }

    public SyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersInvoker(DeleteServersRequest request) {
        return new SyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, EcsMeta.deleteServers, hcClient);
    }

    public DetachServerVolumeResponse detachServerVolume(DetachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    public SyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeInvoker(
        DetachServerVolumeRequest request) {
        return new SyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>(request,
            EcsMeta.detachServerVolume, hcClient);
    }

    public DisassociateServerVirtualIpResponse disassociateServerVirtualIp(DisassociateServerVirtualIpRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.disassociateServerVirtualIp);
    }

    public SyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIpInvoker(
        DisassociateServerVirtualIpRequest request) {
        return new SyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>(request,
            EcsMeta.disassociateServerVirtualIp, hcClient);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listFlavors);
    }

    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, EcsMeta.listFlavors, hcClient);
    }

    public ListResizeFlavorsResponse listResizeFlavors(ListResizeFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    public SyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsInvoker(
        ListResizeFlavorsRequest request) {
        return new SyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>(request, EcsMeta.listResizeFlavors,
            hcClient);
    }

    public ListServerBlockDevicesResponse listServerBlockDevices(ListServerBlockDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    public SyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesInvoker(
        ListServerBlockDevicesRequest request) {
        return new SyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>(request,
            EcsMeta.listServerBlockDevices, hcClient);
    }

    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerGroups);
    }

    public SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsInvoker(
        ListServerGroupsRequest request) {
        return new SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>(request, EcsMeta.listServerGroups,
            hcClient);
    }

    public ListServerInterfacesResponse listServerInterfaces(ListServerInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    public SyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesInvoker(
        ListServerInterfacesRequest request) {
        return new SyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>(request,
            EcsMeta.listServerInterfaces, hcClient);
    }

    public ListServerTagsResponse listServerTags(ListServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerTags);
    }

    public SyncInvoker<ListServerTagsRequest, ListServerTagsResponse> listServerTagsInvoker(
        ListServerTagsRequest request) {
        return new SyncInvoker<ListServerTagsRequest, ListServerTagsResponse>(request, EcsMeta.listServerTags,
            hcClient);
    }

    public ListServersDetailsResponse listServersDetails(ListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    public SyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsInvoker(
        ListServersDetailsRequest request) {
        return new SyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>(request,
            EcsMeta.listServersDetails, hcClient);
    }

    public MigrateServerResponse migrateServer(MigrateServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.migrateServer);
    }

    public SyncInvoker<MigrateServerRequest, MigrateServerResponse> migrateServerInvoker(MigrateServerRequest request) {
        return new SyncInvoker<MigrateServerRequest, MigrateServerResponse>(request, EcsMeta.migrateServer, hcClient);
    }

    public NovaAssociateSecurityGroupResponse novaAssociateSecurityGroup(NovaAssociateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    public SyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupInvoker(
        NovaAssociateSecurityGroupRequest request) {
        return new SyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>(request,
            EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    public NovaAttachInterfaceResponse novaAttachInterface(NovaAttachInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaAttachInterface);
    }

    public SyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterfaceInvoker(
        NovaAttachInterfaceRequest request) {
        return new SyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>(request,
            EcsMeta.novaAttachInterface, hcClient);
    }

    public NovaCreateKeypairResponse novaCreateKeypair(NovaCreateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    public SyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairInvoker(
        NovaCreateKeypairRequest request) {
        return new SyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>(request, EcsMeta.novaCreateKeypair,
            hcClient);
    }

    public NovaCreateServersResponse novaCreateServers(NovaCreateServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    public SyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersInvoker(
        NovaCreateServersRequest request) {
        return new SyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>(request, EcsMeta.novaCreateServers,
            hcClient);
    }

    public NovaDeleteKeypairResponse novaDeleteKeypair(NovaDeleteKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    public SyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairInvoker(
        NovaDeleteKeypairRequest request) {
        return new SyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>(request, EcsMeta.novaDeleteKeypair,
            hcClient);
    }

    public NovaDeleteServerResponse novaDeleteServer(NovaDeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    public SyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerInvoker(
        NovaDeleteServerRequest request) {
        return new SyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>(request, EcsMeta.novaDeleteServer,
            hcClient);
    }

    public NovaDisassociateSecurityGroupResponse novaDisassociateSecurityGroup(
        NovaDisassociateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    public SyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupInvoker(
        NovaDisassociateSecurityGroupRequest request) {
        return new SyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>(request,
            EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    public NovaListAvailabilityZonesResponse novaListAvailabilityZones(NovaListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    public SyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesInvoker(
        NovaListAvailabilityZonesRequest request) {
        return new SyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>(request,
            EcsMeta.novaListAvailabilityZones, hcClient);
    }

    public NovaListKeypairsResponse novaListKeypairs(NovaListKeypairsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    public SyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsInvoker(
        NovaListKeypairsRequest request) {
        return new SyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>(request, EcsMeta.novaListKeypairs,
            hcClient);
    }

    public NovaListServerSecurityGroupsResponse novaListServerSecurityGroups(
        NovaListServerSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    public SyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsInvoker(
        NovaListServerSecurityGroupsRequest request) {
        return new SyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>(request,
            EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    public NovaListServersDetailsResponse novaListServersDetails(NovaListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    public SyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsInvoker(
        NovaListServersDetailsRequest request) {
        return new SyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>(request,
            EcsMeta.novaListServersDetails, hcClient);
    }

    public NovaShowKeypairResponse novaShowKeypair(NovaShowKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaShowKeypair);
    }

    public SyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairInvoker(
        NovaShowKeypairRequest request) {
        return new SyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>(request, EcsMeta.novaShowKeypair,
            hcClient);
    }

    public NovaShowServerResponse novaShowServer(NovaShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    public SyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerInvoker(
        NovaShowServerRequest request) {
        return new SyncInvoker<NovaShowServerRequest, NovaShowServerResponse>(request, EcsMeta.novaShowServer,
            hcClient);
    }

    public RegisterServerAutoRecoveryResponse registerServerAutoRecovery(RegisterServerAutoRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.registerServerAutoRecovery);
    }

    public SyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryInvoker(
        RegisterServerAutoRecoveryRequest request) {
        return new SyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>(request,
            EcsMeta.registerServerAutoRecovery, hcClient);
    }

    public RegisterServerMonitorResponse registerServerMonitor(RegisterServerMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.registerServerMonitor);
    }

    public SyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitorInvoker(
        RegisterServerMonitorRequest request) {
        return new SyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>(request,
            EcsMeta.registerServerMonitor, hcClient);
    }

    public ReinstallServerWithCloudInitResponse reinstallServerWithCloudInit(
        ReinstallServerWithCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    public SyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitInvoker(
        ReinstallServerWithCloudInitRequest request) {
        return new SyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>(request,
            EcsMeta.reinstallServerWithCloudInit, hcClient);
    }

    public ReinstallServerWithoutCloudInitResponse reinstallServerWithoutCloudInit(
        ReinstallServerWithoutCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.reinstallServerWithoutCloudInit);
    }

    public SyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitInvoker(
        ReinstallServerWithoutCloudInitRequest request) {
        return new SyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>(request,
            EcsMeta.reinstallServerWithoutCloudInit, hcClient);
    }

    public ResetServerPasswordResponse resetServerPassword(ResetServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    public SyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordInvoker(
        ResetServerPasswordRequest request) {
        return new SyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>(request,
            EcsMeta.resetServerPassword, hcClient);
    }

    public ResizePostPaidServerResponse resizePostPaidServer(ResizePostPaidServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    public SyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerInvoker(
        ResizePostPaidServerRequest request) {
        return new SyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>(request,
            EcsMeta.resizePostPaidServer, hcClient);
    }

    public ResizeServerResponse resizeServer(ResizeServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resizeServer);
    }

    public SyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerInvoker(ResizeServerRequest request) {
        return new SyncInvoker<ResizeServerRequest, ResizeServerResponse>(request, EcsMeta.resizeServer, hcClient);
    }

    public ShowResetPasswordFlagResponse showResetPasswordFlag(ShowResetPasswordFlagRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    public SyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagInvoker(
        ShowResetPasswordFlagRequest request) {
        return new SyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>(request,
            EcsMeta.showResetPasswordFlag, hcClient);
    }

    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServer);
    }

    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<ShowServerRequest, ShowServerResponse>(request, EcsMeta.showServer, hcClient);
    }

    public ShowServerAutoRecoveryResponse showServerAutoRecovery(ShowServerAutoRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerAutoRecovery);
    }

    public SyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> showServerAutoRecoveryInvoker(
        ShowServerAutoRecoveryRequest request) {
        return new SyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>(request,
            EcsMeta.showServerAutoRecovery, hcClient);
    }

    public ShowServerBlockDeviceResponse showServerBlockDevice(ShowServerBlockDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerBlockDevice);
    }

    public SyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDeviceInvoker(
        ShowServerBlockDeviceRequest request) {
        return new SyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>(request,
            EcsMeta.showServerBlockDevice, hcClient);
    }

    public ShowServerGroupResponse showServerGroup(ShowServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerGroup);
    }

    public SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupInvoker(
        ShowServerGroupRequest request) {
        return new SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>(request, EcsMeta.showServerGroup,
            hcClient);
    }

    public ShowServerLimitsResponse showServerLimits(ShowServerLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    public SyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsInvoker(
        ShowServerLimitsRequest request) {
        return new SyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>(request, EcsMeta.showServerLimits,
            hcClient);
    }

    public ShowServerPasswordResponse showServerPassword(ShowServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerPassword);
    }

    public SyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPasswordInvoker(
        ShowServerPasswordRequest request) {
        return new SyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>(request,
            EcsMeta.showServerPassword, hcClient);
    }

    public ShowServerRemoteConsoleResponse showServerRemoteConsole(ShowServerRemoteConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    public SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>(request,
            EcsMeta.showServerRemoteConsole, hcClient);
    }

    public ShowServerTagsResponse showServerTags(ShowServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerTags);
    }

    public SyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsInvoker(
        ShowServerTagsRequest request) {
        return new SyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>(request, EcsMeta.showServerTags,
            hcClient);
    }

    public UpdateServerResponse updateServer(UpdateServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServer);
    }

    public SyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerInvoker(UpdateServerRequest request) {
        return new SyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, EcsMeta.updateServer, hcClient);
    }

    public UpdateServerAutoTerminateTimeResponse updateServerAutoTerminateTime(
        UpdateServerAutoTerminateTimeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServerAutoTerminateTime);
    }

    public SyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeInvoker(
        UpdateServerAutoTerminateTimeRequest request) {
        return new SyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>(request,
            EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    public UpdateServerMetadataResponse updateServerMetadata(UpdateServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    public SyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataInvoker(
        UpdateServerMetadataRequest request) {
        return new SyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>(request,
            EcsMeta.updateServerMetadata, hcClient);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showJob);
    }

    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, EcsMeta.showJob, hcClient);
    }

}
