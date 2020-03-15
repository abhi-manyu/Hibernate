package tests;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update_table
{
	public static void main(String[] args)
	{
		// here the primary id from 111 to 555 is updated by hql query
       Configuration cfg=new Configuration();
       cfg.configure("configs/emp.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s= sf.openSession();
       s.beginTransaction();
       String query="update Employee set salary=80000 where name='abhi'";
       Query q= s.createQuery(query);
        int i=q.executeUpdate();
        System.out.println(i+" no of records updated");
	}

}
