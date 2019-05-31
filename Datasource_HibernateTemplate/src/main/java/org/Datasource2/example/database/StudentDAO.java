package org.Datasource2.example.database;


import org.Datasource2.example.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

public class StudentDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addStudent(Student stud)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(stud);
		t.commit();
		System.out.println("student added");
	}
	
	public Student findStudent(int id)
	{
		Session s=sessionFactory.openSession();
		Student stud=s.load(Student.class,id);
		return stud;
	}
}
