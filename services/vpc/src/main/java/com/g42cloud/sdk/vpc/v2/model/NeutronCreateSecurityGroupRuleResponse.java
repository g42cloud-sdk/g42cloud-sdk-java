package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronCreateSecurityGroupRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    private NeutronSecurityGroupRule securityGroupRule;

    public NeutronCreateSecurityGroupRuleResponse withSecurityGroupRule(NeutronSecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    public NeutronCreateSecurityGroupRuleResponse withSecurityGroupRule(
        Consumer<NeutronSecurityGroupRule> securityGroupRuleSetter) {
        if (this.securityGroupRule == null) {
            this.securityGroupRule = new NeutronSecurityGroupRule();
            securityGroupRuleSetter.accept(this.securityGroupRule);
        }

        return this;
    }

    public NeutronSecurityGroupRule getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(NeutronSecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateSecurityGroupRuleResponse neutronCreateSecurityGroupRuleResponse =
            (NeutronCreateSecurityGroupRuleResponse) o;
        return Objects.equals(this.securityGroupRule, neutronCreateSecurityGroupRuleResponse.securityGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateSecurityGroupRuleResponse {\n");
        sb.append("    securityGroupRule: ").append(toIndentedString(securityGroupRule)).append("\n");
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
