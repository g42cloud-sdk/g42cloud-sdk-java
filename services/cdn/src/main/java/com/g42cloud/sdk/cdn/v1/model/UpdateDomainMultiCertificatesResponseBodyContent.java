package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainMultiCertificatesResponseBodyContent
 */
public class UpdateDomainMultiCertificatesResponseBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_switch")

    private Integer httpsSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_origin_way")

    private Integer accessOriginWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_https")

    private Integer forceRedirectHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_config")

    private ForceRedirect forceRedirectConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2")

    private Integer http2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    public UpdateDomainMultiCertificatesResponseBodyContent withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
        return this;
    }

    public Integer getHttpsSwitch() {
        return httpsSwitch;
    }

    public void setHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
        return this;
    }

    public Integer getAccessOriginWay() {
        return accessOriginWay;
    }

    public void setAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withForceRedirectConfig(
        Consumer<ForceRedirect> forceRedirectConfigSetter) {
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

    public UpdateDomainMultiCertificatesResponseBodyContent withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public UpdateDomainMultiCertificatesResponseBodyContent withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesResponseBodyContent that = (UpdateDomainMultiCertificatesResponseBodyContent) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.httpsSwitch, that.httpsSwitch)
            && Objects.equals(this.accessOriginWay, that.accessOriginWay)
            && Objects.equals(this.forceRedirectHttps, that.forceRedirectHttps)
            && Objects.equals(this.forceRedirectConfig, that.forceRedirectConfig)
            && Objects.equals(this.http2, that.http2) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.expirationTime, that.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            httpsSwitch,
            accessOriginWay,
            forceRedirectHttps,
            forceRedirectConfig,
            http2,
            certName,
            certificate,
            certificateType,
            expirationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesResponseBodyContent {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    httpsSwitch: ").append(toIndentedString(httpsSwitch)).append("\n");
        sb.append("    accessOriginWay: ").append(toIndentedString(accessOriginWay)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
