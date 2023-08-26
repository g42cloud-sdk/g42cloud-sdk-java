package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateRouteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    private String routetableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RoutetableAssociateReqbody body;

    public DisassociateRouteTableRequest withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    public DisassociateRouteTableRequest withBody(RoutetableAssociateReqbody body) {
        this.body = body;
        return this;
    }

    public DisassociateRouteTableRequest withBody(Consumer<RoutetableAssociateReqbody> bodySetter) {
        if (this.body == null) {
            this.body = new RoutetableAssociateReqbody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public RoutetableAssociateReqbody getBody() {
        return body;
    }

    public void setBody(RoutetableAssociateReqbody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateRouteTableRequest that = (DisassociateRouteTableRequest) obj;
        return Objects.equals(this.routetableId, that.routetableId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateRouteTableRequest {\n");
        sb.append("    routetableId: ").append(toIndentedString(routetableId)).append("\n");
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
