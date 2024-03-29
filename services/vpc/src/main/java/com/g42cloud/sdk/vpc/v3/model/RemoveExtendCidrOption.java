package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class RemoveExtendCidrOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_cidrs")

    private List<String> extendCidrs = null;

    public RemoveExtendCidrOption withExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
        return this;
    }

    public RemoveExtendCidrOption addExtendCidrsItem(String extendCidrsItem) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        this.extendCidrs.add(extendCidrsItem);
        return this;
    }

    public RemoveExtendCidrOption withExtendCidrs(Consumer<List<String>> extendCidrsSetter) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        extendCidrsSetter.accept(this.extendCidrs);
        return this;
    }

    public List<String> getExtendCidrs() {
        return extendCidrs;
    }

    public void setExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveExtendCidrOption that = (RemoveExtendCidrOption) obj;
        return Objects.equals(this.extendCidrs, that.extendCidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendCidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveExtendCidrOption {\n");
        sb.append("    extendCidrs: ").append(toIndentedString(extendCidrs)).append("\n");
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
