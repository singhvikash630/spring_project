package com.jspider.springs.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.spring.pojo.Capital;
import com.java.spring.pojo.Country;


public class SpringTest {

	public static void main(String[] args) 
	{
			
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res); 
		Country countryObj=(Country) factory.getBean("countryBean");
		String countryNm=countryObj.getCountryNm();
		
		Capital capitalObj=countryObj.getCapitalObj();
		String capitalNm="";
		if(capitalObj!=null)
		{
			capitalNm=capitalObj.getCapitalNm();
		}
		else
		{
			capitalNm="Default";
		}
		System.out.println(capitalNm+"is the capital of"+countryNm);
		
		
		
		
	}

}
