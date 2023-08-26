package com.g42cloud.sdk.sms.v3.model;

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
public class ShowsSpeedLimitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private List<SpeedLimitlJson> speedLimit = null;

    public ShowsSpeedLimitsResponse withSpeedLimit(List<SpeedLimitlJson> speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public ShowsSpeedLimitsResponse addSpeedLimitItem(SpeedLimitlJson speedLimitItem) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        this.speedLimit.add(speedLimitItem);
        return this;
    }

    public ShowsSpeedLimitsResponse withSpeedLimit(Consumer<List<SpeedLimitlJson>> speedLimitSetter) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        speedLimitSetter.accept(this.speedLimit);
        return this;
    }

    public List<SpeedLimitlJson> getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(List<SpeedLimitlJson> speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowsSpeedLimitsResponse that = (ShowsSpeedLimitsResponse) obj;
        return Objects.equals(this.speedLimit, that.speedLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowsSpeedLimitsResponse {\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
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
