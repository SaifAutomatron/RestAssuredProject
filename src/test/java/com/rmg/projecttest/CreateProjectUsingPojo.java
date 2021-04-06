package com.rmg.projecttest;

import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmg.projectmain.Project_Pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingPojo {
	
	@Test
	public void crateprojectUsingPojoClass() throws Exception
	{
		RequestSpecification req = RestAssured.given();
		 Project_Pojo proj=new Project_Pojo("m.saif", "5 March 2021", "nexus", "On-Going", 14);
				 
		 req.contentType(ContentType.JSON);
		 req.body(proj);
		 
		 Response response = req.post("http://localhost:8084/addProject");
		 
		 response.prettyPrint();
		 
		 int actualrespCode = response.getStatusCode();
		 System.out.println(actualrespCode);
		 
		 String actualContentType = response.getContentType();
		 System.out.println(actualContentType);
		 
		 Assert.assertEquals(actualrespCode, 201);
	}

}
