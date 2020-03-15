package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import classes.Employee;

public class Table_Creation extends HttpServlet
{
	SessionFactory sf;
	@Override
	public void init() throws ServletException
	{
		Configuration cfg=new Configuration();
		cfg.configure("configs/employee.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		response.setContentType("text/html");
		
		String fname=request.getParameter("fnam");
		String lnam=request.getParameter("lnam");
		String mail=request.getParameter("mail");
		String ph_no=request.getParameter("tlp");
		String pass=request.getParameter("cpas");
		
		Employee emp1=new Employee(fname,lnam,mail,ph_no,pass);
		try{
		  s.save(emp1);
		  t.commit();
		  System.out.println("data created successfully");
			pw.println("<html><body>"
					+ "<h2>record inserted successfully</h2></body></html>");
		   }
		catch (Exception e)
		{
			System.out.println("data can not be inserted");
			pw.println("<html><body><h2 style='color:red';>"
					+ "data can not be inseted</h2></body></html>");
			
		}
		finally {
			s.close();
		}
	}
	@Override
	public void destroy()
	{
		sf.close();
	}

}
