package org.Hibernate_UserDefined;

public class Address
{
    private int flatno;
    private String pgname;
    
    public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int flatno, String pgname) {
		super();
		this.flatno = flatno;
		this.pgname = pgname;
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getPgname() {
		return pgname;
	}
	public void setPgname(String pgname) {
		this.pgname = pgname;
	}
    
}
