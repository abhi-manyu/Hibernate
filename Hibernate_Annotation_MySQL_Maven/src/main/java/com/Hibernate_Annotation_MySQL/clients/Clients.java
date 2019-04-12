package com.Hibernate_Annotation_MySQL.clients;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Hibernate_Annotation_MySQL.beans.Customer;

public class Clients {

	public static void main(String[] args) {
        
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/Hibernate_Annotation_MySQL/configs/customer.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("the table created by hibernate annotation");
	    Transaction t=s.beginTransaction();
	    Customer cs1=new Customer(6394,"the princess","Bhubaneswar");
	    //Customer cs2=new Customer(65465,"maharani","Bangalore");
	    try{
	         s.save(cs1);
	        // s.save(cs2);
	         t.commit();
	         System.out.println("data inserted successfully");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("data can not be inserted ;;;;\t performing rollback operation");
	    	e.printStackTrace();
	    	t.rollback();
	    }
	    
	    finally
	    {
	    	s.close();
	    	sf.close();
	    }
	}

}
