package classes;

public class Department
{
   private int dept_id;
   private String dept_name;
   private String dept_place;
   public Department()
      {
	   
      }
public Department(int dept_id, String dept_name, String dept_place) {
	super();
	this.dept_id = dept_id;
	this.dept_name = dept_name;
	this.dept_place = dept_place;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public String getDept_place() {
	return dept_place;
}
public void setDept_place(String dept_place) {
	this.dept_place = dept_place;
}
   
}
