package tests;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import classes.Employee;

public class select_Single_row
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       String query="from Employee where name='abhi'";
       Query q=s.createQuery(query);
       Employee emp=(Employee)q.uniqueResult();
       System.out.println("id \t name \t mail \t\t salary");
       System.out.println("======================================================");
       System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getMail()+" \t"+emp.getSalary());
       System.out.println("data retrived successfully");
	   }

}
