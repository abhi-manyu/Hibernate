package classes;

public class Student
{
  private int stud_id;
  private String stud_name;
  private String address;
  public Student()
      {
	  
       }
public Student(int stud_id, String stud_name, String address) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
	this.address = address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
}
