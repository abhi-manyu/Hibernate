package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Homes;
import classes.Village;

public class Create_Table
{
	public static void main(String[] args)
	{
         Configuration cfg=new Configuration();
         cfg.configure("configs/one-many-exp2.cfg.xml");
         SessionFactory sf=cfg.buildSessionFactory();
         Session s=sf.openSession();
         Transaction t=s.beginTransaction();
         
         Village v1=new Village(111,"arjunbindha",150);
         Village v2=new Village(222,"gobind_pur",100);
         Village v3=new Village(333,"madhu_pur",130);
         
         Homes h1=new Homes(100,"maharana_house",8,50000);
         Homes h2=new Homes(200,"sahoo",10,80000);
         Homes h3=new Homes(300,"kumvar_house",12,10000);
         Homes h4=new Homes(400,"dhoba_house",15,15000);
         Homes h5=new Homes(500,"keuta_house",20,25000);
         Homes h6=new Homes(600,"majhi_house",22,13000);
         Homes h7=new Homes(700,"brhmana_house",8,30000);
         Homes h8=new Homes(800,"teli_house",5,17000);
         Homes h9=new Homes(900,"pana_house",20,5000);
         Homes h10=new Homes(1000,"kandra_house",22,3000);
         
         s.save(h1);
         s.save(h2);
         s.save(h3);
         s.save(h4);
         s.save(h5);
         s.save(h6);
         s.save(h7);
         s.save(h8);
         s.save(h9);
         s.save(h10);
         
         
         Set<Homes> set=new HashSet<Homes>();
         set.add(h1);
         set.add(h3);
         set.add(h5);
         v1.setHomes(set);
         
         Set<Homes> set2=new HashSet<Homes>();
         set2.add(h2);
         set2.add(h4);
         set2.add(h6);
         v2.setHomes(set2);
         
         Set<Homes> set3=new HashSet<Homes>();
         set3.add(h7);
         set3.add(h8);
         set3.add(h9);
         set3.add(h10);
         v3.setHomes(set3);
         
         s.save(v1);
         s.save(v2);
         s.save(v3);
         
         t.commit();
         System.out.println("insertion successful");
         s.close();
         sf.close();
	}

}
