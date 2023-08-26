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
 * 集群参数定义。
 */
public class ClusterSpec {

    public static final class CategoryEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final CategoryEnum CCE = new CategoryEnum("CCE");

        /**
         * Enum TURBO for value: "Turbo"
         */
        public static final CategoryEnum TURBO = new CategoryEnum("Turbo");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("Turbo", TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    public static final class TypeEnum {

        /**
         * Enum VIRTUALMACHINE for value: "VirtualMachine"
         */
        public static final TypeEnum VIRTUALMACHINE = new TypeEnum("VirtualMachine");

        /**
         * Enum ARM64 for value: "ARM64"
         */
        public static final TypeEnum ARM64 = new TypeEnum("ARM64");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VirtualMachine", VIRTUALMACHINE);
            map.put("ARM64", ARM64);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platformVersion")

    private String platformVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSan")

    private List<String> customSan = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6enable")

    private Boolean ipv6enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private HostNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private ContainerNetwork containerNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniNetwork")

    private EniNetwork eniNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Authentication authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingMode")

    private Integer billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masters")

    private List<MasterSpec> masters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesSvcIpRange")

    private String kubernetesSvcIpRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterTags")

    private List<ResourceTag> clusterTags = null;

    public static final class KubeProxyModeEnum {

        /**
         * Enum IPTABLES for value: "iptables"
         */
        public static final KubeProxyModeEnum IPTABLES = new KubeProxyModeEnum("iptables");

        /**
         * Enum IPVS for value: "ipvs"
         */
        public static final KubeProxyModeEnum IPVS = new KubeProxyModeEnum("ipvs");

        private static final Map<String, KubeProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KubeProxyModeEnum> createStaticFields() {
            Map<String, KubeProxyModeEnum> map = new HashMap<>();
            map.put("iptables", IPTABLES);
            map.put("ipvs", IPVS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KubeProxyModeEnum(String value) {
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
        public static KubeProxyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KubeProxyModeEnum(value));
        }

        public static KubeProxyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KubeProxyModeEnum) {
                return this.value.equals(((KubeProxyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeProxyMode")

    private KubeProxyModeEnum kubeProxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ClusterExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportIstio")

    private Boolean supportIstio;

    public ClusterSpec withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ClusterSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ClusterSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ClusterSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterSpec withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public ClusterSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public ClusterSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public ClusterSpec withCustomSan(Consumer<List<String>> customSanSetter) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        customSanSetter.accept(this.customSan);
        return this;
    }

    public List<String> getCustomSan() {
        return customSan;
    }

    public void setCustomSan(List<String> customSan) {
        this.customSan = customSan;
    }

    public ClusterSpec withIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
        return this;
    }

    public Boolean getIpv6enable() {
        return ipv6enable;
    }

    public void setIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
    }

    public ClusterSpec withHostNetwork(HostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public ClusterSpec withHostNetwork(Consumer<HostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new HostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    public HostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(HostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public ClusterSpec withContainerNetwork(ContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public ClusterSpec withContainerNetwork(Consumer<ContainerNetwork> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ContainerNetwork();
            containerNetworkSetter.accept(this.containerNetwork);
        }

        return this;
    }

    public ContainerNetwork getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(ContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public ClusterSpec withEniNetwork(EniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
        return this;
    }

    public ClusterSpec withEniNetwork(Consumer<EniNetwork> eniNetworkSetter) {
        if (this.eniNetwork == null) {
            this.eniNetwork = new EniNetwork();
            eniNetworkSetter.accept(this.eniNetwork);
        }

        return this;
    }

    public EniNetwork getEniNetwork() {
        return eniNetwork;
    }

    public void setEniNetwork(EniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
    }

    public ClusterSpec withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public ClusterSpec withAuthentication(Consumer<Authentication> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new Authentication();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public ClusterSpec withBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    public Integer getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
    }

    public ClusterSpec withMasters(List<MasterSpec> masters) {
        this.masters = masters;
        return this;
    }

    public ClusterSpec addMastersItem(MasterSpec mastersItem) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        this.masters.add(mastersItem);
        return this;
    }

    public ClusterSpec withMasters(Consumer<List<MasterSpec>> mastersSetter) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        mastersSetter.accept(this.masters);
        return this;
    }

    public List<MasterSpec> getMasters() {
        return masters;
    }

    public void setMasters(List<MasterSpec> masters) {
        this.masters = masters;
    }

    public ClusterSpec withKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
        return this;
    }

    public String getKubernetesSvcIpRange() {
        return kubernetesSvcIpRange;
    }

    public void setKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
    }

    public ClusterSpec withClusterTags(List<ResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
        return this;
    }

    public ClusterSpec addClusterTagsItem(ResourceTag clusterTagsItem) {
        if (this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        this.clusterTags.add(clusterTagsItem);
        return this;
    }

    public ClusterSpec withClusterTags(Consumer<List<ResourceTag>> clusterTagsSetter) {
        if (this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        clusterTagsSetter.accept(this.clusterTags);
        return this;
    }

    public List<ResourceTag> getClusterTags() {
        return clusterTags;
    }

    public void setClusterTags(List<ResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
    }

    public ClusterSpec withKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    public KubeProxyModeEnum getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public ClusterSpec withAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public ClusterSpec withExtendParam(ClusterExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ClusterSpec withExtendParam(Consumer<ClusterExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ClusterExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    public ClusterExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ClusterExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public ClusterSpec withSupportIstio(Boolean supportIstio) {
        this.supportIstio = supportIstio;
        return this;
    }

    public Boolean getSupportIstio() {
        return supportIstio;
    }

    public void setSupportIstio(Boolean supportIstio) {
        this.supportIstio = supportIstio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSpec that = (ClusterSpec) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.type, that.type)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.version, that.version)
            && Objects.equals(this.platformVersion, that.platformVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.ipv6enable, that.ipv6enable) && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.containerNetwork, that.containerNetwork)
            && Objects.equals(this.eniNetwork, that.eniNetwork)
            && Objects.equals(this.authentication, that.authentication)
            && Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.masters, that.masters)
            && Objects.equals(this.kubernetesSvcIpRange, that.kubernetesSvcIpRange)
            && Objects.equals(this.clusterTags, that.clusterTags)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode) && Objects.equals(this.az, that.az)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.supportIstio, that.supportIstio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            type,
            flavor,
            version,
            platformVersion,
            description,
            customSan,
            ipv6enable,
            hostNetwork,
            containerNetwork,
            eniNetwork,
            authentication,
            billingMode,
            masters,
            kubernetesSvcIpRange,
            clusterTags,
            kubeProxyMode,
            az,
            extendParam,
            supportIstio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSpec {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    ipv6enable: ").append(toIndentedString(ipv6enable)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    kubernetesSvcIpRange: ").append(toIndentedString(kubernetesSvcIpRange)).append("\n");
        sb.append("    clusterTags: ").append(toIndentedString(clusterTags)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    supportIstio: ").append(toIndentedString(supportIstio)).append("\n");
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
