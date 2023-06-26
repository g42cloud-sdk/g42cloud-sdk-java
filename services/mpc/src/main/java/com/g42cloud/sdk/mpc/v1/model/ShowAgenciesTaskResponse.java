package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgenciesTaskResponse extends SdkResponse {

    public static final class OperateTypeEnum {

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final OperateTypeEnum CREATED = new OperateTypeEnum("CREATED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final OperateTypeEnum CANCELED = new OperateTypeEnum("CANCELED");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("CREATED", CREATED);
            map.put("CANCELED", CANCELED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperateTypeEnum(value);
            }
            return result;
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    public ShowAgenciesTaskResponse withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAgenciesTaskResponse showAgenciesTaskResponse = (ShowAgenciesTaskResponse) o;
        return Objects.equals(this.operateType, showAgenciesTaskResponse.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgenciesTaskResponse {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
