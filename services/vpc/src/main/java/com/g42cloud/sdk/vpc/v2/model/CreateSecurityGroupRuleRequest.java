package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSecurityGroupRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSecurityGroupRuleRequestBody body;

    public CreateSecurityGroupRuleRequest withBody(CreateSecurityGroupRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSecurityGroupRuleRequest withBody(Consumer<CreateSecurityGroupRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSecurityGroupRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateSecurityGroupRuleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSecurityGroupRuleRequestBody body) {
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
        CreateSecurityGroupRuleRequest createSecurityGroupRuleRequest = (CreateSecurityGroupRuleRequest) o;
        return Objects.equals(this.body, createSecurityGroupRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleRequest {\n");
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
