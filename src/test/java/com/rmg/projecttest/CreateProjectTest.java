package com.rmg.projecttest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest 
{
	
   @Test
   public void createProject()
   {
	 JSONObject jObj=new JSONObject();
	 jObj.put("createdBy", "Saif");
	 jObj.put("createdOn", "5 April 2021");
	 jObj.put("projectName", "spacex");
	 jObj.put("status", "On-going");
	 jObj.put("teamSize", 10);
	 
	 RequestSpecification req = RestAssured.given();
	 
	 req.contentType(ContentType.JSON);
	 req.body(jObj);
	 
	 Response response = req.post("http://localhost:8084/addProject");
	 
	 response.prettyPrint();
	 
	 int actualrespCode = response.getStatusCode();
	 System.out.println(actualrespCode);
	 
	 String actualContentType = response.getContentType();
	 System.out.println(actualContentType);
	 
	 Assert.assertEquals(actualrespCode, 201);
   }
 
}
