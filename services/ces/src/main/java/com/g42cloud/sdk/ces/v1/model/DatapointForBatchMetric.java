package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class DatapointForBatchMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private Double average;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum")

    private Double sum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variance")

    private Double variance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public DatapointForBatchMetric withMax(Double max) {
        this.max = max;
        return this;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public DatapointForBatchMetric withMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public DatapointForBatchMetric withAverage(Double average) {
        this.average = average;
        return this;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public DatapointForBatchMetric withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public DatapointForBatchMetric withVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    public Double getVariance() {
        return variance;
    }

    public void setVariance(Double variance) {
        this.variance = variance;
    }

    public DatapointForBatchMetric withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatapointForBatchMetric datapointForBatchMetric = (DatapointForBatchMetric) o;
        return Objects.equals(this.max, datapointForBatchMetric.max)
            && Objects.equals(this.min, datapointForBatchMetric.min)
            && Objects.equals(this.average, datapointForBatchMetric.average)
            && Objects.equals(this.sum, datapointForBatchMetric.sum)
            && Objects.equals(this.variance, datapointForBatchMetric.variance)
            && Objects.equals(this.timestamp, datapointForBatchMetric.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, average, sum, variance, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatapointForBatchMetric {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
