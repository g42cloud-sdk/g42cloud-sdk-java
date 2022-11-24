package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ResizeServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize")

    private ResizePrePaidServerOption resize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public ResizeServerRequestBody withResize(ResizePrePaidServerOption resize) {
        this.resize = resize;
        return this;
    }

    public ResizeServerRequestBody withResize(Consumer<ResizePrePaidServerOption> resizeSetter) {
        if (this.resize == null) {
            this.resize = new ResizePrePaidServerOption();
            resizeSetter.accept(this.resize);
        }

        return this;
    }

    public ResizePrePaidServerOption getResize() {
        return resize;
    }

    public void setResize(ResizePrePaidServerOption resize) {
        this.resize = resize;
    }

    public ResizeServerRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeServerRequestBody resizeServerRequestBody = (ResizeServerRequestBody) o;
        return Objects.equals(this.resize, resizeServerRequestBody.resize)
            && Objects.equals(this.dryRun, resizeServerRequestBody.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resize, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeServerRequestBody {\n");
        sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
