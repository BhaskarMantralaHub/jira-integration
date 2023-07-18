package com.bhaskarmantralahub.jiraintegration.controller;

import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.repository.JiraSearchDynamoDBRepository;
import com.bhaskarmantralahub.jiraintegration.services.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/dynamodb")
public class DynamoDBController {

    @Autowired
    private JiraSearchDynamoDBRepository jiraSearchDynamoDBRepository;

    @Autowired
    JiraService jiraService;


    @GetMapping("/save/all")
    public List<JiraSearchEntity> saveAll() {
        List<JiraIssue> issues = jiraService.getIssues();
        List<JiraSearchEntity> allEntities = new ArrayList<>();
        issues.forEach(jiraIssue -> {
            JiraSearchEntity jiraSearchEntity = new JiraSearchEntity();
            jiraSearchEntity.setAssignee(jiraIssue.getAssignee());
            jiraSearchEntity.setIssueName(jiraIssue.getIssueName());
            jiraSearchEntity.setIssueType(jiraIssue.getIssueType());
            jiraSearchEntity.setCreatedAt(jiraIssue.getCreatedAt());
            jiraSearchEntity.setDescription(jiraIssue.getDescription());
            jiraSearchEntity.setCurrentStatus(jiraIssue.getCurrentStatus());
            jiraSearchEntity.setUpdatedAt(jiraIssue.getUpdatedAt());
            jiraSearchEntity.setPriority(jiraIssue.getPriority());
            jiraSearchEntity.setProject(jiraIssue.getProject());
            jiraSearchEntity.setSearchUrl(jiraIssue.getSearchUrl());
            jiraSearchEntity.setReporter(jiraIssue.getReporter());
            jiraSearchDynamoDBRepository.save(jiraSearchEntity);
            allEntities.add(jiraSearchEntity);
        });
        return allEntities;
    }

}
