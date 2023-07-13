package com.bhaskarmantralahub.jiraintegration.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "jira_log")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JiraLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastUpdatedAt", unique = true)
    private String lastUpdatedAt;

}
