package classes;

public class Woner
{
   private int owner_id;
   private String woner_name;
   private String woner_address;
   private String woner_alt_ph_nomber;
public Woner(int owner_id, String woner_name, String woner_address, String woner_alt_ph_nomber) {
	super();
	this.owner_id = owner_id;
	this.woner_name = woner_name;
	this.woner_address = woner_address;
	this.woner_alt_ph_nomber = woner_alt_ph_nomber;
}
public int getOwner_id() {
	return owner_id;
}
public void setOwner_id(int owner_id) {
	this.owner_id = owner_id;
}
public String getWoner_name() {
	return woner_name;
}
public void setWoner_name(String woner_name) {
	this.woner_name = woner_name;
}
public String getWoner_address() {
	return woner_address;
}
public void setWoner_address(String woner_address) {
	this.woner_address = woner_address;
}
public String getWoner_alt_ph_nomber() {
	return woner_alt_ph_nomber;
}
public void setWoner_alt_ph_nomber(String woner_alt_ph_nomber) {
	this.woner_alt_ph_nomber = woner_alt_ph_nomber;
}
   
}
