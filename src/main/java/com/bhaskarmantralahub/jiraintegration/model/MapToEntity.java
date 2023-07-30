package com.bhaskarmantralahub.jiraintegration.model;

import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;

import java.util.Map;

public class MapToEntity {

    public static JiraSearchEntity convert(Map<String, String> map) {
        JiraSearchEntity jiraSearchEntity = new JiraSearchEntity();
        if (map.containsKey("issueName")) jiraSearchEntity.setIssueName(map.get("issueName"));
        if (map.containsKey("summary")) jiraSearchEntity.setDescription(map.get("summary"));
        if (map.containsKey("issueStatus")) jiraSearchEntity.setCurrentStatus(map.get("issueStatus"));
        if (map.containsKey("reporter")) jiraSearchEntity.setReporter(map.get("reporter"));
        if (map.containsKey("priority")) jiraSearchEntity.setPriority(map.get("priority"));
        if (map.containsKey("assignee")) jiraSearchEntity.setAssignee(map.get("assignee"));

        return jiraSearchEntity;

    }

}

