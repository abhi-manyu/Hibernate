package clients;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Veichle;
import beans.Woner;

public class Client {

	public static void main(String[] args)
	{
       Configuration cfg=new Configuration();
       cfg.configure("configs/onetomany.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Veichle v1=new Veichle("KA-02-3456","RangeRover-signature","20km/l");
       Veichle v2=new Veichle("KA-02-2134","RangeRover-seleron","22km/l");
       Veichle v3=new Veichle("KA-02-6875","RangeRover-sports2017","25km/l");
       Veichle v4=new Veichle("KA-02-3328","Audi Q8","24km/l");
       
       Set<Veichle> set=new HashSet<>();
         set.add(v1);
         set.add(v3);
         
       Set<Veichle> set2=new HashSet<>();
          set2.add(v4);
          set2.add(v2);
          
          Woner w1=new Woner(5454,"mahaRaja","3465467325","hydrabad", set);
          Woner w2=new Woner(163854,"Maharani","12385674689","New Delhi",set2);
          
          s.save(w1);
          s.save(w2);
          t.commit();
          System.out.println("data inserted successfuly");
          
          s.close();
          sf.close();
	}

}
