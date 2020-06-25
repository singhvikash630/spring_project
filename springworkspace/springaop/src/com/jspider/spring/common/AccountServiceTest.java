package com.jspider.spring.common;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.spring.myexception.MyException;
import com.jspider.spring.service.AccountService;
public class AccountServiceTest
{
public static void main(String[] args) throws MyException, BeansException
		{
	    try {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		AccountService es;
		es = (AccountService) context.getBean("accountService");
		System.out.println(es.withdraw(1,1000));
		System.out.println(es.deposit(1, 2000));
		}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
