package com.jspider.spring.serviceimpl;

import com.jspider.spring.dao.AccountDAO;
import com.jspider.spring.myexception.MyException;
import com.jspider.spring.service.AccountService;

public class AccountServiceImpl implements AccountService
{
	private AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO)
	{
		this.accountDAO=accountDAO;	
	}

	public boolean deposit(int accno, int amt) throws MyException
	{
		System.out.println("in deposit method");
		int bal=accountDAO.getBalance(accno);
		bal+=amt;
		accountDAO.setBalance(accno, bal);
		return true;	
	}

	public boolean withdraw(int accno, int amt)throws MyException 
	{
		System.out.println("in withdraw method");
		int bal=accountDAO.getBalance(accno);
		bal-=amt;
		if(bal>=1000)
		{
			accountDAO.setBalance(accno, bal);
		}
		return false;
	}
	
	


}
