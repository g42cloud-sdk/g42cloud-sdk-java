package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackupRestore
 */
public class BackupRestore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<BackupRestoreServerMapping> mappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_on")

    private Boolean powerOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public BackupRestore withMappings(List<BackupRestoreServerMapping> mappings) {
        this.mappings = mappings;
        return this;
    }

    public BackupRestore addMappingsItem(BackupRestoreServerMapping mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public BackupRestore withMappings(Consumer<List<BackupRestoreServerMapping>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    public List<BackupRestoreServerMapping> getMappings() {
        return mappings;
    }

    public void setMappings(List<BackupRestoreServerMapping> mappings) {
        this.mappings = mappings;
    }

    public BackupRestore withPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
        return this;
    }

    public Boolean getPowerOn() {
        return powerOn;
    }

    public void setPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
    }

    public BackupRestore withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public BackupRestore withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public BackupRestore withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestore backupRestore = (BackupRestore) o;
        return Objects.equals(this.mappings, backupRestore.mappings)
            && Objects.equals(this.powerOn, backupRestore.powerOn)
            && Objects.equals(this.serverId, backupRestore.serverId)
            && Objects.equals(this.volumeId, backupRestore.volumeId)
            && Objects.equals(this.resourceId, backupRestore.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mappings, powerOn, serverId, volumeId, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestore {\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    powerOn: ").append(toIndentedString(powerOn)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
