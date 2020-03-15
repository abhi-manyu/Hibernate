package forgotpass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import pojo.Customer;

public class ForgotPass extends HttpServlet
{
	SessionFactory sf;
    @Override
    public void init() throws ServletException {
    	Configuration cfg=new Configuration();
    	cfg.configure("configs/customer.cfg.xml");
    	sf=cfg.buildSessionFactory();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Session s=sf.openSession();
		int forid=Integer.parseInt(request.getParameter("forid"));
		//through HQL
		/*String query="from Customer where id = 123";
		Query<Customer> q=s.createQuery(query);
		Customer cust=q.uniqueResult();*/
		//through criteria
		Criteria cr=s.createCriteria(Customer.class);
		Criterion c1=Restrictions.eq("id",forid);
		cr.add(c1);
		try
		{
		  Customer cust=(Customer) cr.uniqueResult();
		  pw.println("<html><body>ur id : "+cust.getId()+"<br>ur name is : "+cust.getName()+"<br>ur phone number is : "+cust.getPhno()+"<br>ur adress is : "+cust.getAddress()+"</body></html>");
		}
		catch (Exception e)
		{
			pw.println("<font color='red'>no data found !!</font>");
			RequestDispatcher rd=request.getRequestDispatcher("forgotpassword.html");
			rd.include(request, response);
			System.out.println("record not found in database");
		}
	}

}
