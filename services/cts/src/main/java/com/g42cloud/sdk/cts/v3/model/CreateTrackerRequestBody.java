package com.g42cloud.sdk.cts.v3.model;

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
 * CreateTrackerRequestBody
 */
public class CreateTrackerRequestBody {

    public static final class TrackerTypeEnum {

        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TrackerTypeEnum SYSTEM = new TrackerTypeEnum("system");

        /**
         * Enum DATA for value: "data"
         */
        public static final TrackerTypeEnum DATA = new TrackerTypeEnum("data");

        private static final Map<String, TrackerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrackerTypeEnum> createStaticFields() {
            Map<String, TrackerTypeEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("data", DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrackerTypeEnum(String value) {
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
        public static TrackerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TrackerTypeEnum(value));
        }

        public static TrackerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrackerTypeEnum) {
                return this.value.equals(((TrackerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_type")

    private TrackerTypeEnum trackerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_lts_enabled")

    private Boolean isLtsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private TrackerObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_trace_files_encryption")

    private Boolean isSupportTraceFilesEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_validate")

    private Boolean isSupportValidate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bucket")

    private DataBucket dataBucket;

    public CreateTrackerRequestBody withTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    public TrackerTypeEnum getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
    }

    public CreateTrackerRequestBody withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public CreateTrackerRequestBody withIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
        return this;
    }

    public Boolean getIsLtsEnabled() {
        return isLtsEnabled;
    }

    public void setIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
    }

    public CreateTrackerRequestBody withObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public CreateTrackerRequestBody withObsInfo(Consumer<TrackerObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new TrackerObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    public TrackerObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(TrackerObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public CreateTrackerRequestBody withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    public CreateTrackerRequestBody withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public CreateTrackerRequestBody withIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
        return this;
    }

    public Boolean getIsSupportValidate() {
        return isSupportValidate;
    }

    public void setIsSupportValidate(Boolean isSupportValidate) {
        this.isSupportValidate = isSupportValidate;
    }

    public CreateTrackerRequestBody withDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
        return this;
    }

    public CreateTrackerRequestBody withDataBucket(Consumer<DataBucket> dataBucketSetter) {
        if (this.dataBucket == null) {
            this.dataBucket = new DataBucket();
            dataBucketSetter.accept(this.dataBucket);
        }

        return this;
    }

    public DataBucket getDataBucket() {
        return dataBucket;
    }

    public void setDataBucket(DataBucket dataBucket) {
        this.dataBucket = dataBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrackerRequestBody that = (CreateTrackerRequestBody) obj;
        return Objects.equals(this.trackerType, that.trackerType) && Objects.equals(this.trackerName, that.trackerName)
            && Objects.equals(this.isLtsEnabled, that.isLtsEnabled) && Objects.equals(this.obsInfo, that.obsInfo)
            && Objects.equals(this.isSupportTraceFilesEncryption, that.isSupportTraceFilesEncryption)
            && Objects.equals(this.kmsId, that.kmsId) && Objects.equals(this.isSupportValidate, that.isSupportValidate)
            && Objects.equals(this.dataBucket, that.dataBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackerType,
            trackerName,
            isLtsEnabled,
            obsInfo,
            isSupportTraceFilesEncryption,
            kmsId,
            isSupportValidate,
            dataBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrackerRequestBody {\n");
        sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    isLtsEnabled: ").append(toIndentedString(isLtsEnabled)).append("\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    isSupportTraceFilesEncryption: ")
            .append(toIndentedString(isSupportTraceFilesEncryption))
            .append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    isSupportValidate: ").append(toIndentedString(isSupportValidate)).append("\n");
        sb.append("    dataBucket: ").append(toIndentedString(dataBucket)).append("\n");
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
