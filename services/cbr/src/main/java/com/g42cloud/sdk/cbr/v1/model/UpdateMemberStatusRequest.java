package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateMemberStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateMember body;

    public UpdateMemberStatusRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public UpdateMemberStatusRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public UpdateMemberStatusRequest withBody(UpdateMember body) {
        this.body = body;
        return this;
    }

    public UpdateMemberStatusRequest withBody(Consumer<UpdateMember> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateMember();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateMember getBody() {
        return body;
    }

    public void setBody(UpdateMember body) {
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
        UpdateMemberStatusRequest updateMemberStatusRequest = (UpdateMemberStatusRequest) o;
        return Objects.equals(this.memberId, updateMemberStatusRequest.memberId)
            && Objects.equals(this.backupId, updateMemberStatusRequest.backupId)
            && Objects.equals(this.body, updateMemberStatusRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, backupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberStatusRequest {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
