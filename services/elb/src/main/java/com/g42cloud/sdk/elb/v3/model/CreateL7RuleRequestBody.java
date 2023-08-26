package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateL7RuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private CreateRuleOption rule;

    public CreateL7RuleRequestBody withRule(CreateRuleOption rule) {
        this.rule = rule;
        return this;
    }

    public CreateL7RuleRequestBody withRule(Consumer<CreateRuleOption> ruleSetter) {
        if (this.rule == null) {
            this.rule = new CreateRuleOption();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    public CreateRuleOption getRule() {
        return rule;
    }

    public void setRule(CreateRuleOption rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateL7RuleRequestBody that = (CreateL7RuleRequestBody) obj;
        return Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7RuleRequestBody {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
