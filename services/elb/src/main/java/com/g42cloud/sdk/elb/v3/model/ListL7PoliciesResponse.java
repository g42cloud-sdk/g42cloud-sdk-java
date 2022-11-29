package com.g42cloud.sdk.elb.v3.model;

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
public class ListL7PoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policies")

    private List<L7Policy> l7policies = null;

    public ListL7PoliciesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListL7PoliciesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListL7PoliciesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListL7PoliciesResponse withL7policies(List<L7Policy> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    public ListL7PoliciesResponse addL7policiesItem(L7Policy l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public ListL7PoliciesResponse withL7policies(Consumer<List<L7Policy>> l7policiesSetter) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    public List<L7Policy> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<L7Policy> l7policies) {
        this.l7policies = l7policies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7PoliciesResponse listL7PoliciesResponse = (ListL7PoliciesResponse) o;
        return Objects.equals(this.requestId, listL7PoliciesResponse.requestId)
            && Objects.equals(this.pageInfo, listL7PoliciesResponse.pageInfo)
            && Objects.equals(this.l7policies, listL7PoliciesResponse.l7policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, l7policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7PoliciesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
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
