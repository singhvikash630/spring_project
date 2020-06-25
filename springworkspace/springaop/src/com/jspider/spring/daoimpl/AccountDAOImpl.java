package com.jspider.spring.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.spring.bean.Account;
import com.jspider.spring.dao.AccountDAO;
import com.jspider.spring.myexception.MyException;

public class AccountDAOImpl implements AccountDAO
{
public int getBalance(int accno)throws MyException 
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Account actno=(Account) session.get(Account.class, accno);
	
	int amt=actno.getAmt();	
    return amt;
}

	public void setBalance(int accno, int amt)throws MyException
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		//int salary=(int)sal;
         Account act=null;
         act=new Account();
         act.setAccno(accno);
         act.setAmt(amt);
		session.update(act);
		session.flush();
		session.close();
	
	}
   
}
