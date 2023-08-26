package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库用户信息。
 */
public class PostgresqlUserForList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memberof")

    private List<String> memberof = null;

    public PostgresqlUserForList withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostgresqlUserForList withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public PostgresqlUserForList withMemberof(List<String> memberof) {
        this.memberof = memberof;
        return this;
    }

    public PostgresqlUserForList addMemberofItem(String memberofItem) {
        if (this.memberof == null) {
            this.memberof = new ArrayList<>();
        }
        this.memberof.add(memberofItem);
        return this;
    }

    public PostgresqlUserForList withMemberof(Consumer<List<String>> memberofSetter) {
        if (this.memberof == null) {
            this.memberof = new ArrayList<>();
        }
        memberofSetter.accept(this.memberof);
        return this;
    }

    public List<String> getMemberof() {
        return memberof;
    }

    public void setMemberof(List<String> memberof) {
        this.memberof = memberof;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgresqlUserForList that = (PostgresqlUserForList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.attributes, that.attributes)
            && Objects.equals(this.memberof, that.memberof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attributes, memberof);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlUserForList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    memberof: ").append(toIndentedString(memberof)).append("\n");
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
