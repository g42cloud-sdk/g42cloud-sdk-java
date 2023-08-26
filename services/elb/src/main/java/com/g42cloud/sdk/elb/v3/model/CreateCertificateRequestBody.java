package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private CreateCertificateOption certificate;

    public CreateCertificateRequestBody withCertificate(CreateCertificateOption certificate) {
        this.certificate = certificate;
        return this;
    }

    public CreateCertificateRequestBody withCertificate(Consumer<CreateCertificateOption> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new CreateCertificateOption();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    public CreateCertificateOption getCertificate() {
        return certificate;
    }

    public void setCertificate(CreateCertificateOption certificate) {
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
        CreateCertificateRequestBody that = (CreateCertificateRequestBody) obj;
        return Objects.equals(this.certificate, that.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateRequestBody {\n");
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
