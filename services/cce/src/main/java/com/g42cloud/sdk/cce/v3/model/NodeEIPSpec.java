package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodeEIPSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private String iptype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private NodeBandwidth bandwidth;

    public NodeEIPSpec withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    public NodeEIPSpec withBandwidth(NodeBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public NodeEIPSpec withBandwidth(Consumer<NodeBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new NodeBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    public NodeBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(NodeBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeEIPSpec nodeEIPSpec = (NodeEIPSpec) o;
        return Objects.equals(this.iptype, nodeEIPSpec.iptype) && Objects.equals(this.bandwidth, nodeEIPSpec.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iptype, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeEIPSpec {\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
