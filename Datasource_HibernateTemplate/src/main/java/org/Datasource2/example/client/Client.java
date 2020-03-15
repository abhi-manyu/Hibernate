package org.Datasource2.example.client;

import org.Datasource2.example.beans.Student;
import org.Datasource2.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
   public static void main(String[] args)
   {
	ApplicationContext ap=
	new ClassPathXmlApplicationContext("org/Datasource2/example/configs/student.spring.xml");
	
	StudentService stdsserv=(StudentService) ap.getBean("stdserv");
	Student st=new Student(333,"arabinda","bhadrak");
	stdsserv.addStudent(st);
	
	/*Student std=stdsserv.findStudent(222);
	System.out.println(std.getId()+"-------"+std.getName()+"-----"+std.getAddress());*/
	
   }
}
