package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBlackWhiteListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BlackWhiteListBody body;

    public UpdateBlackWhiteListRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateBlackWhiteListRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateBlackWhiteListRequest withBody(BlackWhiteListBody body) {
        this.body = body;
        return this;
    }

    public UpdateBlackWhiteListRequest withBody(Consumer<BlackWhiteListBody> bodySetter) {
        if (this.body == null) {
            this.body = new BlackWhiteListBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BlackWhiteListBody getBody() {
        return body;
    }

    public void setBody(BlackWhiteListBody body) {
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
        UpdateBlackWhiteListRequest updateBlackWhiteListRequest = (UpdateBlackWhiteListRequest) o;
        return Objects.equals(this.domainId, updateBlackWhiteListRequest.domainId)
            && Objects.equals(this.enterpriseProjectId, updateBlackWhiteListRequest.enterpriseProjectId)
            && Objects.equals(this.body, updateBlackWhiteListRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlackWhiteListRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
