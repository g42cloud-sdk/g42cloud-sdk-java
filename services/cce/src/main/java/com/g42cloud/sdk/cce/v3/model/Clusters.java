package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Clusters
 */
public class Clusters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private ClusterCert cluster;

    public Clusters withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clusters withCluster(ClusterCert cluster) {
        this.cluster = cluster;
        return this;
    }

    public Clusters withCluster(Consumer<ClusterCert> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new ClusterCert();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    public ClusterCert getCluster() {
        return cluster;
    }

    public void setCluster(ClusterCert cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Clusters clusters = (Clusters) o;
        return Objects.equals(this.name, clusters.name) && Objects.equals(this.cluster, clusters.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clusters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
