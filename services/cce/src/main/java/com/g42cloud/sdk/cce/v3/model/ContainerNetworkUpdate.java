package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerNetworkUpdate
 */
public class ContainerNetworkUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<ContainerCIDR> cidrs = null;

    public ContainerNetworkUpdate withCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public ContainerNetworkUpdate addCidrsItem(ContainerCIDR cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public ContainerNetworkUpdate withCidrs(Consumer<List<ContainerCIDR>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    public List<ContainerCIDR> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerNetworkUpdate containerNetworkUpdate = (ContainerNetworkUpdate) o;
        return Objects.equals(this.cidrs, containerNetworkUpdate.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetworkUpdate {\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
