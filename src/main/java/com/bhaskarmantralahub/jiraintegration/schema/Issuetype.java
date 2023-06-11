
package com.bhaskarmantralahub.jiraintegration.schema;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "id",
    "description",
    "iconUrl",
    "name",
    "subtask",
    "avatarId",
    "entityId",
    "hierarchyLevel"
})
@Generated("jsonschema2pojo")
public class Issuetype {

    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("subtask")
    private Boolean subtask;
    @JsonProperty("avatarId")
    private Integer avatarId;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("hierarchyLevel")
    private Integer hierarchyLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("subtask")
    public Boolean getSubtask() {
        return subtask;
    }

    @JsonProperty("subtask")
    public void setSubtask(Boolean subtask) {
        this.subtask = subtask;
    }

    @JsonProperty("avatarId")
    public Integer getAvatarId() {
        return avatarId;
    }

    @JsonProperty("avatarId")
    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("hierarchyLevel")
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    @JsonProperty("hierarchyLevel")
    public void setHierarchyLevel(Integer hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issuetype.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("iconUrl");
        sb.append('=');
        sb.append(((this.iconUrl == null)?"<null>":this.iconUrl));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("subtask");
        sb.append('=');
        sb.append(((this.subtask == null)?"<null>":this.subtask));
        sb.append(',');
        sb.append("avatarId");
        sb.append('=');
        sb.append(((this.avatarId == null)?"<null>":this.avatarId));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("hierarchyLevel");
        sb.append('=');
        sb.append(((this.hierarchyLevel == null)?"<null>":this.hierarchyLevel));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.avatarId == null)? 0 :this.avatarId.hashCode()));
        result = ((result* 31)+((this.hierarchyLevel == null)? 0 :this.hierarchyLevel.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.iconUrl == null)? 0 :this.iconUrl.hashCode()));
        result = ((result* 31)+((this.subtask == null)? 0 :this.subtask.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Issuetype) == false) {
            return false;
        }
        Issuetype rhs = ((Issuetype) other);
        return (((((((((((this.avatarId == rhs.avatarId)||((this.avatarId!= null)&&this.avatarId.equals(rhs.avatarId)))&&((this.hierarchyLevel == rhs.hierarchyLevel)||((this.hierarchyLevel!= null)&&this.hierarchyLevel.equals(rhs.hierarchyLevel))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.iconUrl == rhs.iconUrl)||((this.iconUrl!= null)&&this.iconUrl.equals(rhs.iconUrl))))&&((this.subtask == rhs.subtask)||((this.subtask!= null)&&this.subtask.equals(rhs.subtask))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
