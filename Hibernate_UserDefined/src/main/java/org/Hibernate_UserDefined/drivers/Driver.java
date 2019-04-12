package org.Hibernate_UserDefined.drivers;

import org.Hibernate_UserDefined.Address;
import org.Hibernate_UserDefined.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Driver
{
	public static void main(String[] args)
	{
        AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("org/Hibernate_UserDefined/configs/data.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Address ad=new Address(899,"kolkata pg");
        Address ad2=new Address(454, "Kedarnath pG");
        
        //Student st=new Student(459,"Queen",ad2);
        Student st2=new Student(222,"King",ad);
        
        //s.save(st);
        s.save(st2);
        t.commit();
        sf.close();
        s.close();
        System.out.println("saved successuly");
	}

}
