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
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate_jsp.beans.Student;

@WebServlet("/getsingle")
public class RetriveSingleServlet extends HttpServlet
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
		s=sf.openSession();
		PrintWriter pw=response.getWriter();
		int roll=Integer.parseInt(request.getParameter("rolo"));
		if(roll!=0 )
		{
			try {
				Student st=(Student)s.get(Student.class,roll);
				if(st==null)
					throw new Exception();
				pw.println("<html><body><table style='text-align:center;'border=2>");
				  pw.println("<tr><th style='color:#ff9900;'>student_rollno</th>"
				  		+ "<th style='color:#ff9900;'>student_name</th>"
				  		+ "<th style='color:#ff9900;'>student_marks</th></tr>");
				  pw.println("<tr><td>"+st.getRollno()+"</td>"
				  		+ "<td>"+st.getStudentName()+"</td>"
				  		+ "<td>"+st.getMarks()+"</td></tr>");
				pw.println("</html></body></table>");
				System.out.println("roll no : "+st.getRollno());
				System.out.println("name is : "+st.getStudentName());
				System.out.println("marks secured : "+st.getMarks());
			}
			catch (Exception e) {
				System.out.println("no data found associated with this roll no");
				pw.println("<font style='color: red;'>no record found for this record</font><br>");
				RequestDispatcher rs=request.getRequestDispatcher("retrivedata.jsp");
				rs.include(request, response);
			}
		}
		else
		{
			pw.println("<font style='color:red'>roll no can not b zero(0)</font>");
			RequestDispatcher rs=request.getRequestDispatcher("retrivedata.jsp");
			rs.include(request, response);
		}
		
		
	}
	@Override
	public void destroy() {
		s.close();
		sf.close();
	}

}
