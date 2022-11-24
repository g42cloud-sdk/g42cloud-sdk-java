package com.g42cloud.sdk.rds.v3.model;

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
public class ListErrorLogsNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    public static final class LevelEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LevelEnum ALL = new LevelEnum("ALL");

        /**
         * Enum INFO for value: "INFO"
         */
        public static final LevelEnum INFO = new LevelEnum("INFO");

        /**
         * Enum LOG for value: "LOG"
         */
        public static final LevelEnum LOG = new LevelEnum("LOG");

        /**
         * Enum WARNING for value: "WARNING"
         */
        public static final LevelEnum WARNING = new LevelEnum("WARNING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final LevelEnum ERROR = new LevelEnum("ERROR");

        /**
         * Enum FATAL for value: "FATAL"
         */
        public static final LevelEnum FATAL = new LevelEnum("FATAL");

        /**
         * Enum PANIC for value: "PANIC"
         */
        public static final LevelEnum PANIC = new LevelEnum("PANIC");

        /**
         * Enum NOTE for value: "NOTE"
         */
        public static final LevelEnum NOTE = new LevelEnum("NOTE");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("INFO", INFO);
            map.put("LOG", LOG);
            map.put("WARNING", WARNING);
            map.put("ERROR", ERROR);
            map.put("FATAL", FATAL);
            map.put("PANIC", PANIC);
            map.put("NOTE", NOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LevelEnum(value);
            }
            return result;
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    public ListErrorLogsNewRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListErrorLogsNewRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListErrorLogsNewRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListErrorLogsNewRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ListErrorLogsNewRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListErrorLogsNewRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListErrorLogsNewRequest withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListErrorLogsNewRequest listErrorLogsNewRequest = (ListErrorLogsNewRequest) o;
        return Objects.equals(this.xLanguage, listErrorLogsNewRequest.xLanguage)
            && Objects.equals(this.instanceId, listErrorLogsNewRequest.instanceId)
            && Objects.equals(this.startDate, listErrorLogsNewRequest.startDate)
            && Objects.equals(this.endDate, listErrorLogsNewRequest.endDate)
            && Objects.equals(this.offset, listErrorLogsNewRequest.offset)
            && Objects.equals(this.limit, listErrorLogsNewRequest.limit)
            && Objects.equals(this.level, listErrorLogsNewRequest.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, startDate, endDate, offset, limit, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListErrorLogsNewRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
