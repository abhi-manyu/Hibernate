package hibernate.criteria.test.drivers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.criterion.Criterion;
//import org.hibernate.criterion.Restrictions;

import hibernate.criteria.test.beans.Person;
public class forgetPasword extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	AnnotationConfiguration cfg;
    SessionFactory sf;
    Session s;
    public forgetPasword() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		cfg=new AnnotationConfiguration();
		cfg.configure("hibernate/criteria/test/configs/person.cfg.xml");
		sf=cfg.buildSessionFactory();
		s=sf.openSession();
		
		String username=request.getParameter("unam");
		
		/*Criteria cr=s.createCriteria(Person.class);
		Criterion c=Restrictions.eq("name", username);
		cr.add(c);
		Person p=(Person) cr.uniqueResult();
		if(p!=null)
		{
			System.out.println("i got ur password : "+p.getPassword());
		}
		else
		{
			System.out.println("oops !! couldn't find ur account details");
		}*/
		
		String que="from Person p where p.name="+username;
		Query qry=s.createQuery(que);
		
		Person p=(Person) qry.uniqueResult();
		
		if(p!=null)
		{
			System.out.println("by HQL we got ur password : "+p.getPassword());
		}
		else
		{
			System.out.println("couldn't find ny such record !!");
		}
		
		s.close();
		sf.close();
	}


}
