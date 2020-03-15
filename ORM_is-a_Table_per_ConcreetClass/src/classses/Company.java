package classses;

public class Company
{
   private int reg_no;
   private String name;
   public Company() 
   {
	   
     }
public Company(int reg_no, String name) {
	super();
	this.reg_no = reg_no;
	this.name = name;
}
public int getReg_no() {
	return reg_no;
}
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
} 
   
}
