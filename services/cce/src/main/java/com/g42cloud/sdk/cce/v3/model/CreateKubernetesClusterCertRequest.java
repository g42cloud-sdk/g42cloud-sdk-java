package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateKubernetesClusterCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CertDuration body;

    public CreateKubernetesClusterCertRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateKubernetesClusterCertRequest withBody(CertDuration body) {
        this.body = body;
        return this;
    }

    public CreateKubernetesClusterCertRequest withBody(Consumer<CertDuration> bodySetter) {
        if (this.body == null) {
            this.body = new CertDuration();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CertDuration getBody() {
        return body;
    }

    public void setBody(CertDuration body) {
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
        CreateKubernetesClusterCertRequest createKubernetesClusterCertRequest = (CreateKubernetesClusterCertRequest) o;
        return Objects.equals(this.clusterId, createKubernetesClusterCertRequest.clusterId)
            && Objects.equals(this.body, createKubernetesClusterCertRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKubernetesClusterCertRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
