package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.OldData;

public class Test
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("conf/data.cfg.xml");
       SessionFactory sf= cfg.buildSessionFactory();
       Session s= sf.openSession();
       OldData od= new OldData("abhi", 23,"unmrd");
       s.save(od);
       OldData od2= new OldData("phukia", 20,"unmrd");
       s.save(od2);
       OldData od3= new OldData("anirudha", 57,"mrd");
       s.save(od3);
       OldData od4= new OldData("charulata", 51,"mrd");
       s.save(od4);
       OldData od5= new OldData("ashok",42,"mrd");
       s.save(od5);
       OldData od6= new OldData("smita", 35,"mrd");
       s.save(od6);
       OldData od7= new OldData("aanshu",3,"child");
       s.save(od7);
       Transaction t= s.beginTransaction();
       t.commit();
	}

}
