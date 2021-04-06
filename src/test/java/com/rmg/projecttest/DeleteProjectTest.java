package com.rmg.projecttest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	
	@Test
	public void deleteProject()
	{
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_802");
		
		int actualStatusCode = response.getStatusCode();
		
		Assert.assertEquals(actualStatusCode, 204);

	}

}
