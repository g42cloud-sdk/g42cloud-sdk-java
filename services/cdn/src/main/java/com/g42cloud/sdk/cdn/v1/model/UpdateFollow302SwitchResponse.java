package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateFollow302SwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_status")

    private Follow302StatusBody followStatus;

    public UpdateFollow302SwitchResponse withFollowStatus(Follow302StatusBody followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    public UpdateFollow302SwitchResponse withFollowStatus(Consumer<Follow302StatusBody> followStatusSetter) {
        if (this.followStatus == null) {
            this.followStatus = new Follow302StatusBody();
            followStatusSetter.accept(this.followStatus);
        }

        return this;
    }

    public Follow302StatusBody getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Follow302StatusBody followStatus) {
        this.followStatus = followStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFollow302SwitchResponse that = (UpdateFollow302SwitchResponse) obj;
        return Objects.equals(this.followStatus, that.followStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(followStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFollow302SwitchResponse {\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
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
