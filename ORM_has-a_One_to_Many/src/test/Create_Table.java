package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Actor;
import classes.Movies;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/one-many.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Actor a1=new Actor();
       a1.setAct_id(111);
       a1.setAct_name("amirkhan");
       
       Movies m1=new Movies();
       m1.setMov_id(100);
       m1.setMov_name("pk");
       
       Movies m2=new Movies();
       m2.setMov_id(500);
       m2.setMov_name("lagan");
       
       Set set=new HashSet();
       set.add(m1);
       set.add(m2);
       a1.setMovies(set);
       
       s.save(a1);
       s.save(m1);
       s.save(m2);
       t.commit();
       System.out.println("one to many table created and datas inserted successfully");
       s.close();
       sf.close();
	}

}
