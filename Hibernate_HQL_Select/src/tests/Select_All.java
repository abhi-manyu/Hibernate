package tests;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import classes.Employee;

public class Select_All
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/emp.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        String query="from Employee";
        Query q=s.createQuery(query);
        List<Employee> list=q.list();
        System.out.println("all details about the  employees are" );
        System.out.println("emp id\t\temp name\t\temp mail\t\t"
        +"emp salary "
        + "\n==========================================================================");
        for(Employee emp:list)
        {
        	System.out.println(emp.getId()+"\t\t"+emp.getName()+"\t\t"+
               emp.getMail()+"\t\t\t"+emp.getSalary());
        }
	}

}
