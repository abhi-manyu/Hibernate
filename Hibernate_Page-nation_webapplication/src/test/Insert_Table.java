package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Student;

public class Insert_Table
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("configs/student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Student s1=new Student(100,"abhimanyu","abhi@gmail.com",456);
		Student s2=new Student(200,"aurobinda","ara@gmail.com",655);
		Student s3=new Student(300,"ashok","ashok@gmail.com",215);
		Student s4=new Student(400,"anirudha","ani@gmail.com",353);
		Student s5=new Student(1500,"charulata","charu@gmail.com",468);
		Student s6=new Student(1060,"smitarani","smita@gmail.com",367);
		Student s7=new Student(100,"anshuraj","anshu@gmail.com",789);
		Student s8=new Student(160,"krushna","krushna@gmail.com",154);
		Student s9=new Student(1500,"rasmita","rasmita@gmail.com",886);
		Student s10=new Student(1080,"mamata","mamata@gmail.com",235);
		Student s11=new Student(1060,"raja","raja@gmail.com",879);
		Student s12=new Student(1468,"rani","rani@gmail.com",783);
		
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		s.save(s6);
		s.save(s7);
		s.save(s8);
		s.save(s9);
		s.save(s10);
		s.save(s11);
		s.save(s12);
       
		t.commit();
		System.out.println("datas inserted successful");
		s.close();
		sf.close();
	}

}
