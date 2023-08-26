package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Container network parameters.
 */
public class ContainerNetwork {

    public static final class ModeEnum {

        /**
         * Enum OVERLAY_L2 for value: "overlay_l2"
         */
        public static final ModeEnum OVERLAY_L2 = new ModeEnum("overlay_l2");

        /**
         * Enum VPC_ROUTER for value: "vpc-router"
         */
        public static final ModeEnum VPC_ROUTER = new ModeEnum("vpc-router");

        /**
         * Enum ENI for value: "eni"
         */
        public static final ModeEnum ENI = new ModeEnum("eni");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("overlay_l2", OVERLAY_L2);
            map.put("vpc-router", VPC_ROUTER);
            map.put("eni", ENI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<ContainerCIDR> cidrs = null;

    public ContainerNetwork withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ContainerNetwork withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ContainerNetwork withCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public ContainerNetwork addCidrsItem(ContainerCIDR cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public ContainerNetwork withCidrs(Consumer<List<ContainerCIDR>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    public List<ContainerCIDR> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerNetwork that = (ContainerNetwork) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.cidrs, that.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, cidr, cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetwork {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
