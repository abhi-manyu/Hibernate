package org.nodata.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentNO_data
{
   @Id
   private int rol;
   private String name;
   public StudentNO_data() {
	// TODO Auto-generated constructor stub
   }
public StudentNO_data(int rol, String name) {
	super();
	this.rol = rol;
	this.name = name;
}
public int getRol() {
	return rol;
}
public void setRol(int rol) {
	this.rol = rol;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
