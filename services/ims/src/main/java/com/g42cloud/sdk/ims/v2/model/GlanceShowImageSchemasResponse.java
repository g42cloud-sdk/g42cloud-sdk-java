package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GlanceShowImageSchemasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additionalProperties")

    private AdditionalProperties additionalProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Links> links = null;

    public GlanceShowImageSchemasResponse withAdditionalProperties(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    public GlanceShowImageSchemasResponse withAdditionalProperties(
        Consumer<AdditionalProperties> additionalPropertiesSetter) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new AdditionalProperties();
            additionalPropertiesSetter.accept(this.additionalProperties);
        }

        return this;
    }

    public AdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public GlanceShowImageSchemasResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceShowImageSchemasResponse withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public GlanceShowImageSchemasResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    public GlanceShowImageSchemasResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public GlanceShowImageSchemasResponse withLinks(Consumer<List<Links>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlanceShowImageSchemasResponse that = (GlanceShowImageSchemasResponse) obj;
        return Objects.equals(this.additionalProperties, that.additionalProperties)
            && Objects.equals(this.name, that.name) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalProperties, name, properties, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceShowImageSchemasResponse {\n");
        sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
