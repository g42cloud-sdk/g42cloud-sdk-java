package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FailoverStrategyRequest
 */
public class FailoverStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repairStrategy")

    private String repairStrategy;

    public FailoverStrategyRequest withRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
        return this;
    }

    public String getRepairStrategy() {
        return repairStrategy;
    }

    public void setRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailoverStrategyRequest that = (FailoverStrategyRequest) obj;
        return Objects.equals(this.repairStrategy, that.repairStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repairStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailoverStrategyRequest {\n");
        sb.append("    repairStrategy: ").append(toIndentedString(repairStrategy)).append("\n");
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
