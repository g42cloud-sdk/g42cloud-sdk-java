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
public class NeutronCreateFirewallRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public static final class ActionEnum {

        /**
         * Enum DENY for value: "DENY"
         */
        public static final ActionEnum DENY = new ActionEnum("DENY");

        /**
         * Enum ALLOW for value: "ALLOW"
         */
        public static final ActionEnum ALLOW = new ActionEnum("ALLOW");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("DENY", DENY);
            map.put("ALLOW", ALLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_ip_address")

    private String destinationIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_port")

    private String destinationPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip_address")

    private String sourceIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public NeutronCreateFirewallRuleOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronCreateFirewallRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronCreateFirewallRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public NeutronCreateFirewallRuleOption withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public NeutronCreateFirewallRuleOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public NeutronCreateFirewallRuleOption withDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    public NeutronCreateFirewallRuleOption withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public NeutronCreateFirewallRuleOption withSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    public NeutronCreateFirewallRuleOption withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public NeutronCreateFirewallRuleOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallRuleOption neutronCreateFirewallRuleOption = (NeutronCreateFirewallRuleOption) o;
        return Objects.equals(this.name, neutronCreateFirewallRuleOption.name)
            && Objects.equals(this.description, neutronCreateFirewallRuleOption.description)
            && Objects.equals(this.protocol, neutronCreateFirewallRuleOption.protocol)
            && Objects.equals(this.action, neutronCreateFirewallRuleOption.action)
            && Objects.equals(this.ipVersion, neutronCreateFirewallRuleOption.ipVersion)
            && Objects.equals(this.destinationIpAddress, neutronCreateFirewallRuleOption.destinationIpAddress)
            && Objects.equals(this.destinationPort, neutronCreateFirewallRuleOption.destinationPort)
            && Objects.equals(this.sourceIpAddress, neutronCreateFirewallRuleOption.sourceIpAddress)
            && Objects.equals(this.sourcePort, neutronCreateFirewallRuleOption.sourcePort)
            && Objects.equals(this.enabled, neutronCreateFirewallRuleOption.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            protocol,
            action,
            ipVersion,
            destinationIpAddress,
            destinationPort,
            sourceIpAddress,
            sourcePort,
            enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallRuleOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
        sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
