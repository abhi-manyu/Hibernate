package Clients;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Person;

public class Client {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("configs/person.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("table created");
		Transaction t=s.beginTransaction();
		Person p1=new Person(212,"raja","Delhi","56146556656");
		//Person p2=new Person(7698,"rani","Bangalore","43758345");
		try{
			s.save(p1);
			//s.save(p2);
			t.commit();
			System.out.println("inserted successfuly");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("can not save into database \n performing rollback");
		     t.rollback();
		}
		
		finally
		{
			System.out.println("connection closed");
			s.close();
			sf.close();
		}
	}

}
