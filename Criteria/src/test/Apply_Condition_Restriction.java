package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import classes.Library;

public class Apply_Condition_Restriction
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	     cfg.configure("configs/library.cfg.xml");
	     SessionFactory sf=cfg.buildSessionFactory();
	     Session s=sf.openSession();
	     Criteria cr=s.createCriteria(Library.class);
	     Criterion c=Restrictions.eq("cost",1000);
	     cr.add(c);
	     Library lb=(Library)cr.uniqueResult();
	     System.out.println("the book of rs 1000 /-- is :"+lb.getBook_name()+" and \n"
	     		+ "pages of the coresponding book is: "+lb.getPages());
	}

}
