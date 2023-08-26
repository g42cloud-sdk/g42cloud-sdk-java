package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ResetServerPasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset-password")

    private ResetServerPasswordOption resetPassword;

    public ResetServerPasswordRequestBody withResetPassword(ResetServerPasswordOption resetPassword) {
        this.resetPassword = resetPassword;
        return this;
    }

    public ResetServerPasswordRequestBody withResetPassword(Consumer<ResetServerPasswordOption> resetPasswordSetter) {
        if (this.resetPassword == null) {
            this.resetPassword = new ResetServerPasswordOption();
            resetPasswordSetter.accept(this.resetPassword);
        }

        return this;
    }

    public ResetServerPasswordOption getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(ResetServerPasswordOption resetPassword) {
        this.resetPassword = resetPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetServerPasswordRequestBody that = (ResetServerPasswordRequestBody) obj;
        return Objects.equals(this.resetPassword, that.resetPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resetPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetServerPasswordRequestBody {\n");
        sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
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
