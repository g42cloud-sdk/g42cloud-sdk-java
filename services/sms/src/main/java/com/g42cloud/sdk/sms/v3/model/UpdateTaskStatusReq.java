package com.g42cloud.sdk.sms.v3.model;

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
 * This is a auto create Body Object
 */
public class UpdateTaskStatusReq {

    public static final class OperationEnum {

        /**
         * Enum START for value: "start"
         */
        public static final OperationEnum START = new OperationEnum("start");

        /**
         * Enum STOP for value: "stop"
         */
        public static final OperationEnum STOP = new OperationEnum("stop");

        /**
         * Enum COLLECT_LOG for value: "collect_log"
         */
        public static final OperationEnum COLLECT_LOG = new OperationEnum("collect_log");

        /**
         * Enum TEST for value: "test"
         */
        public static final OperationEnum TEST = new OperationEnum("test");

        /**
         * Enum CLONE_TEST for value: "clone_test"
         */
        public static final OperationEnum CLONE_TEST = new OperationEnum("clone_test");

        /**
         * Enum RESTART for value: "restart"
         */
        public static final OperationEnum RESTART = new OperationEnum("restart");

        /**
         * Enum SYNC_FAILED_ROLLBACK for value: "sync_failed_rollback"
         */
        public static final OperationEnum SYNC_FAILED_ROLLBACK = new OperationEnum("sync_failed_rollback");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("start", START);
            map.put("stop", STOP);
            map.put("collect_log", COLLECT_LOG);
            map.put("test", TEST);
            map.put("clone_test", CLONE_TEST);
            map.put("restart", RESTART);
            map.put("sync_failed_rollback", SYNC_FAILED_ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationEnum(value));
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private OperationEnum operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private Map<String, String> param = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_hce")

    private Boolean switchHce;

    public UpdateTaskStatusReq withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public UpdateTaskStatusReq withParam(Map<String, String> param) {
        this.param = param;
        return this;
    }

    public UpdateTaskStatusReq putParamItem(String key, String paramItem) {
        if (this.param == null) {
            this.param = new HashMap<>();
        }
        this.param.put(key, paramItem);
        return this;
    }

    public UpdateTaskStatusReq withParam(Consumer<Map<String, String>> paramSetter) {
        if (this.param == null) {
            this.param = new HashMap<>();
        }
        paramSetter.accept(this.param);
        return this;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public UpdateTaskStatusReq withSwitchHce(Boolean switchHce) {
        this.switchHce = switchHce;
        return this;
    }

    public Boolean getSwitchHce() {
        return switchHce;
    }

    public void setSwitchHce(Boolean switchHce) {
        this.switchHce = switchHce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskStatusReq that = (UpdateTaskStatusReq) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.param, that.param)
            && Objects.equals(this.switchHce, that.switchHce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, param, switchHce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskStatusReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    switchHce: ").append(toIndentedString(switchHce)).append("\n");
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
