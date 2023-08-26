package com.g42cloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作事件列表，目前最多支持对100服务的1000个关键操作进行配置。
 */
public class Operations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_names")

    private List<String> traceNames = null;

    public Operations withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Operations withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Operations withTraceNames(List<String> traceNames) {
        this.traceNames = traceNames;
        return this;
    }

    public Operations addTraceNamesItem(String traceNamesItem) {
        if (this.traceNames == null) {
            this.traceNames = new ArrayList<>();
        }
        this.traceNames.add(traceNamesItem);
        return this;
    }

    public Operations withTraceNames(Consumer<List<String>> traceNamesSetter) {
        if (this.traceNames == null) {
            this.traceNames = new ArrayList<>();
        }
        traceNamesSetter.accept(this.traceNames);
        return this;
    }

    public List<String> getTraceNames() {
        return traceNames;
    }

    public void setTraceNames(List<String> traceNames) {
        this.traceNames = traceNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operations that = (Operations) obj;
        return Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.traceNames, that.traceNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, resourceType, traceNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operations {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    traceNames: ").append(toIndentedString(traceNames)).append("\n");
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
