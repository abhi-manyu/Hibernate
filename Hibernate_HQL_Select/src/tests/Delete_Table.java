package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       String query="delete Employee where id=500";
       Query q=s.createQuery(query);
       int i=q.executeUpdate();
       System.out.println(i+" no of records deleted");
	}

}
