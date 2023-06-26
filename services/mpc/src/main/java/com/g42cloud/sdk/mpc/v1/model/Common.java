package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Common
 */
public class Common {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PVC")

    private Boolean pvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_interval")

    private Integer hlsInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dash_interval")

    private Integer dashInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_type")

    private Integer packType;

    public Common withPvc(Boolean pvc) {
        this.pvc = pvc;
        return this;
    }

    public Boolean getPvc() {
        return pvc;
    }

    public void setPvc(Boolean pvc) {
        this.pvc = pvc;
    }

    public Common withHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
        return this;
    }

    public Integer getHlsInterval() {
        return hlsInterval;
    }

    public void setHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
    }

    public Common withDashInterval(Integer dashInterval) {
        this.dashInterval = dashInterval;
        return this;
    }

    public Integer getDashInterval() {
        return dashInterval;
    }

    public void setDashInterval(Integer dashInterval) {
        this.dashInterval = dashInterval;
    }

    public Common withPackType(Integer packType) {
        this.packType = packType;
        return this;
    }

    public Integer getPackType() {
        return packType;
    }

    public void setPackType(Integer packType) {
        this.packType = packType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Common common = (Common) o;
        return Objects.equals(this.pvc, common.pvc) && Objects.equals(this.hlsInterval, common.hlsInterval)
            && Objects.equals(this.dashInterval, common.dashInterval) && Objects.equals(this.packType, common.packType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pvc, hlsInterval, dashInterval, packType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Common {\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    hlsInterval: ").append(toIndentedString(hlsInterval)).append("\n");
        sb.append("    dashInterval: ").append(toIndentedString(dashInterval)).append("\n");
        sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
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
