package tablecreate;

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
import org.hibernate.cfg.Configuration;

import pojo.Customer;

public class Table_Creation extends HttpServlet
{
    SessionFactory sf;
    @Override
    public void init() throws ServletException {
    	Configuration cfg=new Configuration();
    	cfg.configure("configs/customer.cfg.xml");
    	sf=cfg.buildSessionFactory();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int cid=Integer.parseInt(request.getParameter("cust_id"));
		String cname=request.getParameter("cust_name");
		String telephone=request.getParameter("cust_phone");
		String caddress=request.getParameter("cust_address");
		
		Customer cust=new Customer(cid, cname,telephone, caddress);
		
		s.save(cust);
		t.commit();
		System.out.println("data inserted successfully");
		pw.println("<html><body><h2 style='color: green ;'>inserted successfully</h2>"
				+ "  <a href='signup.html'>insert another record</a></body></html>");
		s.close();
	}
	@Override
	public void destroy() {
		sf.close();
	}
}
