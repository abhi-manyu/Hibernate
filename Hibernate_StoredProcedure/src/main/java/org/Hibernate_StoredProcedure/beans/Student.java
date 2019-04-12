package org.Hibernate_StoredProcedure.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@NamedNativeQueries({
	@NamedNativeQuery(
			name="mystoredprocedure",
			query="call studentinsert()",
			resultClass=Student.class
			)
})

@Entity
@Table(name="student")
public class Student
{
	@Id
   private int id;
   private String name;
   private String address;
   public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   
}
