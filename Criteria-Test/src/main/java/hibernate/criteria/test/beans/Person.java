package hibernate.criteria.test.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crTable")
public class Person
{
	@Id()
    private int roll;
    private String name;
    private double marks;
    private String password;
    public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int roll, String name, double marks, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.password = password;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
