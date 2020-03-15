package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Department;
import classes.Employee;

public class Retrive_Data
{
	public static void main(String[] args)
	{ 
		Configuration cfg=new Configuration();
	       cfg.configure("configs/deptemp.cfg.xml");
	       SessionFactory sf=cfg.buildSessionFactory();
	       Session s=sf.openSession();
	       Criteria cr=s.createCriteria(Employee.class);
	       List li=cr.list();
	       Iterator itr=li.iterator();
	       while(itr.hasNext())
	       {
	    	   Employee emp=(Employee)itr.next();
	    	   System.out.print
	    	   (emp.getEmp_id()+"\t"+emp.getEmp_name()+"\t"+emp.getMail()+"\t");
	    	   Department dept=emp.getDept();
	    	   System.out.print(dept.getDept_name()+"\t"+dept.getDept_place());
	    	   System.out.println();
	       }
	    s.close();
	    sf.close();
	}

}
