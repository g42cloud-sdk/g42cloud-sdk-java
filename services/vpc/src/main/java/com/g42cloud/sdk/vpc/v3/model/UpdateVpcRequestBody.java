package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateVpcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private UpdateVpcOption vpc;

    public UpdateVpcRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateVpcRequestBody withVpc(UpdateVpcOption vpc) {
        this.vpc = vpc;
        return this;
    }

    public UpdateVpcRequestBody withVpc(Consumer<UpdateVpcOption> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new UpdateVpcOption();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    public UpdateVpcOption getVpc() {
        return vpc;
    }

    public void setVpc(UpdateVpcOption vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcRequestBody updateVpcRequestBody = (UpdateVpcRequestBody) o;
        return Objects.equals(this.dryRun, updateVpcRequestBody.dryRun)
            && Objects.equals(this.vpc, updateVpcRequestBody.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
