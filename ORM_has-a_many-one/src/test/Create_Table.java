package test;

import java.util.Date;

import javax.swing.border.EmptyBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Department;
import classes.Employee;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/deptemp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       // create depatment object
       Department dept2=new Department(222,"software_testing","hydrabad");
       Department dept1=new Department();
       dept1.setDept_id(111);
       dept1.setDept_name("software_developing");
       dept1.setDept_place("bengaluru");
       
       //create Employee object
       Employee emp1=new Employee(100,"Abhimanyu","abhi@gmail.com",new Date(95,8,27));
       Employee emp2=new Employee(200,"Arabinda","arabind@gmail.com",new Date(99,12,13));
       Employee emp3=new Employee(300,"Anirudha","anirudha@gmail.com",new Date(88,9,19));
       emp1.setDept(dept1);
       emp2.setDept(dept1);
       emp3.setDept(dept1);
       Employee emp4=new Employee(400,"Ashok","ashok@gmail.com",new Date(88,9,19));
       Employee emp5=new Employee(500,"smitarani","smita@gmail.com",new Date(88,9,19));
       Employee emp6=new Employee(600,"anshuraj","anshu@gmail.com",new Date(88,9,19));
       Employee emp7=new Employee(700,"charulata","charu@gmail.com",new Date(88,9,19));
       emp4.setDept(dept2);
       emp5.setDept(dept2);
       emp6.setDept(dept2);
       emp7.setDept(dept2);
       
       s.save(emp1);
       s.save(emp7);
       s.save(emp3);
       s.save(emp6);
       s.save(emp5);
       s.save(emp4);
       s.save(emp2);
       
       System.out.println("datas are inserted by many to one rule");
       
       t.commit();
       s.close();
       sf.close();
	}
}
