package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MixInfo
 */
public class MixInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputSetting> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout")

    private MixInfoLayout layout;

    public MixInfo withInputs(List<InputSetting> inputs) {
        this.inputs = inputs;
        return this;
    }

    public MixInfo addInputsItem(InputSetting inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public MixInfo withInputs(Consumer<List<InputSetting>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    public List<InputSetting> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputSetting> inputs) {
        this.inputs = inputs;
    }

    public MixInfo withLayout(MixInfoLayout layout) {
        this.layout = layout;
        return this;
    }

    public MixInfo withLayout(Consumer<MixInfoLayout> layoutSetter) {
        if (this.layout == null) {
            this.layout = new MixInfoLayout();
            layoutSetter.accept(this.layout);
        }

        return this;
    }

    public MixInfoLayout getLayout() {
        return layout;
    }

    public void setLayout(MixInfoLayout layout) {
        this.layout = layout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) o;
        return Objects.equals(this.inputs, mixInfo.inputs) && Objects.equals(this.layout, mixInfo.layout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, layout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixInfo {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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
