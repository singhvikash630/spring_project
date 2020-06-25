package com.jspider.springs.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jspider.springs.bean.Country;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		//Resource res=new ClassPathResource("applicationContext.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		Country coObj=(Country)ac.getBean("countryBean");
		String name1=coObj.getCountryName();
		String name2=coObj.getCapitalObj().getCapitalName();
		System.out.println(name2+" is the capital of "+name1);

	}
}
