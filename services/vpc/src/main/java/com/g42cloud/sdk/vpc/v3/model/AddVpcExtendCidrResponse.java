package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddVpcExtendCidrResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private Vpc vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public AddVpcExtendCidrResponse withVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }

    public AddVpcExtendCidrResponse withVpc(Consumer<Vpc> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new Vpc();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    public Vpc getVpc() {
        return vpc;
    }

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    public AddVpcExtendCidrResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddVpcExtendCidrResponse addVpcExtendCidrResponse = (AddVpcExtendCidrResponse) o;
        return Objects.equals(this.vpc, addVpcExtendCidrResponse.vpc)
            && Objects.equals(this.requestId, addVpcExtendCidrResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpc, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVpcExtendCidrResponse {\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
