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
 * 快速通道创建镜像的请求体
 */
public class QuickImportImageByFileRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public static final class TypeEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final TypeEnum ECS = new TypeEnum("ECS");

        /**
         * Enum BMS for value: "BMS"
         */
        public static final TypeEnum BMS = new TypeEnum("BMS");

        /**
         * Enum DATAIMAGE for value: "DataImage"
         */
        public static final TypeEnum DATAIMAGE = new TypeEnum("DataImage");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("BMS", BMS);
            map.put("DataImage", DATAIMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public static final class ArchitectureEnum {

        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchitectureEnum X86 = new ArchitectureEnum("x86");

        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchitectureEnum ARM = new ArchitectureEnum("arm");

        private static final Map<String, ArchitectureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitectureEnum> createStaticFields() {
            Map<String, ArchitectureEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitectureEnum(String value) {
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
        public static ArchitectureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ArchitectureEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchitectureEnum(value);
            }
            return result;
        }

        public static ArchitectureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ArchitectureEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchitectureEnum) {
                return this.value.equals(((ArchitectureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private ArchitectureEnum architecture;

    public static final class OsTypeEnum {

        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Linux", LINUX);
            map.put("Windows", WINDOWS);
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
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "image_tags")

    private List<ResourceTag> imageTags = null;

    public QuickImportImageByFileRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuickImportImageByFileRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuickImportImageByFileRequestBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public QuickImportImageByFileRequestBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public QuickImportImageByFileRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public QuickImportImageByFileRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public QuickImportImageByFileRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QuickImportImageByFileRequestBody withTags(Consumer<List<String>> tagsSetter) {
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

    public QuickImportImageByFileRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public QuickImportImageByFileRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QuickImportImageByFileRequestBody withArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
        return this;
    }

    public ArchitectureEnum getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
    }

    public QuickImportImageByFileRequestBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public QuickImportImageByFileRequestBody withImageTags(List<ResourceTag> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    public QuickImportImageByFileRequestBody addImageTagsItem(ResourceTag imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public QuickImportImageByFileRequestBody withImageTags(Consumer<List<ResourceTag>> imageTagsSetter) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        imageTagsSetter.accept(this.imageTags);
        return this;
    }

    public List<ResourceTag> getImageTags() {
        return imageTags;
    }

    public void setImageTags(List<ResourceTag> imageTags) {
        this.imageTags = imageTags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuickImportImageByFileRequestBody quickImportImageByFileRequestBody = (QuickImportImageByFileRequestBody) o;
        return Objects.equals(this.name, quickImportImageByFileRequestBody.name)
            && Objects.equals(this.description, quickImportImageByFileRequestBody.description)
            && Objects.equals(this.osVersion, quickImportImageByFileRequestBody.osVersion)
            && Objects.equals(this.imageUrl, quickImportImageByFileRequestBody.imageUrl)
            && Objects.equals(this.minDisk, quickImportImageByFileRequestBody.minDisk)
            && Objects.equals(this.tags, quickImportImageByFileRequestBody.tags)
            && Objects.equals(this.type, quickImportImageByFileRequestBody.type)
            && Objects.equals(this.enterpriseProjectId, quickImportImageByFileRequestBody.enterpriseProjectId)
            && Objects.equals(this.architecture, quickImportImageByFileRequestBody.architecture)
            && Objects.equals(this.osType, quickImportImageByFileRequestBody.osType)
            && Objects.equals(this.imageTags, quickImportImageByFileRequestBody.imageTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            osVersion,
            imageUrl,
            minDisk,
            tags,
            type,
            enterpriseProjectId,
            architecture,
            osType,
            imageTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuickImportImageByFileRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
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
