package hibernate_jsp.clients;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate_jsp.beans.Student;

//@WebServlet("/getall")
public class RetriveRecord extends HttpServlet
{
       SessionFactory sf=null;
       Session s=null;
       @Override
    public void init() throws ServletException {
    	   AnnotationConfiguration cfg=new AnnotationConfiguration();
    	   cfg.configure("hibernate_jsp/configs/student.cfg.xml");
    	   sf=cfg.buildSessionFactory();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		s=sf.openSession();
		PrintWriter pw=response.getWriter();
		Criteria cr=s.createCriteria(Student.class);
		 List<Student> li=cr.list();
		System.out.println(li.size());
		Iterator<Student> itr=li.iterator();
		pw.println("<html><body><table style='text-align:center;background-color:#a3c2c2;' border=1> ");
		pw.println("<tr><th>roll no</th>"
				+ "<th>name</th>"
				+ "<th>marks</th></tr>");
		while(itr.hasNext())
		{
			Student st=itr.next();
			pw.println("<tr><td>"+st.getRollno()+"</td>"
					+ "<td>"+st.getStudentName()+"</td>"
					+ "<td>"+st.getMarks()+"</td></tr>");
		}
		pw.println("</table></body></html>");
		li.clear();
		s.evict(li);
		pw.close();
	}
	@Override
	public void destroy() {
		s.flush();
		s.close();
		s.clear();
		sf.close();
	}
}
