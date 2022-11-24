package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 跨区域备份实例信息。
 */
public class OffsiteBackupInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ParaGroupDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Long keepDays;

    public OffsiteBackupInstance withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OffsiteBackupInstance withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsiteBackupInstance withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public OffsiteBackupInstance withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public OffsiteBackupInstance withDatastore(ParaGroupDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public OffsiteBackupInstance withDatastore(Consumer<ParaGroupDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ParaGroupDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    public ParaGroupDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ParaGroupDatastore datastore) {
        this.datastore = datastore;
    }

    public OffsiteBackupInstance withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public OffsiteBackupInstance withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public OffsiteBackupInstance withKeepDays(Long keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    public Long getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Long keepDays) {
        this.keepDays = keepDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OffsiteBackupInstance offsiteBackupInstance = (OffsiteBackupInstance) o;
        return Objects.equals(this.id, offsiteBackupInstance.id)
            && Objects.equals(this.name, offsiteBackupInstance.name)
            && Objects.equals(this.sourceRegion, offsiteBackupInstance.sourceRegion)
            && Objects.equals(this.sourceProjectId, offsiteBackupInstance.sourceProjectId)
            && Objects.equals(this.datastore, offsiteBackupInstance.datastore)
            && Objects.equals(this.destinationRegion, offsiteBackupInstance.destinationRegion)
            && Objects.equals(this.destinationProjectId, offsiteBackupInstance.destinationProjectId)
            && Objects.equals(this.keepDays, offsiteBackupInstance.keepDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            sourceRegion,
            sourceProjectId,
            datastore,
            destinationRegion,
            destinationProjectId,
            keepDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffsiteBackupInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
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
