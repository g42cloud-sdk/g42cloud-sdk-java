package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateSecurityGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private NeutronCreateSecurityGroupOption securityGroup;

    public NeutronCreateSecurityGroupRequestBody withSecurityGroup(NeutronCreateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public NeutronCreateSecurityGroupRequestBody withSecurityGroup(
        Consumer<NeutronCreateSecurityGroupOption> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new NeutronCreateSecurityGroupOption();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    public NeutronCreateSecurityGroupOption getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(NeutronCreateSecurityGroupOption securityGroup) {
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
        NeutronCreateSecurityGroupRequestBody neutronCreateSecurityGroupRequestBody =
            (NeutronCreateSecurityGroupRequestBody) o;
        return Objects.equals(this.securityGroup, neutronCreateSecurityGroupRequestBody.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateSecurityGroupRequestBody {\n");
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
