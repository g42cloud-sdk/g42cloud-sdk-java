package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHttpInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private HttpInfoResponseBody https;

    public ShowHttpInfoResponse withHttps(HttpInfoResponseBody https) {
        this.https = https;
        return this;
    }

    public ShowHttpInfoResponse withHttps(Consumer<HttpInfoResponseBody> httpsSetter) {
        if (this.https == null) {
            this.https = new HttpInfoResponseBody();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    public HttpInfoResponseBody getHttps() {
        return https;
    }

    public void setHttps(HttpInfoResponseBody https) {
        this.https = https;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpInfoResponse that = (ShowHttpInfoResponse) obj;
        return Objects.equals(this.https, that.https);
    }

    @Override
    public int hashCode() {
        return Objects.hash(https);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpInfoResponse {\n");
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
