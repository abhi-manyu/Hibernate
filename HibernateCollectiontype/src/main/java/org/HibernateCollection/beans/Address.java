package org.HibernateCollection.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address
{
   @Id
   private String name;
   
   @OneToMany(cascade=CascadeType.ALL)
   private Set<Student> st;
   
   public Address() {
	// TODO Auto-generated constructor stub
}
public Address(String name, Set<Student> st) {
	super();
	this.name = name;
	this.st=st;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   public void setSt(Set<Student> st) {
	this.st = st;
}
   public Set<Student> getSt() {
	return st;
}
}
