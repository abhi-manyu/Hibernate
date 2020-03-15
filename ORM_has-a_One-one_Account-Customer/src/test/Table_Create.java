package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.CustomCollectionType;

import classes.Account;
import classes.Customer;

public class Table_Create
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/accust.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Account acc1=new Account(1323544,"saving",new Date(2016,12,23),50000);
        Account acc2=new Account(6989889,"saving",new Date(93,8,6),35000);
        
        Customer cust1=new Customer(121688,"abhimanyu","bangalore","8095113494");
        Customer cust2=new Customer(936514,"arabinda","bhadrak","9668159430");
        Customer cust3=new Customer(798133,"anirudha","kolkata","236596869");
        
        cust1.setAcc(acc1);
        cust2.setAcc(acc2);
        
        s.save(cust1);
        s.save(cust2);
        t.commit();
        System.out.println("datas inserted successfully");
        s.close();
        sf.close();
	}

}
