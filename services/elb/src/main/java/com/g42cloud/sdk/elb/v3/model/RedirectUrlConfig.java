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
 * 转发到的url配置。  当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。  当action为REDIRECT_TO_URL时生效，且为必选字段，其他action不可指定，否则报错。  格式：protocol://host:port/path?query  protocol、host、port、path不允许同时不传或同时传${xxx} （${xxx}表示原值，如${host}表示被转发的请求URL的host部分）。 protocol和port传入的值不能与l7policy关联的监听器一致且host、path同时不传或同时传${xxx}。   [共享型负载均衡器下的转发策略不支持该字段，传入会报错。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt)  [不支持该字段，请勿使用。](tag:hcso_dt)
 */
public class RedirectUrlConfig {

    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        /**
         * Enum _PROTOCOL_ for value: "${protocol}"
         */
        public static final ProtocolEnum _PROTOCOL_ = new ProtocolEnum("${protocol}");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            map.put("${protocol}", _PROTOCOL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public static final class StatusCodeEnum {

        /**
         * Enum _301 for value: "301"
         */
        public static final StatusCodeEnum _301 = new StatusCodeEnum("301");

        /**
         * Enum _302 for value: "302"
         */
        public static final StatusCodeEnum _302 = new StatusCodeEnum("302");

        /**
         * Enum _303 for value: "303"
         */
        public static final StatusCodeEnum _303 = new StatusCodeEnum("303");

        /**
         * Enum _307 for value: "307"
         */
        public static final StatusCodeEnum _307 = new StatusCodeEnum("307");

        /**
         * Enum _308 for value: "308"
         */
        public static final StatusCodeEnum _308 = new StatusCodeEnum("308");

        private static final Map<String, StatusCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusCodeEnum> createStaticFields() {
            Map<String, StatusCodeEnum> map = new HashMap<>();
            map.put("301", _301);
            map.put("302", _302);
            map.put("303", _303);
            map.put("307", _307);
            map.put("308", _308);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusCodeEnum(String value) {
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
        public static StatusCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusCodeEnum(value);
            }
            return result;
        }

        public static StatusCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusCodeEnum) {
                return this.value.equals(((StatusCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private StatusCodeEnum statusCode;

    public RedirectUrlConfig withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public RedirectUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RedirectUrlConfig withPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RedirectUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RedirectUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public RedirectUrlConfig withStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RedirectUrlConfig redirectUrlConfig = (RedirectUrlConfig) o;
        return Objects.equals(this.protocol, redirectUrlConfig.protocol)
            && Objects.equals(this.host, redirectUrlConfig.host) && Objects.equals(this.port, redirectUrlConfig.port)
            && Objects.equals(this.path, redirectUrlConfig.path) && Objects.equals(this.query, redirectUrlConfig.query)
            && Objects.equals(this.statusCode, redirectUrlConfig.statusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path, query, statusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedirectUrlConfig {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
