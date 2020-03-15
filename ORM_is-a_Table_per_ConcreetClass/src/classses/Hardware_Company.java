package classses;

public class Hardware_Company extends Company
{
   private double hike;
   private int no_of_holydays;
   public Hardware_Company()
   {

   }
public Hardware_Company(int reg_no, String name, double hike, int no_of_holydays) {
	super(reg_no, name);
	this.hike = hike;
	this.no_of_holydays = no_of_holydays;
}
public double getHike() {
	return hike;
}
public void setHike(double hike) {
	this.hike = hike;
}
public int getNo_of_holydays() {
	return no_of_holydays;
}
public void setNo_of_holydays(int no_of_holydays) {
	this.no_of_holydays = no_of_holydays;
}
   
}
