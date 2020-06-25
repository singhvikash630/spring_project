package com.jspider.spring.beans;

public class Capital1
{
	private String capitalNm;
	public Capital1()
	{
		System.out.println("Initialized Capital object");
	}
	public String getCapitalNm() {
		return capitalNm;
	}
	public void setCapitalNm(String capitalNm) {
		this.capitalNm = capitalNm;
	}
	public void myInit() throws Exception
	{
		System.out.println("inside Init method");
	}
	
	public void myDestroy() throws Exception
	{
		System.out.println("inside destroy method");
		
	}
	
}
