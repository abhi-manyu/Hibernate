package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import classes.Library;

public class Maximum_Id
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/library.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Criteria cr=s.createCriteria(Library.class);
        Projection pr=Projections.max("cost");
        cr.setProjection(pr);
        int max_id=(int) cr.uniqueResult();
        System.out.println("the maximum book id  available is : "+max_id);
	}

}
