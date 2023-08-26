package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 子网配置的NTP地址对象
 */
public class ExtraDhcpOption {

    public static final class OptNameEnum {

        /**
         * Enum NTP for value: "ntp"
         */
        public static final OptNameEnum NTP = new OptNameEnum("ntp");

        private static final Map<String, OptNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptNameEnum> createStaticFields() {
            Map<String, OptNameEnum> map = new HashMap<>();
            map.put("ntp", NTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptNameEnum(String value) {
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
        public static OptNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptNameEnum(value));
        }

        public static OptNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptNameEnum) {
                return this.value.equals(((OptNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_name")

    private OptNameEnum optName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_value")

    private String optValue;

    public ExtraDhcpOption withOptName(OptNameEnum optName) {
        this.optName = optName;
        return this;
    }

    public OptNameEnum getOptName() {
        return optName;
    }

    public void setOptName(OptNameEnum optName) {
        this.optName = optName;
    }

    public ExtraDhcpOption withOptValue(String optValue) {
        this.optValue = optValue;
        return this;
    }

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtraDhcpOption that = (ExtraDhcpOption) obj;
        return Objects.equals(this.optName, that.optName) && Objects.equals(this.optValue, that.optValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optName, optValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraDhcpOption {\n");
        sb.append("    optName: ").append(toIndentedString(optName)).append("\n");
        sb.append("    optValue: ").append(toIndentedString(optValue)).append("\n");
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
