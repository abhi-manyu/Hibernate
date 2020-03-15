package classes;

public class CommerceStudent extends Student
{
   private String unique_Sub;
   private String College;
   public CommerceStudent()
   {
	   
      }
public CommerceStudent(int id, String name, int age, String address, String unique_Sub, String college) {
	super(id, name, age, address);
	this.unique_Sub = unique_Sub;
	College = college;
}
public String getUnique_Sub() {
	return unique_Sub;
}
public void setUnique_Sub(String unique_Sub) {
	this.unique_Sub = unique_Sub;
}
public String getCollege() {
	return College;
}
public void setCollege(String college) {
	College = college;
}
   
}
