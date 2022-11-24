package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ExtraDhcpOpt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_name")

    private String optName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_value")

    private String optValue;

    public ExtraDhcpOpt withOptName(String optName) {
        this.optName = optName;
        return this;
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    public ExtraDhcpOpt withOptValue(String optValue) {
        this.optValue = optValue;
        return this;
    }

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtraDhcpOpt extraDhcpOpt = (ExtraDhcpOpt) o;
        return Objects.equals(this.optName, extraDhcpOpt.optName)
            && Objects.equals(this.optValue, extraDhcpOpt.optValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optName, optValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraDhcpOpt {\n");
        sb.append("    optName: ").append(toIndentedString(optName)).append("\n");
        sb.append("    optValue: ").append(toIndentedString(optValue)).append("\n");
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
