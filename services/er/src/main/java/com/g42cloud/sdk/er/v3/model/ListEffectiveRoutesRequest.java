package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEffectiveRoutesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private List<String> destination = null;

    public static final class ResourceTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final ResourceTypeEnum VPC = new ResourceTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final ResourceTypeEnum VPN = new ResourceTypeEnum("vpn");

        /**
         * Enum DGW for value: "dgw"
         */
        public static final ResourceTypeEnum DGW = new ResourceTypeEnum("dgw");

        /**
         * Enum VGW for value: "vgw"
         */
        public static final ResourceTypeEnum VGW = new ResourceTypeEnum("vgw");

        /**
         * Enum PEERING for value: "peering"
         */
        public static final ResourceTypeEnum PEERING = new ResourceTypeEnum("peering");

        /**
         * Enum CAN for value: "can"
         */
        public static final ResourceTypeEnum CAN = new ResourceTypeEnum("can");

        /**
         * Enum GDGW for value: "gdgw"
         */
        public static final ResourceTypeEnum GDGW = new ResourceTypeEnum("gdgw");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            map.put("dgw", DGW);
            map.put("vgw", VGW);
            map.put("peering", PEERING);
            map.put("can", CAN);
            map.put("gdgw", GDGW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private List<ResourceTypeEnum> resourceType = null;

    public ListEffectiveRoutesRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public ListEffectiveRoutesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEffectiveRoutesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListEffectiveRoutesRequest withDestination(List<String> destination) {
        this.destination = destination;
        return this;
    }

    public ListEffectiveRoutesRequest addDestinationItem(String destinationItem) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        this.destination.add(destinationItem);
        return this;
    }

    public ListEffectiveRoutesRequest withDestination(Consumer<List<String>> destinationSetter) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        destinationSetter.accept(this.destination);
        return this;
    }

    public List<String> getDestination() {
        return destination;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    public ListEffectiveRoutesRequest withResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ListEffectiveRoutesRequest addResourceTypeItem(ResourceTypeEnum resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ListEffectiveRoutesRequest withResourceType(Consumer<List<ResourceTypeEnum>> resourceTypeSetter) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        resourceTypeSetter.accept(this.resourceType);
        return this;
    }

    public List<ResourceTypeEnum> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEffectiveRoutesRequest listEffectiveRoutesRequest = (ListEffectiveRoutesRequest) o;
        return Objects.equals(this.routeTableId, listEffectiveRoutesRequest.routeTableId)
            && Objects.equals(this.limit, listEffectiveRoutesRequest.limit)
            && Objects.equals(this.marker, listEffectiveRoutesRequest.marker)
            && Objects.equals(this.destination, listEffectiveRoutesRequest.destination)
            && Objects.equals(this.resourceType, listEffectiveRoutesRequest.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTableId, limit, marker, destination, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEffectiveRoutesRequest {\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
