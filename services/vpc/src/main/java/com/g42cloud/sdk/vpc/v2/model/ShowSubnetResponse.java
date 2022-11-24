package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private Subnet subnet;

    public ShowSubnetResponse withSubnet(Subnet subnet) {
        this.subnet = subnet;
        return this;
    }

    public ShowSubnetResponse withSubnet(Consumer<Subnet> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new Subnet();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    public Subnet getSubnet() {
        return subnet;
    }

    public void setSubnet(Subnet subnet) {
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
        ShowSubnetResponse showSubnetResponse = (ShowSubnetResponse) o;
        return Objects.equals(this.subnet, showSubnetResponse.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubnetResponse {\n");
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
