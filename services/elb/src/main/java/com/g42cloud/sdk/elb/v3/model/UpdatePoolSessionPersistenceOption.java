package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 会话持久性对象。
 */
public class UpdatePoolSessionPersistenceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_name")

    private String cookieName;

    public static final class TypeEnum {

        /**
         * Enum SOURCE_IP for value: "SOURCE_IP"
         */
        public static final TypeEnum SOURCE_IP = new TypeEnum("SOURCE_IP");

        /**
         * Enum HTTP_COOKIE for value: "HTTP_COOKIE"
         */
        public static final TypeEnum HTTP_COOKIE = new TypeEnum("HTTP_COOKIE");

        /**
         * Enum APP_COOKIE for value: "APP_COOKIE"
         */
        public static final TypeEnum APP_COOKIE = new TypeEnum("APP_COOKIE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SOURCE_IP", SOURCE_IP);
            map.put("HTTP_COOKIE", HTTP_COOKIE);
            map.put("APP_COOKIE", APP_COOKIE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "persistence_timeout")

    private Integer persistenceTimeout;

    public UpdatePoolSessionPersistenceOption withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public UpdatePoolSessionPersistenceOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdatePoolSessionPersistenceOption withPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }

    public Integer getPersistenceTimeout() {
        return persistenceTimeout;
    }

    public void setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePoolSessionPersistenceOption updatePoolSessionPersistenceOption = (UpdatePoolSessionPersistenceOption) o;
        return Objects.equals(this.cookieName, updatePoolSessionPersistenceOption.cookieName)
            && Objects.equals(this.type, updatePoolSessionPersistenceOption.type)
            && Objects.equals(this.persistenceTimeout, updatePoolSessionPersistenceOption.persistenceTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cookieName, type, persistenceTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolSessionPersistenceOption {\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
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
