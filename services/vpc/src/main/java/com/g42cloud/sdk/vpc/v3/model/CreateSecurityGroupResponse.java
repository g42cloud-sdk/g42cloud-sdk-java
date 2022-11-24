package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSecurityGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private SecurityGroupInfo securityGroup;

    public CreateSecurityGroupResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateSecurityGroupResponse withSecurityGroup(SecurityGroupInfo securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public CreateSecurityGroupResponse withSecurityGroup(Consumer<SecurityGroupInfo> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new SecurityGroupInfo();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    public SecurityGroupInfo getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroupInfo securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecurityGroupResponse createSecurityGroupResponse = (CreateSecurityGroupResponse) o;
        return Objects.equals(this.requestId, createSecurityGroupResponse.requestId)
            && Objects.equals(this.securityGroup, createSecurityGroupResponse.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
