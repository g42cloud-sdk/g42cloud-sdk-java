package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronUpdateFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule")

    private NeutronUpdateFirewallRuleOption firewallRule;

    public NeutronUpdateFirewallRuleRequestBody withFirewallRule(NeutronUpdateFirewallRuleOption firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }

    public NeutronUpdateFirewallRuleRequestBody withFirewallRule(
        Consumer<NeutronUpdateFirewallRuleOption> firewallRuleSetter) {
        if (this.firewallRule == null) {
            this.firewallRule = new NeutronUpdateFirewallRuleOption();
            firewallRuleSetter.accept(this.firewallRule);
        }

        return this;
    }

    public NeutronUpdateFirewallRuleOption getFirewallRule() {
        return firewallRule;
    }

    public void setFirewallRule(NeutronUpdateFirewallRuleOption firewallRule) {
        this.firewallRule = firewallRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallRuleRequestBody neutronUpdateFirewallRuleRequestBody =
            (NeutronUpdateFirewallRuleRequestBody) o;
        return Objects.equals(this.firewallRule, neutronUpdateFirewallRuleRequestBody.firewallRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallRuleRequestBody {\n");
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
