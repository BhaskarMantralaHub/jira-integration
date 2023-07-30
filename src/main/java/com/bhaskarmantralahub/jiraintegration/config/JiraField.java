package com.bhaskarmantralahub.jiraintegration.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JiraField {

    private String dynamoColumName;
    private String fieldName;
    private String fieldMapping;

}
