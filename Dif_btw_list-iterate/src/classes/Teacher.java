package classes;

public class Teacher
{
    private int teach_id;
    private String teach_name;
    private String teach_sub;
    private int teach_age;
    public Teacher()
    {
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teach_id, String teach_name, String teach_sub, int teach_age) {
		super();
		this.teach_id = teach_id;
		this.teach_name = teach_name;
		this.teach_sub = teach_sub;
		this.teach_age = teach_age;
	}
	public int getTeach_id() {
		return teach_id;
	}
	public void setTeach_id(int teach_id) {
		this.teach_id = teach_id;
	}
	public String getTeach_name() {
		return teach_name;
	}
	public void setTeach_name(String teach_name) {
		this.teach_name = teach_name;
	}
	public String getTeach_sub() {
		return teach_sub;
	}
	public void setTeach_sub(String teach_sub) {
		this.teach_sub = teach_sub;
	}
	public int getTeach_age() {
		return teach_age;
	}
	public void setTeach_age(int teach_age) {
		this.teach_age = teach_age;
	}
    
}
