package tests;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Select_Multi_Coloumn 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/emp.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        String query="select name,salary from Employee";
        Query q=s.createQuery(query);
       List l= q.list();
       System.out.println("the names and coloumns are as follows");
       System.out.println("names\t\t salary "
       		+ "\n===========================================");
       for(Object o:l)
       {
    	   Object[] arr=(Object[])o;
    	   System.out.print(arr[0]+"-----------");
    	   System.out.println(arr[1]+".00");
       }
       t.commit();
       s.close();
       sf.close();
	}

}
