package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.ArtsStudent;
import classes.CommerceStudent;
import classes.ScienceStudent;

public class Create_Table
{
	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/stuedent.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       //creating respective objects and inserting into the respective tables
       ScienceStudent ss=new ScienceStudent(111,"abhimanyu",22,"bhadrak","physics",80);
       CommerceStudent cs=
    	 new CommerceStudent(222,"surya",24,"remuna","statistics","baleswar_college_of_Engineering");
       ArtsStudent as=new ArtsStudent(333,"anurag",25,"baleswar","litratuture", "sonny_leoan");
       s.save(ss);
       s.save(cs);
       s.save(as);
       t.commit();
       s.close();
       sf.close();
    	
	}

}
