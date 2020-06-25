package com.jspider.springs.bean;

public class Capital
{
	private String capitalName;
	public Capital()
	{
		System.out.println("Initializing Capital Object");
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	

}
