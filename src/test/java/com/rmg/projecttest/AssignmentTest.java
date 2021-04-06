package com.rmg.projecttest;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import com.rmg.projectmain.Address;
import com.rmg.projectmain.AssignmentPojo;



public class AssignmentTest {
	
	@Test
	public void parseTest() throws Exception
	{
		int phone[]={123132,231233};
		
		AssignmentPojo ap=new AssignmentPojo("Saif",phone , new Address("Delhi", "Bengaluru"));
		
		ObjectMapper obj=new ObjectMapper();
		
		String jsonstr = obj.writeValueAsString(ap);
		
		System.out.println(jsonstr);
		
	}

}
