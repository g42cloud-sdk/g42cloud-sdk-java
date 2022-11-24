package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public static final class NodepoolScaleUpEnum {

        /**
         * Enum NODEPOOLSCALEUP for value: "NodepoolScaleUp"
         */
        public static final NodepoolScaleUpEnum NODEPOOLSCALEUP = new NodepoolScaleUpEnum("NodepoolScaleUp");

        private static final Map<String, NodepoolScaleUpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodepoolScaleUpEnum> createStaticFields() {
            Map<String, NodepoolScaleUpEnum> map = new HashMap<>();
            map.put("NodepoolScaleUp", NODEPOOLSCALEUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodepoolScaleUpEnum(String value) {
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
        public static NodepoolScaleUpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NodepoolScaleUpEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodepoolScaleUpEnum(value);
            }
            return result;
        }

        public static NodepoolScaleUpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NodepoolScaleUpEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodepoolScaleUpEnum) {
                return this.value.equals(((NodepoolScaleUpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolScaleUp")

    private NodepoolScaleUpEnum nodepoolScaleUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NodeCreateRequest body;

    public CreateNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateNodeRequest withNodepoolScaleUp(NodepoolScaleUpEnum nodepoolScaleUp) {
        this.nodepoolScaleUp = nodepoolScaleUp;
        return this;
    }

    public NodepoolScaleUpEnum getNodepoolScaleUp() {
        return nodepoolScaleUp;
    }

    public void setNodepoolScaleUp(NodepoolScaleUpEnum nodepoolScaleUp) {
        this.nodepoolScaleUp = nodepoolScaleUp;
    }

    public CreateNodeRequest withBody(NodeCreateRequest body) {
        this.body = body;
        return this;
    }

    public CreateNodeRequest withBody(Consumer<NodeCreateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new NodeCreateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public NodeCreateRequest getBody() {
        return body;
    }

    public void setBody(NodeCreateRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNodeRequest createNodeRequest = (CreateNodeRequest) o;
        return Objects.equals(this.clusterId, createNodeRequest.clusterId)
            && Objects.equals(this.nodepoolScaleUp, createNodeRequest.nodepoolScaleUp)
            && Objects.equals(this.body, createNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolScaleUp, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodepoolScaleUp: ").append(toIndentedString(nodepoolScaleUp)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
