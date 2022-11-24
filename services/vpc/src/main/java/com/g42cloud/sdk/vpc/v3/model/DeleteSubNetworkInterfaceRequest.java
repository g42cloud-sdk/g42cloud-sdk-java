package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSubNetworkInterfaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interface_id")

    private String subNetworkInterfaceId;

    public DeleteSubNetworkInterfaceRequest withSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
        return this;
    }

    public String getSubNetworkInterfaceId() {
        return subNetworkInterfaceId;
    }

    public void setSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSubNetworkInterfaceRequest deleteSubNetworkInterfaceRequest = (DeleteSubNetworkInterfaceRequest) o;
        return Objects.equals(this.subNetworkInterfaceId, deleteSubNetworkInterfaceRequest.subNetworkInterfaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subNetworkInterfaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSubNetworkInterfaceRequest {\n");
        sb.append("    subNetworkInterfaceId: ").append(toIndentedString(subNetworkInterfaceId)).append("\n");
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
