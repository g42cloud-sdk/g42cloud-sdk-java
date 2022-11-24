package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceRestartRequsetBody
 */
public class InstanceRestartRequsetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    private Object restart;

    public InstanceRestartRequsetBody withRestart(Object restart) {
        this.restart = restart;
        return this;
    }

    public Object getRestart() {
        return restart;
    }

    public void setRestart(Object restart) {
        this.restart = restart;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceRestartRequsetBody instanceRestartRequsetBody = (InstanceRestartRequsetBody) o;
        return Objects.equals(this.restart, instanceRestartRequsetBody.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRestartRequsetBody {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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
