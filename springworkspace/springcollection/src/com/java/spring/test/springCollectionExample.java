package com.java.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.pojo.Collection;
import com.java.spring.pojo.Country;


public class springCollectionExample {

	public static void main(String[] args) 
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Collection collection=(Collection) appContext.getBean("collectionBean");
		System.out.println(collection);
	}

}
