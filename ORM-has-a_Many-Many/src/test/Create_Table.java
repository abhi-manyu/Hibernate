package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Courses;
import classes.Student;

public class Create_Table
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/costu.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Courses c1=new Courses(111,"core_java",10);
        Courses c2=new Courses(222,"JDBC",5);
        Courses c3=new Courses(333,"servlet",12);
        Courses c4=new Courses(999,"html_css",8);
        /*Courses c5=new Courses(555,"hibernate",3);
        Courses c6=new Courses(777,"spring",2);*/
        
        
        Student s1=new Student(100,"abhimanyu",560,"bangalore");
        Student s2=new Student(300,"arabinda",595,"bhadrak");
        Student s3=new Student(700,"anshuraj",580,"kolkata");
  
        Set<Courses> set1=new HashSet<Courses>();
        set1.add(c1);
        set1.add(c2);
        
        Set<Courses> set2=new HashSet<Courses>();
        set2.add(c3);
        set2.add(c4);
        
        Set<Courses> set3=new HashSet<Courses>();
        set3.add(c1);
        set3.add(c4);
        
        s1.setCourses(set1);
        s2.setCourses(set2);
        s3.setCourses(set3);
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        
        t.commit();
        System.out.println("datas inserted successfully");
        s.close();
        sf.close();
        
	}

}
