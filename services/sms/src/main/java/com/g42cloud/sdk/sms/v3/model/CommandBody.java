package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 命令参数body
 */
public class CommandBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_detail")

    private Object resultDetail;

    public CommandBody withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public CommandBody withResult(String result) {
        this.result = result;
        return this;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CommandBody withResultDetail(Object resultDetail) {
        this.resultDetail = resultDetail;
        return this;
    }

    public Object getResultDetail() {
        return resultDetail;
    }

    public void setResultDetail(Object resultDetail) {
        this.resultDetail = resultDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommandBody that = (CommandBody) obj;
        return Objects.equals(this.commandName, that.commandName) && Objects.equals(this.result, that.result)
            && Objects.equals(this.resultDetail, that.resultDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandName, result, resultDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandBody {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    resultDetail: ").append(toIndentedString(resultDetail)).append("\n");
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
