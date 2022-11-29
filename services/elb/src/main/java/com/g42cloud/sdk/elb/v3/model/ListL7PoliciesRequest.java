package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListL7PoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private List<String> listenerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private List<Integer> position = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private List<String> redirectUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private List<String> redirectPoolId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private List<String> redirectListenerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private List<String> provisioningStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_all_rules")

    private Boolean displayAllRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private List<Integer> priority = null;

    public ListL7PoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListL7PoliciesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListL7PoliciesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListL7PoliciesRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListL7PoliciesRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListL7PoliciesRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListL7PoliciesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListL7PoliciesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListL7PoliciesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListL7PoliciesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListL7PoliciesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListL7PoliciesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListL7PoliciesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListL7PoliciesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListL7PoliciesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListL7PoliciesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListL7PoliciesRequest withListenerId(List<String> listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    public ListL7PoliciesRequest addListenerIdItem(String listenerIdItem) {
        if (this.listenerId == null) {
            this.listenerId = new ArrayList<>();
        }
        this.listenerId.add(listenerIdItem);
        return this;
    }

    public ListL7PoliciesRequest withListenerId(Consumer<List<String>> listenerIdSetter) {
        if (this.listenerId == null) {
            this.listenerId = new ArrayList<>();
        }
        listenerIdSetter.accept(this.listenerId);
        return this;
    }

    public List<String> getListenerId() {
        return listenerId;
    }

    public void setListenerId(List<String> listenerId) {
        this.listenerId = listenerId;
    }

    public ListL7PoliciesRequest withPosition(List<Integer> position) {
        this.position = position;
        return this;
    }

    public ListL7PoliciesRequest addPositionItem(Integer positionItem) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        this.position.add(positionItem);
        return this;
    }

    public ListL7PoliciesRequest withPosition(Consumer<List<Integer>> positionSetter) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        positionSetter.accept(this.position);
        return this;
    }

    public List<Integer> getPosition() {
        return position;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }

    public ListL7PoliciesRequest withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public ListL7PoliciesRequest addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public ListL7PoliciesRequest withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public ListL7PoliciesRequest withRedirectUrl(List<String> redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public ListL7PoliciesRequest addRedirectUrlItem(String redirectUrlItem) {
        if (this.redirectUrl == null) {
            this.redirectUrl = new ArrayList<>();
        }
        this.redirectUrl.add(redirectUrlItem);
        return this;
    }

    public ListL7PoliciesRequest withRedirectUrl(Consumer<List<String>> redirectUrlSetter) {
        if (this.redirectUrl == null) {
            this.redirectUrl = new ArrayList<>();
        }
        redirectUrlSetter.accept(this.redirectUrl);
        return this;
    }

    public List<String> getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(List<String> redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public ListL7PoliciesRequest withRedirectPoolId(List<String> redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    public ListL7PoliciesRequest addRedirectPoolIdItem(String redirectPoolIdItem) {
        if (this.redirectPoolId == null) {
            this.redirectPoolId = new ArrayList<>();
        }
        this.redirectPoolId.add(redirectPoolIdItem);
        return this;
    }

    public ListL7PoliciesRequest withRedirectPoolId(Consumer<List<String>> redirectPoolIdSetter) {
        if (this.redirectPoolId == null) {
            this.redirectPoolId = new ArrayList<>();
        }
        redirectPoolIdSetter.accept(this.redirectPoolId);
        return this;
    }

    public List<String> getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(List<String> redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public ListL7PoliciesRequest withRedirectListenerId(List<String> redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    public ListL7PoliciesRequest addRedirectListenerIdItem(String redirectListenerIdItem) {
        if (this.redirectListenerId == null) {
            this.redirectListenerId = new ArrayList<>();
        }
        this.redirectListenerId.add(redirectListenerIdItem);
        return this;
    }

    public ListL7PoliciesRequest withRedirectListenerId(Consumer<List<String>> redirectListenerIdSetter) {
        if (this.redirectListenerId == null) {
            this.redirectListenerId = new ArrayList<>();
        }
        redirectListenerIdSetter.accept(this.redirectListenerId);
        return this;
    }

    public List<String> getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(List<String> redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public ListL7PoliciesRequest withProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    public ListL7PoliciesRequest addProvisioningStatusItem(String provisioningStatusItem) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        this.provisioningStatus.add(provisioningStatusItem);
        return this;
    }

    public ListL7PoliciesRequest withProvisioningStatus(Consumer<List<String>> provisioningStatusSetter) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        provisioningStatusSetter.accept(this.provisioningStatus);
        return this;
    }

    public List<String> getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public ListL7PoliciesRequest withDisplayAllRules(Boolean displayAllRules) {
        this.displayAllRules = displayAllRules;
        return this;
    }

    public Boolean getDisplayAllRules() {
        return displayAllRules;
    }

    public void setDisplayAllRules(Boolean displayAllRules) {
        this.displayAllRules = displayAllRules;
    }

    public ListL7PoliciesRequest withPriority(List<Integer> priority) {
        this.priority = priority;
        return this;
    }

    public ListL7PoliciesRequest addPriorityItem(Integer priorityItem) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        this.priority.add(priorityItem);
        return this;
    }

    public ListL7PoliciesRequest withPriority(Consumer<List<Integer>> prioritySetter) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        prioritySetter.accept(this.priority);
        return this;
    }

    public List<Integer> getPriority() {
        return priority;
    }

    public void setPriority(List<Integer> priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7PoliciesRequest listL7PoliciesRequest = (ListL7PoliciesRequest) o;
        return Objects.equals(this.marker, listL7PoliciesRequest.marker)
            && Objects.equals(this.limit, listL7PoliciesRequest.limit)
            && Objects.equals(this.pageReverse, listL7PoliciesRequest.pageReverse)
            && Objects.equals(this.enterpriseProjectId, listL7PoliciesRequest.enterpriseProjectId)
            && Objects.equals(this.id, listL7PoliciesRequest.id)
            && Objects.equals(this.name, listL7PoliciesRequest.name)
            && Objects.equals(this.description, listL7PoliciesRequest.description)
            && Objects.equals(this.adminStateUp, listL7PoliciesRequest.adminStateUp)
            && Objects.equals(this.listenerId, listL7PoliciesRequest.listenerId)
            && Objects.equals(this.position, listL7PoliciesRequest.position)
            && Objects.equals(this.action, listL7PoliciesRequest.action)
            && Objects.equals(this.redirectUrl, listL7PoliciesRequest.redirectUrl)
            && Objects.equals(this.redirectPoolId, listL7PoliciesRequest.redirectPoolId)
            && Objects.equals(this.redirectListenerId, listL7PoliciesRequest.redirectListenerId)
            && Objects.equals(this.provisioningStatus, listL7PoliciesRequest.provisioningStatus)
            && Objects.equals(this.displayAllRules, listL7PoliciesRequest.displayAllRules)
            && Objects.equals(this.priority, listL7PoliciesRequest.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            pageReverse,
            enterpriseProjectId,
            id,
            name,
            description,
            adminStateUp,
            listenerId,
            position,
            action,
            redirectUrl,
            redirectPoolId,
            redirectListenerId,
            provisioningStatus,
            displayAllRules,
            priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7PoliciesRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    displayAllRules: ").append(toIndentedString(displayAllRules)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
