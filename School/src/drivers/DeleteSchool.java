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

public class DeleteSchool extends HttpServlet
{
	SessionFactory sf;
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
		int id=Integer.parseInt(request.getParameter("delid"));
        try
        {
			Object obj=s.get(School.class, id);
			School sc=(School)obj;
			s.delete(sc);
			t.commit();
			System.out.println("data deleted successfully");
			pw.println("<html><body><h2 style='color:green ;'>data deleted</h2></body></html>");
			
		}
        catch (Exception e)
        {
        	System.out.println("data not found");
			pw.println("<html><body><h2 style='color:red ;'>no school of id :<mark> "+id+" </mark>found</h2></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("deleteschool.html");
			rd.include(request, response);
		}		
	}
   @Override
public void destroy() {
	   sf.close();
}

}
