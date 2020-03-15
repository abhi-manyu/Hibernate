package classes;

import java.util.Date;

public class Account
{
   private int acc_id;
   private String acc_type;
   private Date acc_created_dt;
   private int acc_sal;
   public Account()
     {
	   
     }
public Account(int acc_id, String acc_type, Date acc_created_dt, int acc_sal) {
	super();
	this.acc_id = acc_id;
	this.acc_type = acc_type;
	this.acc_created_dt = acc_created_dt;
	this.acc_sal = acc_sal;
}
public int getAcc_id() {
	return acc_id;
}
public void setAcc_id(int acc_id) {
	this.acc_id = acc_id;
}
public String getAcc_type() {
	return acc_type;
}
public void setAcc_type(String acc_type) {
	this.acc_type = acc_type;
}
public Date getAcc_created_dt() {
	return acc_created_dt;
}
public void setAcc_created_dt(Date acc_created_dt) {
	this.acc_created_dt = acc_created_dt;
}
public int getAcc_sal() {
	return acc_sal;
}
public void setAcc_sal(int acc_sal) {
	this.acc_sal = acc_sal;
}
   
}
