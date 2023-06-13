# jira-integration

## Pre-requisites
* Maven
* Java 17


## Configuration

Add the following to application.yaml under project resources directory
```yaml
server:
  port: 

jira:
  userName: 
  token: 
  project: 
  issueType: 
  issueStatus: 
  domain: https://<>.atlassian.net
  baseuri: https://<>.atlassian.net/rest/api/2/search?jql=
```

## Start the server
```
./mvnw spring-boot:run
```

## API 
```api
http://localhost:<PORT>/jira
```

## Swagger API
```api
http://localhost:28080/jira/api
```
