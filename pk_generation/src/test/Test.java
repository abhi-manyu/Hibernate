package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Movie;

public class Test {

	public static void main(String[] args) {
     Configuration cfg=new Configuration();
     cfg.configure("config/picture.cfg.xml");
     SessionFactory sf= cfg.buildSessionFactory();
     Session s=  sf.openSession();
     Movie movie=new Movie();
     //movie.setId(154);
     movie.setName("race 3");
     movie.setTime("12pm");
     s.save(movie);
     s.beginTransaction().commit();
     sf.close();
     s.close();
	}

}
