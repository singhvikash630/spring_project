package com.jspider.spring.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jspider.spring.service.EmployeeService;
public class EmployeeServiceTest
{
public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService es=(EmployeeService) context.getBean("employeeService");
	es.incrementSalary(10, 1000);
	}
}
