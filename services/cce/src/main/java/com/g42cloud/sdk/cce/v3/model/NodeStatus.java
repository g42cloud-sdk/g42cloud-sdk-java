package com.g42cloud.sdk.cce.v3.model;

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
public class NodeStatus {

    public static final class PhaseEnum {

        /**
         * Enum BUILD for value: "Build"
         */
        public static final PhaseEnum BUILD = new PhaseEnum("Build");

        /**
         * Enum INSTALLING for value: "Installing"
         */
        public static final PhaseEnum INSTALLING = new PhaseEnum("Installing");

        /**
         * Enum INSTALLED for value: "Installed"
         */
        public static final PhaseEnum INSTALLED = new PhaseEnum("Installed");

        /**
         * Enum SHUTDOWN for value: "ShutDown"
         */
        public static final PhaseEnum SHUTDOWN = new PhaseEnum("ShutDown");

        /**
         * Enum UPGRADING for value: "Upgrading"
         */
        public static final PhaseEnum UPGRADING = new PhaseEnum("Upgrading");

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final PhaseEnum ACTIVE = new PhaseEnum("Active");

        /**
         * Enum ABNORMAL for value: "Abnormal"
         */
        public static final PhaseEnum ABNORMAL = new PhaseEnum("Abnormal");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final PhaseEnum DELETING = new PhaseEnum("Deleting");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final PhaseEnum ERROR = new PhaseEnum("Error");

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("Build", BUILD);
            map.put("Installing", INSTALLING);
            map.put("Installed", INSTALLED);
            map.put("ShutDown", SHUTDOWN);
            map.put("Upgrading", UPGRADING);
            map.put("Active", ACTIVE);
            map.put("Abnormal", ABNORMAL);
            map.put("Deleting", DELETING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
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
        public static PhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PhaseEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PhaseEnum(value);
            }
            return result;
        }

        public static PhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PhaseEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private PhaseEnum phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIP")

    private String privateIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIPv6IP")

    private String privateIPv6IP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIP")

    private String publicIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteStatus")

    private DeleteStatus deleteStatus;

    public NodeStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    public NodeStatus withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public NodeStatus withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NodeStatus withPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }

    public String getPrivateIP() {
        return privateIP;
    }

    public void setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
    }

    public NodeStatus withPrivateIPv6IP(String privateIPv6IP) {
        this.privateIPv6IP = privateIPv6IP;
        return this;
    }

    public String getPrivateIPv6IP() {
        return privateIPv6IP;
    }

    public void setPrivateIPv6IP(String privateIPv6IP) {
        this.privateIPv6IP = privateIPv6IP;
    }

    public NodeStatus withPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    public String getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(String publicIP) {
        this.publicIP = publicIP;
    }

    public NodeStatus withDeleteStatus(DeleteStatus deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    public NodeStatus withDeleteStatus(Consumer<DeleteStatus> deleteStatusSetter) {
        if (this.deleteStatus == null) {
            this.deleteStatus = new DeleteStatus();
            deleteStatusSetter.accept(this.deleteStatus);
        }

        return this;
    }

    public DeleteStatus getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(DeleteStatus deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeStatus nodeStatus = (NodeStatus) o;
        return Objects.equals(this.phase, nodeStatus.phase) && Objects.equals(this.jobID, nodeStatus.jobID)
            && Objects.equals(this.serverId, nodeStatus.serverId)
            && Objects.equals(this.privateIP, nodeStatus.privateIP)
            && Objects.equals(this.privateIPv6IP, nodeStatus.privateIPv6IP)
            && Objects.equals(this.publicIP, nodeStatus.publicIP)
            && Objects.equals(this.deleteStatus, nodeStatus.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, jobID, serverId, privateIP, privateIPv6IP, publicIP, deleteStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    privateIP: ").append(toIndentedString(privateIP)).append("\n");
        sb.append("    privateIPv6IP: ").append(toIndentedString(privateIPv6IP)).append("\n");
        sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
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
