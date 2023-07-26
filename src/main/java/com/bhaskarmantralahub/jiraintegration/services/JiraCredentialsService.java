package com.bhaskarmantralahub.jiraintegration.services;

import com.bhaskarmantralahub.jiraintegration.config.Jira;
import com.bhaskarmantralahub.jiraintegration.entity.JiraUserEntity;
import com.bhaskarmantralahub.jiraintegration.repository.JiraUserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraCredentialsService {

    @Autowired
    JiraUserRepository jiraUserRepository;

    public Jira getCreds(String env) {
        JiraUserEntity jiraUserEntity = jiraUserRepository.findByEnv(env);
        Gson gson = new Gson();
        return gson.fromJson(jiraUserEntity.getUser(), Jira.class);
    }

}
