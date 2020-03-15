package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import classes.Library;

public class SingleColoumn_Select_Projecttion
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/library.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Criteria cr=s.createCriteria(Library.class);
       Projection pr=Projections.property("book_name");
       cr.setProjection(pr);
       List li=cr.list();
       for(Object obj:li)
       {
    	   System.out.println((String)obj);
       }
	}

}
