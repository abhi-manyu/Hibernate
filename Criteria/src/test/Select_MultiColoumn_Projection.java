package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import classes.Library;

public class Select_MultiColoumn_Projection
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	       cfg.configure("configs/library.cfg.xml");
	       SessionFactory sf=cfg.buildSessionFactory();
	       Session s=sf.openSession();
	       Criteria cr=s.createCriteria(Library.class);
	       //creating projection list
           ProjectionList prl=Projections.projectionList();
           //creating more number of Projections 
           Projection pr1=Projections.property("book_name");
           Projection pr2=Projections.property("pages");
           Projection pr3=Projections.property("cost");
           prl.add(pr1);
           prl.add(pr2);
           prl.add(pr3);
           //set the projection to the criteria
           cr.setProjection(prl);
           List li=cr.list();
           System.out.println("names\t\t\tpages \t\t cost \n"
           		+ "=========================================================");
           for(Object obj:li)
           {
        	   Object[] arr=(Object[])obj;
        	   System.out.println(arr[0]+"\t\t"+arr[1]+"\t\t"+arr[2]);
           }
	}

}
