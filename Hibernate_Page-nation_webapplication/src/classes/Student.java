package classes;

public class Student
{
   private int stud_id;
   private String stud_name;
   private String stud_mail;
   private int stud_marks;
   
   public Student()
   {
	   
    }

public Student(int stud_id, String stud_name, String stud_mail, int stud_marks) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
	this.stud_mail = stud_mail;
	this.stud_marks = stud_marks;
}

public int getStud_id() {
	return stud_id;
}

public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}

public String getStud_name() {
	return stud_name;
}

public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}

public String getStud_mail() {
	return stud_mail;
}

public void setStud_mail(String stud_mail) {
	this.stud_mail = stud_mail;
}

public int getStud_marks() {
	return stud_marks;
}

public void setStud_marks(int stud_marks) {
	this.stud_marks = stud_marks;
}
   
}
