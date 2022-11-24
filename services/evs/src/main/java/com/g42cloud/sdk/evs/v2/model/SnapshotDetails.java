package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 快照详情。
 */
public class SnapshotDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-snapshot-attributes:project_id")

    private String osExtendedSnapshotAttributesProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-snapshot-attributes:progress")

    private String osExtendedSnapshotAttributesProgress;

    public SnapshotDetails withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SnapshotDetails withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotDetails withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SnapshotDetails withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SnapshotDetails withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public SnapshotDetails withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public SnapshotDetails withSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public SnapshotDetails withOsExtendedSnapshotAttributesProjectId(String osExtendedSnapshotAttributesProjectId) {
        this.osExtendedSnapshotAttributesProjectId = osExtendedSnapshotAttributesProjectId;
        return this;
    }

    public String getOsExtendedSnapshotAttributesProjectId() {
        return osExtendedSnapshotAttributesProjectId;
    }

    public void setOsExtendedSnapshotAttributesProjectId(String osExtendedSnapshotAttributesProjectId) {
        this.osExtendedSnapshotAttributesProjectId = osExtendedSnapshotAttributesProjectId;
    }

    public SnapshotDetails withOsExtendedSnapshotAttributesProgress(String osExtendedSnapshotAttributesProgress) {
        this.osExtendedSnapshotAttributesProgress = osExtendedSnapshotAttributesProgress;
        return this;
    }

    public String getOsExtendedSnapshotAttributesProgress() {
        return osExtendedSnapshotAttributesProgress;
    }

    public void setOsExtendedSnapshotAttributesProgress(String osExtendedSnapshotAttributesProgress) {
        this.osExtendedSnapshotAttributesProgress = osExtendedSnapshotAttributesProgress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotDetails snapshotDetails = (SnapshotDetails) o;
        return Objects.equals(this.id, snapshotDetails.id) && Objects.equals(this.status, snapshotDetails.status)
            && Objects.equals(this.name, snapshotDetails.name)
            && Objects.equals(this.description, snapshotDetails.description)
            && Objects.equals(this.createdAt, snapshotDetails.createdAt)
            && Objects.equals(this.updatedAt, snapshotDetails.updatedAt)
            && Objects.equals(this.metadata, snapshotDetails.metadata)
            && Objects.equals(this.volumeId, snapshotDetails.volumeId)
            && Objects.equals(this.size, snapshotDetails.size)
            && Objects.equals(this.osExtendedSnapshotAttributesProjectId,
                snapshotDetails.osExtendedSnapshotAttributesProjectId)
            && Objects.equals(this.osExtendedSnapshotAttributesProgress,
                snapshotDetails.osExtendedSnapshotAttributesProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            name,
            description,
            createdAt,
            updatedAt,
            metadata,
            volumeId,
            size,
            osExtendedSnapshotAttributesProjectId,
            osExtendedSnapshotAttributesProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    osExtendedSnapshotAttributesProjectId: ")
            .append(toIndentedString(osExtendedSnapshotAttributesProjectId))
            .append("\n");
        sb.append("    osExtendedSnapshotAttributesProgress: ")
            .append(toIndentedString(osExtendedSnapshotAttributesProgress))
            .append("\n");
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
