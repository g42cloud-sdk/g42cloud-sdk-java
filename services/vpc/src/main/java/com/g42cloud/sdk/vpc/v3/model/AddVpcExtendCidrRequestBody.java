package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class AddVpcExtendCidrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private AddExtendCidrOption vpc;

    public AddVpcExtendCidrRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public AddVpcExtendCidrRequestBody withVpc(AddExtendCidrOption vpc) {
        this.vpc = vpc;
        return this;
    }

    public AddVpcExtendCidrRequestBody withVpc(Consumer<AddExtendCidrOption> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new AddExtendCidrOption();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    public AddExtendCidrOption getVpc() {
        return vpc;
    }

    public void setVpc(AddExtendCidrOption vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddVpcExtendCidrRequestBody that = (AddVpcExtendCidrRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.vpc, that.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVpcExtendCidrRequestBody {\n");
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
