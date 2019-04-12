package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_details")
public class Person {
    
	@Id
	@Column(name="person_Id")
	private int id;
	
	@Column(name="person_Name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	private String phno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public Person(int id, String name, String address, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	
	
}
