package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import classes.Phones;
import classes.Sim;

public class Retrive_Data
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/phonesim.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Phones.class);
        Criterion c= Restrictions.eq("ph_id", 23454);
        cr.add(c);
        Object obj=cr.uniqueResult();
        Phones ph=(Phones)obj;
        System.out.println("the phone_id \t phone_name \t phone cost \t used_sim \n "
        		+ "==========================================================");
        System.out.print(ph.getPh_id()+"\t\t"+ph.getPh_name()+"\t\t"+ph.getPh_cost()+"\t");
        Set set=ph.getSim();
        Iterator itr=set.iterator();
        	while(itr.hasNext())
        	{
        	 Sim sim=(Sim) itr.next();
        	 System.out.print(sim.getSim_name()+" ,");
        	}
	}

}
