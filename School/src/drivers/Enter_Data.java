package drivers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.School;

public class Enter_Data extends HttpServlet
{
	SessionFactory sf;
	@Override
	public void init() throws ServletException
	{
		Configuration cfg=new Configuration();
		cfg.configure("configs/school.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Session s;
		s=sf.openSession();
		Transaction t=s.beginTransaction();
		int id=Integer.parseInt(request.getParameter("cid"));
		String col_name=request.getParameter("cname");
		int no_of_stud=Integer.parseInt(request.getParameter("nostu"));
		String address=request.getParameter("cadd");
		School sc1=new School(id, col_name, no_of_stud, address);
		s.save(sc1);
		System.out.println("school registered successfully");
		try {
			t.commit();
			s.close();
			RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
		}
		catch (Exception e) {
			pw.println("<html><body><h2 style='color:red ;'>can not inserted</h2></body></html>");
		}
	}
	@Override
	public void destroy() {
	   sf.close();
	}

}
