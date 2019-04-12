package hibernate_jsp.clients;

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

import hibernate_jsp.beans.Student;
@WebServlet("/register")
public class Registration extends HttpServlet
{
	SessionFactory sf;
	Session s;
	@Override
	public void init() throws ServletException {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate_jsp/configs/student.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
		  int rollno=Integer.parseInt(request.getParameter("rol"));
		  String name=request.getParameter("nam");
		  double marks=Double.parseDouble(request.getParameter("mark"));
		  s=sf.openSession();
		  Transaction t=s.beginTransaction();
		  Student st=new Student(rollno, name, marks);
		  s.save(st);
		  t.commit();
		 System.out.println("inserted successfully");
		}
		catch(Exception e)
		{
			System.out.println("duplicate data found, try again with different data");
		}
	}
	@Override
	public void destroy() {
		s.close();
		sf.close();
	}
}
