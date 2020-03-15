package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Student;

public class Data_Insert
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/student.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Student s1=new Student(101,"abhi",1246);
       s.save(s1);
       t.commit();
       System.out.println("data inserted");
       s.close();
       sf.close();
	}

}
