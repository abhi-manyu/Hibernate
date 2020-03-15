package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import classes.Homes;
public class Retrive_Projection
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/one-many-exp2.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Homes.class);
        Projection p1= Projections.property("home_name");
        Projection p2=Projections.property("income_of_home");
        ProjectionList pl=Projections.projectionList();
        pl.add(p1);
        pl.add(p2);
        cr.setProjection(pl);
        List<Object> list= cr.list();
        for(Object ob:list)
        {
        	Object[] arr=(Object[])ob;
        	System.out.println(arr[0]+"\t"+arr[1]);
        }
	}

}
