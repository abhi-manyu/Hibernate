package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Teacher;

public class Create_Table
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/teacher.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Teacher t1=new Teacher(1354,"abhimanyu","java",25);
        Teacher t2=new Teacher(768,"arabinda","testing",21);
        Teacher t3=new Teacher(6368,"anirudha","javascript",58);
        Teacher t4=new Teacher(4514,"ashok","c#",42);
        Teacher t5=new Teacher(6986,"anshuraj","cloud_computing",05);
        Teacher t6=new Teacher(5468,"charulata","networking",45);
        
        s.save(t1);
        s.save(t2);
        s.save(t3);
        s.save(t4);
        s.save(t5);
        s.save(t6);
        
        t.commit();
        System.out.println("data inserted successfully");
        s.close();
        sf.close();
	}

}
