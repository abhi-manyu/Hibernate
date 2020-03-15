package classes;


public class Address
{
   private int plot_no;
   private String PG;
   private String layout;
   private String pin;
   private Student stud;
   public Address()
         {
	   
         }
public Address(int plot_no, String pG, String layout, String pin) {
	super();
	this.plot_no = plot_no;
	PG = pG;
	this.layout = layout;
	this.pin = pin;
}
public int getPlot_no() {
	return plot_no;
}
public void setPlot_no(int plot_no) {
	this.plot_no = plot_no;
}
public String getPG() {
	return PG;
}
public void setPG(String pG) {
	PG = pG;
}
public String getLayout() {
	return layout;
}
public void setLayout(String layout) {
	this.layout = layout;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}

   
}
