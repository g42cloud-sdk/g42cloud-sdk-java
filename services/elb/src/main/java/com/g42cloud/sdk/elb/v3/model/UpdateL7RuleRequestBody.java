package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateL7RuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private UpdateL7RuleOption rule;

    public UpdateL7RuleRequestBody withRule(UpdateL7RuleOption rule) {
        this.rule = rule;
        return this;
    }

    public UpdateL7RuleRequestBody withRule(Consumer<UpdateL7RuleOption> ruleSetter) {
        if (this.rule == null) {
            this.rule = new UpdateL7RuleOption();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    public UpdateL7RuleOption getRule() {
        return rule;
    }

    public void setRule(UpdateL7RuleOption rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateL7RuleRequestBody updateL7RuleRequestBody = (UpdateL7RuleRequestBody) o;
        return Objects.equals(this.rule, updateL7RuleRequestBody.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7RuleRequestBody {\n");
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
