package org.Hibernate_Testing.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addresstable")
public class Address
{
	@Id
   private int flatNo;
   private String pgName;
   private String layout;
   private int pin;
   public Address() {
	// TODO Auto-generated constructor stub
   }
public Address(int flatNo, String pgName, String layout, int pin) {
	super();
	this.flatNo = flatNo;
	this.pgName = pgName;
	this.layout = layout;
	this.pin = pin;
}
public int getFlatNo() {
	return flatNo;
}
public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}
public String getPgName() {
	return pgName;
}
public void setPgName(String pgName) {
	this.pgName = pgName;
}
public String getLayout() {
	return layout;
}
public void setLayout(String layout) {
	this.layout = layout;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
   
}
