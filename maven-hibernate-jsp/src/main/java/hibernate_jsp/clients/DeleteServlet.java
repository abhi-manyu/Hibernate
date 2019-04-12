package hibernate_jsp.clients;

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
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate_jsp.beans.Student;

@WebServlet("/deleterecord")
public class DeleteServlet extends HttpServlet
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
		int rolno=0;
		PrintWriter pw=response.getWriter();
		try {
			 rolno=Integer.parseInt(request.getParameter("delno"));
			 if(rolno==0)
			 {
				 pw.println("<font style='color:red;'>roll no can not be Zero(0)</font>");
				 RequestDispatcher rs=request.getRequestDispatcher("deleterecord.jsp");
				 rs.include(request, response);
			 }
		}
		catch (Exception e) {
			pw.println("<font style='color:red'>plz input integer type roll no</font>");
		}
		try
		{
			s=sf.openSession();
		   Student st=(Student)s.get(Student.class,rolno);
		   if(st==null)
			   throw new Exception();
		   else
		   {
			 Transaction t=s.beginTransaction();
			 s.delete(st);
			 t.commit();
			 System.out.println("deleted successfully");
			 pw.println("<font style='color:green'>data deleted successfully</font>");
		   }
		}
		catch (Exception e)
		{
			pw.println("<font style='color:red;'>no record found asscociated with this record</font><br>");
			 RequestDispatcher rs=request.getRequestDispatcher("deleterecord.jsp");
			 rs.include(request, response);
		}
		
	}
	@Override
	public void destroy() {
		s.close();
		sf.close();
	}


}
