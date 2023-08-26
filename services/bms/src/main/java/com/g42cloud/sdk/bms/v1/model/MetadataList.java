package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * metadata数据结构说明
 */
public class MetadataList {

    public static final class ChargingModeEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final ChargingModeEnum _1 = new ChargingModeEnum("1");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.order_id")

    private String meteringOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.product_id")

    private String meteringProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private UUID vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.image_id")

    private UUID meteringImageId;

    public static final class MeteringImagetypeEnum {

        /**
         * Enum GOLD for value: "gold"
         */
        public static final MeteringImagetypeEnum GOLD = new MeteringImagetypeEnum("gold");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final MeteringImagetypeEnum PRIVATE = new MeteringImagetypeEnum("private");

        /**
         * Enum SHARED for value: "shared"
         */
        public static final MeteringImagetypeEnum SHARED = new MeteringImagetypeEnum("shared");

        private static final Map<String, MeteringImagetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MeteringImagetypeEnum> createStaticFields() {
            Map<String, MeteringImagetypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("private", PRIVATE);
            map.put("shared", SHARED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MeteringImagetypeEnum(String value) {
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
        public static MeteringImagetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MeteringImagetypeEnum(value));
        }

        public static MeteringImagetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MeteringImagetypeEnum) {
                return this.value.equals(((MeteringImagetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.imagetype")

    private MeteringImagetypeEnum meteringImagetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baremetalPortIDList")

    private String baremetalPortIDList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.resourcespeccode")

    private String meteringResourcespeccode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metering.resourcetype")

    private String meteringResourcetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_svc_userid")

    private String opSvcUserid;

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
    @JsonProperty(value = "__bms_support_evs")

    private String bmsSupportEvs;

    public static final class OsBitEnum {

        /**
         * Enum _32 for value: "32"
         */
        public static final OsBitEnum _32 = new OsBitEnum("32");

        /**
         * Enum _64 for value: "64"
         */
        public static final OsBitEnum _64 = new OsBitEnum("64");

        private static final Map<String, OsBitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsBitEnum> createStaticFields() {
            Map<String, OsBitEnum> map = new HashMap<>();
            map.put("32", _32);
            map.put("64", _64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsBitEnum(String value) {
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
        public static OsBitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsBitEnum(value));
        }

        public static OsBitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsBitEnum) {
                return this.value.equals(((OsBitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private OsBitEnum osBit;

    public MetadataList withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public MetadataList withMeteringOrderId(String meteringOrderId) {
        this.meteringOrderId = meteringOrderId;
        return this;
    }

    public String getMeteringOrderId() {
        return meteringOrderId;
    }

    public void setMeteringOrderId(String meteringOrderId) {
        this.meteringOrderId = meteringOrderId;
    }

    public MetadataList withMeteringProductId(String meteringProductId) {
        this.meteringProductId = meteringProductId;
        return this;
    }

    public String getMeteringProductId() {
        return meteringProductId;
    }

    public void setMeteringProductId(String meteringProductId) {
        this.meteringProductId = meteringProductId;
    }

    public MetadataList withVpcId(UUID vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public UUID getVpcId() {
        return vpcId;
    }

    public void setVpcId(UUID vpcId) {
        this.vpcId = vpcId;
    }

    public MetadataList withMeteringImageId(UUID meteringImageId) {
        this.meteringImageId = meteringImageId;
        return this;
    }

    public UUID getMeteringImageId() {
        return meteringImageId;
    }

    public void setMeteringImageId(UUID meteringImageId) {
        this.meteringImageId = meteringImageId;
    }

    public MetadataList withMeteringImagetype(MeteringImagetypeEnum meteringImagetype) {
        this.meteringImagetype = meteringImagetype;
        return this;
    }

    public MeteringImagetypeEnum getMeteringImagetype() {
        return meteringImagetype;
    }

    public void setMeteringImagetype(MeteringImagetypeEnum meteringImagetype) {
        this.meteringImagetype = meteringImagetype;
    }

    public MetadataList withBaremetalPortIDList(String baremetalPortIDList) {
        this.baremetalPortIDList = baremetalPortIDList;
        return this;
    }

    public String getBaremetalPortIDList() {
        return baremetalPortIDList;
    }

    public void setBaremetalPortIDList(String baremetalPortIDList) {
        this.baremetalPortIDList = baremetalPortIDList;
    }

    public MetadataList withMeteringResourcespeccode(String meteringResourcespeccode) {
        this.meteringResourcespeccode = meteringResourcespeccode;
        return this;
    }

    public String getMeteringResourcespeccode() {
        return meteringResourcespeccode;
    }

    public void setMeteringResourcespeccode(String meteringResourcespeccode) {
        this.meteringResourcespeccode = meteringResourcespeccode;
    }

    public MetadataList withMeteringResourcetype(String meteringResourcetype) {
        this.meteringResourcetype = meteringResourcetype;
        return this;
    }

    public String getMeteringResourcetype() {
        return meteringResourcetype;
    }

    public void setMeteringResourcetype(String meteringResourcetype) {
        this.meteringResourcetype = meteringResourcetype;
    }

    public MetadataList withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public MetadataList withOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
        return this;
    }

    public String getOpSvcUserid() {
        return opSvcUserid;
    }

    public void setOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
    }

    public MetadataList withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public MetadataList withBmsSupportEvs(String bmsSupportEvs) {
        this.bmsSupportEvs = bmsSupportEvs;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__bms_support_evs")
    public String getBmsSupportEvs() {
        return bmsSupportEvs;
    }

    public void setBmsSupportEvs(String bmsSupportEvs) {
        this.bmsSupportEvs = bmsSupportEvs;
    }

    public MetadataList withOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
        return this;
    }

    public OsBitEnum getOsBit() {
        return osBit;
    }

    public void setOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetadataList that = (MetadataList) obj;
        return Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.meteringOrderId, that.meteringOrderId)
            && Objects.equals(this.meteringProductId, that.meteringProductId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.meteringImageId, that.meteringImageId)
            && Objects.equals(this.meteringImagetype, that.meteringImagetype)
            && Objects.equals(this.baremetalPortIDList, that.baremetalPortIDList)
            && Objects.equals(this.meteringResourcespeccode, that.meteringResourcespeccode)
            && Objects.equals(this.meteringResourcetype, that.meteringResourcetype)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.opSvcUserid, that.opSvcUserid)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.bmsSupportEvs, that.bmsSupportEvs)
            && Objects.equals(this.osBit, that.osBit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            meteringOrderId,
            meteringProductId,
            vpcId,
            meteringImageId,
            meteringImagetype,
            baremetalPortIDList,
            meteringResourcespeccode,
            meteringResourcetype,
            imageName,
            opSvcUserid,
            osType,
            bmsSupportEvs,
            osBit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataList {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    meteringOrderId: ").append(toIndentedString(meteringOrderId)).append("\n");
        sb.append("    meteringProductId: ").append(toIndentedString(meteringProductId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    meteringImageId: ").append(toIndentedString(meteringImageId)).append("\n");
        sb.append("    meteringImagetype: ").append(toIndentedString(meteringImagetype)).append("\n");
        sb.append("    baremetalPortIDList: ").append(toIndentedString(baremetalPortIDList)).append("\n");
        sb.append("    meteringResourcespeccode: ").append(toIndentedString(meteringResourcespeccode)).append("\n");
        sb.append("    meteringResourcetype: ").append(toIndentedString(meteringResourcetype)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    opSvcUserid: ").append(toIndentedString(opSvcUserid)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    bmsSupportEvs: ").append(toIndentedString(bmsSupportEvs)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
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
