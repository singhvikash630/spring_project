package com.jspider.spring.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.spring.bean.Employee;
import com.jspider.spring.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO
{
   public int getSalary(int eno)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=(Employee) session.get(Employee.class, eno);
		
		int salary=emp.getSal();	
	   return salary;
	}

	public void setSalary(int eno, int sal)
	{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	//int salary=(int)sal;
	Employee emp=null;
	emp=new Employee();
	emp.setEno(eno);
	emp.setSal(sal);
	session.update(emp);
	session.flush();
	session.close();
		
	}

}
