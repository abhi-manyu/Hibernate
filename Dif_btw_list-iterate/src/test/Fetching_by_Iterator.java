package test;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import classes.Teacher;

public class Fetching_by_Iterator
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/teacher.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Query qry=s.createQuery("from Teacher");
        System.out.println("fething data from data base by list()");
        System.out.println("===============================================================");
        Iterator<Teacher> itr=qry.iterate();
        if(!itr.hasNext())
        {
        	System.out.println("no data found");
        }
        else {
        	while(itr.hasNext())
        	{
			Teacher t=itr.next();
        	System.out.println
        	(t.getTeach_id()+"\t"+t.getTeach_name()+"\t"+t.getTeach_age()+"\t"+t.getTeach_sub());
        	}
        }
        s.close();
        sf.close();
	}

}
