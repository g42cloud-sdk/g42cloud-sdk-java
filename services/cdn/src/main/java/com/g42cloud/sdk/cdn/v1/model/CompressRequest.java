package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompressRequest
 */
public class CompressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_switch")

    private Integer compressSwitch;

    public CompressRequest withCompressSwitch(Integer compressSwitch) {
        this.compressSwitch = compressSwitch;
        return this;
    }

    public Integer getCompressSwitch() {
        return compressSwitch;
    }

    public void setCompressSwitch(Integer compressSwitch) {
        this.compressSwitch = compressSwitch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompressRequest compressRequest = (CompressRequest) o;
        return Objects.equals(this.compressSwitch, compressRequest.compressSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompressRequest {\n");
        sb.append("    compressSwitch: ").append(toIndentedString(compressSwitch)).append("\n");
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
