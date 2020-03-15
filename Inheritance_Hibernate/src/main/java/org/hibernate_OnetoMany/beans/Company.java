package org.hibernate_OnetoMany.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {

	@Id
	private int cmpId;
	
	private String cmpName;
	private String cmpAddress;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Employee> employees;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int cmpId, String cmpName, String cmpAddress, List<Employee> employees) {
		super();
		this.cmpId = cmpId;
		this.cmpName = cmpName;
		this.cmpAddress = cmpAddress;
		this.employees = employees;
	}

	public int getCmpId() {
		return cmpId;
	}

	public void setCmpId(int cmpId) {
		this.cmpId = cmpId;
	}

	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public String getCmpAddress() {
		return cmpAddress;
	}

	public void setCmpAddress(String cmpAddress) {
		this.cmpAddress = cmpAddress;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
	
}
