package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标记接受云硬盘过户操作。
 */
public class CinderAcceptVolumeTransferOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    public CinderAcceptVolumeTransferOption withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderAcceptVolumeTransferOption cinderAcceptVolumeTransferOption = (CinderAcceptVolumeTransferOption) o;
        return Objects.equals(this.authKey, cinderAcceptVolumeTransferOption.authKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderAcceptVolumeTransferOption {\n");
        sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
