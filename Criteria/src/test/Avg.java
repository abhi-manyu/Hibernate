package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import classes.Library;

public class Avg
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	     cfg.configure("configs/library.cfg.xml");
	     SessionFactory sf=cfg.buildSessionFactory();
	     Session s=sf.openSession();
	     Criteria cr=s.createCriteria(Library.class);
	    /* Projection pr=Projections.avg("cost");
	     cr.setProjection(pr);*/
	     //double cost=(double) cr.uniqueResult();
	     //System.out.println("the avg price of all the book available is: "+cost);
	  // there is one method sum() to calculate the sum of ny property
	     Projection pr1=Projections.sum("pages");
	     cr.setProjection(pr1);
	     long total=(long) cr.uniqueResult();
	     System.out.println("the total nomber of pages : "+total);
	  }

}
