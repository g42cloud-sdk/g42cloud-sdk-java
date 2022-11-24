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
 * Request Object
 */
public class DeleteNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public static final class NodepoolScaleDownEnum {

        /**
         * Enum NOSCALEDOWN for value: "NoScaleDown"
         */
        public static final NodepoolScaleDownEnum NOSCALEDOWN = new NodepoolScaleDownEnum("NoScaleDown");

        private static final Map<String, NodepoolScaleDownEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodepoolScaleDownEnum> createStaticFields() {
            Map<String, NodepoolScaleDownEnum> map = new HashMap<>();
            map.put("NoScaleDown", NOSCALEDOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodepoolScaleDownEnum(String value) {
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
        public static NodepoolScaleDownEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NodepoolScaleDownEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodepoolScaleDownEnum(value);
            }
            return result;
        }

        public static NodepoolScaleDownEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NodepoolScaleDownEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodepoolScaleDownEnum) {
                return this.value.equals(((NodepoolScaleDownEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolScaleDown")

    private NodepoolScaleDownEnum nodepoolScaleDown;

    public DeleteNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteNodeRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeleteNodeRequest withNodepoolScaleDown(NodepoolScaleDownEnum nodepoolScaleDown) {
        this.nodepoolScaleDown = nodepoolScaleDown;
        return this;
    }

    public NodepoolScaleDownEnum getNodepoolScaleDown() {
        return nodepoolScaleDown;
    }

    public void setNodepoolScaleDown(NodepoolScaleDownEnum nodepoolScaleDown) {
        this.nodepoolScaleDown = nodepoolScaleDown;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteNodeRequest deleteNodeRequest = (DeleteNodeRequest) o;
        return Objects.equals(this.clusterId, deleteNodeRequest.clusterId)
            && Objects.equals(this.nodeId, deleteNodeRequest.nodeId)
            && Objects.equals(this.nodepoolScaleDown, deleteNodeRequest.nodepoolScaleDown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodeId, nodepoolScaleDown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodepoolScaleDown: ").append(toIndentedString(nodepoolScaleDown)).append("\n");
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
