package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Application的属性列表。
 */
public class ListApplicationAttributesResponseBodyAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apple_certificate_expiration_date")

    private String appleCertificateExpirationDate;

    public ListApplicationAttributesResponseBodyAttributes withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public ListApplicationAttributesResponseBodyAttributes withAppleCertificateExpirationDate(
        String appleCertificateExpirationDate) {
        this.appleCertificateExpirationDate = appleCertificateExpirationDate;
        return this;
    }

    public String getAppleCertificateExpirationDate() {
        return appleCertificateExpirationDate;
    }

    public void setAppleCertificateExpirationDate(String appleCertificateExpirationDate) {
        this.appleCertificateExpirationDate = appleCertificateExpirationDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationAttributesResponseBodyAttributes listApplicationAttributesResponseBodyAttributes =
            (ListApplicationAttributesResponseBodyAttributes) o;
        return Objects.equals(this.enabled, listApplicationAttributesResponseBodyAttributes.enabled)
            && Objects.equals(this.appleCertificateExpirationDate,
                listApplicationAttributesResponseBodyAttributes.appleCertificateExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, appleCertificateExpirationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationAttributesResponseBodyAttributes {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    appleCertificateExpirationDate: ")
            .append(toIndentedString(appleCertificateExpirationDate))
            .append("\n");
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
