package org.Datasource2.example.database;


import org.Datasource2.example.beans.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {

	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void addStudent(Student stud)
	{
		template.save(stud);
		System.out.println("student added");
	}
}
