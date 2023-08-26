package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private CertificateInfo certificate;

    public UpdateCertificateResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateCertificateResponse withCertificate(CertificateInfo certificate) {
        this.certificate = certificate;
        return this;
    }

    public UpdateCertificateResponse withCertificate(Consumer<CertificateInfo> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new CertificateInfo();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    public CertificateInfo getCertificate() {
        return certificate;
    }

    public void setCertificate(CertificateInfo certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCertificateResponse that = (UpdateCertificateResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.certificate, that.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, certificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
