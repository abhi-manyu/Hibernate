package org.hibernate_OnetoMany.beans;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Employee {
	
	private String empName;
	
	private String empAddress;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	

}
