package classses;

public class Software_Company extends Company
{
   private int salary;
   private int working_hr;
   public Software_Company()
   {

   }
public Software_Company(int reg_no, String name, int salary, int working_hr) {
	super(reg_no, name);
	this.salary = salary;
	this.working_hr = working_hr;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getWorking_hr() {
	return working_hr;
}
public void setWorking_hr(int working_hr) {
	this.working_hr = working_hr;
}
   
}
