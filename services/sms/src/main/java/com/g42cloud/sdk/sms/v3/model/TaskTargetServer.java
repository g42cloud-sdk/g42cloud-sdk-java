package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目的端服务器
 */
public class TaskTargetServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_dir")

    private String systemDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<TargetDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    private List<VolumeGroups> volumeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    private List<String> btrfsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_disk_id")

    private String imageDiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cutovered_snapshot_ids")

    private String cutoveredSnapshotIds;

    public TaskTargetServer withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskTargetServer withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public TaskTargetServer withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskTargetServer withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TaskTargetServer withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public TaskTargetServer withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public TaskTargetServer withSystemDir(String systemDir) {
        this.systemDir = systemDir;
        return this;
    }

    public String getSystemDir() {
        return systemDir;
    }

    public void setSystemDir(String systemDir) {
        this.systemDir = systemDir;
    }

    public TaskTargetServer withDisks(List<TargetDisk> disks) {
        this.disks = disks;
        return this;
    }

    public TaskTargetServer addDisksItem(TargetDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public TaskTargetServer withDisks(Consumer<List<TargetDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    public List<TargetDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<TargetDisk> disks) {
        this.disks = disks;
    }

    public TaskTargetServer withVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public TaskTargetServer addVolumeGroupsItem(VolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public TaskTargetServer withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    public TaskTargetServer withBtrfsList(List<String> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public TaskTargetServer addBtrfsListItem(String btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public TaskTargetServer withBtrfsList(Consumer<List<String>> btrfsListSetter) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    public List<String> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<String> btrfsList) {
        this.btrfsList = btrfsList;
    }

    public TaskTargetServer withImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
        return this;
    }

    public String getImageDiskId() {
        return imageDiskId;
    }

    public void setImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
    }

    public TaskTargetServer withCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
        return this;
    }

    public String getCutoveredSnapshotIds() {
        return cutoveredSnapshotIds;
    }

    public void setCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskTargetServer that = (TaskTargetServer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vmId, that.vmId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.systemDir, that.systemDir) && Objects.equals(this.disks, that.disks)
            && Objects.equals(this.volumeGroups, that.volumeGroups) && Objects.equals(this.btrfsList, that.btrfsList)
            && Objects.equals(this.imageDiskId, that.imageDiskId)
            && Objects.equals(this.cutoveredSnapshotIds, that.cutoveredSnapshotIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vmId,
            name,
            ip,
            osType,
            osVersion,
            systemDir,
            disks,
            volumeGroups,
            btrfsList,
            imageDiskId,
            cutoveredSnapshotIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTargetServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    systemDir: ").append(toIndentedString(systemDir)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    imageDiskId: ").append(toIndentedString(imageDiskId)).append("\n");
        sb.append("    cutoveredSnapshotIds: ").append(toIndentedString(cutoveredSnapshotIds)).append("\n");
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
