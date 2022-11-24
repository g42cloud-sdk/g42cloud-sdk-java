package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOffSiteRestoreTimesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private List<GetRestoreTimeResponseRestoreTime> restoreTime = null;

    public ListOffSiteRestoreTimesResponse withRestoreTime(List<GetRestoreTimeResponseRestoreTime> restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    public ListOffSiteRestoreTimesResponse addRestoreTimeItem(GetRestoreTimeResponseRestoreTime restoreTimeItem) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        this.restoreTime.add(restoreTimeItem);
        return this;
    }

    public ListOffSiteRestoreTimesResponse withRestoreTime(
        Consumer<List<GetRestoreTimeResponseRestoreTime>> restoreTimeSetter) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        restoreTimeSetter.accept(this.restoreTime);
        return this;
    }

    public List<GetRestoreTimeResponseRestoreTime> getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(List<GetRestoreTimeResponseRestoreTime> restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOffSiteRestoreTimesResponse listOffSiteRestoreTimesResponse = (ListOffSiteRestoreTimesResponse) o;
        return Objects.equals(this.restoreTime, listOffSiteRestoreTimesResponse.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOffSiteRestoreTimesResponse {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
