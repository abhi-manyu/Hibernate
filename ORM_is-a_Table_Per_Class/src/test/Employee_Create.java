package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Admin;
import classes.Hard;
import classes.Soft;

public class Employee_Create {
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       
       Soft sf1=new Soft(111,"abhi","abhi@gmail.com",50000,"hibernate");
       Hard hd1=new Hard(222,"aurobinda","aurobinda@gmail.com",60000, 5);
       Admin ad1=new Admin(333,"anirudha","anirudha@gmail.com",80000,"bhadrak");
       
       s.save(sf1);
       s.save(hd1);
       s.save(ad1);
       t.commit();
       s.close();
       sf.close();
	}

}
