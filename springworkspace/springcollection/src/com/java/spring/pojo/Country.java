package com.java.spring.pojo;

public class Country 
{
	private String countryNm;
	private Capital capitalObj;
	public Country()
	{
		System.out.println("Initialized Country Object");
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
	public Capital getCapitalObj() {
		return capitalObj;
	}
	public void setCapitalObj(Capital capitalObj) {
		this.capitalObj = capitalObj;
	}
	
	
    
}
