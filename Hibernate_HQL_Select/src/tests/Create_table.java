package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Employee;

public class Create_table
{
	public static void main(String[] args)
	{
		// here 1st datas are inserted;
		
        Configuration cfg=new Configuration();
        cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf= cfg.buildSessionFactory();
       Session s= sf.openSession();
       Transaction t= s.beginTransaction();
       
       Employee e1=new Employee(100,"abhi","abhi@gmail.com",40000);
       Employee e2=new Employee(200,"surya","surya@gmail.com",50000);
       Employee e3=new Employee(300,"amiya","amiya@gmail.com",60000);
       Employee e4=new Employee(400,"nanda","nanda@gmail.com",70000);
       Employee e5=new Employee(500,"abinash","abinash@gmail.com",80000);
       
       s.save(e1);
       s.save(e2);
       s.save(e3);
       s.save(e4);
       s.save(e5);
       t.commit();
       System.out.println("records inserted successfully");
       s.close();
       sf.close();
	}

}
