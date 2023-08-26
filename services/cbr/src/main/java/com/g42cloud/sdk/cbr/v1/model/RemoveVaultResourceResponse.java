package com.g42cloud.sdk.cbr.v1.model;

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
public class RemoveVaultResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_resource_ids")

    private List<String> removeResourceIds = null;

    public RemoveVaultResourceResponse withRemoveResourceIds(List<String> removeResourceIds) {
        this.removeResourceIds = removeResourceIds;
        return this;
    }

    public RemoveVaultResourceResponse addRemoveResourceIdsItem(String removeResourceIdsItem) {
        if (this.removeResourceIds == null) {
            this.removeResourceIds = new ArrayList<>();
        }
        this.removeResourceIds.add(removeResourceIdsItem);
        return this;
    }

    public RemoveVaultResourceResponse withRemoveResourceIds(Consumer<List<String>> removeResourceIdsSetter) {
        if (this.removeResourceIds == null) {
            this.removeResourceIds = new ArrayList<>();
        }
        removeResourceIdsSetter.accept(this.removeResourceIds);
        return this;
    }

    public List<String> getRemoveResourceIds() {
        return removeResourceIds;
    }

    public void setRemoveResourceIds(List<String> removeResourceIds) {
        this.removeResourceIds = removeResourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveVaultResourceResponse that = (RemoveVaultResourceResponse) obj;
        return Objects.equals(this.removeResourceIds, that.removeResourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeResourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveVaultResourceResponse {\n");
        sb.append("    removeResourceIds: ").append(toIndentedString(removeResourceIds)).append("\n");
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
