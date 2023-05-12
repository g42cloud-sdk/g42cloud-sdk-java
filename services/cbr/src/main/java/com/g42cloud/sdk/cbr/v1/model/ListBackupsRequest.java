package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListBackupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dec")

    private Boolean dec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_az")

    private String resourceAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum PROTECTING for value: "protecting"
         */
        public static final StatusEnum PROTECTING = new StatusEnum("protecting");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum RESTORING for value: "restoring"
         */
        public static final StatusEnum RESTORING = new StatusEnum("restoring");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");

        /**
         * Enum WAITING_PROTECT for value: "waiting_protect"
         */
        public static final StatusEnum WAITING_PROTECT = new StatusEnum("waiting_protect");

        /**
         * Enum WAITING_DELETE for value: "waiting_delete"
         */
        public static final StatusEnum WAITING_DELETE = new StatusEnum("waiting_delete");

        /**
         * Enum WAITING_RESTORE for value: "waiting_restore"
         */
        public static final StatusEnum WAITING_RESTORE = new StatusEnum("waiting_restore");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("protecting", PROTECTING);
            map.put("deleting", DELETING);
            map.put("restoring", RESTORING);
            map.put("error", ERROR);
            map.put("waiting_protect", WAITING_PROTECT);
            map.put("waiting_delete", WAITING_DELETE);
            map.put("waiting_restore", WAITING_RESTORE);
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
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public static final class OwnTypeEnum {

        /**
         * Enum ALL_GRANTED for value: "all_granted"
         */
        public static final OwnTypeEnum ALL_GRANTED = new OwnTypeEnum("all_granted");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final OwnTypeEnum PRIVATE = new OwnTypeEnum("private");

        /**
         * Enum SHARED for value: "shared"
         */
        public static final OwnTypeEnum SHARED = new OwnTypeEnum("shared");

        private static final Map<String, OwnTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnTypeEnum> createStaticFields() {
            Map<String, OwnTypeEnum> map = new HashMap<>();
            map.put("all_granted", ALL_GRANTED);
            map.put("private", PRIVATE);
            map.put("shared", SHARED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnTypeEnum(String value) {
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
        public static OwnTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OwnTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OwnTypeEnum(value);
            }
            return result;
        }

        public static OwnTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OwnTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnTypeEnum) {
                return this.value.equals(((OwnTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own_type")

    private OwnTypeEnum ownType;

    public static final class MemberStatusEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final MemberStatusEnum PENDING = new MemberStatusEnum("pending");

        /**
         * Enum ACCEPTED for value: "accepted"
         */
        public static final MemberStatusEnum ACCEPTED = new MemberStatusEnum("accepted");

        /**
         * Enum REJECTED for value: "rejected"
         */
        public static final MemberStatusEnum REJECTED = new MemberStatusEnum("rejected");

        private static final Map<String, MemberStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberStatusEnum> createStaticFields() {
            Map<String, MemberStatusEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("accepted", ACCEPTED);
            map.put("rejected", REJECTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberStatusEnum(String value) {
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
        public static MemberStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MemberStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MemberStatusEnum(value);
            }
            return result;
        }

        public static MemberStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MemberStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberStatusEnum) {
                return this.value.equals(((MemberStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_status")

    private MemberStatusEnum memberStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_percent")

    private String usedPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_replication")

    private Boolean showReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    public ListBackupsRequest withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public ListBackupsRequest withDec(Boolean dec) {
        this.dec = dec;
        return this;
    }

    public Boolean getDec() {
        return dec;
    }

    public void setDec(Boolean dec) {
        this.dec = dec;
    }

    public ListBackupsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListBackupsRequest withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ListBackupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBackupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListBackupsRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListBackupsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBackupsRequest withResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
        return this;
    }

    public String getResourceAz() {
        return resourceAz;
    }

    public void setResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
    }

    public ListBackupsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListBackupsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListBackupsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListBackupsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListBackupsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListBackupsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListBackupsRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ListBackupsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListBackupsRequest withOwnType(OwnTypeEnum ownType) {
        this.ownType = ownType;
        return this;
    }

    public OwnTypeEnum getOwnType() {
        return ownType;
    }

    public void setOwnType(OwnTypeEnum ownType) {
        this.ownType = ownType;
    }

    public ListBackupsRequest withMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    public MemberStatusEnum getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
    }

    public ListBackupsRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ListBackupsRequest withUsedPercent(String usedPercent) {
        this.usedPercent = usedPercent;
        return this;
    }

    public String getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(String usedPercent) {
        this.usedPercent = usedPercent;
    }

    public ListBackupsRequest withShowReplication(Boolean showReplication) {
        this.showReplication = showReplication;
        return this;
    }

    public Boolean getShowReplication() {
        return showReplication;
    }

    public void setShowReplication(Boolean showReplication) {
        this.showReplication = showReplication;
    }

    public ListBackupsRequest withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsRequest listBackupsRequest = (ListBackupsRequest) o;
        return Objects.equals(this.checkpointId, listBackupsRequest.checkpointId)
            && Objects.equals(this.dec, listBackupsRequest.dec)
            && Objects.equals(this.endTime, listBackupsRequest.endTime)
            && Objects.equals(this.imageType, listBackupsRequest.imageType)
            && Objects.equals(this.limit, listBackupsRequest.limit)
            && Objects.equals(this.marker, listBackupsRequest.marker)
            && Objects.equals(this.name, listBackupsRequest.name)
            && Objects.equals(this.offset, listBackupsRequest.offset)
            && Objects.equals(this.resourceAz, listBackupsRequest.resourceAz)
            && Objects.equals(this.resourceId, listBackupsRequest.resourceId)
            && Objects.equals(this.resourceName, listBackupsRequest.resourceName)
            && Objects.equals(this.resourceType, listBackupsRequest.resourceType)
            && Objects.equals(this.sort, listBackupsRequest.sort)
            && Objects.equals(this.startTime, listBackupsRequest.startTime)
            && Objects.equals(this.status, listBackupsRequest.status)
            && Objects.equals(this.vaultId, listBackupsRequest.vaultId)
            && Objects.equals(this.enterpriseProjectId, listBackupsRequest.enterpriseProjectId)
            && Objects.equals(this.ownType, listBackupsRequest.ownType)
            && Objects.equals(this.memberStatus, listBackupsRequest.memberStatus)
            && Objects.equals(this.parentId, listBackupsRequest.parentId)
            && Objects.equals(this.usedPercent, listBackupsRequest.usedPercent)
            && Objects.equals(this.showReplication, listBackupsRequest.showReplication)
            && Objects.equals(this.incremental, listBackupsRequest.incremental);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointId,
            dec,
            endTime,
            imageType,
            limit,
            marker,
            name,
            offset,
            resourceAz,
            resourceId,
            resourceName,
            resourceType,
            sort,
            startTime,
            status,
            vaultId,
            enterpriseProjectId,
            ownType,
            memberStatus,
            parentId,
            usedPercent,
            showReplication,
            incremental);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsRequest {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    dec: ").append(toIndentedString(dec)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    resourceAz: ").append(toIndentedString(resourceAz)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ownType: ").append(toIndentedString(ownType)).append("\n");
        sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    usedPercent: ").append(toIndentedString(usedPercent)).append("\n");
        sb.append("    showReplication: ").append(toIndentedString(showReplication)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
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
