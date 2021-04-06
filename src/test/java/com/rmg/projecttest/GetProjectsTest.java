package com.rmg.projecttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProjectsTest 
{

	@Test
	public void getProjects()
	{
		Response response = RestAssured.get("http://localhost:8084/projects");
		
		response.prettyPrint();

		int actualStatusCode = response.getStatusCode();
		System.out.println(actualStatusCode);
		
		String actualContentType = response.getContentType();
		System.out.println(actualContentType);
		
		Assert.assertEquals(actualStatusCode, 200);
	}
	
}
