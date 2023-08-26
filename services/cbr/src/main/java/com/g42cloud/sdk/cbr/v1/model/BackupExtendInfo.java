package com.g42cloud.sdk.cbr.v1.model;

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
 * BackupExtendInfo
 */
public class BackupExtendInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    private Boolean bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_lld")

    private Boolean supportLld;

    public static final class SupportedRestoreModeEnum {

        /**
         * Enum NA for value: "na"
         */
        public static final SupportedRestoreModeEnum NA = new SupportedRestoreModeEnum("na");

        /**
         * Enum _BACKUP for value: " backup"
         */
        public static final SupportedRestoreModeEnum _BACKUP = new SupportedRestoreModeEnum(" backup");

        /**
         * Enum _SNAPSHOT for value: " snapshot"
         */
        public static final SupportedRestoreModeEnum _SNAPSHOT = new SupportedRestoreModeEnum(" snapshot");

        private static final Map<String, SupportedRestoreModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedRestoreModeEnum> createStaticFields() {
            Map<String, SupportedRestoreModeEnum> map = new HashMap<>();
            map.put("na", NA);
            map.put(" backup", _BACKUP);
            map.put(" snapshot", _SNAPSHOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedRestoreModeEnum(String value) {
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
        public static SupportedRestoreModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedRestoreModeEnum(value));
        }

        public static SupportedRestoreModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedRestoreModeEnum) {
                return this.value.equals(((SupportedRestoreModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_restore_mode")

    private SupportedRestoreModeEnum supportedRestoreMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_images_data")

    private List<ImageData> osImagesData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_system_disk")

    private Boolean containSystemDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk")

    private Boolean systemDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    public BackupExtendInfo withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public BackupExtendInfo withBootable(Boolean bootable) {
        this.bootable = bootable;
        return this;
    }

    public Boolean getBootable() {
        return bootable;
    }

    public void setBootable(Boolean bootable) {
        this.bootable = bootable;
    }

    public BackupExtendInfo withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    public BackupExtendInfo withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public BackupExtendInfo withSupportLld(Boolean supportLld) {
        this.supportLld = supportLld;
        return this;
    }

    public Boolean getSupportLld() {
        return supportLld;
    }

    public void setSupportLld(Boolean supportLld) {
        this.supportLld = supportLld;
    }

    public BackupExtendInfo withSupportedRestoreMode(SupportedRestoreModeEnum supportedRestoreMode) {
        this.supportedRestoreMode = supportedRestoreMode;
        return this;
    }

    public SupportedRestoreModeEnum getSupportedRestoreMode() {
        return supportedRestoreMode;
    }

    public void setSupportedRestoreMode(SupportedRestoreModeEnum supportedRestoreMode) {
        this.supportedRestoreMode = supportedRestoreMode;
    }

    public BackupExtendInfo withOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
        return this;
    }

    public BackupExtendInfo addOsImagesDataItem(ImageData osImagesDataItem) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        this.osImagesData.add(osImagesDataItem);
        return this;
    }

    public BackupExtendInfo withOsImagesData(Consumer<List<ImageData>> osImagesDataSetter) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        osImagesDataSetter.accept(this.osImagesData);
        return this;
    }

    public List<ImageData> getOsImagesData() {
        return osImagesData;
    }

    public void setOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
    }

    public BackupExtendInfo withContainSystemDisk(Boolean containSystemDisk) {
        this.containSystemDisk = containSystemDisk;
        return this;
    }

    public Boolean getContainSystemDisk() {
        return containSystemDisk;
    }

    public void setContainSystemDisk(Boolean containSystemDisk) {
        this.containSystemDisk = containSystemDisk;
    }

    public BackupExtendInfo withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public BackupExtendInfo withSystemDisk(Boolean systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    public Boolean getSystemDisk() {
        return systemDisk;
    }

    public void setSystemDisk(Boolean systemDisk) {
        this.systemDisk = systemDisk;
    }

    public BackupExtendInfo withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupExtendInfo that = (BackupExtendInfo) obj;
        return Objects.equals(this.autoTrigger, that.autoTrigger) && Objects.equals(this.bootable, that.bootable)
            && Objects.equals(this.incremental, that.incremental) && Objects.equals(this.snapshotId, that.snapshotId)
            && Objects.equals(this.supportLld, that.supportLld)
            && Objects.equals(this.supportedRestoreMode, that.supportedRestoreMode)
            && Objects.equals(this.osImagesData, that.osImagesData)
            && Objects.equals(this.containSystemDisk, that.containSystemDisk)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.systemDisk, that.systemDisk)
            && Objects.equals(this.isMultiAz, that.isMultiAz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger,
            bootable,
            incremental,
            snapshotId,
            supportLld,
            supportedRestoreMode,
            osImagesData,
            containSystemDisk,
            encrypted,
            systemDisk,
            isMultiAz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupExtendInfo {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    supportLld: ").append(toIndentedString(supportLld)).append("\n");
        sb.append("    supportedRestoreMode: ").append(toIndentedString(supportedRestoreMode)).append("\n");
        sb.append("    osImagesData: ").append(toIndentedString(osImagesData)).append("\n");
        sb.append("    containSystemDisk: ").append(toIndentedString(containSystemDisk)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    systemDisk: ").append(toIndentedString(systemDisk)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
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
