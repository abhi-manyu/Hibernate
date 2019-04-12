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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Usercredentials;

@WebServlet("/Signup_Servlet")
public class Signup_Servlet extends HttpServlet
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
		response.setContentType("text/html");
		s=sf.openSession();
		Transaction t=s.beginTransaction();
		int number=Integer.parseInt(request.getParameter("id"));
		String uname=request.getParameter("unm");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("conpas");
		String mail=request.getParameter("mid");
		if(pass.equals(cpass)) 
		{
			Usercredentials uc1=new Usercredentials(number, mail, uname, pass, cpass);
			s.save(uc1);
			t.commit();
			System.out.println("record inserted successfuly");
			RequestDispatcher rs=request.getRequestDispatcher("signUp.html");
			pw.println("<font style='color:green;text-align: center;'>record inserted successfully</font>");
			rs.include(request, response);
		}
		else {
			System.out.println("sign up failed");
			RequestDispatcher rs=request.getRequestDispatcher("signUp.html");
			pw.println("<font style='color:red ;text-align: center;'>failed to sign up , plz try again with care</font>");
			rs.include(request, response);
		}
	}
	@Override
	public void destroy() {
        s.close();
        sf.close();
	}


}
