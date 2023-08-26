package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRouteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRouteTableRequestBody body;

    public UpdateRouteTableRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public UpdateRouteTableRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public UpdateRouteTableRequest withBody(UpdateRouteTableRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRouteTableRequest withBody(Consumer<UpdateRouteTableRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRouteTableRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateRouteTableRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRouteTableRequestBody body) {
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
        UpdateRouteTableRequest that = (UpdateRouteTableRequest) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.routeTableId, that.routeTableId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, routeTableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
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
