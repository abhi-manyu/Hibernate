package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classses.Hardware_Company;
import classses.Reserch_Developement;
import classses.Software_Company;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/company.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Software_Company sc=new Software_Company(123354,"microsoft",90000,8);
       Hardware_Company hc=new Hardware_Company(1235135,"cisco",8.5, 23);
       Reserch_Developement rd= new Reserch_Developement(1321348,"Hexaware","selfDriving car","manager");
       s.save(sc);
       s.save(hc);
       s.save(rd);
       t.commit();
       System.out.println("tables created and datas r inserted succesfully");
	}

}
