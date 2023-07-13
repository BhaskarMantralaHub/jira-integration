package com.bhaskarmantralahub.jiraintegration.controller;

import com.bhaskarmantralahub.jiraintegration.DateUtil;
import com.bhaskarmantralahub.jiraintegration.entity.JiraLogEntity;
import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import com.bhaskarmantralahub.jiraintegration.model.JiraIssue;
import com.bhaskarmantralahub.jiraintegration.repository.JiraLogRepository;
import com.bhaskarmantralahub.jiraintegration.repository.JiraSearchRepository;
import com.bhaskarmantralahub.jiraintegration.services.JiraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jira")
public class JiraController {

    @Autowired
    JiraService jiraService;

    @Autowired
    JiraSearchRepository jiraSearchRepository;

    @Autowired
    JiraLogRepository jiraLogRepository;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public List<JiraIssue> getIssues() {
        System.out.println(jiraService.getIssues().toString());
        List<JiraIssue> issues = jiraService.getIssues();
        List<JiraLogEntity> jiraLogEntities = jiraLogRepository.findAll();
        String lastUpdatedAt = jiraLogEntities.get(0).getLastUpdatedAt();
        return issues.stream().filter(jiraIssue -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            try {
                Date date1 = dateFormat.parse(jiraIssue.getUpdatedAt());
                Date date2 = dateFormat.parse(lastUpdatedAt);
                System.out.println(jiraIssue.getIssueName());
                System.out.println(date1);
                System.out.println(date2);
                return date1.compareTo(date2) > 0;
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }

    @PostMapping("/save/all")
//    @Scheduled(cron = "* * * * *")
    public @ResponseBody ResponseEntity saveAllEpics() {
        List<JiraLogEntity> jiraLogEntities = jiraLogRepository.findAll();
        List<JiraIssue> epics = getIssues();

        List<JiraSearchEntity> jiraSearchEntities = epics.stream().map(jiraIssue -> modelMapper.map(jiraIssue, JiraSearchEntity.class)).collect(Collectors.toList());

        jiraSearchEntities.forEach(jiraIssue -> {
            jiraService.saveJiraIssue(jiraIssue);
        });

        //Update timestamp
        jiraLogEntities.get(0).setLastUpdatedAt(DateUtil.getCurrentDate());
        jiraLogRepository.save(jiraLogEntities.get(0));

        return new ResponseEntity(jiraSearchEntities, HttpStatus.CREATED);
    }
}
