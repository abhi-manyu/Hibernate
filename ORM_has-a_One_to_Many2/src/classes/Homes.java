package classes;

public class Homes
{
   private int home_id;
   private String home_name;
   private int no_of_people;
   private int income_of_home;
   public Homes()
   {
	   
   }
public Homes(int home_id, String home_name, int no_of_people, int income_of_home) {
	super();
	this.home_id = home_id;
	this.home_name = home_name;
	this.no_of_people = no_of_people;
	this.income_of_home = income_of_home;
}
public int getHome_id() {
	return home_id;
}
public void setHome_id(int home_id) {
	this.home_id = home_id;
}
public String getHome_name() {
	return home_name;
}
public void setHome_name(String home_name) {
	this.home_name = home_name;
}
public int getNo_of_people() {
	return no_of_people;
}
public void setNo_of_people(int no_of_people) {
	this.no_of_people = no_of_people;
}
public int getIncome_of_home() {
	return income_of_home;
}
public void setIncome_of_home(int income_of_home) {
	this.income_of_home = income_of_home;
}
   
}
