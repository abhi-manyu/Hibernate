package org.Datasource2.example.client;

import org.Datasource2.example.beans.Student;
import org.Datasource2.example.database.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
   public static void main(String[] args) {
	ApplicationContext ap=
	new ClassPathXmlApplicationContext("org/Datasource2/example/configs/student.spring.xml");
	
	StudentDAO stdao=(StudentDAO) ap.getBean("stdao");
	Student st=new Student(101,"abhi","Bangalore");
	stdao.addStudent(st);
	
   }
}
