package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Teacher;

public class Fetching_by_Load
{
  public static void main(String[] args)
  {
	  Configuration cfg=new Configuration();
      cfg.configure("configs/teacher.cfg.xml");
      SessionFactory sf=cfg.buildSessionFactory();
      Session s=sf.openSession();
      Object obj=s.load(Teacher.class,new Integer(4653545));
      Teacher t3=(Teacher) obj;
      System.out.println(obj.getClass().getName());
      System.out.println(t3.getTeach_id());
      /*here in load method allways retuarns a student object even if the primary key
       is not there in data base. so while printing the primary key we will not getting 
      ny exception but problem comes after that if we try to print other properties
      for the the same record so here t3.getTeach_Id() did not through ny exception
      but when i tried to print the name of that record it through the object not found exception*/
      try
      {
      System.out.println(t3.getTeach_name());
      }
      catch (Exception e)
      {
    	  System.out.println("no such records found may be u have given some wrong"
    	  		+ "primary key value");
	}
      
      s.close();
      sf.close();
  }
}
