package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Colleges;
import classes.University;

public class Create_Table
{
	public static void main(String[] args)
	{
      Configuration cfg=new Configuration();
      cfg.configure("configs/university.cfg.xml");
      SessionFactory sf=cfg.buildSessionFactory();
      Session s=sf.openSession();
      Transaction t=s.beginTransaction();
      
      University u1=new University(111,"BPUT",180);
      University u2=new University(222,"SOA",4);
      
      Colleges cl1=new Colleges(100,"gandhi_eng._college",1500,120,15);
      Colleges cl2=new Colleges(200,"CV_Raman_eng_college",2000,500,50);
      Colleges cl3=new Colleges(300,"GITA_eng_college",1200,150,20);
      Colleges cl4=new Colleges(400,"Gunpur_eng_college",2000,200,20);
      
      Set<Colleges> set=new HashSet<Colleges>();
      set.add(cl1);
      set.add(cl2);
      
      Set<Colleges> set2=new HashSet<Colleges>();
      set2.add(cl3);
      set2.add(cl4);
      
      u1.setColleges(set);
      u2.setColleges(set2);
      s.save(u1);
      s.save(u2);
      t.commit();
      s.close();
      sf.close();
	}

}
