package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * server字段数据结构说明
 */
public class CreateServers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private UUID imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetaDataInfo metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupsInfo> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcid")

    private UUID vpcid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicIp publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private RootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<DataVolumes> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private ExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulerHints")

    private CreateSchedulerHints schedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_tags")

    private List<SystemTags> serverTags = null;

    public CreateServers withImageRef(UUID imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public UUID getImageRef() {
        return imageRef;
    }

    public void setImageRef(UUID imageRef) {
        this.imageRef = imageRef;
    }

    public CreateServers withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateServers withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateServers withMetadata(MetaDataInfo metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateServers withMetadata(Consumer<MetaDataInfo> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetaDataInfo();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public MetaDataInfo getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaDataInfo metadata) {
        this.metadata = metadata;
    }

    public CreateServers withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateServers withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public CreateServers withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CreateServers withSecurityGroups(List<SecurityGroupsInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateServers addSecurityGroupsItem(SecurityGroupsInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateServers withSecurityGroups(Consumer<List<SecurityGroupsInfo>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<SecurityGroupsInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsInfo> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateServers withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public CreateServers addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateServers withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public CreateServers withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateServers withVpcid(UUID vpcid) {
        this.vpcid = vpcid;
        return this;
    }

    public UUID getVpcid() {
        return vpcid;
    }

    public void setVpcid(UUID vpcid) {
        this.vpcid = vpcid;
    }

    public CreateServers withPublicip(PublicIp publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreateServers withPublicip(Consumer<PublicIp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicIp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    public PublicIp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIp publicip) {
        this.publicip = publicip;
    }

    public CreateServers withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateServers withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateServers withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new RootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    public RootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public CreateServers withDataVolumes(List<DataVolumes> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public CreateServers addDataVolumesItem(DataVolumes dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public CreateServers withDataVolumes(Consumer<List<DataVolumes>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    public List<DataVolumes> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolumes> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CreateServers withExtendparam(ExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public CreateServers withExtendparam(Consumer<ExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new ExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public ExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(ExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public CreateServers withSchedulerHints(CreateSchedulerHints schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public CreateServers withSchedulerHints(Consumer<CreateSchedulerHints> schedulerHintsSetter) {
        if (this.schedulerHints == null) {
            this.schedulerHints = new CreateSchedulerHints();
            schedulerHintsSetter.accept(this.schedulerHints);
        }

        return this;
    }

    public CreateSchedulerHints getSchedulerHints() {
        return schedulerHints;
    }

    public void setSchedulerHints(CreateSchedulerHints schedulerHints) {
        this.schedulerHints = schedulerHints;
    }

    public CreateServers withServerTags(List<SystemTags> serverTags) {
        this.serverTags = serverTags;
        return this;
    }

    public CreateServers addServerTagsItem(SystemTags serverTagsItem) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        this.serverTags.add(serverTagsItem);
        return this;
    }

    public CreateServers withServerTags(Consumer<List<SystemTags>> serverTagsSetter) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        serverTagsSetter.accept(this.serverTags);
        return this;
    }

    public List<SystemTags> getServerTags() {
        return serverTags;
    }

    public void setServerTags(List<SystemTags> serverTags) {
        this.serverTags = serverTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServers that = (CreateServers) obj;
        return Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.name, that.name) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.adminPass, that.adminPass)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.nics, that.nics) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vpcid, that.vpcid) && Objects.equals(this.publicip, that.publicip)
            && Objects.equals(this.count, that.count) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.extendparam, that.extendparam)
            && Objects.equals(this.schedulerHints, that.schedulerHints)
            && Objects.equals(this.serverTags, that.serverTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageRef,
            flavorRef,
            name,
            metadata,
            userData,
            adminPass,
            keyName,
            securityGroups,
            nics,
            availabilityZone,
            vpcid,
            publicip,
            count,
            rootVolume,
            dataVolumes,
            extendparam,
            schedulerHints,
            serverTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServers {\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcid: ").append(toIndentedString(vpcid)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    serverTags: ").append(toIndentedString(serverTags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
