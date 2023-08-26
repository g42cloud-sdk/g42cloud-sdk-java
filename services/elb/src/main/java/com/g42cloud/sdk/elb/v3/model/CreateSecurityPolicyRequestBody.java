package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateSecurityPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy")

    private CreateSecurityPolicyOption securityPolicy;

    public CreateSecurityPolicyRequestBody withSecurityPolicy(CreateSecurityPolicyOption securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    public CreateSecurityPolicyRequestBody withSecurityPolicy(
        Consumer<CreateSecurityPolicyOption> securityPolicySetter) {
        if (this.securityPolicy == null) {
            this.securityPolicy = new CreateSecurityPolicyOption();
            securityPolicySetter.accept(this.securityPolicy);
        }

        return this;
    }

    public CreateSecurityPolicyOption getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(CreateSecurityPolicyOption securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityPolicyRequestBody that = (CreateSecurityPolicyRequestBody) obj;
        return Objects.equals(this.securityPolicy, that.securityPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityPolicyRequestBody {\n");
        sb.append("    securityPolicy: ").append(toIndentedString(securityPolicy)).append("\n");
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
