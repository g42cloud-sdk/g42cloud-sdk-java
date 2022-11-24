package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupDownloadLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<GetBackupDownloadLinkFiles> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    public ShowBackupDownloadLinkResponse withFiles(List<GetBackupDownloadLinkFiles> files) {
        this.files = files;
        return this;
    }

    public ShowBackupDownloadLinkResponse addFilesItem(GetBackupDownloadLinkFiles filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ShowBackupDownloadLinkResponse withFiles(Consumer<List<GetBackupDownloadLinkFiles>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    public List<GetBackupDownloadLinkFiles> getFiles() {
        return files;
    }

    public void setFiles(List<GetBackupDownloadLinkFiles> files) {
        this.files = files;
    }

    public ShowBackupDownloadLinkResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBackupDownloadLinkResponse showBackupDownloadLinkResponse = (ShowBackupDownloadLinkResponse) o;
        return Objects.equals(this.files, showBackupDownloadLinkResponse.files)
            && Objects.equals(this.bucket, showBackupDownloadLinkResponse.bucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files, bucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupDownloadLinkResponse {\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
