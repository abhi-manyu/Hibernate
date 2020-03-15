package classes;

public class OldStudent
{
 private int id;
 private String name;
 private String mail;
 private String address;
 public OldStudent() {
	// TODO Auto-generated constructor stub
}
public OldStudent(int id, String name, String mail, String address)
  {
	super();
	this.id = id;
	this.name = name;
	this.mail = mail;
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 

}
