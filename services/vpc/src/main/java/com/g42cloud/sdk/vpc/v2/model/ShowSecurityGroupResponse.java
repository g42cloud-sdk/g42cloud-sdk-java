package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private SecurityGroup securityGroup;

    public ShowSecurityGroupResponse withSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public ShowSecurityGroupResponse withSecurityGroup(Consumer<SecurityGroup> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new SecurityGroup();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
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
        ShowSecurityGroupResponse showSecurityGroupResponse = (ShowSecurityGroupResponse) o;
        return Objects.equals(this.securityGroup, showSecurityGroupResponse.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityGroupResponse {\n");
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
