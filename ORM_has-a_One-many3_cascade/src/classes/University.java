package classes;

import java.util.Set;

public class University
{
  private int id;
  private String name;
  private int no_of_clg;
  private Set colleges;
  public University()
   {
	  
    }
public University(int id, String name, int no_of_clg) {
	super();
	this.id = id;
	this.name = name;
	this.no_of_clg = no_of_clg;
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
public int getNo_of_clg() {
	return no_of_clg;
}
public void setNo_of_clg(int no_of_clg) {
	this.no_of_clg = no_of_clg;
}
public Set getColleges() {
	return colleges;
}
public void setColleges(Set colleges) {
	this.colleges = colleges;
}
  
}
