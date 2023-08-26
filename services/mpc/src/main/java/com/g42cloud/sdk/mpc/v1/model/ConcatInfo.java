package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConcatInfo
 */
public class ConcatInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<ObsObjInfo> inputs = null;

    public ConcatInfo withInputs(List<ObsObjInfo> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ConcatInfo addInputsItem(ObsObjInfo inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ConcatInfo withInputs(Consumer<List<ObsObjInfo>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    public List<ObsObjInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<ObsObjInfo> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConcatInfo that = (ConcatInfo) obj;
        return Objects.equals(this.inputs, that.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConcatInfo {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
