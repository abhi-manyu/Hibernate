package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Employee;

public class Create_Table {

	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/employee.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       
       Employee emp1=new Employee("abhi","manyu","abhi@hmail.com","8043543","abhi");
       Employee emp2=new Employee("manyu","abhi","manyu@hmail.com","456546","manyu");
       Employee emp3=new Employee("arabind","aru","arabin@hmail.com","41331734","aru");
       Employee emp4=new Employee("annirudh","ani","ani@hmail.com","13487956","ani");
       Employee emp5=new Employee("ashok","kumar","ashok@hmail.com","213653235","ashok");
       Employee emp6=new Employee("charu","lata","charu@hmail.com","79879323","charu");
	   
       s.save(emp1);
       s.save(emp2);
       s.save(emp3);
       s.save(emp4);
       s.save(emp5);
       s.save(emp6);
       t.commit();
       System.out.println("datas saved to database");
       s.close();
       sf.close();
	}

}
