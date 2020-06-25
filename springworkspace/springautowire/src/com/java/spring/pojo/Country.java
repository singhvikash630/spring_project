package com.java.spring.pojo;

public class Country 
{
	private String countryNm;
	private Capital capitalObj;
	Country()
	{
		System.out.println("Initialized Country Object");
		
	}
	
	/*public Country(String countryNm,Capital capitalObj)
	{
		System.out.println("Initialized Country Object");
		this.countryNm=countryNm;
		this.capitalObj=capitalObj;
	}*/
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
