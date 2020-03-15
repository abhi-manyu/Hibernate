package client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Student;

public class CreateTable extends HttpServlet
{
	SessionFactory sf;
	@Override
	public void init() throws ServletException
	{
		Configuration cfg=new Configuration();
		cfg.configure("configs/student.cfg.xml");
		sf=cfg.buildSessionFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int sid=Integer.parseInt(request.getParameter("rl"));
		String sname=request.getParameter("name");
		int smark=Integer.parseInt(request.getParameter("marks"));
		Student s1=new Student(sid, sname, smark);
		s.save(s1);
		t.commit();
		System.out.println("data entered successful");
		s.close();
	}
	@Override
	public void destroy() {
		sf.close();
	}
}
