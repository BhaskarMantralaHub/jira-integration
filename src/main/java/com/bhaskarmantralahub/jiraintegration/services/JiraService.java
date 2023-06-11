package com.bhaskarmantralahub.jiraintegration.services;

import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.model.JiraQuery;
import com.bhaskarmantralahub.jiraintegration.schema.Issue;
import com.bhaskarmantralahub.jiraintegration.schema.JiraQueryResponse;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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


    public List<String> getEpics() {
        ResponseEntity<JiraQueryResponse> responseEntity = new RestTemplate().exchange(getJiraQuery(),
                HttpMethod.GET, new HttpEntity<>(httpHeaders()), JiraQueryResponse.class);

        System.out.println(responseEntity);
        if (!responseEntity.hasBody() || responseEntity.getBody() == null) return Collections.emptyList();

        JiraQueryResponse jiraQueryResponse = responseEntity.getBody();
        if (jiraQueryResponse.getIssues().size() == 0) return Collections.emptyList();

        return jiraQueryResponse.getIssues().stream().map(Issue::getKey).toList();
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
