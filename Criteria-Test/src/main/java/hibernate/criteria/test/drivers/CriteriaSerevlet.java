package hibernate.criteria.test.drivers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate.criteria.test.beans.Person;

public class CriteriaSerevlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       AnnotationConfiguration cfg;
       SessionFactory sf;
       Session s;
    public CriteriaSerevlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		cfg=new AnnotationConfiguration();
		cfg.configure("hibernate/criteria/test/configs/person.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		int rol=Integer.parseInt(request.getParameter("rl"));
		String name=request.getParameter("nam");
		double marks=Double.parseDouble(request.getParameter("mrk"));
		String pass=request.getParameter("pas");
		
		Person pe=new Person(rol, name, marks, pass);
		
		s.save(pe);
		System.out.println("data inserted successfully");
		
		t.commit();
		s.close();
		sf.close();
		
	}


}
