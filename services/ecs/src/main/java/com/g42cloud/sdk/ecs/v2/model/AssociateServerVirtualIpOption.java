package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AssociateServerVirtualIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_binding")

    private Boolean reverseBinding;

    public AssociateServerVirtualIpOption withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public AssociateServerVirtualIpOption withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AssociateServerVirtualIpOption withReverseBinding(Boolean reverseBinding) {
        this.reverseBinding = reverseBinding;
        return this;
    }

    public Boolean getReverseBinding() {
        return reverseBinding;
    }

    public void setReverseBinding(Boolean reverseBinding) {
        this.reverseBinding = reverseBinding;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateServerVirtualIpOption associateServerVirtualIpOption = (AssociateServerVirtualIpOption) o;
        return Objects.equals(this.subnetId, associateServerVirtualIpOption.subnetId)
            && Objects.equals(this.ipAddress, associateServerVirtualIpOption.ipAddress)
            && Objects.equals(this.reverseBinding, associateServerVirtualIpOption.reverseBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress, reverseBinding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateServerVirtualIpOption {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    reverseBinding: ").append(toIndentedString(reverseBinding)).append("\n");
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
