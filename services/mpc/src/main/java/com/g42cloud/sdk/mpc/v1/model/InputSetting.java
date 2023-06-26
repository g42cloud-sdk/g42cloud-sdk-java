package com.g42cloud.sdk.mpc.v1.model;

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
 * InputSetting
 */
public class InputSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pane_id")

    private String paneId;

    public static final class AudioPolicyEnum {

        /**
         * Enum DISCARD for value: "DISCARD"
         */
        public static final AudioPolicyEnum DISCARD = new AudioPolicyEnum("DISCARD");

        /**
         * Enum RESERVE for value: "RESERVE"
         */
        public static final AudioPolicyEnum RESERVE = new AudioPolicyEnum("RESERVE");

        private static final Map<String, AudioPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioPolicyEnum> createStaticFields() {
            Map<String, AudioPolicyEnum> map = new HashMap<>();
            map.put("DISCARD", DISCARD);
            map.put("RESERVE", RESERVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioPolicyEnum(String value) {
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
        public static AudioPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AudioPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AudioPolicyEnum(value);
            }
            return result;
        }

        public static AudioPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AudioPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioPolicyEnum) {
                return this.value.equals(((AudioPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_policy")

    private AudioPolicyEnum audioPolicy;

    public InputSetting withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public InputSetting withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public InputSetting withPaneId(String paneId) {
        this.paneId = paneId;
        return this;
    }

    public String getPaneId() {
        return paneId;
    }

    public void setPaneId(String paneId) {
        this.paneId = paneId;
    }

    public InputSetting withAudioPolicy(AudioPolicyEnum audioPolicy) {
        this.audioPolicy = audioPolicy;
        return this;
    }

    public AudioPolicyEnum getAudioPolicy() {
        return audioPolicy;
    }

    public void setAudioPolicy(AudioPolicyEnum audioPolicy) {
        this.audioPolicy = audioPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputSetting inputSetting = (InputSetting) o;
        return Objects.equals(this.input, inputSetting.input) && Objects.equals(this.paneId, inputSetting.paneId)
            && Objects.equals(this.audioPolicy, inputSetting.audioPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, paneId, audioPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputSetting {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    paneId: ").append(toIndentedString(paneId)).append("\n");
        sb.append("    audioPolicy: ").append(toIndentedString(audioPolicy)).append("\n");
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
