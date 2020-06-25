package com.jspider.springs.bean;

public class B
{
	private A aRef;
	public B()
	{
	//this.aRef=aRef;	
	}
	public A getaRef() {
		return aRef;
	}
	public void setaRef(A aRef) {
		this.aRef = aRef;
	}
	public String printMessage()
	{
	return "I am in class B";	
	}

}
