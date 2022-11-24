package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Computes
 */
public class Computes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavors")

    private List<ScaleFlavors> computeFlavors = null;

    public Computes withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Computes withComputeFlavors(List<ScaleFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
        return this;
    }

    public Computes addComputeFlavorsItem(ScaleFlavors computeFlavorsItem) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        this.computeFlavors.add(computeFlavorsItem);
        return this;
    }

    public Computes withComputeFlavors(Consumer<List<ScaleFlavors>> computeFlavorsSetter) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        computeFlavorsSetter.accept(this.computeFlavors);
        return this;
    }

    public List<ScaleFlavors> getComputeFlavors() {
        return computeFlavors;
    }

    public void setComputeFlavors(List<ScaleFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computes computes = (Computes) o;
        return Objects.equals(this.groupType, computes.groupType)
            && Objects.equals(this.computeFlavors, computes.computeFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, computeFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Computes {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    computeFlavors: ").append(toIndentedString(computeFlavors)).append("\n");
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
