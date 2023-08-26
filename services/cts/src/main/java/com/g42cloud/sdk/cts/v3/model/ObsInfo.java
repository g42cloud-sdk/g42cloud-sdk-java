package com.g42cloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转储桶信息。
 */
public class ObsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_prefix_name")

    private String filePrefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_obs_created")

    private Boolean isObsCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized_bucket")

    private Boolean isAuthorizedBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_lifecycle")

    private Long bucketLifecycle;

    public ObsInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsInfo withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }

    public ObsInfo withIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
        return this;
    }

    public Boolean getIsObsCreated() {
        return isObsCreated;
    }

    public void setIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
    }

    public ObsInfo withIsAuthorizedBucket(Boolean isAuthorizedBucket) {
        this.isAuthorizedBucket = isAuthorizedBucket;
        return this;
    }

    public Boolean getIsAuthorizedBucket() {
        return isAuthorizedBucket;
    }

    public void setIsAuthorizedBucket(Boolean isAuthorizedBucket) {
        this.isAuthorizedBucket = isAuthorizedBucket;
    }

    public ObsInfo withBucketLifecycle(Long bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
        return this;
    }

    public Long getBucketLifecycle() {
        return bucketLifecycle;
    }

    public void setBucketLifecycle(Long bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsInfo that = (ObsInfo) obj;
        return Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.filePrefixName, that.filePrefixName)
            && Objects.equals(this.isObsCreated, that.isObsCreated)
            && Objects.equals(this.isAuthorizedBucket, that.isAuthorizedBucket)
            && Objects.equals(this.bucketLifecycle, that.bucketLifecycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, filePrefixName, isObsCreated, isAuthorizedBucket, bucketLifecycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsInfo {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
        sb.append("    isObsCreated: ").append(toIndentedString(isObsCreated)).append("\n");
        sb.append("    isAuthorizedBucket: ").append(toIndentedString(isAuthorizedBucket)).append("\n");
        sb.append("    bucketLifecycle: ").append(toIndentedString(bucketLifecycle)).append("\n");
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
