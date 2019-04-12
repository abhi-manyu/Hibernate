package org.HibernateCollection.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="collection")
public class Student
{
	@Id
   private int id;
   private String name;
   
   @OneToMany(cascade=CascadeType.ALL)
   private List<Courses> courses;
   public Student() {

   }
public Student(int id, String name, List<Courses> courses) {
	super();
	this.id = id;
	this.name = name;
	this.courses = courses;
}
   public void setId(int id) {
	this.id = id;
}
   public int getId() {
	return id;
}
   public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   public void setCourses(List<Courses> courses) {
	this.courses = courses;
}
   public List<Courses> getCourses() {
	return courses;
}
}
