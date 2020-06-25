package com.java.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java.spring.pojo.Country;
public class ScopeTest 
{
	public static void main(String[] args) 
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Country countryObj=(Country) appContext.getBean("countryBean");
		String countryName=countryObj.getCountryNm();
		String capitalName=countryObj.getCapitalObj().getCapitalNm();
		System.out.println(capitalName+"is the capital of"+countryName);
		
		Country countryObj1=(Country) appContext.getBean("countryBean");
		System.out.println(countryObj1.getCountryNm());		
		countryObj1.setCountryNm("Srilanka");
		System.out.println(countryObj1.getCountryNm());
		Country countryObj2=(Country) appContext.getBean("countryBean");
		System.out.println(countryObj2.getCountryNm());
	}
}
