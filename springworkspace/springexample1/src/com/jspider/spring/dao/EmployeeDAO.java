package com.jspider.spring.dao;

public interface EmployeeDAO 
{
	int getSalary(int eno);
	void setSalary(int eno,int sal);
}
