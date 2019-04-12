package clients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Usercredentials;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	Configuration cfg=new Configuration();
	SessionFactory sf;
	Session s;
	
	
       @Override
    public void init() throws ServletException {
    	   cfg.configure("configs/login.cfg.xml");
    	   sf=cfg.buildSessionFactory();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		s=sf.openSession();
		response.setContentType("html/texts");
		int number=Integer.parseInt(request.getParameter("id"));
		String uname=request.getParameter("unm");
		String pass=request.getParameter("pass");
		try
		{
			Usercredentials uc= (Usercredentials)s.get(Usercredentials.class,number);
			if(pass.equals(uc.getPassword()))
				{
		          System.out.println("login successfull");
		          RequestDispatcher rs=request.getRequestDispatcher("loginsuccess.html");
		          rs.forward(request, response);
				}
			else
			{
				System.out.println("login failed");
				RequestDispatcher rs=request.getRequestDispatcher("index.html");
				pw.println("<font style='color:red;'>log in failed</font>");
			}
		}
		catch (Exception e) {
			System.out.println("record not found");
			pw.println("<font style='color:red;'>record not found</font>");
			response.sendRedirect("index.html");
		}
	}
	
	@Override
	public void destroy() {
          s.close();
          sf.close();
	}

}
