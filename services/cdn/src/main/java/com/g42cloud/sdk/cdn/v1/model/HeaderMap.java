package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置HTTP头参数。取值：\&quot;Content-Disposition\&quot;, \&quot;Content-Language\&quot;, \&quot;Access-Control-Allow-Origin\&quot;,\&quot;Access-Control-Allow-Methods\&quot;, \&quot;Access-Control-Max-Age\&quot;, \&quot;Access-Control-Expose-Headers\&quot;。
 */
public class HeaderMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Disposition")

    private String contentDisposition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Language")

    private String contentLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Origin")

    private String accessControlAllowOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Methods")

    private String accessControlAllowMethods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Max-Age")

    private String accessControlMaxAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Expose-Headers")

    private String accessControlExposeHeaders;

    public HeaderMap withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public HeaderMap withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    public HeaderMap withAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public HeaderMap withAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
        return this;
    }

    public String getAccessControlAllowMethods() {
        return accessControlAllowMethods;
    }

    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    public HeaderMap withAccessControlMaxAge(String accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
        return this;
    }

    public String getAccessControlMaxAge() {
        return accessControlMaxAge;
    }

    public void setAccessControlMaxAge(String accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
    }

    public HeaderMap withAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        return this;
    }

    public String getAccessControlExposeHeaders() {
        return accessControlExposeHeaders;
    }

    public void setAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HeaderMap that = (HeaderMap) obj;
        return Objects.equals(this.contentDisposition, that.contentDisposition)
            && Objects.equals(this.contentLanguage, that.contentLanguage)
            && Objects.equals(this.accessControlAllowOrigin, that.accessControlAllowOrigin)
            && Objects.equals(this.accessControlAllowMethods, that.accessControlAllowMethods)
            && Objects.equals(this.accessControlMaxAge, that.accessControlMaxAge)
            && Objects.equals(this.accessControlExposeHeaders, that.accessControlExposeHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentDisposition,
            contentLanguage,
            accessControlAllowOrigin,
            accessControlAllowMethods,
            accessControlMaxAge,
            accessControlExposeHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeaderMap {\n");
        sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
        sb.append("    contentLanguage: ").append(toIndentedString(contentLanguage)).append("\n");
        sb.append("    accessControlAllowOrigin: ").append(toIndentedString(accessControlAllowOrigin)).append("\n");
        sb.append("    accessControlAllowMethods: ").append(toIndentedString(accessControlAllowMethods)).append("\n");
        sb.append("    accessControlMaxAge: ").append(toIndentedString(accessControlMaxAge)).append("\n");
        sb.append("    accessControlExposeHeaders: ").append(toIndentedString(accessControlExposeHeaders)).append("\n");
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
