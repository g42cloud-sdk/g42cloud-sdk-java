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
public class ListAttachmentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public static final class StateEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StateEnum PENDING = new StateEnum("pending");

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StateEnum AVAILABLE = new StateEnum("available");

        /**
         * Enum MODIFYING for value: "modifying"
         */
        public static final StateEnum MODIFYING = new StateEnum("modifying");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StateEnum DELETING = new StateEnum("deleting");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StateEnum DELETED = new StateEnum("deleted");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StateEnum FAILED = new StateEnum("failed");

        /**
         * Enum INITIATING_REQUEST for value: "initiating_request"
         */
        public static final StateEnum INITIATING_REQUEST = new StateEnum("initiating_request");

        /**
         * Enum REJECTED for value: "rejected"
         */
        public static final StateEnum REJECTED = new StateEnum("rejected");

        /**
         * Enum PENDING_ACCEPTANCE for value: "pending_acceptance"
         */
        public static final StateEnum PENDING_ACCEPTANCE = new StateEnum("pending_acceptance");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("available", AVAILABLE);
            map.put("modifying", MODIFYING);
            map.put("deleting", DELETING);
            map.put("deleted", DELETED);
            map.put("failed", FAILED);
            map.put("initiating_request", INITIATING_REQUEST);
            map.put("rejected", REJECTED);
            map.put("pending_acceptance", PENDING_ACCEPTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<StateEnum> state = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private List<String> resourceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<String> sortKey = null;

    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    public ListAttachmentsRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ListAttachmentsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAttachmentsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAttachmentsRequest withState(List<StateEnum> state) {
        this.state = state;
        return this;
    }

    public ListAttachmentsRequest addStateItem(StateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListAttachmentsRequest withState(Consumer<List<StateEnum>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    public List<StateEnum> getState() {
        return state;
    }

    public void setState(List<StateEnum> state) {
        this.state = state;
    }

    public ListAttachmentsRequest withResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ListAttachmentsRequest addResourceTypeItem(ResourceTypeEnum resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ListAttachmentsRequest withResourceType(Consumer<List<ResourceTypeEnum>> resourceTypeSetter) {
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

    public ListAttachmentsRequest withResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ListAttachmentsRequest addResourceIdItem(String resourceIdItem) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        this.resourceId.add(resourceIdItem);
        return this;
    }

    public ListAttachmentsRequest withResourceId(Consumer<List<String>> resourceIdSetter) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        resourceIdSetter.accept(this.resourceId);
        return this;
    }

    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public ListAttachmentsRequest withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListAttachmentsRequest addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListAttachmentsRequest withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public ListAttachmentsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListAttachmentsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListAttachmentsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAttachmentsRequest listAttachmentsRequest = (ListAttachmentsRequest) o;
        return Objects.equals(this.erId, listAttachmentsRequest.erId)
            && Objects.equals(this.limit, listAttachmentsRequest.limit)
            && Objects.equals(this.marker, listAttachmentsRequest.marker)
            && Objects.equals(this.state, listAttachmentsRequest.state)
            && Objects.equals(this.resourceType, listAttachmentsRequest.resourceType)
            && Objects.equals(this.resourceId, listAttachmentsRequest.resourceId)
            && Objects.equals(this.sortKey, listAttachmentsRequest.sortKey)
            && Objects.equals(this.sortDir, listAttachmentsRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, limit, marker, state, resourceType, resourceId, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttachmentsRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
