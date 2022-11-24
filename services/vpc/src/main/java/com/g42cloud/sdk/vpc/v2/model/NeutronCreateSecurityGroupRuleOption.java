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
 * 
 */
public class NeutronCreateSecurityGroupRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public static final class DirectionEnum {

        /**
         * Enum INGRESS for value: "ingress"
         */
        public static final DirectionEnum INGRESS = new DirectionEnum("ingress");

        /**
         * Enum EGRESS for value: "egress"
         */
        public static final DirectionEnum EGRESS = new DirectionEnum("egress");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("ingress", INGRESS);
            map.put("egress", EGRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    public static final class EthertypeEnum {

        /**
         * Enum IPV4 for value: "IPv4"
         */
        public static final EthertypeEnum IPV4 = new EthertypeEnum("IPv4");

        /**
         * Enum IPV6 for value: "IPv6"
         */
        public static final EthertypeEnum IPV6 = new EthertypeEnum("IPv6");

        private static final Map<String, EthertypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EthertypeEnum> createStaticFields() {
            Map<String, EthertypeEnum> map = new HashMap<>();
            map.put("IPv4", IPV4);
            map.put("IPv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EthertypeEnum(String value) {
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
        public static EthertypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EthertypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EthertypeEnum(value);
            }
            return result;
        }

        public static EthertypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EthertypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EthertypeEnum) {
                return this.value.equals(((EthertypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethertype")

    private EthertypeEnum ethertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_range_max")

    private Integer portRangeMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_range_min")

    private Integer portRangeMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_group_id")

    private String remoteGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ip_prefix")

    private String remoteIpPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    public NeutronCreateSecurityGroupRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronCreateSecurityGroupRuleOption withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public NeutronCreateSecurityGroupRuleOption withEthertype(EthertypeEnum ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public EthertypeEnum getEthertype() {
        return ethertype;
    }

    public void setEthertype(EthertypeEnum ethertype) {
        this.ethertype = ethertype;
    }

    public NeutronCreateSecurityGroupRuleOption withPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
        return this;
    }

    public Integer getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    public NeutronCreateSecurityGroupRuleOption withPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
        return this;
    }

    public Integer getPortRangeMin() {
        return portRangeMin;
    }

    public void setPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
    }

    public NeutronCreateSecurityGroupRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public NeutronCreateSecurityGroupRuleOption withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    public NeutronCreateSecurityGroupRuleOption withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    public NeutronCreateSecurityGroupRuleOption withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateSecurityGroupRuleOption neutronCreateSecurityGroupRuleOption =
            (NeutronCreateSecurityGroupRuleOption) o;
        return Objects.equals(this.description, neutronCreateSecurityGroupRuleOption.description)
            && Objects.equals(this.direction, neutronCreateSecurityGroupRuleOption.direction)
            && Objects.equals(this.ethertype, neutronCreateSecurityGroupRuleOption.ethertype)
            && Objects.equals(this.portRangeMax, neutronCreateSecurityGroupRuleOption.portRangeMax)
            && Objects.equals(this.portRangeMin, neutronCreateSecurityGroupRuleOption.portRangeMin)
            && Objects.equals(this.protocol, neutronCreateSecurityGroupRuleOption.protocol)
            && Objects.equals(this.remoteGroupId, neutronCreateSecurityGroupRuleOption.remoteGroupId)
            && Objects.equals(this.remoteIpPrefix, neutronCreateSecurityGroupRuleOption.remoteIpPrefix)
            && Objects.equals(this.securityGroupId, neutronCreateSecurityGroupRuleOption.securityGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            direction,
            ethertype,
            portRangeMax,
            portRangeMin,
            protocol,
            remoteGroupId,
            remoteIpPrefix,
            securityGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateSecurityGroupRuleOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    portRangeMax: ").append(toIndentedString(portRangeMax)).append("\n");
        sb.append("    portRangeMin: ").append(toIndentedString(portRangeMin)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
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
