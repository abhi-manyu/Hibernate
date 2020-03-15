package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Student;

public class TestClass
{

	public static void main(String[] args)
	{
        Student st=new Student();
        st.setR_no(123);
        st.setName("abhimanyu");
        Configuration cfg=new Configuration();
        cfg.configure("configuration/student.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s= sf.openSession();
        s.saveOrUpdate(st);
        s.beginTransaction().commit();
	}

}
