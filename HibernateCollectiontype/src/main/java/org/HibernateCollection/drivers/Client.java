package org.HibernateCollection.drivers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.HibernateCollection.beans.Address;
import org.HibernateCollection.beans.Courses;
import org.HibernateCollection.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client
{

	public static void main(String[] args)
	{
       AnnotationConfiguration cfg=new AnnotationConfiguration();
       cfg.configure("org/HibernateCollection/configs/collection.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       
       Courses c1=new Courses(111, "JAVA");
       Courses c2=new Courses(222, "HIbernate");
       Courses c3=new Courses(333,"Spring");
       Courses c4=new Courses(444, "Servlet");
       
       List<Courses> course=new ArrayList<Courses>();
       course.add(c1);
       course.add(c2);
       List<Courses> course2=new ArrayList<Courses>();
       course2.add(c4);
       course.add(c3);
       
       Student st=new Student(101, "King", course);
       Student st2=new Student(202, "Queen", course2);
       
       Set<Student> s1=new HashSet<Student>();
       s1.add(st);
       s1.add(st2);
       
       Address a =new Address("Bhubaneswar", s1);
       
       s.save(a);
       t.commit();
       System.out.println("saved successfully");
       s.close();
       sf.close();
	}

}
