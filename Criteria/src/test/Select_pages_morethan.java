package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import classes.Library;

public class Select_pages_morethan
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	     cfg.configure("configs/library.cfg.xml");
	     SessionFactory sf=cfg.buildSessionFactory();
	     Session s=sf.openSession();
	     Criteria cr=s.createCriteria(Library.class);
	     Criterion c=Restrictions.gt("pages", 2000);
	     cr.add(c);
	     List<Library> li=cr.list();
	     System.out.println("followings r the boks of pages greater than 2000");
	     for(Library lb:li)
	     {
	    	 System.out.println(lb.getBook_name()+"-------"+lb.getPages()+" page");
	     }
	}

}
