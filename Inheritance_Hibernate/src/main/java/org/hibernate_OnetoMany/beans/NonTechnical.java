package org.hibernate_OnetoMany.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NonTechnical extends Employee {
	
	@Id
	private int id;
	private double salary;
	public NonTechnical() {
		// TODO Auto-generated constructor stub
	}
	public NonTechnical(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
