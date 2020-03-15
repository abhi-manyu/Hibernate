package classes;

public class ScienceStudent extends Student
{
   private String unique_Sub;
   private int marks;
   public ScienceStudent()
   { 
	   
      }
public ScienceStudent(int id, String name, int age, String address, String unique_Sub, int marks) {
	super(id, name, age, address);
	this.unique_Sub = unique_Sub;
	this.marks = marks;
}
public String getUnique_Sub() {
	return unique_Sub;
}
public void setUnique_Sub(String unique_Sub) {
	this.unique_Sub = unique_Sub;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
   
}
