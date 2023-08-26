package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNodePoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "showDefaultNodePool")

    private String showDefaultNodePool;

    public ListNodePoolsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListNodePoolsRequest withShowDefaultNodePool(String showDefaultNodePool) {
        this.showDefaultNodePool = showDefaultNodePool;
        return this;
    }

    public String getShowDefaultNodePool() {
        return showDefaultNodePool;
    }

    public void setShowDefaultNodePool(String showDefaultNodePool) {
        this.showDefaultNodePool = showDefaultNodePool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNodePoolsRequest that = (ListNodePoolsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.showDefaultNodePool, that.showDefaultNodePool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, showDefaultNodePool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodePoolsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    showDefaultNodePool: ").append(toIndentedString(showDefaultNodePool)).append("\n");
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
