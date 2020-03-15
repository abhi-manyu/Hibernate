package pojo;

public class Customer {
  private int id;
  private String name;
  private String phno;
  private String address;
  
  public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(int id, String name, String phno, String address) {
	super();
	this.id = id;
	this.name = name;
	this.phno = phno;
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

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
  
}
