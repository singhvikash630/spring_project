package com.jspider.springs.bean;

public class Country
{
	private String countryName;
	private Capital capitalObj;
	
	Country(String countryName,Capital capitalObj)
	{
	this.countryName=countryName;	
	this.capitalObj=capitalObj;
	}
	public String getCountryName() {
		return countryName;
	}
	
	public Capital getCapitalObj() {
		return capitalObj;
	}
	/*public void setCapitalObj(Capital capitalObj) {
		this.capitalObj = capitalObj;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}*/
	
}
