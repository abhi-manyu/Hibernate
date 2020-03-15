package pojo;

public class School
{
   private int id;
   private String School_name;
   private int no_of_students;
   private String sschool_address;
   
   public School()
    {
	   
    }

public School(int id, String school_name, int no_of_students, String sschool_address) {
	super();
	this.id = id;
	School_name = school_name;
	this.no_of_students = no_of_students;
	this.sschool_address = sschool_address;
    }

  public void setId(int id) {
	this.id = id;
  }
  public void setSchool_name(String school_name) {
	School_name = school_name;
}
  public void setNo_of_students(int no_of_students) {
	this.no_of_students = no_of_students;
}
  public void setSschool_address(String sschool_address) {
	this.sschool_address = sschool_address;
}
  public int getId() {
	return id;
}
  public String getSchool_name() {
	return School_name;
}
  public int getNo_of_students() {
	return no_of_students;
}
  
  public String getSschool_address() {
	return sschool_address;
}
  
   
}
