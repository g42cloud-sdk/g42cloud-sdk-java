package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private SubnetResult subnet;

    public UpdateSubnetResponse withSubnet(SubnetResult subnet) {
        this.subnet = subnet;
        return this;
    }

    public UpdateSubnetResponse withSubnet(Consumer<SubnetResult> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new SubnetResult();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    public SubnetResult getSubnet() {
        return subnet;
    }

    public void setSubnet(SubnetResult subnet) {
        this.subnet = subnet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubnetResponse updateSubnetResponse = (UpdateSubnetResponse) o;
        return Objects.equals(this.subnet, updateSubnetResponse.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetResponse {\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
