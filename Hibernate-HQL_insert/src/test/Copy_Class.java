package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Copy_Class
{
	public static void main(String[] args)
	{
      Configuration cfg= new Configuration();
      cfg.configure("conf/data.cfg.xml");
      SessionFactory sf= cfg.buildSessionFactory();
      Session s= sf.openSession();
      s.beginTransaction();
      String query="insert into NewData(id,name,age,status) select d.id,d.name,d.age, d.status from OldData d";
     Query q=s.createQuery(query);
      int i=q.executeUpdate();
	 System.out.println
	 ("total "+i+" numbers of data copied from old data table to new data table");
	
	}

}
