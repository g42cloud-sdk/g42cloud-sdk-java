package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNodePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_id")

    private String nodepoolId;

    public DeleteNodePoolRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteNodePoolRequest withNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }

    public String getNodepoolId() {
        return nodepoolId;
    }

    public void setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNodePoolRequest that = (DeleteNodePoolRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodepoolId, that.nodepoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodePoolRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodepoolId: ").append(toIndentedString(nodepoolId)).append("\n");
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
