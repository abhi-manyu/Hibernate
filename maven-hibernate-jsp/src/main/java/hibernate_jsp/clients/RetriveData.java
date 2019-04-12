package hibernate_jsp.clients;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate_jsp.beans.Student;

public class RetriveData {

	public static void main(String[] args)
	{
       AnnotationConfiguration cfg=new AnnotationConfiguration();
       cfg.configure("hibernate_jsp/configs/student.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Criteria cr=s.createCriteria(Student.class);
       List<Student> li=cr.list();
       Iterator<Student> itr=li.iterator();
       Student.displayStudentsLayout();
       while(itr.hasNext())
       {
    	   Student st=(Student)itr.next();
    	   System.out.println
    	      (st.getRollno()+"\t"+st.getStudentName()+"\t"+st.getMarks());
    	   
       }
         System.out.println("retrived al data successfully");
         s.close();
         sf.close();
	}
	

}
