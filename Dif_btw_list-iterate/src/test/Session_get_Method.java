package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Teacher;

public class Session_get_Method
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/teacher.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
      //here records exists so we r getting the result, if the record is not there then 
        //by get method we will get the nullpointer exception
        
        
        /*Object obj=s.get(Teacher.class,new Integer(6368));
        System.out.println(obj.getClass().getName());
        Teacher t1=(Teacher) obj;
        System.out.println(t1.getTeach_id());
        System.out.println(t1.getTeach_name());*/
        
        try
        {
			Object obj=s.get(Teacher.class,new Integer(54133));
			Teacher t2=(Teacher)obj;
			System.out.println(t2.getTeach_id());
			System.out.println(t2.getTeach_name());
		}
        catch (Exception e) 
        {
			System.out.println("this record does not exits");
		}
        
        s.close();
        sf.close();
	}

}
