package com.rmg.projectmain;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value= {"name","phoneNo","address"})
public class AssignmentPojo
{
	
	String name;
	int phoneNo[];
    Address address;
    
    public AssignmentPojo()
    {
    	
 
    }
    
	public AssignmentPojo(String name, int[] phone, Address address) {
		this.name = name;
		this.phoneNo = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
    
    

}
