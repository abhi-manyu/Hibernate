package org.nodata.example.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.nodata.example.beans.StudentNO_data;

public class Client {
      public static void main(String[] args) {
		
    	  AnnotationConfiguration cfg=new AnnotationConfiguration();
    	  cfg.configure("org/nodata/example/xmls/nodata.cfg.xml");
    	  SessionFactory sf=cfg.buildSessionFactory();
    	  Session s=sf.openSession();
    	  /*Transaction t=s.beginTransaction();
    	  StudentNO_data st=new StudentNO_data(101,"Abhi");
    	  s.save(st);
    	  t.commit();
    	  System.out.println("data inserted successfully");
    	  */
    	  
    	  List<StudentNO_data> lists=s.createQuery("from StudentNO_data").list();
    	  System.out.println("list size is : "+lists.size());
    	  System.out.println("elements are : "+lists);
    	  for(StudentNO_data stu : lists)
    	  {
    		  System.out.println("roll no : "+stu.getRol()+"\n name : "+stu.getName());
    	  }
    	  s.close();
    	  sf.close();
	}
}
