package com.g42cloud.sdk.cce.v3.model;

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
public class PersistentVolumeClaimSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeID")

    private String volumeID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageType")

    private String storageType;

    public static final class AccessModesEnum {

        /**
         * Enum READONLYMANY for value: "ReadOnlyMany"
         */
        public static final AccessModesEnum READONLYMANY = new AccessModesEnum("ReadOnlyMany");

        /**
         * Enum READWRITEMANY for value: "ReadWriteMany"
         */
        public static final AccessModesEnum READWRITEMANY = new AccessModesEnum("ReadWriteMany");

        private static final Map<String, AccessModesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModesEnum> createStaticFields() {
            Map<String, AccessModesEnum> map = new HashMap<>();
            map.put("ReadOnlyMany", READONLYMANY);
            map.put("ReadWriteMany", READWRITEMANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModesEnum(String value) {
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
        public static AccessModesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModesEnum(value));
        }

        public static AccessModesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModesEnum) {
                return this.value.equals(((AccessModesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessModes")

    private List<AccessModesEnum> accessModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageClassName")

    private String storageClassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeName")

    private String volumeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private ResourceRequirements resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeMode")

    private String volumeMode;

    public PersistentVolumeClaimSpec withVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
    }

    public PersistentVolumeClaimSpec withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public PersistentVolumeClaimSpec withAccessModes(List<AccessModesEnum> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimSpec addAccessModesItem(AccessModesEnum accessModesItem) {
        if (this.accessModes == null) {
            this.accessModes = new ArrayList<>();
        }
        this.accessModes.add(accessModesItem);
        return this;
    }

    public PersistentVolumeClaimSpec withAccessModes(Consumer<List<AccessModesEnum>> accessModesSetter) {
        if (this.accessModes == null) {
            this.accessModes = new ArrayList<>();
        }
        accessModesSetter.accept(this.accessModes);
        return this;
    }

    public List<AccessModesEnum> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(List<AccessModesEnum> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeClaimSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public PersistentVolumeClaimSpec withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public PersistentVolumeClaimSpec withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public PersistentVolumeClaimSpec withResources(Consumer<ResourceRequirements> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ResourceRequirements();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    public PersistentVolumeClaimSpec withVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentVolumeClaimSpec that = (PersistentVolumeClaimSpec) obj;
        return Objects.equals(this.volumeID, that.volumeID) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.accessModes, that.accessModes)
            && Objects.equals(this.storageClassName, that.storageClassName)
            && Objects.equals(this.volumeName, that.volumeName) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.volumeMode, that.volumeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeID, storageType, accessModes, storageClassName, volumeName, resources, volumeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentVolumeClaimSpec {\n");
        sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
        sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
        sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
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
