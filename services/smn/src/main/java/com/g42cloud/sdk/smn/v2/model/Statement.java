package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Statement
 */
public class Statement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Principal")

    private String principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotPrincipal")

    private String notPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotAction")

    private String notAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotResource")

    private String notResource;

    public Statement withSid(String sid) {
        this.sid = sid;
        return this;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Statement withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Statement withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Statement withNotPrincipal(String notPrincipal) {
        this.notPrincipal = notPrincipal;
        return this;
    }

    public String getNotPrincipal() {
        return notPrincipal;
    }

    public void setNotPrincipal(String notPrincipal) {
        this.notPrincipal = notPrincipal;
    }

    public Statement withAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Statement withNotAction(String notAction) {
        this.notAction = notAction;
        return this;
    }

    public String getNotAction() {
        return notAction;
    }

    public void setNotAction(String notAction) {
        this.notAction = notAction;
    }

    public Statement withResource(String resource) {
        this.resource = resource;
        return this;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Statement withNotResource(String notResource) {
        this.notResource = notResource;
        return this;
    }

    public String getNotResource() {
        return notResource;
    }

    public void setNotResource(String notResource) {
        this.notResource = notResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Statement that = (Statement) obj;
        return Objects.equals(this.sid, that.sid) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.notPrincipal, that.notPrincipal)
            && Objects.equals(this.action, that.action) && Objects.equals(this.notAction, that.notAction)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.notResource, that.notResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, effect, principal, notPrincipal, action, notAction, resource, notResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statement {\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    notPrincipal: ").append(toIndentedString(notPrincipal)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    notAction: ").append(toIndentedString(notAction)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    notResource: ").append(toIndentedString(notResource)).append("\n");
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
