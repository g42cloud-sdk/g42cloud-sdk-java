package com.g42cloud.sdk.ecs.v2.model;

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
 * 云服务器对应数据盘相关配置。
 */
public class PrePaidServerDataVolume {

    public static final class VolumetypeEnum {

        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final VolumetypeEnum GPSSD = new VolumetypeEnum("GPSSD");

        /**
         * Enum CO_P1 for value: "co-p1"
         */
        public static final VolumetypeEnum CO_P1 = new VolumetypeEnum("co-p1");

        /**
         * Enum UH_L1 for value: "uh-l1"
         */
        public static final VolumetypeEnum UH_L1 = new VolumetypeEnum("uh-l1");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final VolumetypeEnum ESSD = new VolumetypeEnum("ESSD");

        private static final Map<String, VolumetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumetypeEnum> createStaticFields() {
            Map<String, VolumetypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            map.put("co-p1", CO_P1);
            map.put("uh-l1", UH_L1);
            map.put("ESSD", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumetypeEnum(String value) {
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
        public static VolumetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumetypeEnum(value);
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumetype")

    private VolumetypeEnum volumetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private Boolean hwPassthrough;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PrePaidServerDataVolumeExtendParam extendparam;

    public static final class ClusterTypeEnum {

        /**
         * Enum DSS for value: "DSS"
         */
        public static final ClusterTypeEnum DSS = new ClusterTypeEnum("DSS");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("DSS", DSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
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
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ClusterTypeEnum(value);
            }
            return result;
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PrePaidServerDataVolumeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_image_id")

    private String dataImageId;

    public PrePaidServerDataVolume withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public PrePaidServerDataVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PrePaidServerDataVolume withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public PrePaidServerDataVolume withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public PrePaidServerDataVolume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    public PrePaidServerDataVolume withExtendparam(PrePaidServerDataVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PrePaidServerDataVolume withExtendparam(Consumer<PrePaidServerDataVolumeExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PrePaidServerDataVolumeExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public PrePaidServerDataVolumeExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PrePaidServerDataVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PrePaidServerDataVolume withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public PrePaidServerDataVolume withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public PrePaidServerDataVolume withMetadata(PrePaidServerDataVolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PrePaidServerDataVolume withMetadata(Consumer<PrePaidServerDataVolumeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PrePaidServerDataVolumeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public PrePaidServerDataVolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PrePaidServerDataVolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public PrePaidServerDataVolume withDataImageId(String dataImageId) {
        this.dataImageId = dataImageId;
        return this;
    }

    public String getDataImageId() {
        return dataImageId;
    }

    public void setDataImageId(String dataImageId) {
        this.dataImageId = dataImageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerDataVolume prePaidServerDataVolume = (PrePaidServerDataVolume) o;
        return Objects.equals(this.volumetype, prePaidServerDataVolume.volumetype)
            && Objects.equals(this.size, prePaidServerDataVolume.size)
            && Objects.equals(this.shareable, prePaidServerDataVolume.shareable)
            && Objects.equals(this.multiattach, prePaidServerDataVolume.multiattach)
            && Objects.equals(this.hwPassthrough, prePaidServerDataVolume.hwPassthrough)
            && Objects.equals(this.extendparam, prePaidServerDataVolume.extendparam)
            && Objects.equals(this.clusterType, prePaidServerDataVolume.clusterType)
            && Objects.equals(this.clusterId, prePaidServerDataVolume.clusterId)
            && Objects.equals(this.metadata, prePaidServerDataVolume.metadata)
            && Objects.equals(this.dataImageId, prePaidServerDataVolume.dataImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumetype,
            size,
            shareable,
            multiattach,
            hwPassthrough,
            extendparam,
            clusterType,
            clusterId,
            metadata,
            dataImageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerDataVolume {\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
        sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    dataImageId: ").append(toIndentedString(dataImageId)).append("\n");
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
