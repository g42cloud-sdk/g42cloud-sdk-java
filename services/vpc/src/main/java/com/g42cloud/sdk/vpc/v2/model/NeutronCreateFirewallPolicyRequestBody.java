package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateFirewallPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy")

    private NeutronCreateFirewallPolicyOption firewallPolicy;

    public NeutronCreateFirewallPolicyRequestBody withFirewallPolicy(NeutronCreateFirewallPolicyOption firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    public NeutronCreateFirewallPolicyRequestBody withFirewallPolicy(
        Consumer<NeutronCreateFirewallPolicyOption> firewallPolicySetter) {
        if (this.firewallPolicy == null) {
            this.firewallPolicy = new NeutronCreateFirewallPolicyOption();
            firewallPolicySetter.accept(this.firewallPolicy);
        }

        return this;
    }

    public NeutronCreateFirewallPolicyOption getFirewallPolicy() {
        return firewallPolicy;
    }

    public void setFirewallPolicy(NeutronCreateFirewallPolicyOption firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallPolicyRequestBody neutronCreateFirewallPolicyRequestBody =
            (NeutronCreateFirewallPolicyRequestBody) o;
        return Objects.equals(this.firewallPolicy, neutronCreateFirewallPolicyRequestBody.firewallPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallPolicyRequestBody {\n");
        sb.append("    firewallPolicy: ").append(toIndentedString(firewallPolicy)).append("\n");
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
