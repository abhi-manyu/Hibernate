package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import classes.Employee;

public class Data_Delete
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	       cfg.configure("configs/deptemp.cfg.xml");
	       SessionFactory sf=cfg.buildSessionFactory();
	       Session s=sf.openSession();
	       Transaction t=s.beginTransaction();
	       Criteria cr=s.createCriteria(Employee.class);
	       Criterion c= Restrictions.eq("emp_id",100);
	       cr.add(c);
	       Employee emp=(Employee) cr.uniqueResult();
	       s.delete(emp);
	       t.commit();
	       System.out.println("record deleted succesfully");
	       s.close();
	       sf.close();
	}

}
