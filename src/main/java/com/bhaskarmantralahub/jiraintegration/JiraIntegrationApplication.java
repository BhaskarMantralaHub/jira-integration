package com.bhaskarmantralahub.jiraintegration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
@EnableScheduling
public class   JiraIntegrationApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(JiraIntegrationApplication.class, args);
	}

}
