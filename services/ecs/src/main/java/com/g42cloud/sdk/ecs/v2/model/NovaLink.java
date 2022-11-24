package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *  
 */
public class NovaLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    public static final class RelEnum {

        /**
         * Enum SELF for value: "self"
         */
        public static final RelEnum SELF = new RelEnum("self");

        /**
         * Enum BOOKMARK for value: "bookmark"
         */
        public static final RelEnum BOOKMARK = new RelEnum("bookmark");

        /**
         * Enum ALTERNATE for value: "alternate"
         */
        public static final RelEnum ALTERNATE = new RelEnum("alternate");

        /**
         * Enum DESCRIBEDBY for value: "describedby"
         */
        public static final RelEnum DESCRIBEDBY = new RelEnum("describedby");

        private static final Map<String, RelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelEnum> createStaticFields() {
            Map<String, RelEnum> map = new HashMap<>();
            map.put("self", SELF);
            map.put("bookmark", BOOKMARK);
            map.put("alternate", ALTERNATE);
            map.put("describedby", DESCRIBEDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelEnum(String value) {
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
        public static RelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RelEnum(value);
            }
            return result;
        }

        public static RelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelEnum) {
                return this.value.equals(((RelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private RelEnum rel;

    public NovaLink withHref(String href) {
        this.href = href;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public NovaLink withRel(RelEnum rel) {
        this.rel = rel;
        return this;
    }

    public RelEnum getRel() {
        return rel;
    }

    public void setRel(RelEnum rel) {
        this.rel = rel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaLink novaLink = (NovaLink) o;
        return Objects.equals(this.href, novaLink.href) && Objects.equals(this.rel, novaLink.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaLink {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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
