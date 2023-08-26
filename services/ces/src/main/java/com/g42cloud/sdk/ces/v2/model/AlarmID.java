package com.g42cloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警规则id，以al开头，包含22个数字或字母
 */
public class AlarmID {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmID {\n");
        sb.append("}");
        return sb.toString();
    }

}
