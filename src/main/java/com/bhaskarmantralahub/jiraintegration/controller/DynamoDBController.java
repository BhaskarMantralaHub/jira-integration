package com.bhaskarmantralahub.jiraintegration.controller;

import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.model.MapToEntity;
import com.bhaskarmantralahub.jiraintegration.repository.JiraSearchDynamoDBRepository;
import com.bhaskarmantralahub.jiraintegration.services.JiraCredentialsService;
import com.bhaskarmantralahub.jiraintegration.services.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController("/dynamodb")
public class DynamoDBController {

    @Autowired
    private JiraSearchDynamoDBRepository jiraSearchDynamoDBRepository;

    @Autowired
    JiraService jiraService;

    @Value("${dynamoDB.env}")
    private String env;

    @Autowired
    JiraCredentialsService jiraCredentialsService;

    @GetMapping("/creds")
    public List<Map<String, String>> getCreds() {
        return jiraService.refreshData();
    }


    @GetMapping("/save/all")
    public List<JiraSearchEntity> saveAll() {
        List<JiraSearchEntity> issues = jiraService.getIssues();
        issues.forEach(jiraIssue -> {
            jiraSearchDynamoDBRepository.save(jiraIssue);
        });
        return issues;
    }

    @GetMapping("read/save/all")
    public List<JiraSearchEntity> readConfigAndsaveAll() {
        List<Map<String, String>> maps = jiraService.refreshData();
        List<JiraSearchEntity> allEntities = new ArrayList<>();
        for (Map<String, String> map : maps) {
            JiraSearchEntity jiraSearchEntity = MapToEntity.convert(map);
            jiraSearchDynamoDBRepository.save(jiraSearchEntity);
            allEntities.add(jiraSearchEntity);
        }
        return allEntities;
    }

}
