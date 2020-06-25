package com.jspider.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Capital implements InitializingBean,DisposableBean
{
	private String capitalNm;
	public Capital()
	{
		System.out.println("Initialized Capital object");
	}
	public String getCapitalNm() {
		return capitalNm;
	}
	public void setCapitalNm(String capitalNm) {
		this.capitalNm = capitalNm;
	}
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("inside Init method");
	}
	@Override
	public void destroy() throws Exception
	{
		System.out.println("inside destroy method");
		
	}
	
}
