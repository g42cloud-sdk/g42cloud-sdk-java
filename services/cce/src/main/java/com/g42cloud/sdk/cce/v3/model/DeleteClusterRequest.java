package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public static final class DeleteEfsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEfsEnum TRUE = new DeleteEfsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEfsEnum BLOCK = new DeleteEfsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEfsEnum TRY = new DeleteEfsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEfsEnum FALSE = new DeleteEfsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEfsEnum SKIP = new DeleteEfsEnum("skip");

        private static final Map<String, DeleteEfsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEfsEnum> createStaticFields() {
            Map<String, DeleteEfsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEfsEnum(String value) {
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
        public static DeleteEfsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteEfsEnum(value));
        }

        public static DeleteEfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEfsEnum) {
                return this.value.equals(((DeleteEfsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_efs")

    private DeleteEfsEnum deleteEfs;

    public static final class DeleteEniEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEniEnum TRUE = new DeleteEniEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEniEnum BLOCK = new DeleteEniEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEniEnum TRY = new DeleteEniEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEniEnum FALSE = new DeleteEniEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEniEnum SKIP = new DeleteEniEnum("skip");

        private static final Map<String, DeleteEniEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEniEnum> createStaticFields() {
            Map<String, DeleteEniEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEniEnum(String value) {
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
        public static DeleteEniEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteEniEnum(value));
        }

        public static DeleteEniEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEniEnum) {
                return this.value.equals(((DeleteEniEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_eni")

    private DeleteEniEnum deleteEni;

    public static final class DeleteEvsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteEvsEnum TRUE = new DeleteEvsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteEvsEnum BLOCK = new DeleteEvsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteEvsEnum TRY = new DeleteEvsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteEvsEnum FALSE = new DeleteEvsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteEvsEnum SKIP = new DeleteEvsEnum("skip");

        private static final Map<String, DeleteEvsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteEvsEnum> createStaticFields() {
            Map<String, DeleteEvsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteEvsEnum(String value) {
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
        public static DeleteEvsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteEvsEnum(value));
        }

        public static DeleteEvsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteEvsEnum) {
                return this.value.equals(((DeleteEvsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_evs")

    private DeleteEvsEnum deleteEvs;

    public static final class DeleteNetEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteNetEnum TRUE = new DeleteNetEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteNetEnum BLOCK = new DeleteNetEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteNetEnum TRY = new DeleteNetEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteNetEnum FALSE = new DeleteNetEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteNetEnum SKIP = new DeleteNetEnum("skip");

        private static final Map<String, DeleteNetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteNetEnum> createStaticFields() {
            Map<String, DeleteNetEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteNetEnum(String value) {
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
        public static DeleteNetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteNetEnum(value));
        }

        public static DeleteNetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteNetEnum) {
                return this.value.equals(((DeleteNetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_net")

    private DeleteNetEnum deleteNet;

    public static final class DeleteObsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteObsEnum TRUE = new DeleteObsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteObsEnum BLOCK = new DeleteObsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteObsEnum TRY = new DeleteObsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteObsEnum FALSE = new DeleteObsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteObsEnum SKIP = new DeleteObsEnum("skip");

        private static final Map<String, DeleteObsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteObsEnum> createStaticFields() {
            Map<String, DeleteObsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteObsEnum(String value) {
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
        public static DeleteObsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteObsEnum(value));
        }

        public static DeleteObsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteObsEnum) {
                return this.value.equals(((DeleteObsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_obs")

    private DeleteObsEnum deleteObs;

    public static final class DeleteSfsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteSfsEnum TRUE = new DeleteSfsEnum("true");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final DeleteSfsEnum BLOCK = new DeleteSfsEnum("block");

        /**
         * Enum TRY for value: "try"
         */
        public static final DeleteSfsEnum TRY = new DeleteSfsEnum("try");

        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteSfsEnum FALSE = new DeleteSfsEnum("false");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final DeleteSfsEnum SKIP = new DeleteSfsEnum("skip");

        private static final Map<String, DeleteSfsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteSfsEnum> createStaticFields() {
            Map<String, DeleteSfsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("block", BLOCK);
            map.put("try", TRY);
            map.put("false", FALSE);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteSfsEnum(String value) {
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
        public static DeleteSfsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteSfsEnum(value));
        }

        public static DeleteSfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteSfsEnum) {
                return this.value.equals(((DeleteSfsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_sfs")

    private DeleteSfsEnum deleteSfs;

    public static final class TobedeletedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final TobedeletedEnum TRUE = new TobedeletedEnum("true");

        private static final Map<String, TobedeletedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TobedeletedEnum> createStaticFields() {
            Map<String, TobedeletedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TobedeletedEnum(String value) {
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
        public static TobedeletedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TobedeletedEnum(value));
        }

        public static TobedeletedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TobedeletedEnum) {
                return this.value.equals(((TobedeletedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tobedeleted")

    private TobedeletedEnum tobedeleted;

    public DeleteClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteClusterRequest withDeleteEfs(DeleteEfsEnum deleteEfs) {
        this.deleteEfs = deleteEfs;
        return this;
    }

    public DeleteEfsEnum getDeleteEfs() {
        return deleteEfs;
    }

    public void setDeleteEfs(DeleteEfsEnum deleteEfs) {
        this.deleteEfs = deleteEfs;
    }

    public DeleteClusterRequest withDeleteEni(DeleteEniEnum deleteEni) {
        this.deleteEni = deleteEni;
        return this;
    }

    public DeleteEniEnum getDeleteEni() {
        return deleteEni;
    }

    public void setDeleteEni(DeleteEniEnum deleteEni) {
        this.deleteEni = deleteEni;
    }

    public DeleteClusterRequest withDeleteEvs(DeleteEvsEnum deleteEvs) {
        this.deleteEvs = deleteEvs;
        return this;
    }

    public DeleteEvsEnum getDeleteEvs() {
        return deleteEvs;
    }

    public void setDeleteEvs(DeleteEvsEnum deleteEvs) {
        this.deleteEvs = deleteEvs;
    }

    public DeleteClusterRequest withDeleteNet(DeleteNetEnum deleteNet) {
        this.deleteNet = deleteNet;
        return this;
    }

    public DeleteNetEnum getDeleteNet() {
        return deleteNet;
    }

    public void setDeleteNet(DeleteNetEnum deleteNet) {
        this.deleteNet = deleteNet;
    }

    public DeleteClusterRequest withDeleteObs(DeleteObsEnum deleteObs) {
        this.deleteObs = deleteObs;
        return this;
    }

    public DeleteObsEnum getDeleteObs() {
        return deleteObs;
    }

    public void setDeleteObs(DeleteObsEnum deleteObs) {
        this.deleteObs = deleteObs;
    }

    public DeleteClusterRequest withDeleteSfs(DeleteSfsEnum deleteSfs) {
        this.deleteSfs = deleteSfs;
        return this;
    }

    public DeleteSfsEnum getDeleteSfs() {
        return deleteSfs;
    }

    public void setDeleteSfs(DeleteSfsEnum deleteSfs) {
        this.deleteSfs = deleteSfs;
    }

    public DeleteClusterRequest withTobedeleted(TobedeletedEnum tobedeleted) {
        this.tobedeleted = tobedeleted;
        return this;
    }

    public TobedeletedEnum getTobedeleted() {
        return tobedeleted;
    }

    public void setTobedeleted(TobedeletedEnum tobedeleted) {
        this.tobedeleted = tobedeleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClusterRequest that = (DeleteClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.deleteEfs, that.deleteEfs)
            && Objects.equals(this.deleteEni, that.deleteEni) && Objects.equals(this.deleteEvs, that.deleteEvs)
            && Objects.equals(this.deleteNet, that.deleteNet) && Objects.equals(this.deleteObs, that.deleteObs)
            && Objects.equals(this.deleteSfs, that.deleteSfs) && Objects.equals(this.tobedeleted, that.tobedeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, deleteEfs, deleteEni, deleteEvs, deleteNet, deleteObs, deleteSfs, tobedeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    deleteEfs: ").append(toIndentedString(deleteEfs)).append("\n");
        sb.append("    deleteEni: ").append(toIndentedString(deleteEni)).append("\n");
        sb.append("    deleteEvs: ").append(toIndentedString(deleteEvs)).append("\n");
        sb.append("    deleteNet: ").append(toIndentedString(deleteNet)).append("\n");
        sb.append("    deleteObs: ").append(toIndentedString(deleteObs)).append("\n");
        sb.append("    deleteSfs: ").append(toIndentedString(deleteSfs)).append("\n");
        sb.append("    tobedeleted: ").append(toIndentedString(tobedeleted)).append("\n");
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
