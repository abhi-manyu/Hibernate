package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.HQL_Update;

public class Test
{
	// class for inserting the records into the table first;
	
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/hql_update.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s= sf.openSession();
       HQL_Update hu=new HQL_Update("abhi","abhi@gmail.com",100);
       Transaction t= s.beginTransaction();
       s.save(hu);
       HQL_Update hu2=new HQL_Update("arabinda","arabinda@gmail.com",200);
       s.save(hu2);
       HQL_Update hu3=new HQL_Update("amiya","amiya@gmail.com",300);
       s.save(hu3);
       HQL_Update hu4=new HQL_Update("nanda","nanda@gmail.com",400);
       s.save(hu4);
       HQL_Update hu5=new HQL_Update("maharana","maharana@gmail.com",500);
       s.save(hu5);
       t.commit();
       System.out.println("insertation successful");
	}

}
