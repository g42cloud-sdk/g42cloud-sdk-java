package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSecurityPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSecurityPolicyRequestBody body;

    public CreateSecurityPolicyRequest withBody(CreateSecurityPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSecurityPolicyRequest withBody(Consumer<CreateSecurityPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSecurityPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateSecurityPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSecurityPolicyRequestBody body) {
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
        CreateSecurityPolicyRequest createSecurityPolicyRequest = (CreateSecurityPolicyRequest) o;
        return Objects.equals(this.body, createSecurityPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityPolicyRequest {\n");
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
