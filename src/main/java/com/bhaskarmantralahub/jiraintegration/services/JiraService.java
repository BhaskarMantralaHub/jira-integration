package com.bhaskarmantralahub.jiraintegration.services;

import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.model.JiraQuery;
import com.bhaskarmantralahub.jiraintegration.schema.Fields;
import com.bhaskarmantralahub.jiraintegration.schema.Issue;
import com.bhaskarmantralahub.jiraintegration.schema.JiraQueryResponse;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Service
public class JiraService {

    @Autowired
    Jira jira;

    public String getJiraQuery() {
        return JiraQuery
                .builder()
                .baseUri(jira.getBaseuri())
                .issueType(jira.getIssueType())
                .project(jira.getProject())
                .build();
    }


    public List<JiraIssue> getEpics() {
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
                    .issueId(issue.getKey())
                    .issueType(fields.getIssuetype().getName())
                    .project(fields.getProject().getName())
                    .reporter(fields.getReporter().getDisplayName())
                    .createdAt(fields.getCreated())
                    .priority(fields.getPriority().getName())
                    .assignee(fields.getAssignee().getDisplayName())
                    .updatedAt(fields.getUpdated())
                    .currentStatus(fields.getStatus().getName()).build();
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
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return httpHeaders;
    }
}
