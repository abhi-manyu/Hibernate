package org.hibernate.testing.drivers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.testing.beans.Employee;

@WebServlet("/addemp")
public class DriverServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("org/hibernate/testing/configs/emp.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee emp=new Employee(852456,"Queen","Delhi");
		
		s.save(emp);
		t.commit();
		System.out.println("inserted");
	}

}
