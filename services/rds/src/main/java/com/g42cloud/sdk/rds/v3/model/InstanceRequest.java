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
public class InstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private Ha ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private BackupStrategy backupStrategy;

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
    @JsonProperty(value = "volume")

    private Volume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_of_id")

    private String replicaOfId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_point")

    private RestorePoint restorePoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collation")

    private String collation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagWithKeyValue> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unchangeable_param")

    private UnchangeableParam unchangeableParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public InstanceRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceRequest withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public InstanceRequest withDatastore(Consumer<Datastore> datastoreSetter) {
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

    public InstanceRequest withHa(Ha ha) {
        this.ha = ha;
        return this;
    }

    public InstanceRequest withHa(Consumer<Ha> haSetter) {
        if (this.ha == null) {
            this.ha = new Ha();
            haSetter.accept(this.ha);
        }

        return this;
    }

    public Ha getHa() {
        return ha;
    }

    public void setHa(Ha ha) {
        this.ha = ha;
    }

    public InstanceRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public InstanceRequest withPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public InstanceRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public InstanceRequest withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public InstanceRequest withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new BackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    public BackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public InstanceRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceRequest withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public InstanceRequest withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public InstanceRequest withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public InstanceRequest withVolume(Consumer<Volume> volumeSetter) {
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

    public InstanceRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public InstanceRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceRequest withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public InstanceRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceRequest withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public InstanceRequest withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public InstanceRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public InstanceRequest withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public InstanceRequest withReplicaOfId(String replicaOfId) {
        this.replicaOfId = replicaOfId;
        return this;
    }

    public String getReplicaOfId() {
        return replicaOfId;
    }

    public void setReplicaOfId(String replicaOfId) {
        this.replicaOfId = replicaOfId;
    }

    public InstanceRequest withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public InstanceRequest withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
        if (this.restorePoint == null) {
            this.restorePoint = new RestorePoint();
            restorePointSetter.accept(this.restorePoint);
        }

        return this;
    }

    public RestorePoint getRestorePoint() {
        return restorePoint;
    }

    public void setRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
    }

    public InstanceRequest withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public InstanceRequest withTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceRequest addTagsItem(TagWithKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceRequest withTags(Consumer<List<TagWithKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<TagWithKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
    }

    public InstanceRequest withUnchangeableParam(UnchangeableParam unchangeableParam) {
        this.unchangeableParam = unchangeableParam;
        return this;
    }

    public InstanceRequest withUnchangeableParam(Consumer<UnchangeableParam> unchangeableParamSetter) {
        if (this.unchangeableParam == null) {
            this.unchangeableParam = new UnchangeableParam();
            unchangeableParamSetter.accept(this.unchangeableParam);
        }

        return this;
    }

    public UnchangeableParam getUnchangeableParam() {
        return unchangeableParam;
    }

    public void setUnchangeableParam(UnchangeableParam unchangeableParam) {
        this.unchangeableParam = unchangeableParam;
    }

    public InstanceRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public InstanceRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceRequest instanceRequest = (InstanceRequest) o;
        return Objects.equals(this.name, instanceRequest.name)
            && Objects.equals(this.datastore, instanceRequest.datastore) && Objects.equals(this.ha, instanceRequest.ha)
            && Objects.equals(this.configurationId, instanceRequest.configurationId)
            && Objects.equals(this.port, instanceRequest.port)
            && Objects.equals(this.password, instanceRequest.password)
            && Objects.equals(this.backupStrategy, instanceRequest.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, instanceRequest.enterpriseProjectId)
            && Objects.equals(this.diskEncryptionId, instanceRequest.diskEncryptionId)
            && Objects.equals(this.flavorRef, instanceRequest.flavorRef)
            && Objects.equals(this.volume, instanceRequest.volume)
            && Objects.equals(this.region, instanceRequest.region)
            && Objects.equals(this.availabilityZone, instanceRequest.availabilityZone)
            && Objects.equals(this.vpcId, instanceRequest.vpcId)
            && Objects.equals(this.subnetId, instanceRequest.subnetId)
            && Objects.equals(this.dataVip, instanceRequest.dataVip)
            && Objects.equals(this.securityGroupId, instanceRequest.securityGroupId)
            && Objects.equals(this.chargeInfo, instanceRequest.chargeInfo)
            && Objects.equals(this.timeZone, instanceRequest.timeZone)
            && Objects.equals(this.dsspoolId, instanceRequest.dsspoolId)
            && Objects.equals(this.replicaOfId, instanceRequest.replicaOfId)
            && Objects.equals(this.restorePoint, instanceRequest.restorePoint)
            && Objects.equals(this.collation, instanceRequest.collation)
            && Objects.equals(this.tags, instanceRequest.tags)
            && Objects.equals(this.unchangeableParam, instanceRequest.unchangeableParam)
            && Objects.equals(this.dryRun, instanceRequest.dryRun) && Objects.equals(this.count, instanceRequest.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            datastore,
            ha,
            configurationId,
            port,
            password,
            backupStrategy,
            enterpriseProjectId,
            diskEncryptionId,
            flavorRef,
            volume,
            region,
            availabilityZone,
            vpcId,
            subnetId,
            dataVip,
            securityGroupId,
            chargeInfo,
            timeZone,
            dsspoolId,
            replicaOfId,
            restorePoint,
            collation,
            tags,
            unchangeableParam,
            dryRun,
            count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    replicaOfId: ").append(toIndentedString(replicaOfId)).append("\n");
        sb.append("    restorePoint: ").append(toIndentedString(restorePoint)).append("\n");
        sb.append("    collation: ").append(toIndentedString(collation)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    unchangeableParam: ").append(toIndentedString(unchangeableParam)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
