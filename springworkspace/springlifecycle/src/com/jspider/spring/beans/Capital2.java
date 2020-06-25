package com.jspider.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Capital2
{
	private String capitalNm;
	public Capital2()
	{
		System.out.println("Initialized Capital object");
	}
	public String getCapitalNm() {
		return capitalNm;
	}
	public void setCapitalNm(String capitalNm) {
		this.capitalNm = capitalNm;
	}
	@PostConstruct
	public void anotherInitMethod() throws Exception
	{
		System.out.println("inside Init method");
	}
	@PreDestroy
	public void anotherDestroyMethod() throws Exception
	{
		System.out.println("inside destroy method");
		
	}
	
}
