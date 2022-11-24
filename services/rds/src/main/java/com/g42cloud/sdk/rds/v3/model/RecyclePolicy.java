package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回收策略。
 */
public class RecyclePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period_in_days")

    private String retentionPeriodInDays;

    public RecyclePolicy withRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    public String getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    public void setRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicy recyclePolicy = (RecyclePolicy) o;
        return Objects.equals(this.retentionPeriodInDays, recyclePolicy.retentionPeriodInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionPeriodInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicy {\n");
        sb.append("    retentionPeriodInDays: ").append(toIndentedString(retentionPeriodInDays)).append("\n");
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
