package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UnchangeableParam
 */
public class UnchangeableParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_case_table_names")

    private String lowerCaseTableNames;

    public UnchangeableParam withLowerCaseTableNames(String lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
        return this;
    }

    public String getLowerCaseTableNames() {
        return lowerCaseTableNames;
    }

    public void setLowerCaseTableNames(String lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnchangeableParam unchangeableParam = (UnchangeableParam) o;
        return Objects.equals(this.lowerCaseTableNames, unchangeableParam.lowerCaseTableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerCaseTableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnchangeableParam {\n");
        sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
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
