package classes;

import java.util.Set;

public class Village
{
  private int vil_id;
  private String vil_name;
  private int no_of_homes;
  private Set homes;
  public Village()
     {
	  
     }
public Village(int vil_id, String vil_name, int no_of_homes) {
	super();
	this.vil_id = vil_id;
	this.vil_name = vil_name;
	this.no_of_homes = no_of_homes;
}
public int getVil_id() {
	return vil_id;
}
public void setVil_id(int vil_id) {
	this.vil_id = vil_id;
}
public String getVil_name() {
	return vil_name;
}
public void setVil_name(String vil_name) {
	this.vil_name = vil_name;
}
public int getNo_of_homes() {
	return no_of_homes;
}
public void setNo_of_homes(int no_of_homes) {
	this.no_of_homes = no_of_homes;
}
public Set getHomes() {
	return homes;
}
public void setHomes(Set homes) {
	this.homes = homes;
}
  
}
