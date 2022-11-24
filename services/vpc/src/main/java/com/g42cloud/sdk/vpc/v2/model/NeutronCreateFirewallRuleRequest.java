package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronCreateFirewallRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronCreateFirewallRuleRequestBody body;

    public NeutronCreateFirewallRuleRequest withBody(NeutronCreateFirewallRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronCreateFirewallRuleRequest withBody(Consumer<NeutronCreateFirewallRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronCreateFirewallRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public NeutronCreateFirewallRuleRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronCreateFirewallRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallRuleRequest neutronCreateFirewallRuleRequest = (NeutronCreateFirewallRuleRequest) o;
        return Objects.equals(this.body, neutronCreateFirewallRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallRuleRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
