package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器可挂载磁盘数量。
 */
public class BlockDeviceAttachableQuantity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_scsi")

    private Integer freeScsi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_blk")

    private Integer freeBlk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_disk")

    private Integer freeDisk;

    public BlockDeviceAttachableQuantity withFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
        return this;
    }

    public Integer getFreeScsi() {
        return freeScsi;
    }

    public void setFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
    }

    public BlockDeviceAttachableQuantity withFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
        return this;
    }

    public Integer getFreeBlk() {
        return freeBlk;
    }

    public void setFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
    }

    public BlockDeviceAttachableQuantity withFreeDisk(Integer freeDisk) {
        this.freeDisk = freeDisk;
        return this;
    }

    public Integer getFreeDisk() {
        return freeDisk;
    }

    public void setFreeDisk(Integer freeDisk) {
        this.freeDisk = freeDisk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlockDeviceAttachableQuantity that = (BlockDeviceAttachableQuantity) obj;
        return Objects.equals(this.freeScsi, that.freeScsi) && Objects.equals(this.freeBlk, that.freeBlk)
            && Objects.equals(this.freeDisk, that.freeDisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeScsi, freeBlk, freeDisk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockDeviceAttachableQuantity {\n");
        sb.append("    freeScsi: ").append(toIndentedString(freeScsi)).append("\n");
        sb.append("    freeBlk: ").append(toIndentedString(freeBlk)).append("\n");
        sb.append("    freeDisk: ").append(toIndentedString(freeDisk)).append("\n");
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
