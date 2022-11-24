package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceRequirements
 */
public class ResourceRequirements {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private Map<String, String> limits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Map<String, String> requests = null;

    public ResourceRequirements withLimits(Map<String, String> limits) {
        this.limits = limits;
        return this;
    }

    public ResourceRequirements putLimitsItem(String key, String limitsItem) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        this.limits.put(key, limitsItem);
        return this;
    }

    public ResourceRequirements withLimits(Consumer<Map<String, String>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    public Map<String, String> getLimits() {
        return limits;
    }

    public void setLimits(Map<String, String> limits) {
        this.limits = limits;
    }

    public ResourceRequirements withRequests(Map<String, String> requests) {
        this.requests = requests;
        return this;
    }

    public ResourceRequirements putRequestsItem(String key, String requestsItem) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        this.requests.put(key, requestsItem);
        return this;
    }

    public ResourceRequirements withRequests(Consumer<Map<String, String>> requestsSetter) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    public Map<String, String> getRequests() {
        return requests;
    }

    public void setRequests(Map<String, String> requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceRequirements resourceRequirements = (ResourceRequirements) o;
        return Objects.equals(this.limits, resourceRequirements.limits)
            && Objects.equals(this.requests, resourceRequirements.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceRequirements {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
