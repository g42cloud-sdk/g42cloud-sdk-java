package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainMultiCertificatesRequestBodyContent
 */
public class UpdateDomainMultiCertificatesRequestBodyContent {

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
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    public UpdateDomainMultiCertificatesRequestBodyContent withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
        return this;
    }

    public Integer getHttpsSwitch() {
        return httpsSwitch;
    }

    public void setHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
        return this;
    }

    public Integer getAccessOriginWay() {
        return accessOriginWay;
    }

    public void setAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectConfig(
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

    public UpdateDomainMultiCertificatesRequestBodyContent withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesRequestBodyContent that = (UpdateDomainMultiCertificatesRequestBodyContent) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.httpsSwitch, that.httpsSwitch)
            && Objects.equals(this.accessOriginWay, that.accessOriginWay)
            && Objects.equals(this.forceRedirectHttps, that.forceRedirectHttps)
            && Objects.equals(this.forceRedirectConfig, that.forceRedirectConfig)
            && Objects.equals(this.http2, that.http2) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.certificateType, that.certificateType);
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
            privateKey,
            certificateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesRequestBodyContent {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    httpsSwitch: ").append(toIndentedString(httpsSwitch)).append("\n");
        sb.append("    accessOriginWay: ").append(toIndentedString(accessOriginWay)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
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
