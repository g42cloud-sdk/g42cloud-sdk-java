package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * btrfs子卷信息
 */
public class BtrfsSubvolumn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_snapshot")

    private String isSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subvol_id")

    private String subvolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subvol_name")

    private String subvolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subvol_mount_path")

    private String subvolMountPath;

    public BtrfsSubvolumn withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BtrfsSubvolumn withIsSnapshot(String isSnapshot) {
        this.isSnapshot = isSnapshot;
        return this;
    }

    public String getIsSnapshot() {
        return isSnapshot;
    }

    public void setIsSnapshot(String isSnapshot) {
        this.isSnapshot = isSnapshot;
    }

    public BtrfsSubvolumn withSubvolId(String subvolId) {
        this.subvolId = subvolId;
        return this;
    }

    public String getSubvolId() {
        return subvolId;
    }

    public void setSubvolId(String subvolId) {
        this.subvolId = subvolId;
    }

    public BtrfsSubvolumn withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BtrfsSubvolumn withSubvolName(String subvolName) {
        this.subvolName = subvolName;
        return this;
    }

    public String getSubvolName() {
        return subvolName;
    }

    public void setSubvolName(String subvolName) {
        this.subvolName = subvolName;
    }

    public BtrfsSubvolumn withSubvolMountPath(String subvolMountPath) {
        this.subvolMountPath = subvolMountPath;
        return this;
    }

    public String getSubvolMountPath() {
        return subvolMountPath;
    }

    public void setSubvolMountPath(String subvolMountPath) {
        this.subvolMountPath = subvolMountPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BtrfsSubvolumn that = (BtrfsSubvolumn) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.isSnapshot, that.isSnapshot)
            && Objects.equals(this.subvolId, that.subvolId) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.subvolName, that.subvolName)
            && Objects.equals(this.subvolMountPath, that.subvolMountPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, isSnapshot, subvolId, parentId, subvolName, subvolMountPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BtrfsSubvolumn {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    isSnapshot: ").append(toIndentedString(isSnapshot)).append("\n");
        sb.append("    subvolId: ").append(toIndentedString(subvolId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    subvolName: ").append(toIndentedString(subvolName)).append("\n");
        sb.append("    subvolMountPath: ").append(toIndentedString(subvolMountPath)).append("\n");
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
