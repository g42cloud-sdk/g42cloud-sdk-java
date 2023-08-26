package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateStaticRouteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_id")

    private String routeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRouteRequestBody body;

    public UpdateStaticRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public UpdateStaticRouteRequest withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public UpdateStaticRouteRequest withBody(UpdateRouteRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateStaticRouteRequest withBody(Consumer<UpdateRouteRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRouteRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateRouteRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRouteRequestBody body) {
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
        UpdateStaticRouteRequest that = (UpdateStaticRouteRequest) obj;
        return Objects.equals(this.routeTableId, that.routeTableId) && Objects.equals(this.routeId, that.routeId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTableId, routeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStaticRouteRequest {\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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
