package com.g42cloud.sdk.ims.v2.model;

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
 * 创建镜像请求体
 */
public class GlanceCreateImageMetadataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_format")

    private String containerFormat;

    public static final class DiskFormatEnum {

        /**
         * Enum VHD for value: "vhd"
         */
        public static final DiskFormatEnum VHD = new DiskFormatEnum("vhd");

        /**
         * Enum ZVHD for value: "zvhd"
         */
        public static final DiskFormatEnum ZVHD = new DiskFormatEnum("zvhd");

        /**
         * Enum ZVHD2 for value: "zvhd2"
         */
        public static final DiskFormatEnum ZVHD2 = new DiskFormatEnum("zvhd2");

        /**
         * Enum RAW for value: "raw"
         */
        public static final DiskFormatEnum RAW = new DiskFormatEnum("raw");

        /**
         * Enum QCOW2 for value: "qcow2"
         */
        public static final DiskFormatEnum QCOW2 = new DiskFormatEnum("qcow2");

        private static final Map<String, DiskFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskFormatEnum> createStaticFields() {
            Map<String, DiskFormatEnum> map = new HashMap<>();
            map.put("vhd", VHD);
            map.put("zvhd", ZVHD);
            map.put("zvhd2", ZVHD2);
            map.put("raw", RAW);
            map.put("qcow2", QCOW2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DiskFormatEnum(String value) {
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
        public static DiskFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DiskFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DiskFormatEnum(value);
            }
            return result;
        }

        public static DiskFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DiskFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DiskFormatEnum) {
                return this.value.equals(((DiskFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_format")

    private DiskFormatEnum diskFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private Boolean _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    public GlanceCreateImageMetadataRequestBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public GlanceCreateImageMetadataRequestBody withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public GlanceCreateImageMetadataRequestBody withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public GlanceCreateImageMetadataRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public GlanceCreateImageMetadataRequestBody withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public GlanceCreateImageMetadataRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceCreateImageMetadataRequestBody withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public GlanceCreateImageMetadataRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public GlanceCreateImageMetadataRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GlanceCreateImageMetadataRequestBody withTags(Consumer<List<String>> tagsSetter) {
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

    public GlanceCreateImageMetadataRequestBody withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceCreateImageMetadataRequestBody glanceCreateImageMetadataRequestBody =
            (GlanceCreateImageMetadataRequestBody) o;
        return Objects.equals(this.osVersion, glanceCreateImageMetadataRequestBody.osVersion)
            && Objects.equals(this.containerFormat, glanceCreateImageMetadataRequestBody.containerFormat)
            && Objects.equals(this.diskFormat, glanceCreateImageMetadataRequestBody.diskFormat)
            && Objects.equals(this.minDisk, glanceCreateImageMetadataRequestBody.minDisk)
            && Objects.equals(this.minRam, glanceCreateImageMetadataRequestBody.minRam)
            && Objects.equals(this.name, glanceCreateImageMetadataRequestBody.name)
            && Objects.equals(this._protected, glanceCreateImageMetadataRequestBody._protected)
            && Objects.equals(this.tags, glanceCreateImageMetadataRequestBody.tags)
            && Objects.equals(this.visibility, glanceCreateImageMetadataRequestBody.visibility);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(osVersion, containerFormat, diskFormat, minDisk, minRam, name, _protected, tags, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceCreateImageMetadataRequestBody {\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
