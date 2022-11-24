package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRouteTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private RouteTableResp routetable;

    public ShowRouteTableResponse withRoutetable(RouteTableResp routetable) {
        this.routetable = routetable;
        return this;
    }

    public ShowRouteTableResponse withRoutetable(Consumer<RouteTableResp> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new RouteTableResp();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    public RouteTableResp getRoutetable() {
        return routetable;
    }

    public void setRoutetable(RouteTableResp routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRouteTableResponse showRouteTableResponse = (ShowRouteTableResponse) o;
        return Objects.equals(this.routetable, showRouteTableResponse.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRouteTableResponse {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
