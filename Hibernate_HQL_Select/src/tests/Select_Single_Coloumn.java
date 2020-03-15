package tests;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Select_Single_Coloumn
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/emp.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        String query="select name from Employee";
        Query q=s.createQuery(query);
        List l= q.list();
        System.out.println("the extracred employee names are");
        System.out.println("***********************************");
        for(Object o:l)
        {
        	System.out.println((String)o);
        }
        t.commit();
        s.close();
        sf.close();
	}

}
