package com.g42cloud.sdk.ecs.v2.model;

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
public class NovaListAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availabilityZoneInfo")

    private List<NovaAvailabilityZone> availabilityZoneInfo = null;

    public NovaListAvailabilityZonesResponse withAvailabilityZoneInfo(List<NovaAvailabilityZone> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
        return this;
    }

    public NovaListAvailabilityZonesResponse addAvailabilityZoneInfoItem(
        NovaAvailabilityZone availabilityZoneInfoItem) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        this.availabilityZoneInfo.add(availabilityZoneInfoItem);
        return this;
    }

    public NovaListAvailabilityZonesResponse withAvailabilityZoneInfo(
        Consumer<List<NovaAvailabilityZone>> availabilityZoneInfoSetter) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        availabilityZoneInfoSetter.accept(this.availabilityZoneInfo);
        return this;
    }

    public List<NovaAvailabilityZone> getAvailabilityZoneInfo() {
        return availabilityZoneInfo;
    }

    public void setAvailabilityZoneInfo(List<NovaAvailabilityZone> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaListAvailabilityZonesResponse that = (NovaListAvailabilityZonesResponse) obj;
        return Objects.equals(this.availabilityZoneInfo, that.availabilityZoneInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListAvailabilityZonesResponse {\n");
        sb.append("    availabilityZoneInfo: ").append(toIndentedString(availabilityZoneInfo)).append("\n");
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
