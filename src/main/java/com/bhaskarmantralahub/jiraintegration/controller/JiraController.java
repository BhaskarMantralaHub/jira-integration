package com.bhaskarmantralahub.jiraintegration.controller;

import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.repository.JiraSearchRepository;
import com.bhaskarmantralahub.jiraintegration.services.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jira")
public class JiraController {

    @Autowired
    JiraService jiraService;

    @Autowired
    JiraSearchRepository jiraSearchRepository;

    @GetMapping
    public List<JiraIssue> getEpics() {
        System.out.println(jiraService.getEpics().toString());
        return jiraService.getEpics();
    }

    @PostMapping("/save/search")
    public @ResponseBody ResponseEntity saveSearch(JiraSearchEntity entity) {
        JiraSearchEntity jiraSearchEntity = jiraSearchRepository.save(entity);
        return new ResponseEntity(jiraSearchEntity, HttpStatus.CREATED);
    }
}
