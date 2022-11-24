package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RejectVpcPeeringResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public static final class StatusEnum {

        /**
         * Enum PENDING_ACCEPTANCE for value: "PENDING_ACCEPTANCE"
         */
        public static final StatusEnum PENDING_ACCEPTANCE = new StatusEnum("PENDING_ACCEPTANCE");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");

        /**
         * Enum EXPIRED for value: "EXPIRED"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("EXPIRED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_ACCEPTANCE", PENDING_ACCEPTANCE);
            map.put("REJECTED", REJECTED);
            map.put("EXPIRED", EXPIRED);
            map.put("DELETED", DELETED);
            map.put("ACTIVE", ACTIVE);
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
    @JsonProperty(value = "request_vpc_info")

    private VpcInfo requestVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_vpc_info")

    private VpcInfo acceptVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RejectVpcPeeringResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RejectVpcPeeringResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RejectVpcPeeringResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RejectVpcPeeringResponse withRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
        return this;
    }

    public RejectVpcPeeringResponse withRequestVpcInfo(Consumer<VpcInfo> requestVpcInfoSetter) {
        if (this.requestVpcInfo == null) {
            this.requestVpcInfo = new VpcInfo();
            requestVpcInfoSetter.accept(this.requestVpcInfo);
        }

        return this;
    }

    public VpcInfo getRequestVpcInfo() {
        return requestVpcInfo;
    }

    public void setRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
    }

    public RejectVpcPeeringResponse withAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
        return this;
    }

    public RejectVpcPeeringResponse withAcceptVpcInfo(Consumer<VpcInfo> acceptVpcInfoSetter) {
        if (this.acceptVpcInfo == null) {
            this.acceptVpcInfo = new VpcInfo();
            acceptVpcInfoSetter.accept(this.acceptVpcInfo);
        }

        return this;
    }

    public VpcInfo getAcceptVpcInfo() {
        return acceptVpcInfo;
    }

    public void setAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
    }

    public RejectVpcPeeringResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RejectVpcPeeringResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RejectVpcPeeringResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RejectVpcPeeringResponse rejectVpcPeeringResponse = (RejectVpcPeeringResponse) o;
        return Objects.equals(this.id, rejectVpcPeeringResponse.id)
            && Objects.equals(this.name, rejectVpcPeeringResponse.name)
            && Objects.equals(this.status, rejectVpcPeeringResponse.status)
            && Objects.equals(this.requestVpcInfo, rejectVpcPeeringResponse.requestVpcInfo)
            && Objects.equals(this.acceptVpcInfo, rejectVpcPeeringResponse.acceptVpcInfo)
            && Objects.equals(this.createdAt, rejectVpcPeeringResponse.createdAt)
            && Objects.equals(this.updatedAt, rejectVpcPeeringResponse.updatedAt)
            && Objects.equals(this.description, rejectVpcPeeringResponse.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, requestVpcInfo, acceptVpcInfo, createdAt, updatedAt, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RejectVpcPeeringResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requestVpcInfo: ").append(toIndentedString(requestVpcInfo)).append("\n");
        sb.append("    acceptVpcInfo: ").append(toIndentedString(acceptVpcInfo)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
