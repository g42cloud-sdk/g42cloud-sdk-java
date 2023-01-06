package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopicAttribute
 */
public class TopicAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Statement")

    private List<Statement> statement = null;

    public TopicAttribute withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TopicAttribute withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TopicAttribute withStatement(List<Statement> statement) {
        this.statement = statement;
        return this;
    }

    public TopicAttribute addStatementItem(Statement statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        this.statement.add(statementItem);
        return this;
    }

    public TopicAttribute withStatement(Consumer<List<Statement>> statementSetter) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        statementSetter.accept(this.statement);
        return this;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicAttribute topicAttribute = (TopicAttribute) o;
        return Objects.equals(this.version, topicAttribute.version) && Objects.equals(this.id, topicAttribute.id)
            && Objects.equals(this.statement, topicAttribute.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, id, statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicAttribute {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
