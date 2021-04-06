package com.rmg.projecttest;

import java.io.FileInputStream;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingJsonFile {
	
	@Test
	public void crateprojectUsingFile() throws Exception
	{
		RequestSpecification req = RestAssured.given();
		 
		 req.contentType(ContentType.JSON);
		 req.body(new FileInputStream("C://Users/Saif/Desktop/proj.json"));
		 
		 Response response = req.post("http://localhost:8084/addProject");
		 
		 response.prettyPrint();
		 
		 int actualrespCode = response.getStatusCode();
		 System.out.println(actualrespCode);
		 
		 String actualContentType = response.getContentType();
		 System.out.println(actualContentType);
		 
		 Assert.assertEquals(actualrespCode, 201);
	}

}
