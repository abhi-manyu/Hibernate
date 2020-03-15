package test;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Village;

public class Retriving_data
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/one-many-exp2.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Village.class);
        List list=cr.list();
        for(Object o:list)
        {
        	Village v=(Village) o;
        	System.out.println
        	(v.getVil_id()+"\t"+v.getVil_name()+"\t"+v.getNo_of_homes());
        }
	}

}
