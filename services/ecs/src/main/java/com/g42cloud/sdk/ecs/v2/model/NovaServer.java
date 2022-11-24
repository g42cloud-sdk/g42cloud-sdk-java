package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 *  
 */
public class NovaServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum _BUILD for value: " BUILD"
         */
        public static final StatusEnum _BUILD = new StatusEnum(" BUILD");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum HARD_REBOOT for value: "HARD_REBOOT"
         */
        public static final StatusEnum HARD_REBOOT = new StatusEnum("HARD_REBOOT");

        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final StatusEnum REBOOT = new StatusEnum("REBOOT");

        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final StatusEnum RESIZE = new StatusEnum("RESIZE");

        /**
         * Enum REVERT_RESIZE for value: "REVERT_RESIZE"
         */
        public static final StatusEnum REVERT_RESIZE = new StatusEnum("REVERT_RESIZE");

        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final StatusEnum SHELVED = new StatusEnum("SHELVED");

        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final StatusEnum SHELVED_OFFLOADED = new StatusEnum("SHELVED_OFFLOADED");

        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("UNKNOWN");

        /**
         * Enum VERIFY_RESIZE for value: "VERIFY_RESIZE"
         */
        public static final StatusEnum VERIFY_RESIZE = new StatusEnum("VERIFY_RESIZE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put(" BUILD", _BUILD);
            map.put("DELETED", DELETED);
            map.put("ERROR", ERROR);
            map.put("HARD_REBOOT", HARD_REBOOT);
            map.put("MIGRATING", MIGRATING);
            map.put("REBOOT", REBOOT);
            map.put("RESIZE", RESIZE);
            map.put("REVERT_RESIZE", REVERT_RESIZE);
            map.put("SHELVED", SHELVED);
            map.put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
            map.put("SHUTOFF", SHUTOFF);
            map.put("UNKNOWN", UNKNOWN);
            map.put("VERIFY_RESIZE", VERIFY_RESIZE);
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
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private NovaServerFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private NovaServerImage image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<NovaNetwork>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<NovaServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<NovaLink> links = null;

    public static final class OsDCFDiskConfigEnum {

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        private static final Map<String, OsDCFDiskConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsDCFDiskConfigEnum> createStaticFields() {
            Map<String, OsDCFDiskConfigEnum> map = new HashMap<>();
            map.put("AUTO", AUTO);
            map.put("MANUAL", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsDCFDiskConfigEnum(String value) {
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
        public static OsDCFDiskConfigEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsDCFDiskConfigEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsDCFDiskConfigEnum(value);
            }
            return result;
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsDCFDiskConfigEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsDCFDiskConfigEnum) {
                return this.value.equals(((OsDCFDiskConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-DCF:diskConfig")

    private OsDCFDiskConfigEnum osDCFDiskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-AZ:availability_zone")

    private String osEXTAZAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:host")

    private String osEXTSRVATTRHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hypervisor_hostname")

    private String osEXTSRVATTRHypervisorHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:instance_name")

    private String osEXTSRVATTRInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:power_state")

    private Integer osEXTSTSPowerState;

    public static final class OsEXTSTSTaskStateEnum {

        /**
         * Enum SHOUTOFF for value: "SHOUTOFF"
         */
        public static final OsEXTSTSTaskStateEnum SHOUTOFF = new OsEXTSTSTaskStateEnum("SHOUTOFF");

        /**
         * Enum _RESIZE for value: " RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _RESIZE = new OsEXTSTSTaskStateEnum(" RESIZE");

        /**
         * Enum _REBUILD for value: " REBUILD"
         */
        public static final OsEXTSTSTaskStateEnum _REBUILD = new OsEXTSTSTaskStateEnum(" REBUILD");

        /**
         * Enum _VERIFY_RESIZE for value: " VERIFY_RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _VERIFY_RESIZE = new OsEXTSTSTaskStateEnum(" VERIFY_RESIZE");

        /**
         * Enum _REVERT_RESIZE for value: " REVERT_RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _REVERT_RESIZE = new OsEXTSTSTaskStateEnum(" REVERT_RESIZE");

        /**
         * Enum _PAUSED for value: " PAUSED"
         */
        public static final OsEXTSTSTaskStateEnum _PAUSED = new OsEXTSTSTaskStateEnum(" PAUSED");

        /**
         * Enum _MIGRATING for value: " MIGRATING"
         */
        public static final OsEXTSTSTaskStateEnum _MIGRATING = new OsEXTSTSTaskStateEnum(" MIGRATING");

        /**
         * Enum _SUSPENDED for value: " SUSPENDED"
         */
        public static final OsEXTSTSTaskStateEnum _SUSPENDED = new OsEXTSTSTaskStateEnum(" SUSPENDED");

        /**
         * Enum _RESCUE for value: " RESCUE"
         */
        public static final OsEXTSTSTaskStateEnum _RESCUE = new OsEXTSTSTaskStateEnum(" RESCUE");

        /**
         * Enum _ERROR for value: " ERROR"
         */
        public static final OsEXTSTSTaskStateEnum _ERROR = new OsEXTSTSTaskStateEnum(" ERROR");

        /**
         * Enum _DELETED for value: " DELETED"
         */
        public static final OsEXTSTSTaskStateEnum _DELETED = new OsEXTSTSTaskStateEnum(" DELETED");

        /**
         * Enum SOFT_DELETED for value: "SOFT_DELETED"
         */
        public static final OsEXTSTSTaskStateEnum SOFT_DELETED = new OsEXTSTSTaskStateEnum("SOFT_DELETED");

        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final OsEXTSTSTaskStateEnum SHELVED = new OsEXTSTSTaskStateEnum("SHELVED");

        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final OsEXTSTSTaskStateEnum SHELVED_OFFLOADED = new OsEXTSTSTaskStateEnum("SHELVED_OFFLOADED");

        private static final Map<String, OsEXTSTSTaskStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSTaskStateEnum> createStaticFields() {
            Map<String, OsEXTSTSTaskStateEnum> map = new HashMap<>();
            map.put("SHOUTOFF", SHOUTOFF);
            map.put(" RESIZE", _RESIZE);
            map.put(" REBUILD", _REBUILD);
            map.put(" VERIFY_RESIZE", _VERIFY_RESIZE);
            map.put(" REVERT_RESIZE", _REVERT_RESIZE);
            map.put(" PAUSED", _PAUSED);
            map.put(" MIGRATING", _MIGRATING);
            map.put(" SUSPENDED", _SUSPENDED);
            map.put(" RESCUE", _RESCUE);
            map.put(" ERROR", _ERROR);
            map.put(" DELETED", _DELETED);
            map.put("SOFT_DELETED", SOFT_DELETED);
            map.put("SHELVED", SHELVED);
            map.put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEXTSTSTaskStateEnum(String value) {
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
        public static OsEXTSTSTaskStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsEXTSTSTaskStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEXTSTSTaskStateEnum(value);
            }
            return result;
        }

        public static OsEXTSTSTaskStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsEXTSTSTaskStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEXTSTSTaskStateEnum) {
                return this.value.equals(((OsEXTSTSTaskStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:task_state")

    private OsEXTSTSTaskStateEnum osEXTSTSTaskState;

    public static final class OsEXTSTSVmStateEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final OsEXTSTSVmStateEnum ACTIVE = new OsEXTSTSVmStateEnum("ACTIVE");

        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final OsEXTSTSVmStateEnum BUILDING = new OsEXTSTSVmStateEnum("BUILDING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final OsEXTSTSVmStateEnum STOPPED = new OsEXTSTSVmStateEnum("STOPPED");

        /**
         * Enum RESIZED for value: "RESIZED"
         */
        public static final OsEXTSTSVmStateEnum RESIZED = new OsEXTSTSVmStateEnum("RESIZED");

        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final OsEXTSTSVmStateEnum PAUSED = new OsEXTSTSVmStateEnum("PAUSED");

        /**
         * Enum SUSPENDED for value: "SUSPENDED"
         */
        public static final OsEXTSTSVmStateEnum SUSPENDED = new OsEXTSTSVmStateEnum("SUSPENDED");

        /**
         * Enum RESCUED for value: "RESCUED"
         */
        public static final OsEXTSTSVmStateEnum RESCUED = new OsEXTSTSVmStateEnum("RESCUED");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final OsEXTSTSVmStateEnum ERROR = new OsEXTSTSVmStateEnum("ERROR");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final OsEXTSTSVmStateEnum DELETED = new OsEXTSTSVmStateEnum("DELETED");

        /**
         * Enum SOFT_DELETED for value: "SOFT_DELETED"
         */
        public static final OsEXTSTSVmStateEnum SOFT_DELETED = new OsEXTSTSVmStateEnum("SOFT_DELETED");

        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final OsEXTSTSVmStateEnum SHELVED = new OsEXTSTSVmStateEnum("SHELVED");

        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final OsEXTSTSVmStateEnum SHELVED_OFFLOADED = new OsEXTSTSVmStateEnum("SHELVED_OFFLOADED");

        private static final Map<String, OsEXTSTSVmStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSVmStateEnum> createStaticFields() {
            Map<String, OsEXTSTSVmStateEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILDING", BUILDING);
            map.put("STOPPED", STOPPED);
            map.put("RESIZED", RESIZED);
            map.put("PAUSED", PAUSED);
            map.put("SUSPENDED", SUSPENDED);
            map.put("RESCUED", RESCUED);
            map.put("ERROR", ERROR);
            map.put("DELETED", DELETED);
            map.put("SOFT_DELETED", SOFT_DELETED);
            map.put("SHELVED", SHELVED);
            map.put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEXTSTSVmStateEnum(String value) {
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
        public static OsEXTSTSVmStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsEXTSTSVmStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEXTSTSVmStateEnum(value);
            }
            return result;
        }

        public static OsEXTSTSVmStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsEXTSTSVmStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEXTSTSVmStateEnum) {
                return this.value.equals(((OsEXTSTSVmStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:vm_state")

    private OsEXTSTSVmStateEnum osEXTSTSVmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:launched_at")

    private String osSRVUSGLaunchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:terminated_at")

    private String osSRVUSGTerminatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-volumes:volumes_attached")

    private List<NovaServerVolume> osExtendedVolumesVolumesAttached = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private NovaServerFault fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public static final class HostStatusEnum {

        /**
         * Enum UP for value: "UP"
         */
        public static final HostStatusEnum UP = new HostStatusEnum("UP");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final HostStatusEnum UNKNOWN = new HostStatusEnum("UNKNOWN");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final HostStatusEnum DOWN = new HostStatusEnum("DOWN");

        /**
         * Enum MAINTENANCE for value: "MAINTENANCE"
         */
        public static final HostStatusEnum MAINTENANCE = new HostStatusEnum("MAINTENANCE");

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("UP", UP);
            map.put("UNKNOWN", UNKNOWN);
            map.put("DOWN", DOWN);
            map.put("MAINTENANCE", MAINTENANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostStatusEnum(String value) {
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
        public static HostStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostStatusEnum(value);
            }
            return result;
        }

        public static HostStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostStatusEnum) {
                return this.value.equals(((HostStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private HostStatusEnum hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hostname")

    private String osEXTSRVATTRHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:reservation_id")

    private String osEXTSRVATTRReservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:launch_index")

    private Integer osEXTSRVATTRLaunchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:kernel_id")

    private String osEXTSRVATTRKernelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:ramdisk_id")

    private String osEXTSRVATTRRamdiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:root_device_name")

    private String osEXTSRVATTRRootDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:user_data")

    private String osEXTSRVATTRUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv4")

    private String accessIPv4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv6")

    private String accessIPv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_drive")

    private String configDrive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private NovaServerSchedulerHints osSchedulerHints;

    public NovaServer withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovaServer withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaServer withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NovaServer withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public NovaServer withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public NovaServer withFlavor(NovaServerFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public NovaServer withFlavor(Consumer<NovaServerFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new NovaServerFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    public NovaServerFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(NovaServerFlavor flavor) {
        this.flavor = flavor;
    }

    public NovaServer withImage(NovaServerImage image) {
        this.image = image;
        return this;
    }

    public NovaServer withImage(Consumer<NovaServerImage> imageSetter) {
        if (this.image == null) {
            this.image = new NovaServerImage();
            imageSetter.accept(this.image);
        }

        return this;
    }

    public NovaServerImage getImage() {
        return image;
    }

    public void setImage(NovaServerImage image) {
        this.image = image;
    }

    public NovaServer withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NovaServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public NovaServer withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public NovaServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public NovaServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public NovaServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public NovaServer withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public NovaServer withAddresses(Map<String, List<NovaNetwork>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public NovaServer putAddressesItem(String key, List<NovaNetwork> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public NovaServer withAddresses(Consumer<Map<String, List<NovaNetwork>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    public Map<String, List<NovaNetwork>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<NovaNetwork>> addresses) {
        this.addresses = addresses;
    }

    public NovaServer withSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NovaServer addSecurityGroupsItem(NovaServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaServer withSecurityGroups(Consumer<List<NovaServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<NovaServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NovaServer withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    public NovaServer addLinksItem(NovaLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public NovaServer withLinks(Consumer<List<NovaLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaServer withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaServer withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    public NovaServer withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public NovaServer withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public NovaServer withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    public NovaServer withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public NovaServer withOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    public OsEXTSTSTaskStateEnum getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public NovaServer withOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    public OsEXTSTSVmStateEnum getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public NovaServer withOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    public String getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public NovaServer withOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    public String getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public NovaServer withOsExtendedVolumesVolumesAttached(List<NovaServerVolume> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    public NovaServer addOsExtendedVolumesVolumesAttachedItem(NovaServerVolume osExtendedVolumesVolumesAttachedItem) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public NovaServer withOsExtendedVolumesVolumesAttached(
        Consumer<List<NovaServerVolume>> osExtendedVolumesVolumesAttachedSetter) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    public List<NovaServerVolume> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<NovaServerVolume> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public NovaServer withFault(NovaServerFault fault) {
        this.fault = fault;
        return this;
    }

    public NovaServer withFault(Consumer<NovaServerFault> faultSetter) {
        if (this.fault == null) {
            this.fault = new NovaServerFault();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    public NovaServerFault getFault() {
        return fault;
    }

    public void setFault(NovaServerFault fault) {
        this.fault = fault;
    }

    public NovaServer withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NovaServer withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public NovaServer withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public NovaServer withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public NovaServer withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public NovaServer withOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    public String getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    public NovaServer withOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    public String getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    public NovaServer withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public NovaServer withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public NovaServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public NovaServer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public NovaServer withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public NovaServer withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public NovaServer withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public NovaServer withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public NovaServer withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public NovaServer withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public NovaServer withOsSchedulerHints(NovaServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public NovaServer withOsSchedulerHints(Consumer<NovaServerSchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new NovaServerSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public NovaServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(NovaServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServer novaServer = (NovaServer) o;
        return Objects.equals(this.name, novaServer.name) && Objects.equals(this.id, novaServer.id)
            && Objects.equals(this.status, novaServer.status) && Objects.equals(this.created, novaServer.created)
            && Objects.equals(this.updated, novaServer.updated) && Objects.equals(this.flavor, novaServer.flavor)
            && Objects.equals(this.image, novaServer.image) && Objects.equals(this.tenantId, novaServer.tenantId)
            && Objects.equals(this.keyName, novaServer.keyName) && Objects.equals(this.userId, novaServer.userId)
            && Objects.equals(this.metadata, novaServer.metadata) && Objects.equals(this.hostId, novaServer.hostId)
            && Objects.equals(this.addresses, novaServer.addresses)
            && Objects.equals(this.securityGroups, novaServer.securityGroups)
            && Objects.equals(this.links, novaServer.links)
            && Objects.equals(this.osDCFDiskConfig, novaServer.osDCFDiskConfig)
            && Objects.equals(this.osEXTAZAvailabilityZone, novaServer.osEXTAZAvailabilityZone)
            && Objects.equals(this.osEXTSRVATTRHost, novaServer.osEXTSRVATTRHost)
            && Objects.equals(this.osEXTSRVATTRHypervisorHostname, novaServer.osEXTSRVATTRHypervisorHostname)
            && Objects.equals(this.osEXTSRVATTRInstanceName, novaServer.osEXTSRVATTRInstanceName)
            && Objects.equals(this.osEXTSTSPowerState, novaServer.osEXTSTSPowerState)
            && Objects.equals(this.osEXTSTSTaskState, novaServer.osEXTSTSTaskState)
            && Objects.equals(this.osEXTSTSVmState, novaServer.osEXTSTSVmState)
            && Objects.equals(this.osSRVUSGLaunchedAt, novaServer.osSRVUSGLaunchedAt)
            && Objects.equals(this.osSRVUSGTerminatedAt, novaServer.osSRVUSGTerminatedAt)
            && Objects.equals(this.osExtendedVolumesVolumesAttached, novaServer.osExtendedVolumesVolumesAttached)
            && Objects.equals(this.fault, novaServer.fault) && Objects.equals(this.description, novaServer.description)
            && Objects.equals(this.hostStatus, novaServer.hostStatus)
            && Objects.equals(this.osEXTSRVATTRHostname, novaServer.osEXTSRVATTRHostname)
            && Objects.equals(this.osEXTSRVATTRReservationId, novaServer.osEXTSRVATTRReservationId)
            && Objects.equals(this.osEXTSRVATTRLaunchIndex, novaServer.osEXTSRVATTRLaunchIndex)
            && Objects.equals(this.osEXTSRVATTRKernelId, novaServer.osEXTSRVATTRKernelId)
            && Objects.equals(this.osEXTSRVATTRRamdiskId, novaServer.osEXTSRVATTRRamdiskId)
            && Objects.equals(this.osEXTSRVATTRRootDeviceName, novaServer.osEXTSRVATTRRootDeviceName)
            && Objects.equals(this.osEXTSRVATTRUserData, novaServer.osEXTSRVATTRUserData)
            && Objects.equals(this.tags, novaServer.tags) && Objects.equals(this.locked, novaServer.locked)
            && Objects.equals(this.accessIPv4, novaServer.accessIPv4)
            && Objects.equals(this.accessIPv6, novaServer.accessIPv6)
            && Objects.equals(this.configDrive, novaServer.configDrive)
            && Objects.equals(this.progress, novaServer.progress)
            && Objects.equals(this.osSchedulerHints, novaServer.osSchedulerHints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            status,
            created,
            updated,
            flavor,
            image,
            tenantId,
            keyName,
            userId,
            metadata,
            hostId,
            addresses,
            securityGroups,
            links,
            osDCFDiskConfig,
            osEXTAZAvailabilityZone,
            osEXTSRVATTRHost,
            osEXTSRVATTRHypervisorHostname,
            osEXTSRVATTRInstanceName,
            osEXTSTSPowerState,
            osEXTSTSTaskState,
            osEXTSTSVmState,
            osSRVUSGLaunchedAt,
            osSRVUSGTerminatedAt,
            osExtendedVolumesVolumesAttached,
            fault,
            description,
            hostStatus,
            osEXTSRVATTRHostname,
            osEXTSRVATTRReservationId,
            osEXTSRVATTRLaunchIndex,
            osEXTSRVATTRKernelId,
            osEXTSRVATTRRamdiskId,
            osEXTSRVATTRRootDeviceName,
            osEXTSRVATTRUserData,
            tags,
            locked,
            accessIPv4,
            accessIPv6,
            configDrive,
            progress,
            osSchedulerHints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServer {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
        sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
        sb.append("    osEXTSRVATTRHypervisorHostname: ")
            .append(toIndentedString(osEXTSRVATTRHypervisorHostname))
            .append("\n");
        sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
        sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
        sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
        sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
        sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
        sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
        sb.append("    osExtendedVolumesVolumesAttached: ")
            .append(toIndentedString(osExtendedVolumesVolumesAttached))
            .append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
        sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
        sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
        sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
        sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
        sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
        sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
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
