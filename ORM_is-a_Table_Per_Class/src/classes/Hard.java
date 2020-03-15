package classes;

public class Hard extends Employee 
{
   private int wh;
   public Hard()
     {
	   
     }
public Hard(int id, String name, String mail, int salary, int wh) {
	super(id, name, mail, salary);
	this.wh = wh;
}
public int getWh() {
	return wh;
}
public void setWh(int wh) {
	this.wh = wh;
}
   
}
