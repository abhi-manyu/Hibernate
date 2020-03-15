package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Library;

public class Select_All
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
	       cfg.configure("configs/library.cfg.xml");
	       SessionFactory sf=cfg.buildSessionFactory();
	       Session s=sf.openSession();
	       //by this line automatically the select * from the table is created 
	       // inside the hibernate.so no need to write the extra query
	       Criteria cr= s.createCriteria(Library.class);
	       List<Library> li=cr.list();
	       System.out.println("book_no\t book_name \t\t pages \t\t cost \n"
	       		+ "==============================================================");
	       for(Library lb:li)
	       {
	    	   System.out.println(lb.getBook_id()+"\t"+lb.getBook_name()+"\t\t"
	    			   +lb.getPages()+"\t\t"+lb.getCost());
	       }
	       System.out.println("all datas retrived successfuly");
	}

}
