package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodePoolUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NodePoolMetadataUpdate metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodePoolSpecUpdate spec;

    public NodePoolUpdate withMetadata(NodePoolMetadataUpdate metadata) {
        this.metadata = metadata;
        return this;
    }

    public NodePoolUpdate withMetadata(Consumer<NodePoolMetadataUpdate> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NodePoolMetadataUpdate();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public NodePoolMetadataUpdate getMetadata() {
        return metadata;
    }

    public void setMetadata(NodePoolMetadataUpdate metadata) {
        this.metadata = metadata;
    }

    public NodePoolUpdate withSpec(NodePoolSpecUpdate spec) {
        this.spec = spec;
        return this;
    }

    public NodePoolUpdate withSpec(Consumer<NodePoolSpecUpdate> specSetter) {
        if (this.spec == null) {
            this.spec = new NodePoolSpecUpdate();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public NodePoolSpecUpdate getSpec() {
        return spec;
    }

    public void setSpec(NodePoolSpecUpdate spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePoolUpdate nodePoolUpdate = (NodePoolUpdate) o;
        return Objects.equals(this.metadata, nodePoolUpdate.metadata) && Objects.equals(this.spec, nodePoolUpdate.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolUpdate {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
