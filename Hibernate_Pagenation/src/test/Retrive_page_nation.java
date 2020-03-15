package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import classes.Product;

public class Retrive_page_nation

{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("configs/product.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        String query="from Product";
        Query qry=s.createQuery(query);
        qry.setFirstResult(5);
        qry.setMaxResults(10);
        System.out.println
        ("product_id \t\t product name \t cost of product");
        System.out.println("====================================================");
        List<Product> prd=qry.list();
        Iterator<Product> itr=prd.iterator();
        while(itr.hasNext())
        {
        	Product p=itr.next();
        	System.out.println
        	(p.getPrdct_id()+"\t"+p.getPrdct_name()+"\t\t\t"+p.getPrdct_cost());
        }
        
	}

}
