package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckpointCreate
 */
public class CheckpointCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum PROTECTING for value: "protecting"
         */
        public static final StatusEnum PROTECTING = new StatusEnum("protecting");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /**
         * Enum ERROR_DELETING for value: "error-deleting"
         */
        public static final StatusEnum ERROR_DELETING = new StatusEnum("error-deleting");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("deleting", DELETING);
            map.put("protecting", PROTECTING);
            map.put("deleted", DELETED);
            map.put("error-deleting", ERROR_DELETING);
            map.put("error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private CheckpointPlanCreate vault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private CheckpointExtraInfoResp extraInfo;

    public CheckpointCreate withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CheckpointCreate withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckpointCreate withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CheckpointCreate withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CheckpointCreate withVault(CheckpointPlanCreate vault) {
        this.vault = vault;
        return this;
    }

    public CheckpointCreate withVault(Consumer<CheckpointPlanCreate> vaultSetter) {
        if (this.vault == null) {
            this.vault = new CheckpointPlanCreate();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    public CheckpointPlanCreate getVault() {
        return vault;
    }

    public void setVault(CheckpointPlanCreate vault) {
        this.vault = vault;
    }

    public CheckpointCreate withExtraInfo(CheckpointExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public CheckpointCreate withExtraInfo(Consumer<CheckpointExtraInfoResp> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new CheckpointExtraInfoResp();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    public CheckpointExtraInfoResp getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(CheckpointExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointCreate checkpointCreate = (CheckpointCreate) o;
        return Objects.equals(this.createdAt, checkpointCreate.createdAt)
            && Objects.equals(this.id, checkpointCreate.id)
            && Objects.equals(this.projectId, checkpointCreate.projectId)
            && Objects.equals(this.status, checkpointCreate.status)
            && Objects.equals(this.vault, checkpointCreate.vault)
            && Objects.equals(this.extraInfo, checkpointCreate.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id, projectId, status, vault, extraInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointCreate {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
