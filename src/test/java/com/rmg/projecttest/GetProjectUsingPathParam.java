package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProjectUsingPathParam {

	@Test
	public void getProject()
	{
		RequestSpecification req = RestAssured.given();
		req.pathParam("projectId", "TY_PROJ_802");
		 
		 Response response = req.get("http://localhost:8084/projects/{projectId}");
		 
		 System.out.println(response.getStatusCode());

		 System.out.println( response.getContentType());
		 
	}
}
