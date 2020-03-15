package classes;

public class Customer
{
    private int cust_id;
    private String cust_name;
    private String cust_add;
    private String cust_phone;
    private Account acc;
    public Customer()
    {
    	
	}
	public Customer(int cust_id, String cust_name, String cust_add, String cust_phone) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_add = cust_add;
		this.cust_phone = cust_phone;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_add() {
		return cust_add;
	}
	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
    
    
}
