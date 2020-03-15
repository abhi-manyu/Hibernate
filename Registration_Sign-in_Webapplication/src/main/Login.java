package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import classes.Employee;

public class Login extends HttpServlet
{
	SessionFactory sf;
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
		response.setContentType("text/html");
		String mail=request.getParameter("unm");
		String passw=request.getParameter("pass");
		try
		{
			Object obj=s.get(Employee.class,mail);
			Employee emp1=(Employee) obj;
			if(emp1.getPassword().equals(passw))
			{
				response.sendRedirect("suc/suc.html");
			    System.out.println("u r logged in");
			}
			else {
				pw.println("<html><body><h2 style='color:red';>"
						+ "invalid username or password</h2></body></html>");
			}
			s.close();
		}
		catch (Exception e)
		{
			System.out.println("account not found");
			pw.println("<html><body>"
					+ "<h2>account not found, Wanna sign up ??</h2></body></html>");
		}
		
	}
	@Override
	public void destroy()
	{
		sf.close();
	}


}
