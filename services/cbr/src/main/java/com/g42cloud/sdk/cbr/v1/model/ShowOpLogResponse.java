package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log")

    private OperationLog operationLog;

    public ShowOpLogResponse withOperationLog(OperationLog operationLog) {
        this.operationLog = operationLog;
        return this;
    }

    public ShowOpLogResponse withOperationLog(Consumer<OperationLog> operationLogSetter) {
        if (this.operationLog == null) {
            this.operationLog = new OperationLog();
            operationLogSetter.accept(this.operationLog);
        }

        return this;
    }

    public OperationLog getOperationLog() {
        return operationLog;
    }

    public void setOperationLog(OperationLog operationLog) {
        this.operationLog = operationLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpLogResponse that = (ShowOpLogResponse) obj;
        return Objects.equals(this.operationLog, that.operationLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpLogResponse {\n");
        sb.append("    operationLog: ").append(toIndentedString(operationLog)).append("\n");
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
