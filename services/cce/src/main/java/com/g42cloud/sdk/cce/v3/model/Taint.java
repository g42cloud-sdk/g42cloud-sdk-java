package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 如下字段不可使用：  - node.kubernetes.io/memory-pressure - node.kubernetes.io/disk-pressure - node.kubernetes.io/out-of-disk - node.kubernetes.io/unschedulable - node.kubernetes.io/network-unavailable
 */
public class Taint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public static final class EffectEnum {

        /**
         * Enum NOSCHEDULE for value: "NoSchedule"
         */
        public static final EffectEnum NOSCHEDULE = new EffectEnum("NoSchedule");

        /**
         * Enum PREFERNOSCHEDULE for value: "PreferNoSchedule"
         */
        public static final EffectEnum PREFERNOSCHEDULE = new EffectEnum("PreferNoSchedule");

        /**
         * Enum NOEXECUTE for value: "NoExecute"
         */
        public static final EffectEnum NOEXECUTE = new EffectEnum("NoExecute");

        private static final Map<String, EffectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectEnum> createStaticFields() {
            Map<String, EffectEnum> map = new HashMap<>();
            map.put("NoSchedule", NOSCHEDULE);
            map.put("PreferNoSchedule", PREFERNOSCHEDULE);
            map.put("NoExecute", NOEXECUTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectEnum(String value) {
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
        public static EffectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EffectEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EffectEnum(value);
            }
            return result;
        }

        public static EffectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EffectEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectEnum) {
                return this.value.equals(((EffectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private EffectEnum effect;

    public Taint withKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Taint withValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Taint withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Taint taint = (Taint) o;
        return Objects.equals(this.key, taint.key) && Objects.equals(this.value, taint.value)
            && Objects.equals(this.effect, taint.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Taint {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
