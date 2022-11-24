package com.g42cloud.sdk.vpc.v3.model;

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
public class ListSecurityGroupRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rules")

    private List<SecurityGroupRule> securityGroupRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListSecurityGroupRulesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSecurityGroupRulesResponse withSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    public ListSecurityGroupRulesResponse addSecurityGroupRulesItem(SecurityGroupRule securityGroupRulesItem) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        this.securityGroupRules.add(securityGroupRulesItem);
        return this;
    }

    public ListSecurityGroupRulesResponse withSecurityGroupRules(
        Consumer<List<SecurityGroupRule>> securityGroupRulesSetter) {
        if (this.securityGroupRules == null) {
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    public List<SecurityGroupRule> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    public ListSecurityGroupRulesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSecurityGroupRulesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecurityGroupRulesResponse listSecurityGroupRulesResponse = (ListSecurityGroupRulesResponse) o;
        return Objects.equals(this.requestId, listSecurityGroupRulesResponse.requestId)
            && Objects.equals(this.securityGroupRules, listSecurityGroupRulesResponse.securityGroupRules)
            && Objects.equals(this.pageInfo, listSecurityGroupRulesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, securityGroupRules, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupRulesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
