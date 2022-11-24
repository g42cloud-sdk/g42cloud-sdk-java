package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建子网对象
 */
public class CreateSubnetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private CreateSubnetOption subnet;

    public CreateSubnetRequestBody withSubnet(CreateSubnetOption subnet) {
        this.subnet = subnet;
        return this;
    }

    public CreateSubnetRequestBody withSubnet(Consumer<CreateSubnetOption> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new CreateSubnetOption();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    public CreateSubnetOption getSubnet() {
        return subnet;
    }

    public void setSubnet(CreateSubnetOption subnet) {
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
        CreateSubnetRequestBody createSubnetRequestBody = (CreateSubnetRequestBody) o;
        return Objects.equals(this.subnet, createSubnetRequestBody.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetRequestBody {\n");
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
