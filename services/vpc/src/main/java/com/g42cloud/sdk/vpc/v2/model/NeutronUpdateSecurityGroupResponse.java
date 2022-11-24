package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronUpdateSecurityGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private NeutronSecurityGroup securityGroup;

    public NeutronUpdateSecurityGroupResponse withSecurityGroup(NeutronSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public NeutronUpdateSecurityGroupResponse withSecurityGroup(Consumer<NeutronSecurityGroup> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new NeutronSecurityGroup();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    public NeutronSecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(NeutronSecurityGroup securityGroup) {
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
        NeutronUpdateSecurityGroupResponse neutronUpdateSecurityGroupResponse = (NeutronUpdateSecurityGroupResponse) o;
        return Objects.equals(this.securityGroup, neutronUpdateSecurityGroupResponse.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateSecurityGroupResponse {\n");
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
