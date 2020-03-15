package classes;

import java.io.Serializable;
import java.util.Set;

public class Student
{
   private int stud_id;
   private String stud_name;
   private int stud_marks;
   private String Stud_address;
   private Set<Courses> courses;
   public Student()
      {
	   
      }
public Student(int stud_id, String stud_name, int stud_marks, String stud_address) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
	this.stud_marks = stud_marks;
	Stud_address = stud_address;
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
public int getStud_marks() {
	return stud_marks;
}
public void setStud_marks(int stud_marks) {
	this.stud_marks = stud_marks;
}
public String getStud_address() {
	return Stud_address;
}
public void setStud_address(String stud_address) {
	Stud_address = stud_address;
}
public Set<Courses> getCourses() {
	return courses;
}
public void setCourses(Set<Courses> courses) {
	this.courses = courses;
}
   
}
