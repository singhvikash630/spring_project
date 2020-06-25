package com.jspider.springs.bean;

public class A 
{
	private B bRef;
	public A()
	{
		//this.bRef=bRef;
	}

	public B getbRef() {
		return bRef;
	}

	public void setbRef(B bRef) {
		this.bRef = bRef;
	}
	public String printMessage()
	{
	return "I am in class A";	
	}
	

}
