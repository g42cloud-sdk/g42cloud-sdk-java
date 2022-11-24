package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteCloudPersistentVolumeClaimsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PersistentVolumeClaimMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PersistentVolumeClaimSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PersistentVolumeClaimStatus status;

    public DeleteCloudPersistentVolumeClaimsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withMetadata(
        Consumer<PersistentVolumeClaimMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PersistentVolumeClaimMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public PersistentVolumeClaimMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withSpec(Consumer<PersistentVolumeClaimSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new PersistentVolumeClaimSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withStatus(Consumer<PersistentVolumeClaimStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PersistentVolumeClaimStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    public PersistentVolumeClaimStatus getStatus() {
        return status;
    }

    public void setStatus(PersistentVolumeClaimStatus status) {
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
        DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaimsResponse =
            (DeleteCloudPersistentVolumeClaimsResponse) o;
        return Objects.equals(this.apiVersion, deleteCloudPersistentVolumeClaimsResponse.apiVersion)
            && Objects.equals(this.kind, deleteCloudPersistentVolumeClaimsResponse.kind)
            && Objects.equals(this.metadata, deleteCloudPersistentVolumeClaimsResponse.metadata)
            && Objects.equals(this.spec, deleteCloudPersistentVolumeClaimsResponse.spec)
            && Objects.equals(this.status, deleteCloudPersistentVolumeClaimsResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCloudPersistentVolumeClaimsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
