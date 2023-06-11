
package com.bhaskarmantralahub.jiraintegration.schema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "statuscategorychangedate",
    "issuetype",
    "timespent",
    "customfield_10030",
    "customfield_10031",
    "project",
    "customfield_10032",
    "customfield_10033",
    "fixVersions",
    "aggregatetimespent",
    "customfield_10034",
    "customfield_10035",
    "resolution",
    "customfield_10027",
    "customfield_10028",
    "customfield_10029",
    "resolutiondate",
    "workratio",
    "watches",
    "lastViewed",
    "created",
    "customfield_10020",
    "customfield_10021",
    "customfield_10022",
    "priority",
    "customfield_10023",
    "customfield_10024",
    "customfield_10025",
    "customfield_10026",
    "labels",
    "customfield_10016",
    "customfield_10017",
    "customfield_10018",
    "customfield_10019",
    "aggregatetimeoriginalestimate",
    "timeestimate",
    "versions",
    "issuelinks",
    "assignee",
    "updated",
    "status",
    "components",
    "timeoriginalestimate",
    "description",
    "customfield_10010",
    "customfield_10014",
    "customfield_10015",
    "customfield_10005",
    "customfield_10006",
    "customfield_10007",
    "security",
    "customfield_10008",
    "customfield_10009",
    "aggregatetimeestimate",
    "summary",
    "creator",
    "subtasks",
    "reporter",
    "aggregateprogress",
    "customfield_10001",
    "customfield_10002",
    "customfield_10003",
    "customfield_10004",
    "environment",
    "duedate",
    "progress",
    "votes"
})
@Generated("jsonschema2pojo")
public class Fields {

    @JsonProperty("statuscategorychangedate")
    private String statuscategorychangedate;
    @JsonProperty("issuetype")
    private Issuetype issuetype;
    @JsonProperty("timespent")
    private Object timespent;
    @JsonProperty("customfield_10030")
    private Object customfield10030;
    @JsonProperty("customfield_10031")
    private Object customfield10031;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("customfield_10032")
    private List<Object> customfield10032 = new ArrayList<Object>();
    @JsonProperty("customfield_10033")
    private Object customfield10033;
    @JsonProperty("fixVersions")
    private List<Object> fixVersions = new ArrayList<Object>();
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("customfield_10034")
    private Object customfield10034;
    @JsonProperty("customfield_10035")
    private Object customfield10035;
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("customfield_10027")
    private Object customfield10027;
    @JsonProperty("customfield_10028")
    private Object customfield10028;
    @JsonProperty("customfield_10029")
    private Object customfield10029;
    @JsonProperty("resolutiondate")
    private Object resolutiondate;
    @JsonProperty("workratio")
    private Integer workratio;
    @JsonProperty("watches")
    private Watches watches;
    @JsonProperty("lastViewed")
    private String lastViewed;
    @JsonProperty("created")
    private String created;
    @JsonProperty("customfield_10020")
    private Object customfield10020;
    @JsonProperty("customfield_10021")
    private Object customfield10021;
    @JsonProperty("customfield_10022")
    private Object customfield10022;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("customfield_10023")
    private Object customfield10023;
    @JsonProperty("customfield_10024")
    private Object customfield10024;
    @JsonProperty("customfield_10025")
    private Object customfield10025;
    @JsonProperty("customfield_10026")
    private Object customfield10026;
    @JsonProperty("labels")
    private List<Object> labels = new ArrayList<Object>();
    @JsonProperty("customfield_10016")
    private Object customfield10016;
    @JsonProperty("customfield_10017")
    private String customfield10017;
    @JsonProperty("customfield_10018")
    private Customfield10018 customfield10018;
    @JsonProperty("customfield_10019")
    private String customfield10019;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Object aggregatetimeoriginalestimate;
    @JsonProperty("timeestimate")
    private Object timeestimate;
    @JsonProperty("versions")
    private List<Object> versions = new ArrayList<Object>();
    @JsonProperty("issuelinks")
    private List<Object> issuelinks = new ArrayList<Object>();
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("components")
    private List<Object> components = new ArrayList<Object>();
    @JsonProperty("timeoriginalestimate")
    private Object timeoriginalestimate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("customfield_10010")
    private Object customfield10010;
    @JsonProperty("customfield_10014")
    private Object customfield10014;
    @JsonProperty("customfield_10015")
    private Object customfield10015;
    @JsonProperty("customfield_10005")
    private Object customfield10005;
    @JsonProperty("customfield_10006")
    private Object customfield10006;
    @JsonProperty("customfield_10007")
    private Object customfield10007;
    @JsonProperty("security")
    private Object security;
    @JsonProperty("customfield_10008")
    private Object customfield10008;
    @JsonProperty("customfield_10009")
    private Object customfield10009;
    @JsonProperty("aggregatetimeestimate")
    private Object aggregatetimeestimate;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("subtasks")
    private List<Object> subtasks = new ArrayList<Object>();
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("aggregateprogress")
    private Aggregateprogress aggregateprogress;
    @JsonProperty("customfield_10001")
    private Object customfield10001;
    @JsonProperty("customfield_10002")
    private Object customfield10002;
    @JsonProperty("customfield_10003")
    private Object customfield10003;
    @JsonProperty("customfield_10004")
    private Object customfield10004;
    @JsonProperty("environment")
    private Object environment;
    @JsonProperty("duedate")
    private Object duedate;
    @JsonProperty("progress")
    private Progress progress;
    @JsonProperty("votes")
    private Votes votes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("statuscategorychangedate")
    public String getStatuscategorychangedate() {
        return statuscategorychangedate;
    }

