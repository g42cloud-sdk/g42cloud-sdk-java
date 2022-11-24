package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RemoveNodesTask
 */
public class RemoveNodesTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private RemoveNodesSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private TaskStatus status;

    public RemoveNodesTask withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public RemoveNodesTask withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RemoveNodesTask withSpec(RemoveNodesSpec spec) {
        this.spec = spec;
        return this;
    }

    public RemoveNodesTask withSpec(Consumer<RemoveNodesSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new RemoveNodesSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public RemoveNodesSpec getSpec() {
        return spec;
    }

    public void setSpec(RemoveNodesSpec spec) {
        this.spec = spec;
    }

    public RemoveNodesTask withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    public RemoveNodesTask withStatus(Consumer<TaskStatus> statusSetter) {
        if (this.status == null) {
            this.status = new TaskStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveNodesTask removeNodesTask = (RemoveNodesTask) o;
        return Objects.equals(this.apiVersion, removeNodesTask.apiVersion)
            && Objects.equals(this.kind, removeNodesTask.kind) && Objects.equals(this.spec, removeNodesTask.spec)
            && Objects.equals(this.status, removeNodesTask.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNodesTask {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
