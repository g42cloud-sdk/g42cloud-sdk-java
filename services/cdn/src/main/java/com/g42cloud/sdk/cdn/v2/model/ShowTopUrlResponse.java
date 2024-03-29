package com.g42cloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTopUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_url_summary")

    private List<Map<String, Object>> topUrlSummary = null;

    public ShowTopUrlResponse withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ShowTopUrlResponse withTopUrlSummary(List<Map<String, Object>> topUrlSummary) {
        this.topUrlSummary = topUrlSummary;
        return this;
    }

    public ShowTopUrlResponse addTopUrlSummaryItem(Map<String, Object> topUrlSummaryItem) {
        if (this.topUrlSummary == null) {
            this.topUrlSummary = new ArrayList<>();
        }
        this.topUrlSummary.add(topUrlSummaryItem);
        return this;
    }

    public ShowTopUrlResponse withTopUrlSummary(Consumer<List<Map<String, Object>>> topUrlSummarySetter) {
        if (this.topUrlSummary == null) {
            this.topUrlSummary = new ArrayList<>();
        }
        topUrlSummarySetter.accept(this.topUrlSummary);
        return this;
    }

    public List<Map<String, Object>> getTopUrlSummary() {
        return topUrlSummary;
    }

    public void setTopUrlSummary(List<Map<String, Object>> topUrlSummary) {
        this.topUrlSummary = topUrlSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopUrlResponse that = (ShowTopUrlResponse) obj;
        return Objects.equals(this.serviceArea, that.serviceArea)
            && Objects.equals(this.topUrlSummary, that.topUrlSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceArea, topUrlSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopUrlResponse {\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    topUrlSummary: ").append(toIndentedString(topUrlSummary)).append("\n");
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
