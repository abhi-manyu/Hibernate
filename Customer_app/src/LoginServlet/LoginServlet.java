package LoginServlet;

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

import pojo.Customer;

public class LoginServlet extends HttpServlet
{
	SessionFactory sf;
    @Override
    public void init() throws ServletException {
    	Configuration cfg=new Configuration();
    	cfg.configure("configs/customer.cfg.xml");
    	sf=cfg.buildSessionFactory();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Session s=sf.openSession();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("cust_id"));
		Object obj=s.get(Customer.class, id);
		Customer cust=(Customer)obj;
		String name=request.getParameter("cust_name");
		String number=request.getParameter("tel");
		if(cust.getName().equals(name) && cust.getPhno().equals(number))
		{
			RequestDispatcher rd=request.getRequestDispatcher("success/success.jsp");
			request.setAttribute("name",cust.getName());
			request.setAttribute("phone",cust.getPhno());
			rd.forward(request, response);
			System.out.println("u r signed in !!");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("signin.html");
			pw.println("<font color = red ;> please enter correct credentials </font>");
			rd.include(request, response);
			System.out.println("u failed to log in !!!!");
		}
		s.close();
	}
    @Override
	public void destroy() {
		sf.close();
	}

}