    @JsonProperty("statuscategorychangedate")
    public void setStatuscategorychangedate(String statuscategorychangedate) {
        this.statuscategorychangedate = statuscategorychangedate;
    }

    @JsonProperty("issuetype")
    public Issuetype getIssuetype() {
        return issuetype;
    }

    @JsonProperty("issuetype")
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @JsonProperty("timespent")
    public Object getTimespent() {
        return timespent;
    }

    @JsonProperty("timespent")
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

    @JsonProperty("customfield_10030")
    public Object getCustomfield10030() {
        return customfield10030;
    }

    @JsonProperty("customfield_10030")
    public void setCustomfield10030(Object customfield10030) {
        this.customfield10030 = customfield10030;
    }

    @JsonProperty("customfield_10031")
    public Object getCustomfield10031() {
        return customfield10031;
    }

    @JsonProperty("customfield_10031")
    public void setCustomfield10031(Object customfield10031) {
        this.customfield10031 = customfield10031;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("customfield_10032")
    public List<Object> getCustomfield10032() {
        return customfield10032;
    }

    @JsonProperty("customfield_10032")
    public void setCustomfield10032(List<Object> customfield10032) {
        this.customfield10032 = customfield10032;
    }

    @JsonProperty("customfield_10033")
    public Object getCustomfield10033() {
        return customfield10033;
    }

    @JsonProperty("customfield_10033")
    public void setCustomfield10033(Object customfield10033) {
        this.customfield10033 = customfield10033;
    }

    @JsonProperty("fixVersions")
    public List<Object> getFixVersions() {
        return fixVersions;
    }

    @JsonProperty("fixVersions")
    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }

    @JsonProperty("aggregatetimespent")
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    @JsonProperty("aggregatetimespent")
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    @JsonProperty("customfield_10034")
    public Object getCustomfield10034() {
        return customfield10034;
    }

    @JsonProperty("customfield_10034")
    public void setCustomfield10034(Object customfield10034) {
        this.customfield10034 = customfield10034;
    }

    @JsonProperty("customfield_10035")
    public Object getCustomfield10035() {
        return customfield10035;
    }

    @JsonProperty("customfield_10035")
    public void setCustomfield10035(Object customfield10035) {
        this.customfield10035 = customfield10035;
    }

    @JsonProperty("resolution")
    public Object getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    @JsonProperty("customfield_10027")
    public Object getCustomfield10027() {
        return customfield10027;
    }

    @JsonProperty("customfield_10027")
    public void setCustomfield10027(Object customfield10027) {
        this.customfield10027 = customfield10027;
    }

    @JsonProperty("customfield_10028")
    public Object getCustomfield10028() {
        return customfield10028;
    }

    @JsonProperty("customfield_10028")
    public void setCustomfield10028(Object customfield10028) {
        this.customfield10028 = customfield10028;
    }

    @JsonProperty("customfield_10029")
    public Object getCustomfield10029() {
        return customfield10029;
    }

    @JsonProperty("customfield_10029")
    public void setCustomfield10029(Object customfield10029) {
        this.customfield10029 = customfield10029;
    }

    @JsonProperty("resolutiondate")
    public Object getResolutiondate() {
        return resolutiondate;
    }

    @JsonProperty("resolutiondate")
    public void setResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    @JsonProperty("workratio")
    public Integer getWorkratio() {
        return workratio;
    }

    @JsonProperty("workratio")
    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @JsonProperty("lastViewed")
    public String getLastViewed() {
        return lastViewed;
    }

