package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ENI网络配置，创建集群指定subnets字段使用时必填。
 */
public class NetworkSubnet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetID")

    private String subnetID;

    public NetworkSubnet withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkSubnet that = (NetworkSubnet) obj;
        return Objects.equals(this.subnetID, that.subnetID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSubnet {\n");
        sb.append("    subnetID: ").append(toIndentedString(subnetID)).append("\n");
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
