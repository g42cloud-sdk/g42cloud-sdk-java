package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SATA云硬盘类型预留的云硬盘个数，键值对，包含：reserved（预留）、limit（最大）和in_use（已使用）。
 */
public class QuotaDetailVolumesSATA {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_use")

    private Integer inUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved")

    private Integer reserved;

    public QuotaDetailVolumesSATA withInUse(Integer inUse) {
        this.inUse = inUse;
        return this;
    }

    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }

    public QuotaDetailVolumesSATA withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QuotaDetailVolumesSATA withReserved(Integer reserved) {
        this.reserved = reserved;
        return this;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaDetailVolumesSATA that = (QuotaDetailVolumesSATA) obj;
        return Objects.equals(this.inUse, that.inUse) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.reserved, that.reserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inUse, limit, reserved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaDetailVolumesSATA {\n");
        sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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
