package classes;

public class Employee {
    private String f_name;
    private String l_name;
    private String mail;
    private String ph_no;
    private String password;
    
    public Employee()
    {
    	
	}

	public Employee(String f_name, String l_name, String mail, String ph_no, String password) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.mail = mail;
		this.ph_no = ph_no;
		this.password = password;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
