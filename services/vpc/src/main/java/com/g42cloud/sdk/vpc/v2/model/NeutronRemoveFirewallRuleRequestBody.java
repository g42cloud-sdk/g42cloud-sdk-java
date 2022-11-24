package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class NeutronRemoveFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    private String firewallRuleId;

    public NeutronRemoveFirewallRuleRequestBody withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronRemoveFirewallRuleRequestBody neutronRemoveFirewallRuleRequestBody =
            (NeutronRemoveFirewallRuleRequestBody) o;
        return Objects.equals(this.firewallRuleId, neutronRemoveFirewallRuleRequestBody.firewallRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronRemoveFirewallRuleRequestBody {\n");
        sb.append("    firewallRuleId: ").append(toIndentedString(firewallRuleId)).append("\n");
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
