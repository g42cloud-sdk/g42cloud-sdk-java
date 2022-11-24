package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRouteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    private String routetableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRoutetableReqBody body;

    public UpdateRouteTableRequest withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    public UpdateRouteTableRequest withBody(UpdateRoutetableReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateRouteTableRequest withBody(Consumer<UpdateRoutetableReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRoutetableReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateRoutetableReqBody getBody() {
        return body;
    }

    public void setBody(UpdateRoutetableReqBody body) {
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
        UpdateRouteTableRequest updateRouteTableRequest = (UpdateRouteTableRequest) o;
        return Objects.equals(this.routetableId, updateRouteTableRequest.routetableId)
            && Objects.equals(this.body, updateRouteTableRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableRequest {\n");
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
