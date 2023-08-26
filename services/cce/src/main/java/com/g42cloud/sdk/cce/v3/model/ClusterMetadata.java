package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可以通过 annotations[\&quot;cluster.install.addons/install\&quot;] 来指定创建集群时需要安装的插件，格式形如 &#x60;&#x60;&#x60; [   {     \&quot;addonTemplateName\&quot;: \&quot;autoscaler\&quot;,     \&quot;version\&quot;: \&quot;1.15.3\&quot;,     \&quot;values\&quot;: {       \&quot;flavor\&quot;: {         \&quot;description\&quot;: \&quot;Has only one instance\&quot;,         \&quot;name\&quot;: \&quot;Single\&quot;,         \&quot;replicas\&quot;: 1,         \&quot;resources\&quot;: [           {             \&quot;limitsCpu\&quot;: \&quot;100m\&quot;,             \&quot;limitsMem\&quot;: \&quot;300Mi\&quot;,             \&quot;name\&quot;: \&quot;autoscaler\&quot;,             \&quot;requestsCpu\&quot;: \&quot;100m\&quot;,             \&quot;requestsMem\&quot;: \&quot;300Mi\&quot;           }         ]       },       \&quot;custom\&quot;: {         \&quot;coresTotal\&quot;: 32000,         \&quot;maxEmptyBulkDeleteFlag\&quot;: 10,         \&quot;maxNodesTotal\&quot;: 1000,         \&quot;memoryTotal\&quot;: 128000,         \&quot;scaleDownDelayAfterAdd\&quot;: 10,         \&quot;scaleDownDelayAfterDelete\&quot;: 10,         \&quot;scaleDownDelayAfterFailure\&quot;: 3,         \&quot;scaleDownEnabled\&quot;: false,         \&quot;scaleDownUnneededTime\&quot;: 10,         \&quot;scaleDownUtilizationThreshold\&quot;: 0.5,         \&quot;scaleUpCpuUtilizationThreshold\&quot;: 1,         \&quot;scaleUpMemUtilizationThreshold\&quot;: 1,         \&quot;scaleUpUnscheduledPodEnabled\&quot;: true,         \&quot;scaleUpUtilizationEnabled\&quot;: true,         \&quot;tenant_id\&quot;: \&quot;47eb1d64cbeb45cfa01ae20af4f4b563\&quot;,         \&quot;unremovableNodeRecheckTimeout\&quot;: 5       }     }   } ] &#x60;&#x60;&#x60;
 */
public class ClusterMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    public ClusterMetadata withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ClusterMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ClusterMetadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ClusterMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ClusterMetadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ClusterMetadata putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ClusterMetadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ClusterMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public ClusterMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterMetadata that = (ClusterMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.annotations, that.annotations) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uid, annotations, labels, creationTimestamp, updateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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
