package org.hibernate_OnetoMany.clients;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate_OnetoMany.beans.Company;
import org.hibernate_OnetoMany.beans.Employee;
import org.hibernate_OnetoMany.beans.Technical;

public class Client {

	public static void main(String[] args) {

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("org/hibernate_OnetoMany/configs/onetomany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		
		
		Employee[] emps1={new Technical(123,45000.23),new Technical(123,45000.23)};
		Employee[] emps2= {new Technical(123,45000.23),new Technical(123,45000.23)};
		
		Company cmp1=new Company(101,"MicroLand","Manhattan",Arrays.asList(emps1));
		Company cmp2=new Company(105,"SkyNet","NewYork",Arrays.asList(emps2));
		s.save(cmp1);
		s.save(cmp2);
		t.commit();
		
		
		
		
		
		
		/*Employee empl = new Tech
		
		s.save(cmp2);
		t.commit();
		System.out.println("data inserted successfully");
		*/
	}

}
