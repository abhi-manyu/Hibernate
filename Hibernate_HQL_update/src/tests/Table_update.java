package tests;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Table_update
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
        cfg.configure("configs/hql_update.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t= s.beginTransaction();
        String query="update HQL_Update set name='abhimanyu',status='single' where name='abhi'";
        Query q= s.createQuery(query);
        q.executeUpdate();
        System.out.println("updation successful");
	}

}
