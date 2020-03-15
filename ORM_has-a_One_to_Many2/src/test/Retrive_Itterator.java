package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import classes.Homes;
import classes.Village;

public class Retrive_Itterator 
{
	
	//array index of bound exception is coming
	
	
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/one-many-exp2.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Village.class);
        ProjectionList pr=Projections.projectionList();
        Projection p=Projections.property("vil_name");
        Projection p2=Projections.property("homes");
        pr.add(p);
        pr.add(p2);
        cr.setProjection(pr);
        
        List<Village> lst=cr.list();
        Iterator<Village> itr=lst.iterator();
        while(itr.hasNext())
        {
        	Village v1=itr.next();
        	v1.getVil_name();
        	Set<String> set2=v1.getHomes();
        	Iterator<String> itr2=set2.iterator();
        	while(itr2.hasNext())
        	{
        		String homes=itr2.next();
        		System.out.println(homes);
        	}
        }
	}

}
