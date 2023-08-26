package com.g42cloud.sdk.elb.v3.model;

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
public class ListAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<List<AvailabilityZone>> availabilityZones = null;

    public ListAvailabilityZonesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAvailabilityZonesResponse withAvailabilityZones(List<List<AvailabilityZone>> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ListAvailabilityZonesResponse addAvailabilityZonesItem(List<AvailabilityZone> availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ListAvailabilityZonesResponse withAvailabilityZones(
        Consumer<List<List<AvailabilityZone>>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    public List<List<AvailabilityZone>> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<List<AvailabilityZone>> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailabilityZonesResponse that = (ListAvailabilityZonesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.availabilityZones, that.availabilityZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, availabilityZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailabilityZonesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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
