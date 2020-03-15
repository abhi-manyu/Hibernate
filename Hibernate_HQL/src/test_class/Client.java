package test_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.OldStudent;

public class Client
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("mapp/table.cfg.xml");
      SessionFactory sf= cfg.buildSessionFactory();
      Session s= sf.openSession();
      
      OldStudent os=new OldStudent(123,"abhi","abhi@gmail.com","banglore");
      s.save(os);
      OldStudent os2=new OldStudent(456,"manyu","manyu@gmail.com","bhubaneswar");
      s.save(os2);
      OldStudent os3=new OldStudent(789,"arabinda","arabinda@gmail.com","kolkata");
      s.save(os3);
      Transaction t=s.beginTransaction();
      t.commit();
      s.close();
      sf.close();
	}

}
