package com.jspider.springs.bean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Country implements ApplicationContextAware
{
	private String countryName;
	private ApplicationContext appContext;
	public Country()
	{
		System.out.println("Initializing Country Object");
		}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException 
			{
		     this.appContext=appContext;
		    }
	public String getCapitalName()
	{
		Capital capObj=(Capital)appContext.getBean("capitalBean");
		return capObj.getCapitalNm();
	}

}
