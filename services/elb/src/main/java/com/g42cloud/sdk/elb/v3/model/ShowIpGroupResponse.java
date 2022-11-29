package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIpGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private IpGroup ipgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowIpGroupResponse withIpgroup(IpGroup ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public ShowIpGroupResponse withIpgroup(Consumer<IpGroup> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new IpGroup();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    public IpGroup getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(IpGroup ipgroup) {
        this.ipgroup = ipgroup;
    }

    public ShowIpGroupResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIpGroupResponse showIpGroupResponse = (ShowIpGroupResponse) o;
        return Objects.equals(this.ipgroup, showIpGroupResponse.ipgroup)
            && Objects.equals(this.requestId, showIpGroupResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroup, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpGroupResponse {\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
