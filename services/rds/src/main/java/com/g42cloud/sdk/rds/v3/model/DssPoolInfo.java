package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例专属存储信息。
 */
public class DssPoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_capacity_gb")

    private String freeCapacityGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_volume_type")

    private String dsspoolVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_status")

    private String dsspoolStatus;

    public DssPoolInfo withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public DssPoolInfo withFreeCapacityGb(String freeCapacityGb) {
        this.freeCapacityGb = freeCapacityGb;
        return this;
    }

    public String getFreeCapacityGb() {
        return freeCapacityGb;
    }

    public void setFreeCapacityGb(String freeCapacityGb) {
        this.freeCapacityGb = freeCapacityGb;
    }

    public DssPoolInfo withDsspoolVolumeType(String dsspoolVolumeType) {
        this.dsspoolVolumeType = dsspoolVolumeType;
        return this;
    }

    public String getDsspoolVolumeType() {
        return dsspoolVolumeType;
    }

    public void setDsspoolVolumeType(String dsspoolVolumeType) {
        this.dsspoolVolumeType = dsspoolVolumeType;
    }

    public DssPoolInfo withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public DssPoolInfo withDsspoolStatus(String dsspoolStatus) {
        this.dsspoolStatus = dsspoolStatus;
        return this;
    }

    public String getDsspoolStatus() {
        return dsspoolStatus;
    }

    public void setDsspoolStatus(String dsspoolStatus) {
        this.dsspoolStatus = dsspoolStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DssPoolInfo that = (DssPoolInfo) obj;
        return Objects.equals(this.azName, that.azName) && Objects.equals(this.freeCapacityGb, that.freeCapacityGb)
            && Objects.equals(this.dsspoolVolumeType, that.dsspoolVolumeType)
            && Objects.equals(this.dsspoolId, that.dsspoolId) && Objects.equals(this.dsspoolStatus, that.dsspoolStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azName, freeCapacityGb, dsspoolVolumeType, dsspoolId, dsspoolStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DssPoolInfo {\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    freeCapacityGb: ").append(toIndentedString(freeCapacityGb)).append("\n");
        sb.append("    dsspoolVolumeType: ").append(toIndentedString(dsspoolVolumeType)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    dsspoolStatus: ").append(toIndentedString(dsspoolStatus)).append("\n");
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
