package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAssociationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associations")

    private List<Association> associations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAssociationsResponse withAssociations(List<Association> associations) {
        this.associations = associations;
        return this;
    }

    public ListAssociationsResponse addAssociationsItem(Association associationsItem) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        this.associations.add(associationsItem);
        return this;
    }

    public ListAssociationsResponse withAssociations(Consumer<List<Association>> associationsSetter) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        associationsSetter.accept(this.associations);
        return this;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(List<Association> associations) {
        this.associations = associations;
    }

    public ListAssociationsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAssociationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAssociationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAssociationsResponse listAssociationsResponse = (ListAssociationsResponse) o;
        return Objects.equals(this.associations, listAssociationsResponse.associations)
            && Objects.equals(this.requestId, listAssociationsResponse.requestId)
            && Objects.equals(this.pageInfo, listAssociationsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associations, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociationsResponse {\n");
        sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
