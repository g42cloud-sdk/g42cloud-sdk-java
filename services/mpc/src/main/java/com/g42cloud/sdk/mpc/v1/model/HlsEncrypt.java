package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HlsEncrypt
 */
public class HlsEncrypt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iv")

    private String iv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    public HlsEncrypt withKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HlsEncrypt withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HlsEncrypt withIv(String iv) {
        this.iv = iv;
        return this;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public HlsEncrypt withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HlsEncrypt hlsEncrypt = (HlsEncrypt) o;
        return Objects.equals(this.key, hlsEncrypt.key) && Objects.equals(this.url, hlsEncrypt.url)
            && Objects.equals(this.iv, hlsEncrypt.iv) && Objects.equals(this.algorithm, hlsEncrypt.algorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, url, iv, algorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HlsEncrypt {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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
