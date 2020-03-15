package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Product;

public class Create_Table
{
	public static void main(String[] args)
	{
        Configuration cfg=new Configuration();
        cfg.configure("configs/product.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Product p1=new Product(134,"shirt",800);
        Product p2=new Product(1354,"pant",3200);
        Product p3=new Product(535,"mobile",15000);
        Product p4=new Product(356,"laptop",33500);
        Product p5=new Product(788,"bag",250);
        Product p6=new Product(548,"mouse",560);
        Product p7=new Product(356,"ear_piece",400);
        Product p8=new Product(3569,"charger",390);
        Product p9=new Product(888,"box",840);
        Product p10=new Product(5621,"headphone_splitter",60);
        Product p11=new Product(568,"belt",1230);
        Product p12=new Product(793,"pencil",20);
        Product p13=new Product(781,"books",983);
        Product p14=new Product(235,"notes",540);
        Product p15=new Product(569,"shoes",4500);
        
        s.save(p1);
        s.save(p2);
        s.save(p3);
        s.save(p4);
        s.save(p5);
        s.save(p6);
        s.save(p7);
        s.save(p8);
        s.save(p9);
        s.save(p10);
        s.save(p11);
        s.save(p12);
        s.save(p13);
        s.save(p14);
        s.save(p15);
        t.commit();
        System.out.println("insertetion finished ");
        s.close();
        sf.close();
	}

}
