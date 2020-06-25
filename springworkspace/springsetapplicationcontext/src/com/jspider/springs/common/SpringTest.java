package com.jspider.springs.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jspider.springs.bean.A;
import com.jspider.springs.bean.B;
import com.jspider.springs.bean.Capital;
import com.jspider.springs.bean.Country;

public class SpringTest {

	public static void main(String[] args) 
	{
		/*Capital capital=new Capital();
		capital.setCapitalName("delhi");
		
		Country country=new Country();
		country.setCountryName("India");
		
		country.setCapitalObj(capital);
		
		
		String countryNm=country.getCountryName();
		String capitalNm=country.getCapitalObj().getCapitalName();
		
		System.out.println(capitalNm+"is capital of"+countryNm);
*/	
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});*/
        /*ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\eclipseprogram\\springaop\\applicationContext.xml");*/		
		/*ApplicationContext applicationContext=new FileSystemXmlApplicationContext(new String[]{"E:\\eclipseprogram\\springaop\\applicationContext.xml"});*/
		
		/*Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res); 
		*/
		Country countryObj=(Country) applicationContext.getBean("countryBean");
		String countryNm=countryObj.getCountryName();
		
		String capitalNm=countryObj.getCapitalName();
		System.out.println(capitalNm+"is the capital of"+countryNm);
		
		/*
		 * circular reference
		*/
		A aObj=(A)applicationContext.getBean("aBean");
		System.out.println(aObj.printMessage());
		System.out.println(aObj.getbRef().printMessage());
		
		B bObj=(B)applicationContext.getBean("bBean");
		System.out.println(bObj.printMessage());
		System.out.println(bObj.getaRef().printMessage());
		
		
		
	}

}
