package com.jspider.spring.dao;

import com.jspider.spring.myexception.MyException;

public interface AccountDAO 
{
	int getBalance(int accno)throws MyException;
	void setBalance(int accno,int amt)throws MyException;
}
