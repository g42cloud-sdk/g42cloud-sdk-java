package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目的端
 */
public class TargetServerById {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public TargetServerById withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public TargetServerById withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetServerById that = (TargetServerById) obj;
        return Objects.equals(this.vmId, that.vmId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetServerById {\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
