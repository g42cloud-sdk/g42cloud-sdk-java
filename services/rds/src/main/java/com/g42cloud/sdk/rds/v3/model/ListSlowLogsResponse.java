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
public class ListSlowLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<SlowLog> slowLogList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    private Integer totalRecord;

    public ListSlowLogsResponse withSlowLogList(List<SlowLog> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ListSlowLogsResponse addSlowLogListItem(SlowLog slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListSlowLogsResponse withSlowLogList(Consumer<List<SlowLog>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    public List<SlowLog> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<SlowLog> slowLogList) {
        this.slowLogList = slowLogList;
    }

    public ListSlowLogsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowLogsResponse listSlowLogsResponse = (ListSlowLogsResponse) o;
        return Objects.equals(this.slowLogList, listSlowLogsResponse.slowLogList)
            && Objects.equals(this.totalRecord, listSlowLogsResponse.totalRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogList, totalRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogsResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
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
