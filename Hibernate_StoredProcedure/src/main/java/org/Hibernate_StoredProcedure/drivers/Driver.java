package org.Hibernate_StoredProcedure.drivers;

import org.Hibernate_StoredProcedure.beans.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Driver {

	public static void main(String[] args)
	{
       AnnotationConfiguration cfg=new AnnotationConfiguration();
       cfg.configure("org/Hibernate_StoredProcedure/configs/student.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       
       /*Student st=new Student(202,"XYZ","AUSTRELIA");
       s.save(st);
       t.commit();*/
       
       Query qry=s.getNamedQuery("mystoredprocedure");
       
       qry.executeUpdate();
       t.commit();
       
	}

}
