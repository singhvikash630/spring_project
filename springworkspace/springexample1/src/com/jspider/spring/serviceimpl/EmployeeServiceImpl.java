package com.jspider.spring.serviceimpl;

import com.jspider.spring.dao.EmployeeDAO;
import com.jspider.spring.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDAO employeeDAO;
	public void setEmployeeDAO(EmployeeDAO ed)
	{
		employeeDAO=ed;	
	}
	public void incrementSalary(int empno, int amt)
	{
		int sal=employeeDAO.getSalary(empno);
		sal+=amt;
		employeeDAO.setSalary(empno,sal);
		System.out.println("salary:"+sal);
		System.out.println("updated salary");
	}


}