    @JsonProperty("lastViewed")
    public void setLastViewed(String lastViewed) {
        this.lastViewed = lastViewed;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("customfield_10020")
    public Object getCustomfield10020() {
        return customfield10020;
    }

    @JsonProperty("customfield_10020")
    public void setCustomfield10020(Object customfield10020) {
        this.customfield10020 = customfield10020;
    }

    @JsonProperty("customfield_10021")
    public Object getCustomfield10021() {
        return customfield10021;
    }

    @JsonProperty("customfield_10021")
    public void setCustomfield10021(Object customfield10021) {
        this.customfield10021 = customfield10021;
    }

    @JsonProperty("customfield_10022")
    public Object getCustomfield10022() {
        return customfield10022;
    }

    @JsonProperty("customfield_10022")
    public void setCustomfield10022(Object customfield10022) {
        this.customfield10022 = customfield10022;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("customfield_10023")
    public Object getCustomfield10023() {
        return customfield10023;
    }

    @JsonProperty("customfield_10023")
    public void setCustomfield10023(Object customfield10023) {
        this.customfield10023 = customfield10023;
    }

    @JsonProperty("customfield_10024")
    public Object getCustomfield10024() {
        return customfield10024;
    }

    @JsonProperty("customfield_10024")
    public void setCustomfield10024(Object customfield10024) {
        this.customfield10024 = customfield10024;
    }

    @JsonProperty("customfield_10025")
    public Object getCustomfield10025() {
        return customfield10025;
    }

    @JsonProperty("customfield_10025")
    public void setCustomfield10025(Object customfield10025) {
        this.customfield10025 = customfield10025;
    }

    @JsonProperty("customfield_10026")
    public Object getCustomfield10026() {
        return customfield10026;
    }

    @JsonProperty("customfield_10026")
    public void setCustomfield10026(Object customfield10026) {
        this.customfield10026 = customfield10026;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("customfield_10016")
    public Object getCustomfield10016() {
        return customfield10016;
    }

    @JsonProperty("customfield_10016")
    public void setCustomfield10016(Object customfield10016) {
        this.customfield10016 = customfield10016;
    }

    @JsonProperty("customfield_10017")
    public String getCustomfield10017() {
        return customfield10017;
    }

    @JsonProperty("customfield_10017")
    public void setCustomfield10017(String customfield10017) {
        this.customfield10017 = customfield10017;
    }

    @JsonProperty("customfield_10018")
    public Customfield10018 getCustomfield10018() {
        return customfield10018;
    }

    @JsonProperty("customfield_10018")
    public void setCustomfield10018(Customfield10018 customfield10018) {
        this.customfield10018 = customfield10018;
    }

    @JsonProperty("customfield_10019")
    public String getCustomfield10019() {
        return customfield10019;
    }

    @JsonProperty("customfield_10019")
    public void setCustomfield10019(String customfield10019) {
        this.customfield10019 = customfield10019;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    @JsonProperty("timeestimate")
    public Object getTimeestimate() {
        return timeestimate;
    }

    @JsonProperty("timeestimate")
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    @JsonProperty("issuelinks")
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    @JsonProperty("timeoriginalestimate")
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    @JsonProperty("timeoriginalestimate")
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("customfield_10010")
    public Object getCustomfield10010() {
        return customfield10010;
    }

    @JsonProperty("customfield_10010")
    public void setCustomfield10010(Object customfield10010) {
        this.customfield10010 = customfield10010;
    }

    @JsonProperty("customfield_10014")
    public Object getCustomfield10014() {
        return customfield10014;
    }

    @JsonProperty("customfield_10014")
    public void setCustomfield10014(Object customfield10014) {
        this.customfield10014 = customfield10014;
    }

    @JsonProperty("customfield_10015")
    public Object getCustomfield10015() {
        return customfield10015;
    }

    @JsonProperty("customfield_10015")
    public void setCustomfield10015(Object customfield10015) {
        this.customfield10015 = customfield10015;
    }

    @JsonProperty("customfield_10005")
    public Object getCustomfield10005() {
        return customfield10005;
    }

    @JsonProperty("customfield_10005")
    public void setCustomfield10005(Object customfield10005) {
        this.customfield10005 = customfield10005;
    }

    @JsonProperty("customfield_10006")
    public Object getCustomfield10006() {
        return customfield10006;
    }

    @JsonProperty("customfield_10006")
    public void setCustomfield10006(Object customfield10006) {
        this.customfield10006 = customfield10006;
    }

    @JsonProperty("customfield_10007")
    public Object getCustomfield10007() {
        return customfield10007;
    }

    @JsonProperty("customfield_10007")
    public void setCustomfield10007(Object customfield10007) {
        this.customfield10007 = customfield10007;
    }

    @JsonProperty("security")
    public Object getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(Object security) {
        this.security = security;
    }

    @JsonProperty("customfield_10008")
    public Object getCustomfield10008() {
        return customfield10008;
    }

    @JsonProperty("customfield_10008")
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    @JsonProperty("customfield_10009")
    public Object getCustomfield10009() {
        return customfield10009;
    }

    @JsonProperty("customfield_10009")
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    @JsonProperty("aggregatetimeestimate")
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    @JsonProperty("aggregatetimeestimate")
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("subtasks")
    public List<Object> getSubtasks() {
        return subtasks;
    }

    @JsonProperty("subtasks")
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @JsonProperty("aggregateprogress")
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    @JsonProperty("aggregateprogress")
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    @JsonProperty("customfield_10001")
    public Object getCustomfield10001() {
        return customfield10001;
    }

    @JsonProperty("customfield_10001")
    public void setCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
    }

    @JsonProperty("customfield_10002")
    public Object getCustomfield10002() {
        return customfield10002;
    }

    @JsonProperty("customfield_10002")
    public void setCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
    }

    @JsonProperty("customfield_10003")
    public Object getCustomfield10003() {
        return customfield10003;
    }

    @JsonProperty("customfield_10003")
    public void setCustomfield10003(Object customfield10003) {
        this.customfield10003 = customfield10003;
    }

    @JsonProperty("customfield_10004")
    public Object getCustomfield10004() {
        return customfield10004;
    }

    @JsonProperty("customfield_10004")
    public void setCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
    }

    @JsonProperty("environment")
    public Object getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    @JsonProperty("duedate")
    public Object getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
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
        sb.append(Fields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statuscategorychangedate");
        sb.append('=');
        sb.append(((this.statuscategorychangedate == null)?"<null>":this.statuscategorychangedate));
        sb.append(',');
        sb.append("issuetype");
        sb.append('=');
        sb.append(((this.issuetype == null)?"<null>":this.issuetype));
        sb.append(',');
        sb.append("timespent");
        sb.append('=');
        sb.append(((this.timespent == null)?"<null>":this.timespent));
        sb.append(',');
        sb.append("customfield10030");
        sb.append('=');
        sb.append(((this.customfield10030 == null)?"<null>":this.customfield10030));
        sb.append(',');
        sb.append("customfield10031");
        sb.append('=');
        sb.append(((this.customfield10031 == null)?"<null>":this.customfield10031));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("customfield10032");
        sb.append('=');
        sb.append(((this.customfield10032 == null)?"<null>":this.customfield10032));
        sb.append(',');
        sb.append("customfield10033");
        sb.append('=');
        sb.append(((this.customfield10033 == null)?"<null>":this.customfield10033));
        sb.append(',');
        sb.append("fixVersions");
        sb.append('=');
        sb.append(((this.fixVersions == null)?"<null>":this.fixVersions));
        sb.append(',');
        sb.append("aggregatetimespent");
        sb.append('=');
        sb.append(((this.aggregatetimespent == null)?"<null>":this.aggregatetimespent));
        sb.append(',');
        sb.append("customfield10034");
        sb.append('=');
        sb.append(((this.customfield10034 == null)?"<null>":this.customfield10034));
        sb.append(',');
        sb.append("customfield10035");
        sb.append('=');
        sb.append(((this.customfield10035 == null)?"<null>":this.customfield10035));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("customfield10027");
        sb.append('=');
        sb.append(((this.customfield10027 == null)?"<null>":this.customfield10027));
        sb.append(',');
        sb.append("customfield10028");
        sb.append('=');
        sb.append(((this.customfield10028 == null)?"<null>":this.customfield10028));
        sb.append(',');
        sb.append("customfield10029");
        sb.append('=');
        sb.append(((this.customfield10029 == null)?"<null>":this.customfield10029));
        sb.append(',');
        sb.append("resolutiondate");
        sb.append('=');
        sb.append(((this.resolutiondate == null)?"<null>":this.resolutiondate));
        sb.append(',');
        sb.append("workratio");
        sb.append('=');
        sb.append(((this.workratio == null)?"<null>":this.workratio));
        sb.append(',');
        sb.append("watches");
        sb.append('=');
        sb.append(((this.watches == null)?"<null>":this.watches));
        sb.append(',');
        sb.append("lastViewed");
        sb.append('=');
        sb.append(((this.lastViewed == null)?"<null>":this.lastViewed));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("customfield10020");
        sb.append('=');
        sb.append(((this.customfield10020 == null)?"<null>":this.customfield10020));
        sb.append(',');
        sb.append("customfield10021");
        sb.append('=');
        sb.append(((this.customfield10021 == null)?"<null>":this.customfield10021));
        sb.append(',');
        sb.append("customfield10022");
        sb.append('=');
        sb.append(((this.customfield10022 == null)?"<null>":this.customfield10022));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("customfield10023");
        sb.append('=');
        sb.append(((this.customfield10023 == null)?"<null>":this.customfield10023));
        sb.append(',');
        sb.append("customfield10024");
        sb.append('=');
        sb.append(((this.customfield10024 == null)?"<null>":this.customfield10024));
        sb.append(',');
        sb.append("customfield10025");
        sb.append('=');
        sb.append(((this.customfield10025 == null)?"<null>":this.customfield10025));
        sb.append(',');
        sb.append("customfield10026");
        sb.append('=');
        sb.append(((this.customfield10026 == null)?"<null>":this.customfield10026));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("customfield10016");
        sb.append('=');
        sb.append(((this.customfield10016 == null)?"<null>":this.customfield10016));
        sb.append(',');
        sb.append("customfield10017");
        sb.append('=');
        sb.append(((this.customfield10017 == null)?"<null>":this.customfield10017));
        sb.append(',');
        sb.append("customfield10018");
        sb.append('=');
        sb.append(((this.customfield10018 == null)?"<null>":this.customfield10018));
        sb.append(',');
        sb.append("customfield10019");
        sb.append('=');
        sb.append(((this.customfield10019 == null)?"<null>":this.customfield10019));
        sb.append(',');
        sb.append("aggregatetimeoriginalestimate");
        sb.append('=');
        sb.append(((this.aggregatetimeoriginalestimate == null)?"<null>":this.aggregatetimeoriginalestimate));
        sb.append(',');
        sb.append("timeestimate");
        sb.append('=');
        sb.append(((this.timeestimate == null)?"<null>":this.timeestimate));
        sb.append(',');
        sb.append("versions");
        sb.append('=');
        sb.append(((this.versions == null)?"<null>":this.versions));
        sb.append(',');
        sb.append("issuelinks");
        sb.append('=');
        sb.append(((this.issuelinks == null)?"<null>":this.issuelinks));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        sb.append("timeoriginalestimate");
        sb.append('=');
        sb.append(((this.timeoriginalestimate == null)?"<null>":this.timeoriginalestimate));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("customfield10010");
        sb.append('=');
        sb.append(((this.customfield10010 == null)?"<null>":this.customfield10010));
        sb.append(',');
        sb.append("customfield10014");
        sb.append('=');
        sb.append(((this.customfield10014 == null)?"<null>":this.customfield10014));
        sb.append(',');
        sb.append("customfield10015");
        sb.append('=');
        sb.append(((this.customfield10015 == null)?"<null>":this.customfield10015));
        sb.append(',');
        sb.append("customfield10005");
        sb.append('=');
        sb.append(((this.customfield10005 == null)?"<null>":this.customfield10005));
        sb.append(',');
        sb.append("customfield10006");
        sb.append('=');
        sb.append(((this.customfield10006 == null)?"<null>":this.customfield10006));
        sb.append(',');
        sb.append("customfield10007");
        sb.append('=');
        sb.append(((this.customfield10007 == null)?"<null>":this.customfield10007));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("customfield10008");
        sb.append('=');
        sb.append(((this.customfield10008 == null)?"<null>":this.customfield10008));
        sb.append(',');
        sb.append("customfield10009");
        sb.append('=');
        sb.append(((this.customfield10009 == null)?"<null>":this.customfield10009));
        sb.append(',');
        sb.append("aggregatetimeestimate");
        sb.append('=');
        sb.append(((this.aggregatetimeestimate == null)?"<null>":this.aggregatetimeestimate));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("creator");
        sb.append('=');
        sb.append(((this.creator == null)?"<null>":this.creator));
        sb.append(',');
        sb.append("subtasks");
        sb.append('=');
        sb.append(((this.subtasks == null)?"<null>":this.subtasks));
        sb.append(',');
        sb.append("reporter");
        sb.append('=');
        sb.append(((this.reporter == null)?"<null>":this.reporter));
        sb.append(',');
        sb.append("aggregateprogress");
        sb.append('=');
        sb.append(((this.aggregateprogress == null)?"<null>":this.aggregateprogress));
        sb.append(',');
        sb.append("customfield10001");
        sb.append('=');
        sb.append(((this.customfield10001 == null)?"<null>":this.customfield10001));
        sb.append(',');
        sb.append("customfield10002");
        sb.append('=');
        sb.append(((this.customfield10002 == null)?"<null>":this.customfield10002));
        sb.append(',');
        sb.append("customfield10003");
        sb.append('=');
        sb.append(((this.customfield10003 == null)?"<null>":this.customfield10003));
        sb.append(',');
        sb.append("customfield10004");
        sb.append('=');
        sb.append(((this.customfield10004 == null)?"<null>":this.customfield10004));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null)?"<null>":this.environment));
        sb.append(',');
        sb.append("duedate");
        sb.append('=');
        sb.append(((this.duedate == null)?"<null>":this.duedate));
        sb.append(',');
        sb.append("progress");
        sb.append('=');
        sb.append(((this.progress == null)?"<null>":this.progress));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
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
        result = ((result* 31)+((this.statuscategorychangedate == null)? 0 :this.statuscategorychangedate.hashCode()));
        result = ((result* 31)+((this.issuetype == null)? 0 :this.issuetype.hashCode()));
        result = ((result* 31)+((this.customfield10019 == null)? 0 :this.customfield10019 .hashCode()));
        result = ((result* 31)+((this.timespent == null)? 0 :this.timespent.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.fixVersions == null)? 0 :this.fixVersions.hashCode()));
        result = ((result* 31)+((this.aggregatetimespent == null)? 0 :this.aggregatetimespent.hashCode()));
        result = ((result* 31)+((this.resolution == null)? 0 :this.resolution.hashCode()));
        result = ((result* 31)+((this.resolutiondate == null)? 0 :this.resolutiondate.hashCode()));
        result = ((result* 31)+((this.customfield10010 == null)? 0 :this.customfield10010 .hashCode()));
        result = ((result* 31)+((this.workratio == null)? 0 :this.workratio.hashCode()));
        result = ((result* 31)+((this.customfield10014 == null)? 0 :this.customfield10014 .hashCode()));
        result = ((result* 31)+((this.customfield10016 == null)? 0 :this.customfield10016 .hashCode()));
        result = ((result* 31)+((this.customfield10015 == null)? 0 :this.customfield10015 .hashCode()));
        result = ((result* 31)+((this.customfield10018 == null)? 0 :this.customfield10018 .hashCode()));
        result = ((result* 31)+((this.customfield10017 == null)? 0 :this.customfield10017 .hashCode()));
        result = ((result* 31)+((this.watches == null)? 0 :this.watches.hashCode()));
        result = ((result* 31)+((this.lastViewed == null)? 0 :this.lastViewed.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.aggregatetimeoriginalestimate == null)? 0 :this.aggregatetimeoriginalestimate.hashCode()));
        result = ((result* 31)+((this.timeestimate == null)? 0 :this.timeestimate.hashCode()));
        result = ((result* 31)+((this.versions == null)? 0 :this.versions.hashCode()));
        result = ((result* 31)+((this.customfield10021 == null)? 0 :this.customfield10021 .hashCode()));
        result = ((result* 31)+((this.customfield10020 == null)? 0 :this.customfield10020 .hashCode()));
        result = ((result* 31)+((this.customfield10023 == null)? 0 :this.customfield10023 .hashCode()));
        result = ((result* 31)+((this.customfield10022 == null)? 0 :this.customfield10022 .hashCode()));
        result = ((result* 31)+((this.customfield10025 == null)? 0 :this.customfield10025 .hashCode()));
        result = ((result* 31)+((this.issuelinks == null)? 0 :this.issuelinks.hashCode()));
        result = ((result* 31)+((this.customfield10024 == null)? 0 :this.customfield10024 .hashCode()));
        result = ((result* 31)+((this.assignee == null)? 0 :this.assignee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customfield10027 == null)? 0 :this.customfield10027 .hashCode()));
        result = ((result* 31)+((this.customfield10026 == null)? 0 :this.customfield10026 .hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.customfield10029 == null)? 0 :this.customfield10029 .hashCode()));
        result = ((result* 31)+((this.customfield10028 == null)? 0 :this.customfield10028 .hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.timeoriginalestimate == null)? 0 :this.timeoriginalestimate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this.customfield10030 == null)? 0 :this.customfield10030 .hashCode()));
        result = ((result* 31)+((this.aggregatetimeestimate == null)? 0 :this.aggregatetimeestimate.hashCode()));
        result = ((result* 31)+((this.customfield10032 == null)? 0 :this.customfield10032 .hashCode()));
        result = ((result* 31)+((this.customfield10031 == null)? 0 :this.customfield10031 .hashCode()));
        result = ((result* 31)+((this.customfield10034 == null)? 0 :this.customfield10034 .hashCode()));
        result = ((result* 31)+((this.customfield10033 == null)? 0 :this.customfield10033 .hashCode()));
        result = ((result* 31)+((this.customfield10035 == null)? 0 :this.customfield10035 .hashCode()));
        result = ((result* 31)+((this.customfield10009 == null)? 0 :this.customfield10009 .hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.customfield10008 == null)? 0 :this.customfield10008 .hashCode()));
        result = ((result* 31)+((this.creator == null)? 0 :this.creator.hashCode()));
        result = ((result* 31)+((this.subtasks == null)? 0 :this.subtasks.hashCode()));
        result = ((result* 31)+((this.reporter == null)? 0 :this.reporter.hashCode()));
        result = ((result* 31)+((this.aggregateprogress == null)? 0 :this.aggregateprogress.hashCode()));
        result = ((result* 31)+((this.environment == null)? 0 :this.environment.hashCode()));
        result = ((result* 31)+((this.duedate == null)? 0 :this.duedate.hashCode()));
        result = ((result* 31)+((this.customfield10001 == null)? 0 :this.customfield10001 .hashCode()));
        result = ((result* 31)+((this.progress == null)? 0 :this.progress.hashCode()));
        result = ((result* 31)+((this.customfield10003 == null)? 0 :this.customfield10003 .hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.customfield10002 == null)? 0 :this.customfield10002 .hashCode()));
        result = ((result* 31)+((this.customfield10005 == null)? 0 :this.customfield10005 .hashCode()));
        result = ((result* 31)+((this.customfield10004 == null)? 0 :this.customfield10004 .hashCode()));
        result = ((result* 31)+((this.customfield10007 == null)? 0 :this.customfield10007 .hashCode()));
        result = ((result* 31)+((this.customfield10006 == null)? 0 :this.customfield10006 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fields) == false) {
            return false;
        }
        Fields rhs = ((Fields) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.statuscategorychangedate == rhs.statuscategorychangedate)||((this.statuscategorychangedate!= null)&&this.statuscategorychangedate.equals(rhs.statuscategorychangedate)))&&((this.issuetype == rhs.issuetype)||((this.issuetype!= null)&&this.issuetype.equals(rhs.issuetype))))&&((this.customfield10019 == rhs.customfield10019)||((this.customfield10019 != null)&&this.customfield10019 .equals(rhs.customfield10019))))&&((this.timespent == rhs.timespent)||((this.timespent!= null)&&this.timespent.equals(rhs.timespent))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.fixVersions == rhs.fixVersions)||((this.fixVersions!= null)&&this.fixVersions.equals(rhs.fixVersions))))&&((this.aggregatetimespent == rhs.aggregatetimespent)||((this.aggregatetimespent!= null)&&this.aggregatetimespent.equals(rhs.aggregatetimespent))))&&((this.resolution == rhs.resolution)||((this.resolution!= null)&&this.resolution.equals(rhs.resolution))))&&((this.resolutiondate == rhs.resolutiondate)||((this.resolutiondate!= null)&&this.resolutiondate.equals(rhs.resolutiondate))))&&((this.customfield10010 == rhs.customfield10010)||((this.customfield10010 != null)&&this.customfield10010 .equals(rhs.customfield10010))))&&((this.workratio == rhs.workratio)||((this.workratio!= null)&&this.workratio.equals(rhs.workratio))))&&((this.customfield10014 == rhs.customfield10014)||((this.customfield10014 != null)&&this.customfield10014 .equals(rhs.customfield10014))))&&((this.customfield10016 == rhs.customfield10016)||((this.customfield10016 != null)&&this.customfield10016 .equals(rhs.customfield10016))))&&((this.customfield10015 == rhs.customfield10015)||((this.customfield10015 != null)&&this.customfield10015 .equals(rhs.customfield10015))))&&((this.customfield10018 == rhs.customfield10018)||((this.customfield10018 != null)&&this.customfield10018 .equals(rhs.customfield10018))))&&((this.customfield10017 == rhs.customfield10017)||((this.customfield10017 != null)&&this.customfield10017 .equals(rhs.customfield10017))))&&((this.watches == rhs.watches)||((this.watches!= null)&&this.watches.equals(rhs.watches))))&&((this.lastViewed == rhs.lastViewed)||((this.lastViewed!= null)&&this.lastViewed.equals(rhs.lastViewed))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.aggregatetimeoriginalestimate == rhs.aggregatetimeoriginalestimate)||((this.aggregatetimeoriginalestimate!= null)&&this.aggregatetimeoriginalestimate.equals(rhs.aggregatetimeoriginalestimate))))&&((this.timeestimate == rhs.timeestimate)||((this.timeestimate!= null)&&this.timeestimate.equals(rhs.timeestimate))))&&((this.versions == rhs.versions)||((this.versions!= null)&&this.versions.equals(rhs.versions))))&&((this.customfield10021 == rhs.customfield10021)||((this.customfield10021 != null)&&this.customfield10021 .equals(rhs.customfield10021))))&&((this.customfield10020 == rhs.customfield10020)||((this.customfield10020 != null)&&this.customfield10020 .equals(rhs.customfield10020))))&&((this.customfield10023 == rhs.customfield10023)||((this.customfield10023 != null)&&this.customfield10023 .equals(rhs.customfield10023))))&&((this.customfield10022 == rhs.customfield10022)||((this.customfield10022 != null)&&this.customfield10022 .equals(rhs.customfield10022))))&&((this.customfield10025 == rhs.customfield10025)||((this.customfield10025 != null)&&this.customfield10025 .equals(rhs.customfield10025))))&&((this.issuelinks == rhs.issuelinks)||((this.issuelinks!= null)&&this.issuelinks.equals(rhs.issuelinks))))&&((this.customfield10024 == rhs.customfield10024)||((this.customfield10024 != null)&&this.customfield10024 .equals(rhs.customfield10024))))&&((this.assignee == rhs.assignee)||((this.assignee!= null)&&this.assignee.equals(rhs.assignee))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customfield10027 == rhs.customfield10027)||((this.customfield10027 != null)&&this.customfield10027 .equals(rhs.customfield10027))))&&((this.customfield10026 == rhs.customfield10026)||((this.customfield10026 != null)&&this.customfield10026 .equals(rhs.customfield10026))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.customfield10029 == rhs.customfield10029)||((this.customfield10029 != null)&&this.customfield10029 .equals(rhs.customfield10029))))&&((this.customfield10028 == rhs.customfield10028)||((this.customfield10028 != null)&&this.customfield10028 .equals(rhs.customfield10028))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.timeoriginalestimate == rhs.timeoriginalestimate)||((this.timeoriginalestimate!= null)&&this.timeoriginalestimate.equals(rhs.timeoriginalestimate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security))))&&((this.customfield10030 == rhs.customfield10030)||((this.customfield10030 != null)&&this.customfield10030 .equals(rhs.customfield10030))))&&((this.aggregatetimeestimate == rhs.aggregatetimeestimate)||((this.aggregatetimeestimate!= null)&&this.aggregatetimeestimate.equals(rhs.aggregatetimeestimate))))&&((this.customfield10032 == rhs.customfield10032)||((this.customfield10032 != null)&&this.customfield10032 .equals(rhs.customfield10032))))&&((this.customfield10031 == rhs.customfield10031)||((this.customfield10031 != null)&&this.customfield10031 .equals(rhs.customfield10031))))&&((this.customfield10034 == rhs.customfield10034)||((this.customfield10034 != null)&&this.customfield10034 .equals(rhs.customfield10034))))&&((this.customfield10033 == rhs.customfield10033)||((this.customfield10033 != null)&&this.customfield10033 .equals(rhs.customfield10033))))&&((this.customfield10035 == rhs.customfield10035)||((this.customfield10035 != null)&&this.customfield10035 .equals(rhs.customfield10035))))&&((this.customfield10009 == rhs.customfield10009)||((this.customfield10009 != null)&&this.customfield10009 .equals(rhs.customfield10009))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.customfield10008 == rhs.customfield10008)||((this.customfield10008 != null)&&this.customfield10008 .equals(rhs.customfield10008))))&&((this.creator == rhs.creator)||((this.creator!= null)&&this.creator.equals(rhs.creator))))&&((this.subtasks == rhs.subtasks)||((this.subtasks!= null)&&this.subtasks.equals(rhs.subtasks))))&&((this.reporter == rhs.reporter)||((this.reporter!= null)&&this.reporter.equals(rhs.reporter))))&&((this.aggregateprogress == rhs.aggregateprogress)||((this.aggregateprogress!= null)&&this.aggregateprogress.equals(rhs.aggregateprogress))))&&((this.environment == rhs.environment)||((this.environment!= null)&&this.environment.equals(rhs.environment))))&&((this.duedate == rhs.duedate)||((this.duedate!= null)&&this.duedate.equals(rhs.duedate))))&&((this.customfield10001 == rhs.customfield10001)||((this.customfield10001 != null)&&this.customfield10001 .equals(rhs.customfield10001))))&&((this.progress == rhs.progress)||((this.progress!= null)&&this.progress.equals(rhs.progress))))&&((this.customfield10003 == rhs.customfield10003)||((this.customfield10003 != null)&&this.customfield10003 .equals(rhs.customfield10003))))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.customfield10002 == rhs.customfield10002)||((this.customfield10002 != null)&&this.customfield10002 .equals(rhs.customfield10002))))&&((this.customfield10005 == rhs.customfield10005)||((this.customfield10005 != null)&&this.customfield10005 .equals(rhs.customfield10005))))&&((this.customfield10004 == rhs.customfield10004)||((this.customfield10004 != null)&&this.customfield10004 .equals(rhs.customfield10004))))&&((this.customfield10007 == rhs.customfield10007)||((this.customfield10007 != null)&&this.customfield10007 .equals(rhs.customfield10007))))&&((this.customfield10006 == rhs.customfield10006)||((this.customfield10006 != null)&&this.customfield10006 .equals(rhs.customfield10006))));
    }

}
