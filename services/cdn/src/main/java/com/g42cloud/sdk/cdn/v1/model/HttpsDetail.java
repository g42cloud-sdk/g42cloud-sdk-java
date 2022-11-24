package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpsDetail
 */
public class HttpsDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private Integer httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_https")

    private Integer forceRedirectHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_config")

    private ForceRedirect forceRedirectConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2")

    private Integer http2;

    public HttpsDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public HttpsDetail withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public HttpsDetail withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public HttpsDetail withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public HttpsDetail withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public HttpsDetail withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public HttpsDetail withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public HttpsDetail withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public HttpsDetail withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public HttpsDetail withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public HttpsDetail withForceRedirectConfig(Consumer<ForceRedirect> forceRedirectConfigSetter) {
        if (this.forceRedirectConfig == null) {
            this.forceRedirectConfig = new ForceRedirect();
            forceRedirectConfigSetter.accept(this.forceRedirectConfig);
        }

        return this;
    }

    public ForceRedirect getForceRedirectConfig() {
        return forceRedirectConfig;
    }

    public void setForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
    }

    public HttpsDetail withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpsDetail httpsDetail = (HttpsDetail) o;
        return Objects.equals(this.domainId, httpsDetail.domainId)
            && Objects.equals(this.domainName, httpsDetail.domainName)
            && Objects.equals(this.certName, httpsDetail.certName)
            && Objects.equals(this.certificate, httpsDetail.certificate)
            && Objects.equals(this.privateKey, httpsDetail.privateKey)
            && Objects.equals(this.certificateType, httpsDetail.certificateType)
            && Objects.equals(this.expirationTime, httpsDetail.expirationTime)
            && Objects.equals(this.httpsStatus, httpsDetail.httpsStatus)
            && Objects.equals(this.forceRedirectHttps, httpsDetail.forceRedirectHttps)
            && Objects.equals(this.forceRedirectConfig, httpsDetail.forceRedirectConfig)
            && Objects.equals(this.http2, httpsDetail.http2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            domainName,
            certName,
            certificate,
            privateKey,
            certificateType,
            expirationTime,
            httpsStatus,
            forceRedirectHttps,
            forceRedirectConfig,
            http2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpsDetail {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
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
