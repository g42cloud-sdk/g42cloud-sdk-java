package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改的逻辑卷信息
 */
public class PutLogicalVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration")

    private Boolean needMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjust_size")

    private Long adjustSize;

    public PutLogicalVolume withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PutLogicalVolume withNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
        return this;
    }

    public Boolean getNeedMigration() {
        return needMigration;
    }

    public void setNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
    }

    public PutLogicalVolume withAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    public Long getAdjustSize() {
        return adjustSize;
    }

    public void setAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutLogicalVolume that = (PutLogicalVolume) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.needMigration, that.needMigration)
            && Objects.equals(this.adjustSize, that.adjustSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, needMigration, adjustSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutLogicalVolume {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    needMigration: ").append(toIndentedString(needMigration)).append("\n");
        sb.append("    adjustSize: ").append(toIndentedString(adjustSize)).append("\n");
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
