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
 * 
 */
public class NodePoolSpec {

    public static final class TypeEnum {

        /**
         * Enum VM for value: "vm"
         */
        public static final TypeEnum VM = new TypeEnum("vm");

        /**
         * Enum ELASTICBMS for value: "ElasticBMS"
         */
        public static final TypeEnum ELASTICBMS = new TypeEnum("ElasticBMS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vm", VM);
            map.put("ElasticBMS", ELASTICBMS);
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
    @JsonProperty(value = "nodeTemplate")

    private NodeSpec nodeTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialNodeCount")

    private Integer initialNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private NodePoolNodeAutoscaling autoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeManagement")

    private NodeManagement nodeManagement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podSecurityGroups")

    private List<SecurityID> podSecurityGroups = null;

    public NodePoolSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NodePoolSpec withNodeTemplate(NodeSpec nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
        return this;
    }

    public NodePoolSpec withNodeTemplate(Consumer<NodeSpec> nodeTemplateSetter) {
        if (this.nodeTemplate == null) {
            this.nodeTemplate = new NodeSpec();
            nodeTemplateSetter.accept(this.nodeTemplate);
        }

        return this;
    }

    public NodeSpec getNodeTemplate() {
        return nodeTemplate;
    }

    public void setNodeTemplate(NodeSpec nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
    }

    public NodePoolSpec withInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
        return this;
    }

    public Integer getInitialNodeCount() {
        return initialNodeCount;
    }

    public void setInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
    }

    public NodePoolSpec withAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public NodePoolSpec withAutoscaling(Consumer<NodePoolNodeAutoscaling> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new NodePoolNodeAutoscaling();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    public NodePoolNodeAutoscaling getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(NodePoolNodeAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
    }

    public NodePoolSpec withNodeManagement(NodeManagement nodeManagement) {
        this.nodeManagement = nodeManagement;
        return this;
    }

    public NodePoolSpec withNodeManagement(Consumer<NodeManagement> nodeManagementSetter) {
        if (this.nodeManagement == null) {
            this.nodeManagement = new NodeManagement();
            nodeManagementSetter.accept(this.nodeManagement);
        }

        return this;
    }

    public NodeManagement getNodeManagement() {
        return nodeManagement;
    }

    public void setNodeManagement(NodeManagement nodeManagement) {
        this.nodeManagement = nodeManagement;
    }

    public NodePoolSpec withPodSecurityGroups(List<SecurityID> podSecurityGroups) {
        this.podSecurityGroups = podSecurityGroups;
        return this;
    }

    public NodePoolSpec addPodSecurityGroupsItem(SecurityID podSecurityGroupsItem) {
        if (this.podSecurityGroups == null) {
            this.podSecurityGroups = new ArrayList<>();
        }
        this.podSecurityGroups.add(podSecurityGroupsItem);
        return this;
    }

    public NodePoolSpec withPodSecurityGroups(Consumer<List<SecurityID>> podSecurityGroupsSetter) {
        if (this.podSecurityGroups == null) {
            this.podSecurityGroups = new ArrayList<>();
        }
        podSecurityGroupsSetter.accept(this.podSecurityGroups);
        return this;
    }

    public List<SecurityID> getPodSecurityGroups() {
        return podSecurityGroups;
    }

    public void setPodSecurityGroups(List<SecurityID> podSecurityGroups) {
        this.podSecurityGroups = podSecurityGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolSpec that = (NodePoolSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.nodeTemplate, that.nodeTemplate)
            && Objects.equals(this.initialNodeCount, that.initialNodeCount)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.nodeManagement, that.nodeManagement)
            && Objects.equals(this.podSecurityGroups, that.podSecurityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nodeTemplate, initialNodeCount, autoscaling, nodeManagement, podSecurityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
        sb.append("    initialNodeCount: ").append(toIndentedString(initialNodeCount)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    nodeManagement: ").append(toIndentedString(nodeManagement)).append("\n");
        sb.append("    podSecurityGroups: ").append(toIndentedString(podSecurityGroups)).append("\n");
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
