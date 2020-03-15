package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Educational;

public class Test_Class
{
	public static void main(String[] args)
	{
		Educational e1=new Educational();
		e1.setRoll_no(0000);
		e1.setName("moharana");
		e1.setDeptmnt("ece");
		e1.setPhone("8095113494");
        Configuration configuration=new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        configuration.buildSessionFactory();
        
	}

}
