package test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Product;

public class Retrive_Page_nation_Criteria 
{
   public static void main(String[] args) 
    {
	   Configuration cfg=new Configuration();
       cfg.configure("configs/product.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Criteria cr=s.createCriteria(Product.class);
       Scanner scn=new Scanner(System.in);
       int i = 0,j = 0;
       try {
    	   System.out.println("enter initial value from which u want to retrive records");
    	    i=scn.nextInt();
    	   if(i<0)
    		   throw new Exception();
	       } 
       catch (Exception e)
       {
          System.out.println("u have entered a wrong initial value \t value should start "
          		+ "from 0 to 15");  
       }
       try {
    	   System.out.println("enter the number upto which u want to retrive records");
    	    j=scn.nextInt();
    	   if(j<i || j>15)
    		   throw new Exception();
	       }
       catch (Exception e)
       {
	      System.out.println("value should be less than 20 and greater than initial value");
       }
       finally {
    	   cr.setFirstResult(i);
           cr.setMaxResults(j);
           System.out.println("prod_id \t prod_name \t\t\t cost of the product");
           System.out.println("==============================================================");
           List<Product> prod=cr.list();
           Iterator<Product> itr=prod.iterator();
           while(itr.hasNext())
           {
        	   Product pr=itr.next();
        	   System.out.println(pr.getPrdct_id()+"\t"+pr.getPrdct_name()+"\t\t\t"+pr.getPrdct_cost());
           }
           s.close();
           sf.close();
		
	}
    }
}
