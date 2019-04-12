package com.maven.hib_final_annot_maven.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_Final")
public class Student {
	@Id
	
	@Column(name="roll_no")
     private int id;
	
	@Column(name="stud_name")
	private String name;
	
	@Column(name="education")
	private String studing;
	
	@Column(name="Stu_Address", nullable = false )
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

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

	public String getStuding() {
		return studing;
	}

	public void setStuding(String studing) {
		this.studing = studing;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int id, String name, String studing, String address) {
		super();
		this.id = id;
		this.name = name;
		this.studing = studing;
		this.address = address;
	}
	
	
}
