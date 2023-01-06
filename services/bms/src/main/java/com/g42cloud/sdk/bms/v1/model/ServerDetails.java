package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * server字段数据结构说明
 */
public class ServerDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private OffsetDateTime created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private OffsetDateTime updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<AddressInfo>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ImageInfo image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInfos flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupsList> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv4")

    private String accessIPv4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv6")

    private String accessIPv6;

    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final StatusEnum REBOOT = new StatusEnum("REBOOT");

        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("ERROR", ERROR);
            map.put("REBOOT", REBOOT);
            map.put("SHUTOFF", SHUTOFF);
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
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_drive")

    private String configDrive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetadataList metadata;

    public static final class OsEXTSTSTaskStateEnum {

        /**
         * Enum REBOOTING for value: "rebooting"
         */
        public static final OsEXTSTSTaskStateEnum REBOOTING = new OsEXTSTSTaskStateEnum("rebooting");

        /**
         * Enum REBOOT_STARTED for value: "reboot_started"
         */
        public static final OsEXTSTSTaskStateEnum REBOOT_STARTED = new OsEXTSTSTaskStateEnum("reboot_started");

        /**
         * Enum REBOOT_STARTED_HARD for value: "reboot_started_hard"
         */
        public static final OsEXTSTSTaskStateEnum REBOOT_STARTED_HARD =
            new OsEXTSTSTaskStateEnum("reboot_started_hard");

        /**
         * Enum POWERING_OFF for value: "powering-off"
         */
        public static final OsEXTSTSTaskStateEnum POWERING_OFF = new OsEXTSTSTaskStateEnum("powering-off");

        /**
         * Enum POWERING_ON for value: "powering-on"
         */
        public static final OsEXTSTSTaskStateEnum POWERING_ON = new OsEXTSTSTaskStateEnum("powering-on");

        /**
         * Enum REBUILDING for value: "rebuilding"
         */
        public static final OsEXTSTSTaskStateEnum REBUILDING = new OsEXTSTSTaskStateEnum("rebuilding");

        /**
         * Enum SCHEDULING for value: "scheduling"
         */
        public static final OsEXTSTSTaskStateEnum SCHEDULING = new OsEXTSTSTaskStateEnum("scheduling");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final OsEXTSTSTaskStateEnum DELETING = new OsEXTSTSTaskStateEnum("deleting");

        private static final Map<String, OsEXTSTSTaskStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSTaskStateEnum> createStaticFields() {
            Map<String, OsEXTSTSTaskStateEnum> map = new HashMap<>();
            map.put("rebooting", REBOOTING);
            map.put("reboot_started", REBOOT_STARTED);
            map.put("reboot_started_hard", REBOOT_STARTED_HARD);
            map.put("powering-off", POWERING_OFF);
            map.put("powering-on", POWERING_ON);
            map.put("rebuilding", REBUILDING);
            map.put("scheduling", SCHEDULING);
            map.put("deleting", DELETING);
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
         * Enum ACTIVE for value: "active"
         */
        public static final OsEXTSTSVmStateEnum ACTIVE = new OsEXTSTSVmStateEnum("active");

        /**
         * Enum SHUTOFF for value: "shutoff"
         */
        public static final OsEXTSTSVmStateEnum SHUTOFF = new OsEXTSTSVmStateEnum("shutoff");

        /**
         * Enum SUSPENDED for value: "suspended"
         */
        public static final OsEXTSTSVmStateEnum SUSPENDED = new OsEXTSTSVmStateEnum("suspended");

        /**
         * Enum REBOOT for value: "reboot"
         */
        public static final OsEXTSTSVmStateEnum REBOOT = new OsEXTSTSVmStateEnum("reboot");

        private static final Map<String, OsEXTSTSVmStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSVmStateEnum> createStaticFields() {
            Map<String, OsEXTSTSVmStateEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("shutoff", SHUTOFF);
            map.put("suspended", SUSPENDED);
            map.put("reboot", REBOOT);
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
    @JsonProperty(value = "OS-EXT-SRV-ATTR:host")

    private String osEXTSRVATTRHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:instance_name")

    private String osEXTSRVATTRInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:power_state")

    private Integer osEXTSTSPowerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hypervisor_hostname")

    private String osEXTSRVATTRHypervisorHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-AZ:availability_zone")

    private String osEXTAZAvailabilityZone;

    public static final class OsDCFDiskConfigEnum {

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        private static final Map<String, OsDCFDiskConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsDCFDiskConfigEnum> createStaticFields() {
            Map<String, OsDCFDiskConfigEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("AUTO", AUTO);
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
    @JsonProperty(value = "fault")

    private Fault fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:launched_at")

    private OffsetDateTime osSRVUSGLaunchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:terminated_at")

    private OffsetDateTime osSRVUSGTerminatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-volumes:volumes_attached")

    private List<OsExtendedVolumesInfo> osExtendedVolumesVolumesAttached = null;

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

    private UUID osEXTSRVATTRKernelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:ramdisk_id")

    private UUID osEXTSRVATTRRamdiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:root_device_name")

    private String osEXTSRVATTRRootDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:user_data")

    private String osEXTSRVATTRUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private SchedulerHints osSchedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SystemTags> sysTags = null;

    public ServerDetails withId(UUID id) {
        this.id = id;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ServerDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ServerDetails withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerDetails withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public ServerDetails withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public ServerDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ServerDetails withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ServerDetails withAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public ServerDetails putAddressesItem(String key, List<AddressInfo> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public ServerDetails withAddresses(Consumer<Map<String, List<AddressInfo>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    public Map<String, List<AddressInfo>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
    }

    public ServerDetails withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public ServerDetails withImage(ImageInfo image) {
        this.image = image;
        return this;
    }

    public ServerDetails withImage(Consumer<ImageInfo> imageSetter) {
        if (this.image == null) {
            this.image = new ImageInfo();
            imageSetter.accept(this.image);
        }

        return this;
    }

    public ImageInfo getImage() {
        return image;
    }

    public void setImage(ImageInfo image) {
        this.image = image;
    }

    public ServerDetails withFlavor(FlavorInfos flavor) {
        this.flavor = flavor;
        return this;
    }

    public ServerDetails withFlavor(Consumer<FlavorInfos> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInfos();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    public FlavorInfos getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfos flavor) {
        this.flavor = flavor;
    }

    public ServerDetails withSecurityGroups(List<SecurityGroupsList> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ServerDetails addSecurityGroupsItem(SecurityGroupsList securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ServerDetails withSecurityGroups(Consumer<List<SecurityGroupsList>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<SecurityGroupsList> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsList> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ServerDetails withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public ServerDetails withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public ServerDetails withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ServerDetails withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ServerDetails withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public ServerDetails withMetadata(MetadataList metadata) {
        this.metadata = metadata;
        return this;
    }

    public ServerDetails withMetadata(Consumer<MetadataList> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetadataList();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public MetadataList getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataList metadata) {
        this.metadata = metadata;
    }

    public ServerDetails withOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    public OsEXTSTSTaskStateEnum getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public ServerDetails withOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    public OsEXTSTSVmStateEnum getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public ServerDetails withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public ServerDetails withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    public ServerDetails withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public ServerDetails withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public ServerDetails withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    public ServerDetails withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public ServerDetails withFault(Fault fault) {
        this.fault = fault;
        return this;
    }

    public ServerDetails withFault(Consumer<Fault> faultSetter) {
        if (this.fault == null) {
            this.fault = new Fault();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    public Fault getFault() {
        return fault;
    }

    public void setFault(Fault fault) {
        this.fault = fault;
    }

    public ServerDetails withOsSRVUSGLaunchedAt(OffsetDateTime osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    public OffsetDateTime getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(OffsetDateTime osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public ServerDetails withOsSRVUSGTerminatedAt(OffsetDateTime osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    public OffsetDateTime getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(OffsetDateTime osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public ServerDetails withOsExtendedVolumesVolumesAttached(
        List<OsExtendedVolumesInfo> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    public ServerDetails addOsExtendedVolumesVolumesAttachedItem(
        OsExtendedVolumesInfo osExtendedVolumesVolumesAttachedItem) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public ServerDetails withOsExtendedVolumesVolumesAttached(
        Consumer<List<OsExtendedVolumesInfo>> osExtendedVolumesVolumesAttachedSetter) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    public List<OsExtendedVolumesInfo> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<OsExtendedVolumesInfo> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public ServerDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServerDetails withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ServerDetails withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public ServerDetails withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public ServerDetails withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public ServerDetails withOsEXTSRVATTRKernelId(UUID osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    public UUID getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(UUID osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    public ServerDetails withOsEXTSRVATTRRamdiskId(UUID osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    public UUID getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(UUID osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    public ServerDetails withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public ServerDetails withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public ServerDetails withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public ServerDetails withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ServerDetails addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServerDetails withTags(Consumer<List<String>> tagsSetter) {
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

    public ServerDetails withOsSchedulerHints(SchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public ServerDetails withOsSchedulerHints(Consumer<SchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new SchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public SchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(SchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public ServerDetails withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ServerDetails withSysTags(List<SystemTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ServerDetails addSysTagsItem(SystemTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ServerDetails withSysTags(Consumer<List<SystemTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    public List<SystemTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SystemTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerDetails serverDetails = (ServerDetails) o;
        return Objects.equals(this.id, serverDetails.id) && Objects.equals(this.userId, serverDetails.userId)
            && Objects.equals(this.name, serverDetails.name) && Objects.equals(this.created, serverDetails.created)
            && Objects.equals(this.updated, serverDetails.updated)
            && Objects.equals(this.tenantId, serverDetails.tenantId)
            && Objects.equals(this.hostId, serverDetails.hostId)
            && Objects.equals(this.addresses, serverDetails.addresses)
            && Objects.equals(this.keyName, serverDetails.keyName) && Objects.equals(this.image, serverDetails.image)
            && Objects.equals(this.flavor, serverDetails.flavor)
            && Objects.equals(this.securityGroups, serverDetails.securityGroups)
            && Objects.equals(this.accessIPv4, serverDetails.accessIPv4)
            && Objects.equals(this.accessIPv6, serverDetails.accessIPv6)
            && Objects.equals(this.status, serverDetails.status)
            && Objects.equals(this.progress, serverDetails.progress)
            && Objects.equals(this.configDrive, serverDetails.configDrive)
            && Objects.equals(this.metadata, serverDetails.metadata)
            && Objects.equals(this.osEXTSTSTaskState, serverDetails.osEXTSTSTaskState)
            && Objects.equals(this.osEXTSTSVmState, serverDetails.osEXTSTSVmState)
            && Objects.equals(this.osEXTSRVATTRHost, serverDetails.osEXTSRVATTRHost)
            && Objects.equals(this.osEXTSRVATTRInstanceName, serverDetails.osEXTSRVATTRInstanceName)
            && Objects.equals(this.osEXTSTSPowerState, serverDetails.osEXTSTSPowerState)
            && Objects.equals(this.osEXTSRVATTRHypervisorHostname, serverDetails.osEXTSRVATTRHypervisorHostname)
            && Objects.equals(this.osEXTAZAvailabilityZone, serverDetails.osEXTAZAvailabilityZone)
            && Objects.equals(this.osDCFDiskConfig, serverDetails.osDCFDiskConfig)
            && Objects.equals(this.fault, serverDetails.fault)
            && Objects.equals(this.osSRVUSGLaunchedAt, serverDetails.osSRVUSGLaunchedAt)
            && Objects.equals(this.osSRVUSGTerminatedAt, serverDetails.osSRVUSGTerminatedAt)
            && Objects.equals(this.osExtendedVolumesVolumesAttached, serverDetails.osExtendedVolumesVolumesAttached)
            && Objects.equals(this.description, serverDetails.description)
            && Objects.equals(this.hostStatus, serverDetails.hostStatus)
            && Objects.equals(this.osEXTSRVATTRHostname, serverDetails.osEXTSRVATTRHostname)
            && Objects.equals(this.osEXTSRVATTRReservationId, serverDetails.osEXTSRVATTRReservationId)
            && Objects.equals(this.osEXTSRVATTRLaunchIndex, serverDetails.osEXTSRVATTRLaunchIndex)
            && Objects.equals(this.osEXTSRVATTRKernelId, serverDetails.osEXTSRVATTRKernelId)
            && Objects.equals(this.osEXTSRVATTRRamdiskId, serverDetails.osEXTSRVATTRRamdiskId)
            && Objects.equals(this.osEXTSRVATTRRootDeviceName, serverDetails.osEXTSRVATTRRootDeviceName)
            && Objects.equals(this.osEXTSRVATTRUserData, serverDetails.osEXTSRVATTRUserData)
            && Objects.equals(this.locked, serverDetails.locked) && Objects.equals(this.tags, serverDetails.tags)
            && Objects.equals(this.osSchedulerHints, serverDetails.osSchedulerHints)
            && Objects.equals(this.enterpriseProjectId, serverDetails.enterpriseProjectId)
            && Objects.equals(this.sysTags, serverDetails.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userId,
            name,
            created,
            updated,
            tenantId,
            hostId,
            addresses,
            keyName,
            image,
            flavor,
            securityGroups,
            accessIPv4,
            accessIPv6,
            status,
            progress,
            configDrive,
            metadata,
            osEXTSTSTaskState,
            osEXTSTSVmState,
            osEXTSRVATTRHost,
            osEXTSRVATTRInstanceName,
            osEXTSTSPowerState,
            osEXTSRVATTRHypervisorHostname,
            osEXTAZAvailabilityZone,
            osDCFDiskConfig,
            fault,
            osSRVUSGLaunchedAt,
            osSRVUSGTerminatedAt,
            osExtendedVolumesVolumesAttached,
            description,
            hostStatus,
            osEXTSRVATTRHostname,
            osEXTSRVATTRReservationId,
            osEXTSRVATTRLaunchIndex,
            osEXTSRVATTRKernelId,
            osEXTSRVATTRRamdiskId,
            osEXTSRVATTRRootDeviceName,
            osEXTSRVATTRUserData,
            locked,
            tags,
            osSchedulerHints,
            enterpriseProjectId,
            sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
        sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
        sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
        sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
        sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
        sb.append("    osEXTSRVATTRHypervisorHostname: ")
            .append(toIndentedString(osEXTSRVATTRHypervisorHostname))
            .append("\n");
        sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
        sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
        sb.append("    osExtendedVolumesVolumesAttached: ")
            .append(toIndentedString(osExtendedVolumesVolumesAttached))
            .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
        sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
        sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
        sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
        sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
        sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
        sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
