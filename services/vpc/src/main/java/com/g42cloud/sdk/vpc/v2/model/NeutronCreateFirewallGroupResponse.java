package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronCreateFirewallGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_group")

    private NeutronFirewallGroup firewallGroup;

    public NeutronCreateFirewallGroupResponse withFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
        return this;
    }

    public NeutronCreateFirewallGroupResponse withFirewallGroup(Consumer<NeutronFirewallGroup> firewallGroupSetter) {
        if (this.firewallGroup == null) {
            this.firewallGroup = new NeutronFirewallGroup();
            firewallGroupSetter.accept(this.firewallGroup);
        }

        return this;
    }

    public NeutronFirewallGroup getFirewallGroup() {
        return firewallGroup;
    }

    public void setFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronCreateFirewallGroupResponse that = (NeutronCreateFirewallGroupResponse) obj;
        return Objects.equals(this.firewallGroup, that.firewallGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallGroupResponse {\n");
        sb.append("    firewallGroup: ").append(toIndentedString(firewallGroup)).append("\n");
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
