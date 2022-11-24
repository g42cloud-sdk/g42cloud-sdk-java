package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCertificatesHttpsInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private List<HttpsDetail> https = null;

    public ShowCertificatesHttpsInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowCertificatesHttpsInfoResponse withHttps(List<HttpsDetail> https) {
        this.https = https;
        return this;
    }

    public ShowCertificatesHttpsInfoResponse addHttpsItem(HttpsDetail httpsItem) {
        if (this.https == null) {
            this.https = new ArrayList<>();
        }
        this.https.add(httpsItem);
        return this;
    }

    public ShowCertificatesHttpsInfoResponse withHttps(Consumer<List<HttpsDetail>> httpsSetter) {
        if (this.https == null) {
            this.https = new ArrayList<>();
        }
        httpsSetter.accept(this.https);
        return this;
    }

    public List<HttpsDetail> getHttps() {
        return https;
    }

    public void setHttps(List<HttpsDetail> https) {
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
        ShowCertificatesHttpsInfoResponse showCertificatesHttpsInfoResponse = (ShowCertificatesHttpsInfoResponse) o;
        return Objects.equals(this.total, showCertificatesHttpsInfoResponse.total)
            && Objects.equals(this.https, showCertificatesHttpsInfoResponse.https);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, https);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificatesHttpsInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
