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
 * 
 */
public class ReplicationRecordGet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_backup_id")

    private String destinationBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_checkpoint_id")

    private String destinationCheckpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ReplicationRecordsExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_backup_id")

    private String sourceBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_checkpoint_id")

    private String sourceCheckpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    public static final class StatusEnum {

        /**
         * Enum REPLICATING for value: "replicating"
         */
        public static final StatusEnum REPLICATING = new StatusEnum("replicating");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final StatusEnum SKIP = new StatusEnum("skip");

        /**
         * Enum WAITING_REPLICATE for value: "waiting_replicate"
         */
        public static final StatusEnum WAITING_REPLICATE = new StatusEnum("waiting_replicate");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("replicating", REPLICATING);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("skip", SKIP);
            map.put("waiting_replicate", WAITING_REPLICATE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public ReplicationRecordGet withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ReplicationRecordGet withDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
        return this;
    }

    public String getDestinationBackupId() {
        return destinationBackupId;
    }

    public void setDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
    }

    public ReplicationRecordGet withDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
        return this;
    }

    public String getDestinationCheckpointId() {
        return destinationCheckpointId;
    }

    public void setDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
    }

    public ReplicationRecordGet withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public ReplicationRecordGet withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public ReplicationRecordGet withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public ReplicationRecordGet withExtraInfo(ReplicationRecordsExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public ReplicationRecordGet withExtraInfo(Consumer<ReplicationRecordsExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ReplicationRecordsExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    public ReplicationRecordsExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ReplicationRecordsExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public ReplicationRecordGet withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReplicationRecordGet withSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
        return this;
    }

    public String getSourceBackupId() {
        return sourceBackupId;
    }

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    public ReplicationRecordGet withSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
        return this;
    }

    public String getSourceCheckpointId() {
        return sourceCheckpointId;
    }

    public void setSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
    }

    public ReplicationRecordGet withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ReplicationRecordGet withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public ReplicationRecordGet withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ReplicationRecordGet withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationRecordGet that = (ReplicationRecordGet) obj;
        return Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.destinationBackupId, that.destinationBackupId)
            && Objects.equals(this.destinationCheckpointId, that.destinationCheckpointId)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationVaultId, that.destinationVaultId)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.sourceBackupId, that.sourceBackupId)
            && Objects.equals(this.sourceCheckpointId, that.sourceCheckpointId)
            && Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.sourceRegion, that.sourceRegion) && Objects.equals(this.status, that.status)
            && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            destinationBackupId,
            destinationCheckpointId,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            extraInfo,
            id,
            sourceBackupId,
            sourceCheckpointId,
            sourceProjectId,
            sourceRegion,
            status,
            vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationRecordGet {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    destinationBackupId: ").append(toIndentedString(destinationBackupId)).append("\n");
        sb.append("    destinationCheckpointId: ").append(toIndentedString(destinationCheckpointId)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceBackupId: ").append(toIndentedString(sourceBackupId)).append("\n");
        sb.append("    sourceCheckpointId: ").append(toIndentedString(sourceCheckpointId)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
