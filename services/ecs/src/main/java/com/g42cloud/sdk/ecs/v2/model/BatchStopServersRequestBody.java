package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchStopServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-stop")

    private BatchStopServersOption osStop;

    public BatchStopServersRequestBody withOsStop(BatchStopServersOption osStop) {
        this.osStop = osStop;
        return this;
    }

    public BatchStopServersRequestBody withOsStop(Consumer<BatchStopServersOption> osStopSetter) {
        if (this.osStop == null) {
            this.osStop = new BatchStopServersOption();
            osStopSetter.accept(this.osStop);
        }

        return this;
    }

    public BatchStopServersOption getOsStop() {
        return osStop;
    }

    public void setOsStop(BatchStopServersOption osStop) {
        this.osStop = osStop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStopServersRequestBody that = (BatchStopServersRequestBody) obj;
        return Objects.equals(this.osStop, that.osStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopServersRequestBody {\n");
        sb.append("    osStop: ").append(toIndentedString(osStop)).append("\n");
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
