package org.Hibernate_Testing.drivers;

import java.util.HashSet;
import java.util.Set;

import org.Hibernate_Testing.beans.Address;
import org.Hibernate_Testing.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Driver {
	public static void main(String[] args)
	{
         AnnotationConfiguration cfg=new AnnotationConfiguration();
         cfg.configure("org/Hibernate_Testing/configs/testing.cfg.xml");
         SessionFactory sf=cfg.buildSessionFactory();
         Session s=sf.openSession();
         Transaction t=s.beginTransaction();
         
         Set<String> books=new HashSet<String>();
         books.add("java");
         books.add("Hibernate");
         books.add("Spring");
         
         
         Student s1=new Student(101,"abhi",books);
         s.save(s1);
         t.commit();
         System.out.println("data inserted successfully");
         
         s.close();
         sf.close();
	}

}
