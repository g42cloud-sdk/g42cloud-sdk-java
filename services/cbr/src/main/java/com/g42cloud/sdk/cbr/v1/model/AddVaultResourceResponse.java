package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddVaultResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_resource_ids")

    private List<String> addResourceIds = null;

    public AddVaultResourceResponse withAddResourceIds(List<String> addResourceIds) {
        this.addResourceIds = addResourceIds;
        return this;
    }

    public AddVaultResourceResponse addAddResourceIdsItem(String addResourceIdsItem) {
        if (this.addResourceIds == null) {
            this.addResourceIds = new ArrayList<>();
        }
        this.addResourceIds.add(addResourceIdsItem);
        return this;
    }

    public AddVaultResourceResponse withAddResourceIds(Consumer<List<String>> addResourceIdsSetter) {
        if (this.addResourceIds == null) {
            this.addResourceIds = new ArrayList<>();
        }
        addResourceIdsSetter.accept(this.addResourceIds);
        return this;
    }

    public List<String> getAddResourceIds() {
        return addResourceIds;
    }

    public void setAddResourceIds(List<String> addResourceIds) {
        this.addResourceIds = addResourceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddVaultResourceResponse addVaultResourceResponse = (AddVaultResourceResponse) o;
        return Objects.equals(this.addResourceIds, addVaultResourceResponse.addResourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addResourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVaultResourceResponse {\n");
        sb.append("    addResourceIds: ").append(toIndentedString(addResourceIds)).append("\n");
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
