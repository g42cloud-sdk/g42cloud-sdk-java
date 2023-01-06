package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowL7PolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private L7Policy l7policy;

    public ShowL7PolicyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowL7PolicyResponse withL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public ShowL7PolicyResponse withL7policy(Consumer<L7Policy> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new L7Policy();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    public L7Policy getL7policy() {
        return l7policy;
    }

    public void setL7policy(L7Policy l7policy) {
        this.l7policy = l7policy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowL7PolicyResponse showL7PolicyResponse = (ShowL7PolicyResponse) o;
        return Objects.equals(this.requestId, showL7PolicyResponse.requestId)
            && Objects.equals(this.l7policy, showL7PolicyResponse.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowL7PolicyResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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
