package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateFirewallPolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audited")

    private Boolean audited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    private List<String> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public NeutronCreateFirewallPolicyOption withAudited(Boolean audited) {
        this.audited = audited;
        return this;
    }

    public Boolean getAudited() {
        return audited;
    }

    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    public NeutronCreateFirewallPolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronCreateFirewallPolicyOption withFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public NeutronCreateFirewallPolicyOption addFirewallRulesItem(String firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronCreateFirewallPolicyOption withFirewallRules(Consumer<List<String>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    public List<String> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public NeutronCreateFirewallPolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallPolicyOption neutronCreateFirewallPolicyOption = (NeutronCreateFirewallPolicyOption) o;
        return Objects.equals(this.audited, neutronCreateFirewallPolicyOption.audited)
            && Objects.equals(this.description, neutronCreateFirewallPolicyOption.description)
            && Objects.equals(this.firewallRules, neutronCreateFirewallPolicyOption.firewallRules)
            && Objects.equals(this.name, neutronCreateFirewallPolicyOption.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audited, description, firewallRules, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallPolicyOption {\n");
        sb.append("    audited: ").append(toIndentedString(audited)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
