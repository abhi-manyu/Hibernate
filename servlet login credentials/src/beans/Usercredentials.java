package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_credentials")
public class Usercredentials {

	@Id
	@Column(name="si_no")
	private int id;
	
	private String mail_id;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="conf_password")
	private String Con_Password;

	
	public Usercredentials() {

	}
	
	public Usercredentials(int id, String mail_id, String username, String password, String con_Password) {
		super();
		this.id = id;
		this.mail_id = mail_id;
		this.username = username;
		this.password = password;
		Con_Password = con_Password;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCon_Password() {
		return Con_Password;
	}

	public void setCon_Password(String con_Password) {
		Con_Password = con_Password;
	}
	
	
	
	
}
