package tests;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import classes.Employee;

public class Max_Salary
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       String query="select max(salary) from Employee";
       Query q=s.createQuery(query);
       int sal=(int) q.uniqueResult();
       System.out.println("the highest salary is : "+sal);
       t.commit();
       s.close();
       sf.close();
	}

}
