package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Phones;
import classes.Sim;

public class Select_Table_Data
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/phonesim.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Phones.class);
        List li=cr.list();
        Iterator itr=li.iterator();
        System.out.println("phone_id \t phone_name \t phone_colour \t phone_cost \t used_sim");
        System.out.println("===================================================================");
        while(itr.hasNext())
        {
        	//Object obj=(Object)itr.next();
        	Phones ph=(Phones)itr.next();
        	System.out.print
        	(ph.getPh_id()+"\t"+ph.getPh_name()+"\t\t"+ph.getColour()+"\t"+ph.getPh_cost()+"\t");
        	Set set= ph.getSim();
        	Iterator itr2=set.iterator();
        	while(itr2.hasNext())
        	{
        		Sim sim=(Sim)itr2.next();
        		System.out.print(sim.getSim_name()+" ,");
        	}
        	System.out.println();
        }
	}

}
