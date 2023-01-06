package com.g42cloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTracesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traces")

    private List<Traces> traces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaData metaData;

    public ListTracesResponse withTraces(List<Traces> traces) {
        this.traces = traces;
        return this;
    }

    public ListTracesResponse addTracesItem(Traces tracesItem) {
        if (this.traces == null) {
            this.traces = new ArrayList<>();
        }
        this.traces.add(tracesItem);
        return this;
    }

    public ListTracesResponse withTraces(Consumer<List<Traces>> tracesSetter) {
        if (this.traces == null) {
            this.traces = new ArrayList<>();
        }
        tracesSetter.accept(this.traces);
        return this;
    }

    public List<Traces> getTraces() {
        return traces;
    }

    public void setTraces(List<Traces> traces) {
        this.traces = traces;
    }

    public ListTracesResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListTracesResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTracesResponse listTracesResponse = (ListTracesResponse) o;
        return Objects.equals(this.traces, listTracesResponse.traces)
            && Objects.equals(this.metaData, listTracesResponse.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traces, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTracesResponse {\n");
        sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
