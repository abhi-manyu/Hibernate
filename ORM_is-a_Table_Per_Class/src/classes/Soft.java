package classes;

public class Soft extends Employee
{
    private String tool;
    public Soft() {
	}
	public Soft(int id, String name, String mail, int salary, String tool) {
		super(id, name, mail, salary);
		this.tool = tool;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
    
}
