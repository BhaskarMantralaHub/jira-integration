package com.bhaskarmantralahub.jiraintegration;

import io.restassured.response.Response;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

class JiraTest {

	@Test
	public  void test() {
		Response response = RestAssured.given()
				.log().all()
				.auth().preemptive().basic("bhaskarmantrala@icloud.com", "ATATT3xFfGF0G89wk9EBiP0U-0lsVPo8n9OoGCOUdEvr5qGGGHnwEb7Jp6VAEfX2DTFnrX9uUJ5wDTj0iokty08YcPLRzqhax2XhACJINy28xIeESB5UnODO9ET5olut5jNltDKL8MedpB0cGNMba9iG7LMKtUYQFxyQ53iJhv76Hm01Hdh-WV0=B39AEB28")
				.when()
				.get("https://bhaskarmantralahub.atlassian.net/rest/api/2/search?jql=issuetype%3DEpic%20AND%20project%20%3D%20CHARTER")
				.then().extract().response();

		response.body().prettyPrint();
	}

}
