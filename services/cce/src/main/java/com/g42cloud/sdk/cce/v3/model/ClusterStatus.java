package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ClusterStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<ClusterEndpoints> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLocked")

    private Boolean isLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockScene")

    private String lockScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSource")

    private String lockSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSourceId")

    private String lockSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteOption")

    private Object deleteOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteStatus")

    private Object deleteStatus;

    public ClusterStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public ClusterStatus withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public ClusterStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ClusterStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClusterStatus withEndpoints(List<ClusterEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ClusterStatus addEndpointsItem(ClusterEndpoints endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ClusterStatus withEndpoints(Consumer<List<ClusterEndpoints>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    public List<ClusterEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<ClusterEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public ClusterStatus withIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public ClusterStatus withLockScene(String lockScene) {
        this.lockScene = lockScene;
        return this;
    }

    public String getLockScene() {
        return lockScene;
    }

    public void setLockScene(String lockScene) {
        this.lockScene = lockScene;
    }

    public ClusterStatus withLockSource(String lockSource) {
        this.lockSource = lockSource;
        return this;
    }

    public String getLockSource() {
        return lockSource;
    }

    public void setLockSource(String lockSource) {
        this.lockSource = lockSource;
    }

    public ClusterStatus withLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
        return this;
    }

    public String getLockSourceId() {
        return lockSourceId;
    }

    public void setLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
    }

    public ClusterStatus withDeleteOption(Object deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    public Object getDeleteOption() {
        return deleteOption;
    }

    public void setDeleteOption(Object deleteOption) {
        this.deleteOption = deleteOption;
    }

    public ClusterStatus withDeleteStatus(Object deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    public Object getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Object deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterStatus that = (ClusterStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.jobID, that.jobID)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message)
            && Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.isLocked, that.isLocked)
            && Objects.equals(this.lockScene, that.lockScene) && Objects.equals(this.lockSource, that.lockSource)
            && Objects.equals(this.lockSourceId, that.lockSourceId)
            && Objects.equals(this.deleteOption, that.deleteOption)
            && Objects.equals(this.deleteStatus, that.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase,
            jobID,
            reason,
            message,
            endpoints,
            isLocked,
            lockScene,
            lockSource,
            lockSourceId,
            deleteOption,
            deleteStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
        sb.append("    lockScene: ").append(toIndentedString(lockScene)).append("\n");
        sb.append("    lockSource: ").append(toIndentedString(lockSource)).append("\n");
        sb.append("    lockSourceId: ").append(toIndentedString(lockSourceId)).append("\n");
        sb.append("    deleteOption: ").append(toIndentedString(deleteOption)).append("\n");
        sb.append("    deleteStatus: ").append(toIndentedString(deleteStatus)).append("\n");
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
