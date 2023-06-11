
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
    "accountId",
    "emailAddress",
    "avatarUrls",
    "displayName",
    "active",
    "timeZone",
    "accountType"
})
@Generated("jsonschema2pojo")
public class Reporter {

    @JsonProperty("self")
    private String self;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("avatarUrls")
    private AvatarUrls__3 avatarUrls;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("accountType")
    private String accountType;
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

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("avatarUrls")
    public AvatarUrls__3 getAvatarUrls() {
        return avatarUrls;
    }

    @JsonProperty("avatarUrls")
    public void setAvatarUrls(AvatarUrls__3 avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
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
        sb.append(Reporter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("avatarUrls");
        sb.append('=');
        sb.append(((this.avatarUrls == null)?"<null>":this.avatarUrls));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("timeZone");
        sb.append('=');
        sb.append(((this.timeZone == null)?"<null>":this.timeZone));
        sb.append(',');
        sb.append("accountType");
        sb.append('=');
        sb.append(((this.accountType == null)?"<null>":this.accountType));
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
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.avatarUrls == null)? 0 :this.avatarUrls.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.accountType == null)? 0 :this.accountType.hashCode()));
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.timeZone == null)? 0 :this.timeZone.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reporter) == false) {
            return false;
        }
        Reporter rhs = ((Reporter) other);
        return ((((((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.avatarUrls == rhs.avatarUrls)||((this.avatarUrls!= null)&&this.avatarUrls.equals(rhs.avatarUrls))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.accountType == rhs.accountType)||((this.accountType!= null)&&this.accountType.equals(rhs.accountType))))&&((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.timeZone == rhs.timeZone)||((this.timeZone!= null)&&this.timeZone.equals(rhs.timeZone))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
