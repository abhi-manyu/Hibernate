package org.Datasource2.example.service;

import org.Datasource2.example.beans.Student;
import org.Datasource2.example.database.StudentDAO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService
{
    @Autowired
    private StudentDAO stdao;
    
    public StudentService() {
		// TODO Auto-generated constructor stub
	}
    
    public StudentService(StudentDAO stdao) {
		super();
		this.stdao = stdao;
	}
	public StudentDAO getStdao() {
		return stdao;
	}
    public void setStdao(StudentDAO stdao) {
		this.stdao = stdao;
	}
    
    public void addStudent(Student student)
    {
    	stdao.addStudent(student);
    }
    
    public Student findStudent(int id)
    {
    	return stdao.findStudent(id);
    }
}
