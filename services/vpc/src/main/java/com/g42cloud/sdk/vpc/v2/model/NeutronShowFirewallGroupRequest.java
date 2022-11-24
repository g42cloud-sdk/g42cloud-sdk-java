package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class NeutronShowFirewallGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_group_id")

    private String firewallGroupId;

    public NeutronShowFirewallGroupRequest withFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
        return this;
    }

    public String getFirewallGroupId() {
        return firewallGroupId;
    }

    public void setFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronShowFirewallGroupRequest neutronShowFirewallGroupRequest = (NeutronShowFirewallGroupRequest) o;
        return Objects.equals(this.firewallGroupId, neutronShowFirewallGroupRequest.firewallGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallGroupRequest {\n");
        sb.append("    firewallGroupId: ").append(toIndentedString(firewallGroupId)).append("\n");
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
