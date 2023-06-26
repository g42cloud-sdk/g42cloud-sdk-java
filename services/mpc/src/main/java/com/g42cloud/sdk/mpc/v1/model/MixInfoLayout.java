package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MixInfoLayout
 */
public class MixInfoLayout {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "panes")

    private List<PaneSetting> panes = null;

    public MixInfoLayout withPanes(List<PaneSetting> panes) {
        this.panes = panes;
        return this;
    }

    public MixInfoLayout addPanesItem(PaneSetting panesItem) {
        if (this.panes == null) {
            this.panes = new ArrayList<>();
        }
        this.panes.add(panesItem);
        return this;
    }

    public MixInfoLayout withPanes(Consumer<List<PaneSetting>> panesSetter) {
        if (this.panes == null) {
            this.panes = new ArrayList<>();
        }
        panesSetter.accept(this.panes);
        return this;
    }

    public List<PaneSetting> getPanes() {
        return panes;
    }

    public void setPanes(List<PaneSetting> panes) {
        this.panes = panes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixInfoLayout mixInfoLayout = (MixInfoLayout) o;
        return Objects.equals(this.panes, mixInfoLayout.panes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(panes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixInfoLayout {\n");
        sb.append("    panes: ").append(toIndentedString(panes)).append("\n");
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
