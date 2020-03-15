package classes;

public class ArtsStudent extends Student 
{
   private String unique_Sub;
   private String teacher_name;
   public ArtsStudent()
       {
	   
       }
public ArtsStudent(int id, String name, int age, String address, String unique_Sub, String teacher_name) {
	super(id, name, age, address);
	this.unique_Sub = unique_Sub;
	this.teacher_name = teacher_name;
}
public String getUnique_Sub() {
	return unique_Sub;
}
public void setUnique_Sub(String unique_Sub) {
	this.unique_Sub = unique_Sub;
}
public String getTeacher_name() {
	return teacher_name;
}
public void setTeacher_name(String teacher_name) {
	this.teacher_name = teacher_name;
}
}
   