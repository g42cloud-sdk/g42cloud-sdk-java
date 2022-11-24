package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeManagement
 */
public class NodeManagement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverGroupReference")

    private String serverGroupReference;

    public NodeManagement withServerGroupReference(String serverGroupReference) {
        this.serverGroupReference = serverGroupReference;
        return this;
    }

    public String getServerGroupReference() {
        return serverGroupReference;
    }

    public void setServerGroupReference(String serverGroupReference) {
        this.serverGroupReference = serverGroupReference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeManagement nodeManagement = (NodeManagement) o;
        return Objects.equals(this.serverGroupReference, nodeManagement.serverGroupReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeManagement {\n");
        sb.append("    serverGroupReference: ").append(toIndentedString(serverGroupReference)).append("\n");
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
