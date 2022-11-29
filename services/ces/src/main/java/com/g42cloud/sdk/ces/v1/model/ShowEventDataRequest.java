package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEventDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.1")

    private String dim1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.2")

    private String dim2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.3")

    private String dim3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public ShowEventDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowEventDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ShowEventDataRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public ShowEventDataRequest withDim2(String dim2) {
        this.dim2 = dim2;
        return this;
    }

    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ShowEventDataRequest withDim3(String dim3) {
        this.dim3 = dim3;
        return this;
    }

    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public ShowEventDataRequest withType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowEventDataRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowEventDataRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventDataRequest showEventDataRequest = (ShowEventDataRequest) o;
        return Objects.equals(this.namespace, showEventDataRequest.namespace)
            && Objects.equals(this.dim0, showEventDataRequest.dim0)
            && Objects.equals(this.dim1, showEventDataRequest.dim1)
            && Objects.equals(this.dim2, showEventDataRequest.dim2)
            && Objects.equals(this.dim3, showEventDataRequest.dim3)
            && Objects.equals(this.type, showEventDataRequest.type)
            && Objects.equals(this.from, showEventDataRequest.from) && Objects.equals(this.to, showEventDataRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dim0, dim1, dim2, dim3, type, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDataRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
        sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
        sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
