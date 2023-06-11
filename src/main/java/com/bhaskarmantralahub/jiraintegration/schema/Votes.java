
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
    "votes",
    "hasVoted"
})
@Generated("jsonschema2pojo")
public class Votes {

    @JsonProperty("self")
    private String self;
    @JsonProperty("votes")
    private Integer votes;
    @JsonProperty("hasVoted")
    private Boolean hasVoted;
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

    @JsonProperty("votes")
    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @JsonProperty("hasVoted")
    public Boolean getHasVoted() {
        return hasVoted;
    }

    @JsonProperty("hasVoted")
    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
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
        sb.append(Votes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
        sb.append(',');
        sb.append("hasVoted");
        sb.append('=');
        sb.append(((this.hasVoted == null)?"<null>":this.hasVoted));
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
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hasVoted == null)? 0 :this.hasVoted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Votes) == false) {
            return false;
        }
        Votes rhs = ((Votes) other);
        return (((((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self)))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hasVoted == rhs.hasVoted)||((this.hasVoted!= null)&&this.hasVoted.equals(rhs.hasVoted))));
    }

}
