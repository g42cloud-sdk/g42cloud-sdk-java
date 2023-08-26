package com.g42cloud.sdk.mpc.v1.model;

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
public class ListAllBucketsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<ObsBucket> buckets = null;

    public ListAllBucketsResponse withBuckets(List<ObsBucket> buckets) {
        this.buckets = buckets;
        return this;
    }

    public ListAllBucketsResponse addBucketsItem(ObsBucket bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public ListAllBucketsResponse withBuckets(Consumer<List<ObsBucket>> bucketsSetter) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        bucketsSetter.accept(this.buckets);
        return this;
    }

    public List<ObsBucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<ObsBucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllBucketsResponse that = (ListAllBucketsResponse) obj;
        return Objects.equals(this.buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllBucketsResponse {\n");
        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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
