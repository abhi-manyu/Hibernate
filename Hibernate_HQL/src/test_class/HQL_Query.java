package test_class;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Query
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("mapp/table.cfg.xml");
       SessionFactory sf= cfg.buildSessionFactory();
       Session s =sf.openSession();
       s.beginTransaction();
       
       String query="insert into New_Sudent"
       		+ "(id,name,mail,address) select s.id,s.name,s.mail,s.address from OldStudent s";
      Query q= s.createQuery(query);
       int i=q.executeUpdate();
       System.out.println("total "+i+" no of query updated");
	}

}
