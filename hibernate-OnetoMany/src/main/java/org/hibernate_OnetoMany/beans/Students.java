package org.hibernate_OnetoMany.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Students {

	@Id
	private String studentName;
	
	@Column(name="rollNo")
	private int rollNo;
	
	@Column(name="studentAddress")
	private String studentAddress;
	
	@Column(name="studentMarks")
	private double marks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(String studentName, int rollNo, String studentAddress, double marks) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentAddress = studentAddress;
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}
