package org.Hibernate_UserDefined;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datatable")
public class Student
{
	@Id
    private int rl;
	
    private String name;
    
    @Embedded
    private Address add;
    
    
    
    public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rl, String name,Address add) {
		super();
		this.rl = rl;
		this.name = name;
		this.add = add;
	}
	public int getRl() {
		return rl;
	}
	public void setRl(int rl) {
		this.rl = rl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
    
}
