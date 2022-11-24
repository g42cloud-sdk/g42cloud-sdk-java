package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainMultiCertificatesRequestBody
 */
public class UpdateDomainMultiCertificatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private UpdateDomainMultiCertificatesRequestBodyContent https;

    public UpdateDomainMultiCertificatesRequestBody withHttps(UpdateDomainMultiCertificatesRequestBodyContent https) {
        this.https = https;
        return this;
    }

    public UpdateDomainMultiCertificatesRequestBody withHttps(
        Consumer<UpdateDomainMultiCertificatesRequestBodyContent> httpsSetter) {
        if (this.https == null) {
            this.https = new UpdateDomainMultiCertificatesRequestBodyContent();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent getHttps() {
        return https;
    }

    public void setHttps(UpdateDomainMultiCertificatesRequestBodyContent https) {
        this.https = https;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesRequestBody updateDomainMultiCertificatesRequestBody =
            (UpdateDomainMultiCertificatesRequestBody) o;
        return Objects.equals(this.https, updateDomainMultiCertificatesRequestBody.https);
    }

    @Override
    public int hashCode() {
        return Objects.hash(https);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesRequestBody {\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
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
