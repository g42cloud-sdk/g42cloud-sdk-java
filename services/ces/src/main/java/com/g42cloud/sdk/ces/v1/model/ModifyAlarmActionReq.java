package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ModifyAlarmActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    public ModifyAlarmActionReq withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyAlarmActionReq modifyAlarmActionReq = (ModifyAlarmActionReq) o;
        return Objects.equals(this.alarmEnabled, modifyAlarmActionReq.alarmEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyAlarmActionReq {\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
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
