package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSecurityPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy")

    private SecurityPolicy securityPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateSecurityPolicyResponse withSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    public CreateSecurityPolicyResponse withSecurityPolicy(Consumer<SecurityPolicy> securityPolicySetter) {
        if (this.securityPolicy == null) {
            this.securityPolicy = new SecurityPolicy();
            securityPolicySetter.accept(this.securityPolicy);
        }

        return this;
    }

    public SecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    public CreateSecurityPolicyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityPolicyResponse that = (CreateSecurityPolicyResponse) obj;
        return Objects.equals(this.securityPolicy, that.securityPolicy)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicy, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityPolicyResponse {\n");
        sb.append("    securityPolicy: ").append(toIndentedString(securityPolicy)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
