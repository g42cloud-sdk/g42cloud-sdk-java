package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateRouteTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    private Map<String, List<RouteTableRoute>> routes = null;

    public UpdateRouteTableReq withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRouteTableReq withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRouteTableReq withRoutes(Map<String, List<RouteTableRoute>> routes) {
        this.routes = routes;
        return this;
    }

    public UpdateRouteTableReq putRoutesItem(String key, List<RouteTableRoute> routesItem) {
        if (this.routes == null) {
            this.routes = new HashMap<>();
        }
        this.routes.put(key, routesItem);
        return this;
    }

    public UpdateRouteTableReq withRoutes(Consumer<Map<String, List<RouteTableRoute>>> routesSetter) {
        if (this.routes == null) {
            this.routes = new HashMap<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    public Map<String, List<RouteTableRoute>> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<String, List<RouteTableRoute>> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteTableReq updateRouteTableReq = (UpdateRouteTableReq) o;
        return Objects.equals(this.name, updateRouteTableReq.name)
            && Objects.equals(this.description, updateRouteTableReq.description)
            && Objects.equals(this.routes, updateRouteTableReq.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
