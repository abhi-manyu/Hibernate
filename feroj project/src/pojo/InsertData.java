package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData
{
	public static void main(String[] args)
	{
      Configuration cfg=new Configuration();
      cfg.configure("configs/medical.cfg.xml");
      SessionFactory sf=cfg.buildSessionFactory();
      Session s=sf.openSession();
      Transaction t=s.beginTransaction();
      Medical m1=new Medical(565,"feroj", "feroj");
      
      s.save(m1);
      t.commit();
      System.out.println("record inserted sucsessful");
      s.close();
      sf.close();
	}

}
