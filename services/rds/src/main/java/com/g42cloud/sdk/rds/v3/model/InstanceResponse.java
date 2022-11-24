package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class InstanceResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ips")

    private List<String> privateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_names")

    private List<String> privateDnsNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ips")

    private List<String> publicIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_name")

    private String dbUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_strategy")

    private String switchStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintenance_window")

    private String maintenanceWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeResponse> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_instance")

    private List<RelatedInstance> relatedInstance = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private HaResponse ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private BackupStrategyForResponse backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Volume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfoResponse chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagResponse> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_used_space")

    private Double backupUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_used_space")

    private Double storageUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_with_ddm")

    private Boolean associatedWithDdm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iops")

    private Long maxIops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    public InstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceResponse withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public InstanceResponse withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public InstanceResponse addPrivateIpsItem(String privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public InstanceResponse withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public InstanceResponse withPrivateDnsNames(List<String> privateDnsNames) {
        this.privateDnsNames = privateDnsNames;
        return this;
    }

    public InstanceResponse addPrivateDnsNamesItem(String privateDnsNamesItem) {
        if (this.privateDnsNames == null) {
            this.privateDnsNames = new ArrayList<>();
        }
        this.privateDnsNames.add(privateDnsNamesItem);
        return this;
    }

    public InstanceResponse withPrivateDnsNames(Consumer<List<String>> privateDnsNamesSetter) {
        if (this.privateDnsNames == null) {
            this.privateDnsNames = new ArrayList<>();
        }
        privateDnsNamesSetter.accept(this.privateDnsNames);
        return this;
    }

    public List<String> getPrivateDnsNames() {
        return privateDnsNames;
    }

    public void setPrivateDnsNames(List<String> privateDnsNames) {
        this.privateDnsNames = privateDnsNames;
    }

    public InstanceResponse withPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    public InstanceResponse addPublicIpsItem(String publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public InstanceResponse withPublicIps(Consumer<List<String>> publicIpsSetter) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        publicIpsSetter.accept(this.publicIps);
        return this;
    }

    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    public InstanceResponse withType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public InstanceResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public InstanceResponse withDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public InstanceResponse withSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
        return this;
    }

    public String getSwitchStrategy() {
        return switchStrategy;
    }

    public void setSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
    }

    public InstanceResponse withMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public InstanceResponse withNodes(List<NodeResponse> nodes) {
        this.nodes = nodes;
        return this;
    }

    public InstanceResponse addNodesItem(NodeResponse nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public InstanceResponse withNodes(Consumer<List<NodeResponse>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    public List<NodeResponse> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeResponse> nodes) {
        this.nodes = nodes;
    }

    public InstanceResponse withRelatedInstance(List<RelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
        return this;
    }

    public InstanceResponse addRelatedInstanceItem(RelatedInstance relatedInstanceItem) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        this.relatedInstance.add(relatedInstanceItem);
        return this;
    }

    public InstanceResponse withRelatedInstance(Consumer<List<RelatedInstance>> relatedInstanceSetter) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        relatedInstanceSetter.accept(this.relatedInstance);
        return this;
    }

    public List<RelatedInstance> getRelatedInstance() {
        return relatedInstance;
    }

    public void setRelatedInstance(List<RelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
    }

    public InstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceResponse withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public InstanceResponse withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public InstanceResponse withHa(HaResponse ha) {
        this.ha = ha;
        return this;
    }

    public InstanceResponse withHa(Consumer<HaResponse> haSetter) {
        if (this.ha == null) {
            this.ha = new HaResponse();
            haSetter.accept(this.ha);
        }

        return this;
    }

    public HaResponse getHa() {
        return ha;
    }

    public void setHa(HaResponse ha) {
        this.ha = ha;
    }

    public InstanceResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public InstanceResponse withBackupStrategy(BackupStrategyForResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public InstanceResponse withBackupStrategy(Consumer<BackupStrategyForResponse> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new BackupStrategyForResponse();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    public BackupStrategyForResponse getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(BackupStrategyForResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public InstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceResponse withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public InstanceResponse withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public InstanceResponse withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public InstanceResponse withMem(String mem) {
        this.mem = mem;
        return this;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public InstanceResponse withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public InstanceResponse withVolume(Consumer<Volume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new Volume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public InstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceResponse withChargeInfo(ChargeInfoResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public InstanceResponse withChargeInfo(Consumer<ChargeInfoResponse> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfoResponse();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    public ChargeInfoResponse getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfoResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public InstanceResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public InstanceResponse withTags(List<TagResponse> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceResponse addTagsItem(TagResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceResponse withTags(Consumer<List<TagResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<TagResponse> getTags() {
        return tags;
    }

    public void setTags(List<TagResponse> tags) {
        this.tags = tags;
    }

    public InstanceResponse withBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
        return this;
    }

    public Double getBackupUsedSpace() {
        return backupUsedSpace;
    }

    public void setBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
    }

    public InstanceResponse withStorageUsedSpace(Double storageUsedSpace) {
        this.storageUsedSpace = storageUsedSpace;
        return this;
    }

    public Double getStorageUsedSpace() {
        return storageUsedSpace;
    }

    public void setStorageUsedSpace(Double storageUsedSpace) {
        this.storageUsedSpace = storageUsedSpace;
    }

    public InstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public InstanceResponse withAssociatedWithDdm(Boolean associatedWithDdm) {
        this.associatedWithDdm = associatedWithDdm;
        return this;
    }

    public Boolean getAssociatedWithDdm() {
        return associatedWithDdm;
    }

    public void setAssociatedWithDdm(Boolean associatedWithDdm) {
        this.associatedWithDdm = associatedWithDdm;
    }

    public InstanceResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public InstanceResponse withMaxIops(Long maxIops) {
        this.maxIops = maxIops;
        return this;
    }

    public Long getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
    }

    public InstanceResponse withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceResponse instanceResponse = (InstanceResponse) o;
        return Objects.equals(this.id, instanceResponse.id) && Objects.equals(this.status, instanceResponse.status)
            && Objects.equals(this.enableSsl, instanceResponse.enableSsl)
            && Objects.equals(this.privateIps, instanceResponse.privateIps)
            && Objects.equals(this.privateDnsNames, instanceResponse.privateDnsNames)
            && Objects.equals(this.publicIps, instanceResponse.publicIps)
            && Objects.equals(this.type, instanceResponse.type)
            && Objects.equals(this.created, instanceResponse.created)
            && Objects.equals(this.updated, instanceResponse.updated)
            && Objects.equals(this.dbUserName, instanceResponse.dbUserName)
            && Objects.equals(this.switchStrategy, instanceResponse.switchStrategy)
            && Objects.equals(this.maintenanceWindow, instanceResponse.maintenanceWindow)
            && Objects.equals(this.nodes, instanceResponse.nodes)
            && Objects.equals(this.relatedInstance, instanceResponse.relatedInstance)
            && Objects.equals(this.name, instanceResponse.name)
            && Objects.equals(this.datastore, instanceResponse.datastore)
            && Objects.equals(this.ha, instanceResponse.ha) && Objects.equals(this.port, instanceResponse.port)
            && Objects.equals(this.backupStrategy, instanceResponse.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, instanceResponse.enterpriseProjectId)
            && Objects.equals(this.diskEncryptionId, instanceResponse.diskEncryptionId)
            && Objects.equals(this.flavorRef, instanceResponse.flavorRef)
            && Objects.equals(this.cpu, instanceResponse.cpu) && Objects.equals(this.mem, instanceResponse.mem)
            && Objects.equals(this.volume, instanceResponse.volume)
            && Objects.equals(this.region, instanceResponse.region)
            && Objects.equals(this.vpcId, instanceResponse.vpcId)
            && Objects.equals(this.subnetId, instanceResponse.subnetId)
            && Objects.equals(this.securityGroupId, instanceResponse.securityGroupId)
            && Objects.equals(this.chargeInfo, instanceResponse.chargeInfo)
            && Objects.equals(this.timeZone, instanceResponse.timeZone)
            && Objects.equals(this.tags, instanceResponse.tags)
            && Objects.equals(this.backupUsedSpace, instanceResponse.backupUsedSpace)
            && Objects.equals(this.storageUsedSpace, instanceResponse.storageUsedSpace)
            && Objects.equals(this.orderId, instanceResponse.orderId)
            && Objects.equals(this.associatedWithDdm, instanceResponse.associatedWithDdm)
            && Objects.equals(this.alias, instanceResponse.alias)
            && Objects.equals(this.maxIops, instanceResponse.maxIops)
            && Objects.equals(this.expirationTime, instanceResponse.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            enableSsl,
            privateIps,
            privateDnsNames,
            publicIps,
            type,
            created,
            updated,
            dbUserName,
            switchStrategy,
            maintenanceWindow,
            nodes,
            relatedInstance,
            name,
            datastore,
            ha,
            port,
            backupStrategy,
            enterpriseProjectId,
            diskEncryptionId,
            flavorRef,
            cpu,
            mem,
            volume,
            region,
            vpcId,
            subnetId,
            securityGroupId,
            chargeInfo,
            timeZone,
            tags,
            backupUsedSpace,
            storageUsedSpace,
            orderId,
            associatedWithDdm,
            alias,
            maxIops,
            expirationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    privateDnsNames: ").append(toIndentedString(privateDnsNames)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    switchStrategy: ").append(toIndentedString(switchStrategy)).append("\n");
        sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    relatedInstance: ").append(toIndentedString(relatedInstance)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    backupUsedSpace: ").append(toIndentedString(backupUsedSpace)).append("\n");
        sb.append("    storageUsedSpace: ").append(toIndentedString(storageUsedSpace)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    associatedWithDdm: ").append(toIndentedString(associatedWithDdm)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
