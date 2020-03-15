package classes;

public class Colleges
{
  private int id;
  private String name;
  private int no_of_student;
  private int no_of_teaches;
  private int no_of_course;
  public Colleges()
        {

        }
public Colleges(int id, String name, int no_of_student, int no_of_teaches, int no_of_course) {
	super();
	this.id = id;
	this.name = name;
	this.no_of_student = no_of_student;
	this.no_of_teaches = no_of_teaches;
	this.no_of_course = no_of_course;
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
public int getNo_of_student() {
	return no_of_student;
}
public void setNo_of_student(int no_of_student) {
	this.no_of_student = no_of_student;
}
public int getNo_of_teaches() {
	return no_of_teaches;
}
public void setNo_of_teaches(int no_of_teaches) {
	this.no_of_teaches = no_of_teaches;
}
public int getNo_of_course() {
	return no_of_course;
}
public void setNo_of_course(int no_of_course) {
	this.no_of_course = no_of_course;
}
    
}
