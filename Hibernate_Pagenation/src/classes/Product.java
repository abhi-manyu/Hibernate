package classes;

public class Product
{
   private int prdct_id;
   private String prdct_name;
   private int prdct_cost;
   
   public Product()
   {

   }

public Product(int prdct_id, String prdct_name, int prdct_cost) {
	super();
	this.prdct_id = prdct_id;
	this.prdct_name = prdct_name;
	this.prdct_cost = prdct_cost;
}

public int getPrdct_id() {
	return prdct_id;
}

public void setPrdct_id(int prdct_id) {
	this.prdct_id = prdct_id;
}

public String getPrdct_name() {
	return prdct_name;
}

public void setPrdct_name(String prdct_name) {
	this.prdct_name = prdct_name;
}

public int getPrdct_cost() {
	return prdct_cost;
}

public void setPrdct_cost(int prdct_cost) {
	this.prdct_cost = prdct_cost;
}
   
}
