package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Teacher;

public class Fetching_by_list
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/teacher.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Teacher.class);
        List li=cr.list();
        System.out.println("fething data from data base by list()");
        System.out.println("===============================================================");
        for(Object obj:li)
        {
        	Teacher t=(Teacher)obj;
        	System.out.println
        	(t.getTeach_id()+"\t"+t.getTeach_name()+"\t"+t.getTeach_age()+"\t"+t.getTeach_sub());
        }
	}

}
