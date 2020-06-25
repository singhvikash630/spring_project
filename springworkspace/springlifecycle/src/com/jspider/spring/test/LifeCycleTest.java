package com.jspider.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.spring.beans.Capital;
import com.jspider.spring.beans.Capital1;
import com.jspider.spring.beans.Capital2;

public class LifeCycleTest {

	public static void main(String[] args)
	{
		AbstractApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Capital capObj=(Capital) appContext.getBean("capitalBean");
		System.out.println(capObj.getCapitalNm());
		appContext.close();
		
	}

}
