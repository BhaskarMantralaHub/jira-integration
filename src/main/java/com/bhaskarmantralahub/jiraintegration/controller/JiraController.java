package com.bhaskarmantralahub.jiraintegration.controller;

import com.bhaskarmantralahub.jiraintegration.services.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jira")
public class JiraController {

    @Autowired
    JiraService jiraService;

    @GetMapping
    public List<String> getEpics() {
        System.out.println(jiraService.getEpics());
        return jiraService.getEpics();
    }
}
