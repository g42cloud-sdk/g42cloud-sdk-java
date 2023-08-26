package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Authentication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authenticatingProxy")

    private AuthenticatingProxy authenticatingProxy;

    public Authentication withMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Authentication withAuthenticatingProxy(AuthenticatingProxy authenticatingProxy) {
        this.authenticatingProxy = authenticatingProxy;
        return this;
    }

    public Authentication withAuthenticatingProxy(Consumer<AuthenticatingProxy> authenticatingProxySetter) {
        if (this.authenticatingProxy == null) {
            this.authenticatingProxy = new AuthenticatingProxy();
            authenticatingProxySetter.accept(this.authenticatingProxy);
        }

        return this;
    }

    public AuthenticatingProxy getAuthenticatingProxy() {
        return authenticatingProxy;
    }

    public void setAuthenticatingProxy(AuthenticatingProxy authenticatingProxy) {
        this.authenticatingProxy = authenticatingProxy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Authentication that = (Authentication) obj;
        return Objects.equals(this.mode, that.mode)
            && Objects.equals(this.authenticatingProxy, that.authenticatingProxy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, authenticatingProxy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authentication {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    authenticatingProxy: ").append(toIndentedString(authenticatingProxy)).append("\n");
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
