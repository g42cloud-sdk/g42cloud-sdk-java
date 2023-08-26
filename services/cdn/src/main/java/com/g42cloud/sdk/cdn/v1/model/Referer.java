package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Referer
 */
public class Referer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_type")

    private Integer refererType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_list")

    private String refererList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_empty")

    private Boolean includeEmpty;

    public Referer withRefererType(Integer refererType) {
        this.refererType = refererType;
        return this;
    }

    public Integer getRefererType() {
        return refererType;
    }

    public void setRefererType(Integer refererType) {
        this.refererType = refererType;
    }

    public Referer withRefererList(String refererList) {
        this.refererList = refererList;
        return this;
    }

    public String getRefererList() {
        return refererList;
    }

    public void setRefererList(String refererList) {
        this.refererList = refererList;
    }

    public Referer withIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
        return this;
    }

    public Boolean getIncludeEmpty() {
        return includeEmpty;
    }

    public void setIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Referer that = (Referer) obj;
        return Objects.equals(this.refererType, that.refererType) && Objects.equals(this.refererList, that.refererList)
            && Objects.equals(this.includeEmpty, that.includeEmpty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refererType, refererList, includeEmpty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Referer {\n");
        sb.append("    refererType: ").append(toIndentedString(refererType)).append("\n");
        sb.append("    refererList: ").append(toIndentedString(refererList)).append("\n");
        sb.append("    includeEmpty: ").append(toIndentedString(includeEmpty)).append("\n");
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
