package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SearchQueryScaleComputeFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavor_groups")

    private List<Computes> computeFlavorGroups = null;

    public SearchQueryScaleComputeFlavorsResponse withComputeFlavorGroups(List<Computes> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
        return this;
    }

    public SearchQueryScaleComputeFlavorsResponse addComputeFlavorGroupsItem(Computes computeFlavorGroupsItem) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        this.computeFlavorGroups.add(computeFlavorGroupsItem);
        return this;
    }

    public SearchQueryScaleComputeFlavorsResponse withComputeFlavorGroups(
        Consumer<List<Computes>> computeFlavorGroupsSetter) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        computeFlavorGroupsSetter.accept(this.computeFlavorGroups);
        return this;
    }

    public List<Computes> getComputeFlavorGroups() {
        return computeFlavorGroups;
    }

    public void setComputeFlavorGroups(List<Computes> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchQueryScaleComputeFlavorsResponse that = (SearchQueryScaleComputeFlavorsResponse) obj;
        return Objects.equals(this.computeFlavorGroups, that.computeFlavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeFlavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQueryScaleComputeFlavorsResponse {\n");
        sb.append("    computeFlavorGroups: ").append(toIndentedString(computeFlavorGroups)).append("\n");
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
