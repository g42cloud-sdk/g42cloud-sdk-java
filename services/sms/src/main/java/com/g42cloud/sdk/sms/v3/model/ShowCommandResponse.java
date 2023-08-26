package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_param")

    private ComandParam commandParam;

    public ShowCommandResponse withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public ShowCommandResponse withCommandParam(ComandParam commandParam) {
        this.commandParam = commandParam;
        return this;
    }

    public ShowCommandResponse withCommandParam(Consumer<ComandParam> commandParamSetter) {
        if (this.commandParam == null) {
            this.commandParam = new ComandParam();
            commandParamSetter.accept(this.commandParam);
        }

        return this;
    }

    public ComandParam getCommandParam() {
        return commandParam;
    }

    public void setCommandParam(ComandParam commandParam) {
        this.commandParam = commandParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommandResponse that = (ShowCommandResponse) obj;
        return Objects.equals(this.commandName, that.commandName)
            && Objects.equals(this.commandParam, that.commandParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandName, commandParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommandResponse {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    commandParam: ").append(toIndentedString(commandParam)).append("\n");
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
