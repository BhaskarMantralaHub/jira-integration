package com.bhaskarmantralahub.jiraintegration.services;

import com.bhaskarmantralahub.jiraintegration.DateUtil;
import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.model.JiraQuery;
import com.bhaskarmantralahub.jiraintegration.schema.Fields;
import com.bhaskarmantralahub.jiraintegration.schema.Issue;
import com.bhaskarmantralahub.jiraintegration.schema.JiraQueryResponse;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class JiraService {

    public final Jira jira;

    public JiraService(Jira jira) {
        this.jira = jira;
    }

    public String getJiraQuery() {
        return JiraQuery
                .builder()
                .baseUri(jira.getBaseuri())
                .issueType(jira.getIssueType())
                .project(jira.getProject())
                .issueStatus(jira.getIssueStatus())
                .jquery(jira.getJquery())
                .build();
    }

    public String getJiraSearchUrl(String key) {
        return jira.getDomain().concat("/browse/").concat(key);
    }


    public List<JiraIssue> getIssues() {
        String jiraQuery = getJiraQuery();
        System.out.println("Jira Query: " + jiraQuery);
        ResponseEntity<JiraQueryResponse> responseEntity = new RestTemplate().exchange(jiraQuery,
                HttpMethod.GET, new HttpEntity<>(httpHeaders()), JiraQueryResponse.class);

        System.out.println(responseEntity);
        if (!responseEntity.hasBody() || responseEntity.getBody() == null) return Collections.emptyList();

        JiraQueryResponse jiraQueryResponse = responseEntity.getBody();
        List<Issue> issues = jiraQueryResponse.getIssues();
        if (issues.size() == 0) return Collections.emptyList();
        List<JiraIssue> jiraIssues = new ArrayList<>();

        for (Issue issue : issues) {
            Fields fields = issue.getFields();
            JiraIssue jiraIssue = JiraIssue
                    .builder()
                    .issueName(issue.getKey())
                    .issueType(fields.getIssuetype().getName())
                    .project(fields.getProject().getName())
                    .reporter(fields.getReporter().getDisplayName())
                    .createdAt(fields.getCreated())
                    .priority(fields.getPriority().getName())
                    .assignee(fields.getAssignee().getDisplayName())
                    .updatedAt(fields.getUpdated())
                    .searchUrl(getJiraSearchUrl(issue.getKey()))
                    .description(issue.getFields().getSummary())
                    .currentStatus(fields.getStatus().getName())
                    .lastUpdatedByService(DateUtil.getCurrentDate())
                    .build();
            jiraIssues.add(jiraIssue);
        }

        return jiraIssues;
    }

    private String getBasicAuthHeader() {
        String credentials = String.format("%s:%s", jira.getUserName(), jira.getToken());
        return new String(Base64.encodeBase64(credentials.getBytes()));
    }

    private HttpHeaders httpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Basic " + getBasicAuthHeader());
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        return httpHeaders;
    }
}
