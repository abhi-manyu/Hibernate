package org.Datasource2.example.database;


import org.Datasource2.example.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {

	private HibernateTemplate template;
	private SessionFactory sf=template.getSessionFactory();
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void addStudent(Student stud)
	{
		Session s=sf.openSession();
		template.save(stud);
		System.out.println("1 new student got added");
	}
}
