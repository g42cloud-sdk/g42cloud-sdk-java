package com.g42cloud.sdk.vpc.v3.model;

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
public class ListSubNetworkInterfacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interfaces")

    private List<SubNetworkInterface> subNetworkInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListSubNetworkInterfacesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSubNetworkInterfacesResponse withSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
        return this;
    }

    public ListSubNetworkInterfacesResponse addSubNetworkInterfacesItem(SubNetworkInterface subNetworkInterfacesItem) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        this.subNetworkInterfaces.add(subNetworkInterfacesItem);
        return this;
    }

    public ListSubNetworkInterfacesResponse withSubNetworkInterfaces(
        Consumer<List<SubNetworkInterface>> subNetworkInterfacesSetter) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        subNetworkInterfacesSetter.accept(this.subNetworkInterfaces);
        return this;
    }

    public List<SubNetworkInterface> getSubNetworkInterfaces() {
        return subNetworkInterfaces;
    }

    public void setSubNetworkInterfaces(List<SubNetworkInterface> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
    }

    public ListSubNetworkInterfacesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSubNetworkInterfacesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubNetworkInterfacesResponse that = (ListSubNetworkInterfacesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.subNetworkInterfaces, that.subNetworkInterfaces)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, subNetworkInterfaces, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubNetworkInterfacesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subNetworkInterfaces: ").append(toIndentedString(subNetworkInterfaces)).append("\n");
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
