package classes;

import java.util.Date;

public class Employee
{
   private int emp_id;
   private String emp_name;
   private String mail;
   private Date emp_birth_date;
   private Department dept;
   public Employee()
    {
	   
    }
   
public Employee(int emp_id, String emp_name, String mail, Date emp_birth_date) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.mail = mail;
	this.emp_birth_date = emp_birth_date;
}

public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public Date getEmp_birth_date() {
	return emp_birth_date;
}
public void setEmp_birth_date(Date emp_birth_date) {
	this.emp_birth_date = emp_birth_date;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
   
}
