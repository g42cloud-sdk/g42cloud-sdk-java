package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemuxOutputParam
 */
public class RemuxOutputParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_duration")

    private Integer segmentDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_meta")

    private Boolean removeMeta;

    public RemuxOutputParam withFormat(String format) {
        this.format = format;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public RemuxOutputParam withSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }

    public Integer getSegmentDuration() {
        return segmentDuration;
    }

    public void setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
    }

    public RemuxOutputParam withRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
        return this;
    }

    public Boolean getRemoveMeta() {
        return removeMeta;
    }

    public void setRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemuxOutputParam that = (RemuxOutputParam) obj;
        return Objects.equals(this.format, that.format) && Objects.equals(this.segmentDuration, that.segmentDuration)
            && Objects.equals(this.removeMeta, that.removeMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, segmentDuration, removeMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemuxOutputParam {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    segmentDuration: ").append(toIndentedString(segmentDuration)).append("\n");
        sb.append("    removeMeta: ").append(toIndentedString(removeMeta)).append("\n");
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
