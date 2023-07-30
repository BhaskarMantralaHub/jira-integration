package com.bhaskarmantralahub.jiraintegration.services;

import com.bhaskarmantralahub.jiraintegration.DateUtil;
import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.config.JiraField;
import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.model.JiraQuery;
import com.bhaskarmantralahub.jiraintegration.repository.JiraSearchRepository;
import com.bhaskarmantralahub.jiraintegration.schema.Fields;
import com.bhaskarmantralahub.jiraintegration.schema.Issue;
import com.bhaskarmantralahub.jiraintegration.schema.JiraQueryResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;


@Service
public class JiraService {

    //    @Autowired
    JiraSearchRepository jiraSearchRepository;

    @Autowired
    JiraCredentialsService jiraCredentialsService;

    @Value("${dynamoDB.env}")
    private String env;

    public Jira getJira() {
        return jiraCredentialsService.getCreds(env);
    }

    public String getJiraQuery() {
        Jira jira = getJira();
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
        Jira jira = getJira();
        return jira.getDomain().concat("/browse/").concat(key);
    }

    private <T> ResponseEntity<T> getJiraResponse(String jiraQuery, Class<T> input) {
        return new RestTemplate().exchange(jiraQuery,
                HttpMethod.GET, new HttpEntity<>(httpHeaders()), input);
    }

    private String getJiraResponseAsString() {
        String jiraQuery = getJiraQuery();
        System.out.println("Jira Query: " + jiraQuery);
        ResponseEntity<String> responseEntity = getJiraResponse(jiraQuery, String.class);
        if (!responseEntity.hasBody() || responseEntity.getBody() == null) return "{}";
        return responseEntity.getBody();
    }


    public List<JiraSearchEntity> getIssues() {
        String jiraQuery = getJiraQuery();
        System.out.println("Jira Query: " + jiraQuery);

        ResponseEntity<JiraQueryResponse> responseEntity = getJiraResponse(jiraQuery, JiraQueryResponse.class);

        System.out.println(responseEntity);
        if (!responseEntity.hasBody() || responseEntity.getBody() == null) return Collections.emptyList();

        JiraQueryResponse jiraQueryResponse = responseEntity.getBody();
        List<Issue> issues = jiraQueryResponse.getIssues();
        if (issues.size() == 0) return Collections.emptyList();
        List<JiraSearchEntity> jiraIssues = new ArrayList<>();

        for (Issue issue : issues) {
            Fields fields = issue.getFields();
            JiraSearchEntity jiraIssue = JiraSearchEntity
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

    @Scheduled(cron = "0 */6 * * * *")
    public void refreshJiraDefects() {
        System.out.println("Refreshing Jira defects");
    }

    public List<Map<String, String>> refreshData() {
        String jsonResponse = getJiraResponseAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, String>> response = new ArrayList<>();
        Jira jira = jiraCredentialsService.getCreds(env);
        JiraField[] jiraFields = jira.getJiraFields();
        try {
            JsonNode root = objectMapper.readTree(jsonResponse);
            JsonNode issues = root.path("issues");
            issues.forEach(issue -> {
                JsonNode fieldsNode = issue.path("fields");
                JsonNode issueName = issue.path("key");
                Map<String, String> valuesFromResponse = new HashMap<>();
                valuesFromResponse.put("issueName", issueName.asText());
                // Fetch values based on the mapping
                for (JiraField entry : jiraFields) {
                    String field = entry.getDynamoColumName();
                    String responseKey = entry.getFieldMapping();
                    String[] keys = responseKey.split("\\.");
                    JsonNode node = fieldsNode;
                    for (String key : keys) {
                        node = node.path(key);
                        if (node.isMissingNode()) {
                            break;
                        }
                    }
                    valuesFromResponse.put(field, node.isMissingNode() ? null : node.asText());
                }
                response.add(valuesFromResponse);
                // Print the fetched values
                System.out.println(response);
            });

        } catch (IOException e) {
            e.printStackTrace();
        }


        return response;
    }

    public void updateJiraIssue(JiraSearchEntity jiraIssue) {
        if (jiraSearchRepository.existsById(jiraIssue.getIssueName())) {
            JiraSearchEntity jiraSearchEntity = jiraSearchRepository.findById(jiraIssue.getIssueName()).get();
            jiraSearchEntity.setAssignee(jiraIssue.getAssignee());
            jiraSearchEntity.setUpdatedAt(jiraIssue.getUpdatedAt());
            jiraSearchEntity.setReporter(jiraIssue.getReporter());
            jiraSearchEntity.setIssueType(jiraIssue.getIssueType());
            jiraSearchEntity.setPriority(jiraIssue.getPriority());
            jiraSearchEntity.setDescription(jiraIssue.getDescription());
            jiraSearchEntity.setCurrentStatus(jiraIssue.getCurrentStatus());
            jiraSearchRepository.save(jiraSearchEntity);
        }
    }

    public void saveJiraIssue(JiraSearchEntity jiraIssue) {
        if (jiraSearchRepository.existsById(jiraIssue.getIssueName())) {
            updateJiraIssue(jiraIssue);
        } else jiraSearchRepository.save(jiraIssue);
    }

    private String getBasicAuthHeader() {
        Jira jira = getJira();
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
