package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateIpListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateIpListRequestBody body;

    public UpdateIpListRequest withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public UpdateIpListRequest withBody(UpdateIpListRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateIpListRequest withBody(Consumer<UpdateIpListRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateIpListRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateIpListRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateIpListRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIpListRequest updateIpListRequest = (UpdateIpListRequest) o;
        return Objects.equals(this.ipgroupId, updateIpListRequest.ipgroupId)
            && Objects.equals(this.body, updateIpListRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpListRequest {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
