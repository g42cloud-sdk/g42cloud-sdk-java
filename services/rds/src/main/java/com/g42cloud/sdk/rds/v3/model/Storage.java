package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例磁盘类型信息。
 */
public class Storage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_compute_group_type")

    private List<String> supportComputeGroupType = null;

    public Storage withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Storage withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public Storage putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public Storage withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    public Storage withSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
        return this;
    }

    public Storage addSupportComputeGroupTypeItem(String supportComputeGroupTypeItem) {
        if (this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        this.supportComputeGroupType.add(supportComputeGroupTypeItem);
        return this;
    }

    public Storage withSupportComputeGroupType(Consumer<List<String>> supportComputeGroupTypeSetter) {
        if (this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        supportComputeGroupTypeSetter.accept(this.supportComputeGroupType);
        return this;
    }

    public List<String> getSupportComputeGroupType() {
        return supportComputeGroupType;
    }

    public void setSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Storage that = (Storage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.azStatus, that.azStatus)
            && Objects.equals(this.supportComputeGroupType, that.supportComputeGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, azStatus, supportComputeGroupType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Storage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    supportComputeGroupType: ").append(toIndentedString(supportComputeGroupType)).append("\n");
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
