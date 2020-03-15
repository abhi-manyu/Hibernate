package classes;

import java.util.Set;

public class Phones
{
   private int ph_id;
   private String ph_name;
   private int ph_cost;
   private Set sim;
   private String colour;
   public Phones()
     {
	   
     }
public Phones(int ph_id, String ph_name, int ph_cost, String colour) {
	super();
	this.ph_id = ph_id;
	this.ph_name = ph_name;
	this.ph_cost = ph_cost;
	this.colour = colour;
}
public int getPh_id() {
	return ph_id;
}
public void setPh_id(int ph_id) {
	this.ph_id = ph_id;
}
public String getPh_name() {
	return ph_name;
}
public void setPh_name(String ph_name) {
	this.ph_name = ph_name;
}
public int getPh_cost() {
	return ph_cost;
}
public void setPh_cost(int ph_cost) {
	this.ph_cost = ph_cost;
}
public Set getSim() {
	return sim;
}
public void setSim(Set sim) {
	this.sim = sim;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
   
}
