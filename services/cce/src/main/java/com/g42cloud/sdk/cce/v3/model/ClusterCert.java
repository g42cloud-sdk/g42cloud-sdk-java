package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterCert
 */
public class ClusterCert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate-authority-data")

    private String certificateAuthorityData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insecure-skip-tls-verify")

    private Boolean insecureSkipTlsVerify;

    public ClusterCert withServer(String server) {
        this.server = server;
        return this;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public ClusterCert withCertificateAuthorityData(String certificateAuthorityData) {
        this.certificateAuthorityData = certificateAuthorityData;
        return this;
    }

    public String getCertificateAuthorityData() {
        return certificateAuthorityData;
    }

    public void setCertificateAuthorityData(String certificateAuthorityData) {
        this.certificateAuthorityData = certificateAuthorityData;
    }

    public ClusterCert withInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify) {
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
        return this;
    }

    public Boolean getInsecureSkipTlsVerify() {
        return insecureSkipTlsVerify;
    }

    public void setInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify) {
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterCert clusterCert = (ClusterCert) o;
        return Objects.equals(this.server, clusterCert.server)
            && Objects.equals(this.certificateAuthorityData, clusterCert.certificateAuthorityData)
            && Objects.equals(this.insecureSkipTlsVerify, clusterCert.insecureSkipTlsVerify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, certificateAuthorityData, insecureSkipTlsVerify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterCert {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    certificateAuthorityData: ").append(toIndentedString(certificateAuthorityData)).append("\n");
        sb.append("    insecureSkipTlsVerify: ").append(toIndentedString(insecureSkipTlsVerify)).append("\n");
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
