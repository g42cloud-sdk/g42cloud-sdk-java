package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建剪辑任务
 */
public class CreateEditingJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_type")

    private List<String> editType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clips")

    private List<ClipInfo> clips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concats")

    private List<MultiConcatInfo> concats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concat")

    private ConcatInfo concat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mix")

    private MixInfo mix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_setting")

    private OutputSetting outputSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark_settings")

    private List<ImageWatermarkSetting> imageWatermarkSettings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_settings")

    private List<EditSetting> editSettings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public CreateEditingJobReq withEditType(List<String> editType) {
        this.editType = editType;
        return this;
    }

    public CreateEditingJobReq addEditTypeItem(String editTypeItem) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        this.editType.add(editTypeItem);
        return this;
    }

    public CreateEditingJobReq withEditType(Consumer<List<String>> editTypeSetter) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        editTypeSetter.accept(this.editType);
        return this;
    }

    public List<String> getEditType() {
        return editType;
    }

    public void setEditType(List<String> editType) {
        this.editType = editType;
    }

    public CreateEditingJobReq withClips(List<ClipInfo> clips) {
        this.clips = clips;
        return this;
    }

    public CreateEditingJobReq addClipsItem(ClipInfo clipsItem) {
        if (this.clips == null) {
            this.clips = new ArrayList<>();
        }
        this.clips.add(clipsItem);
        return this;
    }

    public CreateEditingJobReq withClips(Consumer<List<ClipInfo>> clipsSetter) {
        if (this.clips == null) {
            this.clips = new ArrayList<>();
        }
        clipsSetter.accept(this.clips);
        return this;
    }

    public List<ClipInfo> getClips() {
        return clips;
    }

    public void setClips(List<ClipInfo> clips) {
        this.clips = clips;
    }

    public CreateEditingJobReq withConcats(List<MultiConcatInfo> concats) {
        this.concats = concats;
        return this;
    }

    public CreateEditingJobReq addConcatsItem(MultiConcatInfo concatsItem) {
        if (this.concats == null) {
            this.concats = new ArrayList<>();
        }
        this.concats.add(concatsItem);
        return this;
    }

    public CreateEditingJobReq withConcats(Consumer<List<MultiConcatInfo>> concatsSetter) {
        if (this.concats == null) {
            this.concats = new ArrayList<>();
        }
        concatsSetter.accept(this.concats);
        return this;
    }

    public List<MultiConcatInfo> getConcats() {
        return concats;
    }

    public void setConcats(List<MultiConcatInfo> concats) {
        this.concats = concats;
    }

    public CreateEditingJobReq withConcat(ConcatInfo concat) {
        this.concat = concat;
        return this;
    }

    public CreateEditingJobReq withConcat(Consumer<ConcatInfo> concatSetter) {
        if (this.concat == null) {
            this.concat = new ConcatInfo();
            concatSetter.accept(this.concat);
        }

        return this;
    }

    public ConcatInfo getConcat() {
        return concat;
    }

    public void setConcat(ConcatInfo concat) {
        this.concat = concat;
    }

    public CreateEditingJobReq withMix(MixInfo mix) {
        this.mix = mix;
        return this;
    }

    public CreateEditingJobReq withMix(Consumer<MixInfo> mixSetter) {
        if (this.mix == null) {
            this.mix = new MixInfo();
            mixSetter.accept(this.mix);
        }

        return this;
    }

    public MixInfo getMix() {
        return mix;
    }

    public void setMix(MixInfo mix) {
        this.mix = mix;
    }

    public CreateEditingJobReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateEditingJobReq withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public CreateEditingJobReq withOutputSetting(OutputSetting outputSetting) {
        this.outputSetting = outputSetting;
        return this;
    }

    public CreateEditingJobReq withOutputSetting(Consumer<OutputSetting> outputSettingSetter) {
        if (this.outputSetting == null) {
            this.outputSetting = new OutputSetting();
            outputSettingSetter.accept(this.outputSetting);
        }

        return this;
    }

    public OutputSetting getOutputSetting() {
        return outputSetting;
    }

    public void setOutputSetting(OutputSetting outputSetting) {
        this.outputSetting = outputSetting;
    }

    public CreateEditingJobReq withImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
        return this;
    }

    public CreateEditingJobReq addImageWatermarkSettingsItem(ImageWatermarkSetting imageWatermarkSettingsItem) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        this.imageWatermarkSettings.add(imageWatermarkSettingsItem);
        return this;
    }

    public CreateEditingJobReq withImageWatermarkSettings(
        Consumer<List<ImageWatermarkSetting>> imageWatermarkSettingsSetter) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        imageWatermarkSettingsSetter.accept(this.imageWatermarkSettings);
        return this;
    }

    public List<ImageWatermarkSetting> getImageWatermarkSettings() {
        return imageWatermarkSettings;
    }

    public void setImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
    }

    public CreateEditingJobReq withEditSettings(List<EditSetting> editSettings) {
        this.editSettings = editSettings;
        return this;
    }

    public CreateEditingJobReq addEditSettingsItem(EditSetting editSettingsItem) {
        if (this.editSettings == null) {
            this.editSettings = new ArrayList<>();
        }
        this.editSettings.add(editSettingsItem);
        return this;
    }

    public CreateEditingJobReq withEditSettings(Consumer<List<EditSetting>> editSettingsSetter) {
        if (this.editSettings == null) {
            this.editSettings = new ArrayList<>();
        }
        editSettingsSetter.accept(this.editSettings);
        return this;
    }

    public List<EditSetting> getEditSettings() {
        return editSettings;
    }

    public void setEditSettings(List<EditSetting> editSettings) {
        this.editSettings = editSettings;
    }

    public CreateEditingJobReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEditingJobReq that = (CreateEditingJobReq) obj;
        return Objects.equals(this.editType, that.editType) && Objects.equals(this.clips, that.clips)
            && Objects.equals(this.concats, that.concats) && Objects.equals(this.concat, that.concat)
            && Objects.equals(this.mix, that.mix) && Objects.equals(this.input, that.input)
            && Objects.equals(this.outputSetting, that.outputSetting)
            && Objects.equals(this.imageWatermarkSettings, that.imageWatermarkSettings)
            && Objects.equals(this.editSettings, that.editSettings) && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(editType,
            clips,
            concats,
            concat,
            mix,
            input,
            outputSetting,
            imageWatermarkSettings,
            editSettings,
            userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEditingJobReq {\n");
        sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
        sb.append("    clips: ").append(toIndentedString(clips)).append("\n");
        sb.append("    concats: ").append(toIndentedString(concats)).append("\n");
        sb.append("    concat: ").append(toIndentedString(concat)).append("\n");
        sb.append("    mix: ").append(toIndentedString(mix)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    outputSetting: ").append(toIndentedString(outputSetting)).append("\n");
        sb.append("    imageWatermarkSettings: ").append(toIndentedString(imageWatermarkSettings)).append("\n");
        sb.append("    editSettings: ").append(toIndentedString(editSettings)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
