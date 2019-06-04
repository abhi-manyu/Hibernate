package org.datasource.example.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.datasource.example.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@WebServlet(value="/Register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		int rl=Integer.parseInt(request.getParameter("rln"));
		String firstname=request.getParameter("fnm");
		String lastname=request.getParameter("lnm");
		HttpSession session=request.getSession();
		session.setAttribute("fnm",firstname);
		session.setAttribute("lnm",lastname);
		
		Student st=new Student(rl, firstname, lastname);
		
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("org/datasource/example/resources/student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(st);
		t.commit();
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.include(request, response);
	}

}
