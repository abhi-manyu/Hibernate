package classes;

public class HQL_Update
{
   private int id;
   private String name;
   private String mail;
   private int marks;
   
   public HQL_Update()
   {
	// TODO Auto-generated constructor stub
       }

public HQL_Update(String name, String mail, int marks)
     {
	super();
	this.name = name;
	this.mail = mail;
	this.marks = marks;
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

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}
   
   
}
