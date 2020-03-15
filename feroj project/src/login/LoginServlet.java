package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Medical;

public class LoginServlet extends HttpServlet
{
	SessionFactory sf;
	@Override
	public void init() throws ServletException {
		Configuration cfg=new Configuration();
		cfg.configure("configs/medical.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Session s=sf.openSession();
		String username=request.getParameter("uname");
		String pasaword=request.getParameter("pwd");
		Object obj=s.get(Medical.class, username);
		Medical med=(Medical)obj;
		if(med.getUsername().equals(username))
		{
			RequestDispatcher rd=request.getRequestDispatcher("home/home.html");
			System.out.println("u r logged in");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			pw.println("<font color = red ;> please enter correct credentials </font>");
			rd.include(request, response);
			System.out.println("u failed to log in !!!!");
		}
	}
	@Override
	public void destroy() {
		sf.close();
	}

}
