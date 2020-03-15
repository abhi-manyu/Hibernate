package test_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test_Class {
	public static void main(String[] args) {

		Student st = new Student();
		st.setId(105);
		st.setName("abhi");
		st.setMail("aabh@gmail.com");
		st.setMarks(1235);

		Student st2 = new Student();
		st2.setId(999);
		st2.setName("surya");
		st2.setMail("surya@gmail.com");
		st2.setMarks(5868);
		Configuration configuration = new Configuration();
		configuration.configure("resources/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(st2);
		session.save(st);
		t.commit();
		session.close();
		System.out.println("data inserted");

	}

}
