
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
    "hasEpicLinkFieldDependency",
    "showField",
    "nonEditableReason"
})
@Generated("jsonschema2pojo")
public class Customfield10018 {

    @JsonProperty("hasEpicLinkFieldDependency")
    private Boolean hasEpicLinkFieldDependency;
    @JsonProperty("showField")
    private Boolean showField;
    @JsonProperty("nonEditableReason")
    private NonEditableReason nonEditableReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("hasEpicLinkFieldDependency")
    public Boolean getHasEpicLinkFieldDependency() {
        return hasEpicLinkFieldDependency;
    }

    @JsonProperty("hasEpicLinkFieldDependency")
    public void setHasEpicLinkFieldDependency(Boolean hasEpicLinkFieldDependency) {
        this.hasEpicLinkFieldDependency = hasEpicLinkFieldDependency;
    }

    @JsonProperty("showField")
    public Boolean getShowField() {
        return showField;
    }

    @JsonProperty("showField")
    public void setShowField(Boolean showField) {
        this.showField = showField;
    }

    @JsonProperty("nonEditableReason")
    public NonEditableReason getNonEditableReason() {
        return nonEditableReason;
    }

    @JsonProperty("nonEditableReason")
    public void setNonEditableReason(NonEditableReason nonEditableReason) {
        this.nonEditableReason = nonEditableReason;
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
        sb.append(Customfield10018 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasEpicLinkFieldDependency");
        sb.append('=');
        sb.append(((this.hasEpicLinkFieldDependency == null)?"<null>":this.hasEpicLinkFieldDependency));
        sb.append(',');
        sb.append("showField");
        sb.append('=');
        sb.append(((this.showField == null)?"<null>":this.showField));
        sb.append(',');
        sb.append("nonEditableReason");
        sb.append('=');
        sb.append(((this.nonEditableReason == null)?"<null>":this.nonEditableReason));
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
        result = ((result* 31)+((this.nonEditableReason == null)? 0 :this.nonEditableReason.hashCode()));
        result = ((result* 31)+((this.hasEpicLinkFieldDependency == null)? 0 :this.hasEpicLinkFieldDependency.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.showField == null)? 0 :this.showField.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customfield10018) == false) {
            return false;
        }
        Customfield10018 rhs = ((Customfield10018) other);
        return (((((this.nonEditableReason == rhs.nonEditableReason)||((this.nonEditableReason!= null)&&this.nonEditableReason.equals(rhs.nonEditableReason)))&&((this.hasEpicLinkFieldDependency == rhs.hasEpicLinkFieldDependency)||((this.hasEpicLinkFieldDependency!= null)&&this.hasEpicLinkFieldDependency.equals(rhs.hasEpicLinkFieldDependency))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.showField == rhs.showField)||((this.showField!= null)&&this.showField.equals(rhs.showField))));
    }

}
