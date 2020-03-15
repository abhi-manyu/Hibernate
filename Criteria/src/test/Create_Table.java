package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Library;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/library.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Library lb1=new Library(111,"mahabharat",1545,1000);
       Library lb2=new Library(222,"Ramayana",2298,900);
       Library lb3=new Library(333,"legend_story",125,200);
       Library lb4=new Library(444,"the rituals",2216,1480);
       s.save(lb1);
       s.save(lb2);
       s.save(lb3);
       s.save(lb4);
       t.commit();
       System.out.println("the insertion successful");
       s.close();
       sf.close();
	}

}
