package hibernate_jsp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")
public class Student {
     @Id
     @Column(name="rollno")
     private int rollno;
     
     @Column(name="student_name")
     private String studentName;
     
     private double marks;
     
     public Student() {
    	 
	}

	public Student(int rollno, String studentName, double marks) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
     
     public void displayDetails()
     {
    	 System.out.println("roll no : "+rollno);
    	 System.out.println("name : "+studentName);
    	 System.out.println("mark : "+marks);
     }
     public static void displayStudentsLayout()
     {
    	 System.out.println
    	 ("rollno \t name \t marks \n----------------------------------------");
     }
}
