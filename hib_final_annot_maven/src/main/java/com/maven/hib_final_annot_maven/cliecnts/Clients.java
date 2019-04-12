package com.maven.hib_final_annot_maven.cliecnts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.hib_final_annot_maven.bean.Student;

public class Clients {

	public static void main(String[] args) {

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/maven/hib_final_annot_maven/configs/student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("table created");
		Transaction t=s.beginTransaction();
		try{
			ApplicationContext ap=new ClassPathXmlApplicationContext
					("com/maven/hib_final_annot_maven/configs/stud.spring.xml");
			Student student=(Student)ap.getBean("stud");
			s.save(new Student(student.getId(),student.getName(),student.getStuding(),student.getAddress()));
			System.out.println("record successfully inserted");
			t.commit();
		}
		catch(Exception e){
           e.printStackTrace();
           System.out.println("operation can not be performed /n doing rollback");
           t.rollback();
		}
		finally{
			s.close();
			sf.close();
		}
	}

}
