package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListInstanceRequestBody
 */
public class ListInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<ResourceTags> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<ResourceTags> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<ResourceTags> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TagMatch> matches = null;

    public ListInstanceRequestBody withTags(List<ResourceTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListInstanceRequestBody addTagsItem(ResourceTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstanceRequestBody withTags(Consumer<List<ResourceTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<ResourceTags> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTags> tags) {
        this.tags = tags;
    }

    public ListInstanceRequestBody withTagsAny(List<ResourceTags> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListInstanceRequestBody addTagsAnyItem(ResourceTags tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListInstanceRequestBody withTagsAny(Consumer<List<ResourceTags>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    public List<ResourceTags> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<ResourceTags> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListInstanceRequestBody withNotTags(List<ResourceTags> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListInstanceRequestBody addNotTagsItem(ResourceTags notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListInstanceRequestBody withNotTags(Consumer<List<ResourceTags>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    public List<ResourceTags> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<ResourceTags> notTags) {
        this.notTags = notTags;
    }

    public ListInstanceRequestBody withNotTagsAny(List<ResourceTags> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListInstanceRequestBody addNotTagsAnyItem(ResourceTags notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListInstanceRequestBody withNotTagsAny(Consumer<List<ResourceTags>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    public List<ResourceTags> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<ResourceTags> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListInstanceRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstanceRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstanceRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListInstanceRequestBody withMatches(List<TagMatch> matches) {
        this.matches = matches;
        return this;
    }

    public ListInstanceRequestBody addMatchesItem(TagMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListInstanceRequestBody withMatches(Consumer<List<TagMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    public List<TagMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<TagMatch> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceRequestBody that = (ListInstanceRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.tagsAny, that.tagsAny)
            && Objects.equals(this.notTags, that.notTags) && Objects.equals(this.notTagsAny, that.notTagsAny)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.action, that.action) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, offset, limit, action, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
