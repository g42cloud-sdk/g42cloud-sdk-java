package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateThumbnailsTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project_Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-vod-projectId")

    private String xVodProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateThumbReq body;

    public CreateThumbnailsTaskRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public CreateThumbnailsTaskRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project_Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public CreateThumbnailsTaskRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public CreateThumbnailsTaskRequest withXVodProjectId(String xVodProjectId) {
        this.xVodProjectId = xVodProjectId;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-vod-projectId")
    public String getXVodProjectId() {
        return xVodProjectId;
    }

    public void setXVodProjectId(String xVodProjectId) {
        this.xVodProjectId = xVodProjectId;
    }

    public CreateThumbnailsTaskRequest withBody(CreateThumbReq body) {
        this.body = body;
        return this;
    }

    public CreateThumbnailsTaskRequest withBody(Consumer<CreateThumbReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateThumbReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateThumbReq getBody() {
        return body;
    }

    public void setBody(CreateThumbReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateThumbnailsTaskRequest createThumbnailsTaskRequest = (CreateThumbnailsTaskRequest) o;
        return Objects.equals(this.authorization, createThumbnailsTaskRequest.authorization)
            && Objects.equals(this.xProjectId, createThumbnailsTaskRequest.xProjectId)
            && Objects.equals(this.xSdkDate, createThumbnailsTaskRequest.xSdkDate)
            && Objects.equals(this.xVodProjectId, createThumbnailsTaskRequest.xVodProjectId)
            && Objects.equals(this.body, createThumbnailsTaskRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xProjectId, xSdkDate, xVodProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThumbnailsTaskRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xVodProjectId: ").append(toIndentedString(xVodProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
