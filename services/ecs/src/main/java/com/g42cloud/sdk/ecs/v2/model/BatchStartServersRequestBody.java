package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchStartServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-start")

    private BatchStartServersOption osStart;

    public BatchStartServersRequestBody withOsStart(BatchStartServersOption osStart) {
        this.osStart = osStart;
        return this;
    }

    public BatchStartServersRequestBody withOsStart(Consumer<BatchStartServersOption> osStartSetter) {
        if (this.osStart == null) {
            this.osStart = new BatchStartServersOption();
            osStartSetter.accept(this.osStart);
        }

        return this;
    }

    public BatchStartServersOption getOsStart() {
        return osStart;
    }

    public void setOsStart(BatchStartServersOption osStart) {
        this.osStart = osStart;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStartServersRequestBody batchStartServersRequestBody = (BatchStartServersRequestBody) o;
        return Objects.equals(this.osStart, batchStartServersRequestBody.osStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartServersRequestBody {\n");
        sb.append("    osStart: ").append(toIndentedString(osStart)).append("\n");
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
