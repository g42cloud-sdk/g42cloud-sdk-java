package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronShowFirewallRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule")

    private NeutronFirewallRule firewallRule;

    public NeutronShowFirewallRuleResponse withFirewallRule(NeutronFirewallRule firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }

    public NeutronShowFirewallRuleResponse withFirewallRule(Consumer<NeutronFirewallRule> firewallRuleSetter) {
        if (this.firewallRule == null) {
            this.firewallRule = new NeutronFirewallRule();
            firewallRuleSetter.accept(this.firewallRule);
        }

        return this;
    }

    public NeutronFirewallRule getFirewallRule() {
        return firewallRule;
    }

    public void setFirewallRule(NeutronFirewallRule firewallRule) {
        this.firewallRule = firewallRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronShowFirewallRuleResponse that = (NeutronShowFirewallRuleResponse) obj;
        return Objects.equals(this.firewallRule, that.firewallRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallRuleResponse {\n");
        sb.append("    firewallRule: ").append(toIndentedString(firewallRule)).append("\n");
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
