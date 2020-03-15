package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Teacher;

public class Updating_Single_Record
{
	public static void main(String[] args)
  {
		Configuration cfg=new Configuration();
        cfg.configure("configs/teacher.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Object obj=s.load(Teacher.class,new Integer(4514));
        Teacher t5=(Teacher) obj;
        t5.setTeach_name("ashok_ku");
        t.commit();
        System.out.println("redord updated");
        s.close();
        sf.close();
  }

}
