package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建弹性公网IP的extendparam字段数据结构说明
 */
public class ExtendParamEip {

    public static final class ChargingmodeEnum {

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingmodeEnum PREPAID = new ChargingmodeEnum("prePaid");

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingmodeEnum POSTPAID = new ChargingmodeEnum("postPaid");

        private static final Map<String, ChargingmodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingmodeEnum> createStaticFields() {
            Map<String, ChargingmodeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingmodeEnum(String value) {
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
        public static ChargingmodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingmodeEnum(value));
        }

        public static ChargingmodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingmodeEnum) {
                return this.value.equals(((ChargingmodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingmode")

    private ChargingmodeEnum chargingmode;

    public ExtendParamEip withChargingmode(ChargingmodeEnum chargingmode) {
        this.chargingmode = chargingmode;
        return this;
    }

    public ChargingmodeEnum getChargingmode() {
        return chargingmode;
    }

    public void setChargingmode(ChargingmodeEnum chargingmode) {
        this.chargingmode = chargingmode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendParamEip that = (ExtendParamEip) obj;
        return Objects.equals(this.chargingmode, that.chargingmode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingmode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendParamEip {\n");
        sb.append("    chargingmode: ").append(toIndentedString(chargingmode)).append("\n");
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
