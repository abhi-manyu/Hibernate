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

public class LoginServlet extends HttpServlet
{
	AnnotationConfiguration cfg;
    SessionFactory sf;
    Session s;
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		cfg=new AnnotationConfiguration();
		cfg.configure("hibernate/criteria/test/configs/person.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
		
		int rol=Integer.parseInt(request.getParameter("roll"));
		String username=request.getParameter("unm");
		String pass=request.getParameter("pass");
		
		Person p=(Person) s.load(Person.class,rol);
		
		if(p.getName().equals(username) && p.getPassword().equals(pass))
		{
			System.out.println("hyy body u r logged in !!");
		}
		else {
			System.out.println("oops !!! log in attempt failed");
		}
	}


}
