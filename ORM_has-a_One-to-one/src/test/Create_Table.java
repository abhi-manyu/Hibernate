package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Sim;
import classes.Woner;

public class Create_Table 
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/simwoner.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       //creating sim objects
       Sim s1=new Sim(13568,"Voda_Fone","karnatak");
       Sim s2=new Sim(83854,"Airtel","Odisha");
       Sim s3=new Sim(76468,"jio","West_bengal");
       
      //create Woner objects
       Woner w1=new Woner(2356,"abhimanyu","kolkataa","8095113494");
       Woner w2=new Woner(36945,"arabinda","bangalore","5468989452");
       Woner w3=new Woner(42412,"anirudha","bhadrak","1365689333");
       
       s1.setWoner(w1);
       s2.setWoner(w2);
       s3.setWoner(w3);
       
       s.save(s1);
       s.save(s2);
       s.save(s3);
       
       t.commit();
       System.out.println("datas inserted successfully");
       s.close();
       sf.close();
       
	}

}
