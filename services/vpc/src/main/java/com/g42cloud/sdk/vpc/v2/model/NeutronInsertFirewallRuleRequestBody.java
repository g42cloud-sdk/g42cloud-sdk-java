package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class NeutronInsertFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    private String firewallRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_after")

    private String insertAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_before")

    private String insertBefore;

    public NeutronInsertFirewallRuleRequestBody withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    public NeutronInsertFirewallRuleRequestBody withInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
        return this;
    }

    public String getInsertAfter() {
        return insertAfter;
    }

    public void setInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
    }

    public NeutronInsertFirewallRuleRequestBody withInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
        return this;
    }

    public String getInsertBefore() {
        return insertBefore;
    }

    public void setInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronInsertFirewallRuleRequestBody that = (NeutronInsertFirewallRuleRequestBody) obj;
        return Objects.equals(this.firewallRuleId, that.firewallRuleId)
            && Objects.equals(this.insertAfter, that.insertAfter)
            && Objects.equals(this.insertBefore, that.insertBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId, insertAfter, insertBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronInsertFirewallRuleRequestBody {\n");
        sb.append("    firewallRuleId: ").append(toIndentedString(firewallRuleId)).append("\n");
        sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
        sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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
