package classes;

public class Employee
{
   private int id;
   private String name;
   private String mail;
   private int salary;
   
   public Employee()
   {
	   
   }

public Employee(int id, String name, String mail, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.mail = mail;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
   
   
}
