package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateApplicationRequestBody
 */
public class UpdateApplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_principal")

    private String platformPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_credential")

    private String platformCredential;

    public UpdateApplicationRequestBody withPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
        return this;
    }

    public String getPlatformPrincipal() {
        return platformPrincipal;
    }

    public void setPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
    }

    public UpdateApplicationRequestBody withPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
        return this;
    }

    public String getPlatformCredential() {
        return platformCredential;
    }

    public void setPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateApplicationRequestBody that = (UpdateApplicationRequestBody) obj;
        return Objects.equals(this.platformPrincipal, that.platformPrincipal)
            && Objects.equals(this.platformCredential, that.platformCredential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformPrincipal, platformCredential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationRequestBody {\n");
        sb.append("    platformPrincipal: ").append(toIndentedString(platformPrincipal)).append("\n");
        sb.append("    platformCredential: ").append(toIndentedString(platformCredential)).append("\n");
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
