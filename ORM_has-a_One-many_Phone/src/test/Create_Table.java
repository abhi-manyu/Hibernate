package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Phones;
import classes.Sim;

public class Create_Table
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/phonesim.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Phones ph1=new Phones(23454,"redmi_note5_pro",14000,"black");
        Phones ph2=new Phones(56986,"samsung_galaxy_s9_plus",58000,"navy_ble");
        
        Sim s1=new Sim(1478,"voda_fone","Abhi_manyu");
        Sim s2=new Sim(3600,"Airtel","Ani_rudha");
        Sim s3=new Sim(4591,"jio","Arabinda");
        Sim s4=new Sim(8903,"Idea","Ashok");
        
        Set<Sim> set2=new HashSet<Sim>();
        set2.add(s1);
        set2.add(s2);
        Set<Sim> set1=new HashSet<Sim>();
        set1.add(s3);
        set1.add(s4);
        
        ph1.setSim(set2);
        ph2.setSim(set1);
        
        s.save(ph1);
        s.save(ph2);
        t.commit();
        
        s.close();
        sf.close();
        System.out.println("inserted successfully");
        
	}

}
