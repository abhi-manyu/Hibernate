package classses;

public class Reserch_Developement extends Company
{
    private String dept_name;
    private String position;
    public Reserch_Developement() 
    {
    	
	}
	public Reserch_Developement(int reg_no, String name, String dept_name, String position) {
		super(reg_no, name);
		this.dept_name = dept_name;
		this.position = position;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
