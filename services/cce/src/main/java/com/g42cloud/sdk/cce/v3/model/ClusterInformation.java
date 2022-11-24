package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ClusterInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ClusterInformationSpec spec;

    public ClusterInformation withSpec(ClusterInformationSpec spec) {
        this.spec = spec;
        return this;
    }

    public ClusterInformation withSpec(Consumer<ClusterInformationSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ClusterInformationSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    public ClusterInformationSpec getSpec() {
        return spec;
    }

    public void setSpec(ClusterInformationSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterInformation clusterInformation = (ClusterInformation) o;
        return Objects.equals(this.spec, clusterInformation.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInformation {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
