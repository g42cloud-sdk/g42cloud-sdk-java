package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Cluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ClusterMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ClusterSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ClusterStatus status;

    public Cluster withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Cluster withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Cluster withMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Cluster withMetadata(Consumer<ClusterMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ClusterMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public ClusterMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
    }

    public Cluster withSpec(ClusterSpec spec) {
        this.spec = spec;
        return this;
    }

    public Cluster withSpec(Consumer<ClusterSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ClusterSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public ClusterSpec getSpec() {
        return spec;
    }

    public void setSpec(ClusterSpec spec) {
        this.spec = spec;
    }

    public Cluster withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    public Cluster withStatus(Consumer<ClusterStatus> statusSetter) {
        if (this.status == null) {
            this.status = new ClusterStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    public ClusterStatus getStatus() {
        return status;
    }

    public void setStatus(ClusterStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cluster cluster = (Cluster) o;
        return Objects.equals(this.kind, cluster.kind) && Objects.equals(this.apiVersion, cluster.apiVersion)
            && Objects.equals(this.metadata, cluster.metadata) && Objects.equals(this.spec, cluster.spec)
            && Objects.equals(this.status, cluster.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cluster {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
