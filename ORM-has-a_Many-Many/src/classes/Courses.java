package classes;

import java.util.Set;

public class Courses
{
   private int course_id;
   private  String course_name;
   private int course_duration;
   private Set<Student> students;
   public Courses()
      {
	   
      }
public Courses(int course_id, String course_name, int course_duration) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.course_duration = course_duration;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public int getCourse_duration() {
	return course_duration;
}
public void setCourse_duration(int course_duration) {
	this.course_duration = course_duration;
}
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}
   
}
