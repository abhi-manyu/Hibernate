package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classes.Student;

public class Data_Retrive extends HttpServlet
{
	SessionFactory sf;
	@Override
	public void init() throws ServletException
	{
		Configuration cfg=new Configuration();
		cfg.configure("configs/student.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Session s=sf.openSession();
		int f_valu=Integer.parseInt(request.getParameter("init_value"));
		int l_valu=Integer.parseInt(request.getParameter("fin_value"));
	    Criteria cr=s.createCriteria(Student.class);
	    cr.setFirstResult(f_valu);
	    cr.setMaxResults(l_valu);
	    List<Student> li=cr.list();
	    Iterator<Student> itr= li.iterator();
	    while(itr.hasNext())
	    {
	    	Student st=itr.next();
	    	pw.println(st.getStud_id()+"\t\t"+st.getStud_name()+"\t\t"+st.getStud_marks()+"\t\t"+st.getStud_mail()+"<br>");
	    }
	    s.close();
		
	}
	@Override
	public void destroy()
	{
		sf.close();
	}
}
