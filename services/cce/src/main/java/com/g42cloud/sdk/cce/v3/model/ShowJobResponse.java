package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private JobSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    public ShowJobResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowJobResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowJobResponse withMetadata(JobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowJobResponse withMetadata(Consumer<JobMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public JobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(JobMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowJobResponse withSpec(JobSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowJobResponse withSpec(Consumer<JobSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new JobSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public JobSpec getSpec() {
        return spec;
    }

    public void setSpec(JobSpec spec) {
        this.spec = spec;
    }

    public ShowJobResponse withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    public ShowJobResponse withStatus(Consumer<JobStatus> statusSetter) {
        if (this.status == null) {
            this.status = new JobStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
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
        ShowJobResponse showJobResponse = (ShowJobResponse) o;
        return Objects.equals(this.kind, showJobResponse.kind)
            && Objects.equals(this.apiVersion, showJobResponse.apiVersion)
            && Objects.equals(this.metadata, showJobResponse.metadata)
            && Objects.equals(this.spec, showJobResponse.spec) && Objects.equals(this.status, showJobResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
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
