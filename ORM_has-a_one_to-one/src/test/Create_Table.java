package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Address;
import classes.Student;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/studadd.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       
       Student s1=new Student(124,"abhimanyu","bangalore");
       Student s2=new Student(223,"Arabinda","odisha");
       
       Address ad1=new Address(236,"VKR_confort_pg","balaji_layout","560037");
       Address ad2=new Address(895,"sai_balaji","morden_layout","756131");
       
       ad1.setStud(s1);
       //ad2.setStud(s1);here constraint error will displayed cuz both address object have 
                        //same plot no that from student id so viaolation from mapping rule
       ad2.setStud(s2);
       
       s.save(ad1);
       s.save(ad2);
       
       
       t.commit();
       System.out.println("recod inserted successfully");
       s.close();
       sf.close();
	}

}
