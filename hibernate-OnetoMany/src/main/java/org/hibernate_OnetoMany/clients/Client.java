package org.hibernate_OnetoMany.clients;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate_OnetoMany.beans.College;
import org.hibernate_OnetoMany.beans.Students;

public class Client {

	public static void main(String[] args) {

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("org/hibernate_OnetoMany/configs/onetomany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Students s1=new Students("Raja",35435,"NewDelhi",56.29);
		Students s2=new Students("Rani",32878,"Bangalore", 89.56);
		Students s3=new Students("prince",78963,"Ladakh",24.96);
		Students s4=new Students("Princess",24567,"Kashmir",64.19);
		Students s5=new Students("General",59731,"Rameswar",58.20);
		Students s6=new Students("soldiers",82465,"mhsfsjfd",79.28);
		
		Set<Students> set1=new HashSet<Students>();
		set1.add(s1);
		set1.add(s4);
		
		Set<Students> set2=new HashSet<Students>();
		set2.add(s2);
		set2.add(s5);
		set2.add(s6);
        
		College col1=new College("Banaras Hindu University",465753,"Gujurat");
		College col2=new College("C.V.Raman Engineering College",123879,"NewDelhi");
		col1.setStuds(set1);
		col2.setStuds(set2);
		
		s.save(col1);
		s.save(col2);
		t.commit();
		System.out.println("data inserted successfully");
		
	}

}
