package com.jspider.spring.service;

import com.jspider.spring.myexception.MyException;

public interface AccountService 
{
	boolean deposit(int accno,int amt)throws MyException;
	boolean withdraw(int accno,int amt)throws MyException;
	

}
