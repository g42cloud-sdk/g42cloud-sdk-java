package com.g42cloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAgentDimensionInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public static final class DimNameEnum {

        /**
         * Enum MOUNT_POINT for value: "mount_point"
         */
        public static final DimNameEnum MOUNT_POINT = new DimNameEnum("mount_point");

        /**
         * Enum DISK for value: "disk"
         */
        public static final DimNameEnum DISK = new DimNameEnum("disk");

        /**
         * Enum PROC for value: "proc"
         */
        public static final DimNameEnum PROC = new DimNameEnum("proc");

        /**
         * Enum GPU for value: "gpu"
         */
        public static final DimNameEnum GPU = new DimNameEnum("gpu");

        /**
         * Enum RAID for value: "raid"
         */
        public static final DimNameEnum RAID = new DimNameEnum("raid");

        private static final Map<String, DimNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimNameEnum> createStaticFields() {
            Map<String, DimNameEnum> map = new HashMap<>();
            map.put("mount_point", MOUNT_POINT);
            map.put("disk", DISK);
            map.put("proc", PROC);
            map.put("gpu", GPU);
            map.put("raid", RAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DimNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DimNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DimNameEnum(value);
            }
            return result;
        }

        public static DimNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DimNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimNameEnum) {
                return this.value.equals(((DimNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_name")

    private DimNameEnum dimName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_value")

    private String dimValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAgentDimensionInfoRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAgentDimensionInfoRequest withDimName(DimNameEnum dimName) {
        this.dimName = dimName;
        return this;
    }

    public DimNameEnum getDimName() {
        return dimName;
    }

    public void setDimName(DimNameEnum dimName) {
        this.dimName = dimName;
    }

    public ListAgentDimensionInfoRequest withDimValue(String dimValue) {
        this.dimValue = dimValue;
        return this;
    }

    public String getDimValue() {
        return dimValue;
    }

    public void setDimValue(String dimValue) {
        this.dimValue = dimValue;
    }

    public ListAgentDimensionInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAgentDimensionInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAgentDimensionInfoRequest listAgentDimensionInfoRequest = (ListAgentDimensionInfoRequest) o;
        return Objects.equals(this.instanceId, listAgentDimensionInfoRequest.instanceId)
            && Objects.equals(this.dimName, listAgentDimensionInfoRequest.dimName)
            && Objects.equals(this.dimValue, listAgentDimensionInfoRequest.dimValue)
            && Objects.equals(this.offset, listAgentDimensionInfoRequest.offset)
            && Objects.equals(this.limit, listAgentDimensionInfoRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, dimName, dimValue, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentDimensionInfoRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
        sb.append("    dimValue: ").append(toIndentedString(dimValue)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
