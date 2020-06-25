package com.jspider.springs.bean;

public class Country
{
	private String countryName;
	private Capital capitalObj;
	
	/*
	 * DI with setter method
	*/
	/*public Country()
	{
		System.out.println("Intializing Country Object");
	}*/
	/*
	 * DI with constructor
	*/
	public Country(String countryName,Capital capitalObj)
	{
		System.out.println("Initializing Country Object");
	this.countryName=countryName;
	this.capitalObj=capitalObj;
	}
	public String getCountryName() {
		return countryName;
	}
	/*public void setCountryName(String countryName) {
		this.countryName = countryName;
	}*/
	public Capital getCapitalObj() {
		return capitalObj;
	}
	/*public void setCapitalObj(Capital capitalObj) {
		this.capitalObj = capitalObj;
	}*/
	

}
