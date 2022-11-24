package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecyclePolicyRequestBody
 */
public class RecyclePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_policy")

    private RecyclePolicy recyclePolicy;

    public RecyclePolicyRequestBody withRecyclePolicy(RecyclePolicy recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
        return this;
    }

    public RecyclePolicyRequestBody withRecyclePolicy(Consumer<RecyclePolicy> recyclePolicySetter) {
        if (this.recyclePolicy == null) {
            this.recyclePolicy = new RecyclePolicy();
            recyclePolicySetter.accept(this.recyclePolicy);
        }

        return this;
    }

    public RecyclePolicy getRecyclePolicy() {
        return recyclePolicy;
    }

    public void setRecyclePolicy(RecyclePolicy recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicyRequestBody recyclePolicyRequestBody = (RecyclePolicyRequestBody) o;
        return Objects.equals(this.recyclePolicy, recyclePolicyRequestBody.recyclePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recyclePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicyRequestBody {\n");
        sb.append("    recyclePolicy: ").append(toIndentedString(recyclePolicy)).append("\n");
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
