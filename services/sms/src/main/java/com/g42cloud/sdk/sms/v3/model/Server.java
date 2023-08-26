package com.g42cloud.sdk.sms.v3.model;

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
 * 源端服务器
 */
public class Server {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    public static final class FirmwareEnum {

        /**
         * Enum BIOS for value: "BIOS"
         */
        public static final FirmwareEnum BIOS = new FirmwareEnum("BIOS");

        /**
         * Enum UEFI for value: "UEFI"
         */
        public static final FirmwareEnum UEFI = new FirmwareEnum("UEFI");

        private static final Map<String, FirmwareEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FirmwareEnum> createStaticFields() {
            Map<String, FirmwareEnum> map = new HashMap<>();
            map.put("BIOS", BIOS);
            map.put("UEFI", UEFI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FirmwareEnum(String value) {
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
        public static FirmwareEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FirmwareEnum(value));
        }

        public static FirmwareEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FirmwareEnum) {
                return this.value.equals(((FirmwareEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware")

    private FirmwareEnum firmware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_quantity")

    private Integer cpuQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<Disk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    private List<BtrfsFileSystem> btrfsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<NetWork> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_rsync")

    private Boolean hasRsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paravirtualization")

    private Boolean paravirtualization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_devices")

    private String rawDevices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_files")

    private Boolean driverFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_services")

    private Boolean systemServices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_rights")

    private Boolean accountRights;

    public static final class BootLoaderEnum {

        /**
         * Enum GRUB for value: "GRUB"
         */
        public static final BootLoaderEnum GRUB = new BootLoaderEnum("GRUB");

        /**
         * Enum LILO for value: "LILO"
         */
        public static final BootLoaderEnum LILO = new BootLoaderEnum("LILO");

        private static final Map<String, BootLoaderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BootLoaderEnum> createStaticFields() {
            Map<String, BootLoaderEnum> map = new HashMap<>();
            map.put("GRUB", GRUB);
            map.put("LILO", LILO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BootLoaderEnum(String value) {
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
        public static BootLoaderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BootLoaderEnum(value));
        }

        public static BootLoaderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BootLoaderEnum) {
                return this.value.equals(((BootLoaderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_loader")

    private BootLoaderEnum bootLoader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_dir")

    private String systemDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    private List<VolumeGroups> volumeGroups = null;

    public Server withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Server withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Server withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Server withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Server withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public Server withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Server withFirmware(FirmwareEnum firmware) {
        this.firmware = firmware;
        return this;
    }

    public FirmwareEnum getFirmware() {
        return firmware;
    }

    public void setFirmware(FirmwareEnum firmware) {
        this.firmware = firmware;
    }

    public Server withCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
        return this;
    }

    public Integer getCpuQuantity() {
        return cpuQuantity;
    }

    public void setCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }

    public Server withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Server withDisks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    public Server addDisksItem(Disk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public Server withDisks(Consumer<List<Disk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    public List<Disk> getDisks() {
        return disks;
    }

    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    public Server withBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public Server addBtrfsListItem(BtrfsFileSystem btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public Server withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    public List<BtrfsFileSystem> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
    }

    public Server withNetworks(List<NetWork> networks) {
        this.networks = networks;
        return this;
    }

    public Server addNetworksItem(NetWork networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public Server withNetworks(Consumer<List<NetWork>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    public List<NetWork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetWork> networks) {
        this.networks = networks;
    }

    public Server withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Server withHasRsync(Boolean hasRsync) {
        this.hasRsync = hasRsync;
        return this;
    }

    public Boolean getHasRsync() {
        return hasRsync;
    }

    public void setHasRsync(Boolean hasRsync) {
        this.hasRsync = hasRsync;
    }

    public Server withParavirtualization(Boolean paravirtualization) {
        this.paravirtualization = paravirtualization;
        return this;
    }

    public Boolean getParavirtualization() {
        return paravirtualization;
    }

    public void setParavirtualization(Boolean paravirtualization) {
        this.paravirtualization = paravirtualization;
    }

    public Server withRawDevices(String rawDevices) {
        this.rawDevices = rawDevices;
        return this;
    }

    public String getRawDevices() {
        return rawDevices;
    }

    public void setRawDevices(String rawDevices) {
        this.rawDevices = rawDevices;
    }

    public Server withDriverFiles(Boolean driverFiles) {
        this.driverFiles = driverFiles;
        return this;
    }

    public Boolean getDriverFiles() {
        return driverFiles;
    }

    public void setDriverFiles(Boolean driverFiles) {
        this.driverFiles = driverFiles;
    }

    public Server withSystemServices(Boolean systemServices) {
        this.systemServices = systemServices;
        return this;
    }

    public Boolean getSystemServices() {
        return systemServices;
    }

    public void setSystemServices(Boolean systemServices) {
        this.systemServices = systemServices;
    }

    public Server withAccountRights(Boolean accountRights) {
        this.accountRights = accountRights;
        return this;
    }

    public Boolean getAccountRights() {
        return accountRights;
    }

    public void setAccountRights(Boolean accountRights) {
        this.accountRights = accountRights;
    }

    public Server withBootLoader(BootLoaderEnum bootLoader) {
        this.bootLoader = bootLoader;
        return this;
    }

    public BootLoaderEnum getBootLoader() {
        return bootLoader;
    }

    public void setBootLoader(BootLoaderEnum bootLoader) {
        this.bootLoader = bootLoader;
    }

    public Server withSystemDir(String systemDir) {
        this.systemDir = systemDir;
        return this;
    }

    public String getSystemDir() {
        return systemDir;
    }

    public void setSystemDir(String systemDir) {
        this.systemDir = systemDir;
    }

    public Server withVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public Server addVolumeGroupsItem(VolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public Server withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Server that = (Server) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.name, that.name) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.firmware, that.firmware) && Objects.equals(this.cpuQuantity, that.cpuQuantity)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.disks, that.disks)
            && Objects.equals(this.btrfsList, that.btrfsList) && Objects.equals(this.networks, that.networks)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.hasRsync, that.hasRsync)
            && Objects.equals(this.paravirtualization, that.paravirtualization)
            && Objects.equals(this.rawDevices, that.rawDevices) && Objects.equals(this.driverFiles, that.driverFiles)
            && Objects.equals(this.systemServices, that.systemServices)
            && Objects.equals(this.accountRights, that.accountRights)
            && Objects.equals(this.bootLoader, that.bootLoader) && Objects.equals(this.systemDir, that.systemDir)
            && Objects.equals(this.volumeGroups, that.volumeGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ip,
            name,
            hostname,
            osType,
            osVersion,
            firmware,
            cpuQuantity,
            memory,
            disks,
            btrfsList,
            networks,
            domainId,
            hasRsync,
            paravirtualization,
            rawDevices,
            driverFiles,
            systemServices,
            accountRights,
            bootLoader,
            systemDir,
            volumeGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Server {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    cpuQuantity: ").append(toIndentedString(cpuQuantity)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    hasRsync: ").append(toIndentedString(hasRsync)).append("\n");
        sb.append("    paravirtualization: ").append(toIndentedString(paravirtualization)).append("\n");
        sb.append("    rawDevices: ").append(toIndentedString(rawDevices)).append("\n");
        sb.append("    driverFiles: ").append(toIndentedString(driverFiles)).append("\n");
        sb.append("    systemServices: ").append(toIndentedString(systemServices)).append("\n");
        sb.append("    accountRights: ").append(toIndentedString(accountRights)).append("\n");
        sb.append("    bootLoader: ").append(toIndentedString(bootLoader)).append("\n");
        sb.append("    systemDir: ").append(toIndentedString(systemDir)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
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
