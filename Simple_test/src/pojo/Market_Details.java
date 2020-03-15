package pojo;

public class Market_Details
{
	private String sellers_name;
   private String msrketname;
   private long pruductrange;
   private long profit_range;
   
   
   public Market_Details(String sellers_name, String msrketname, long pruductrange, long profit_range) {
	super();
	this.sellers_name = sellers_name;
	this.msrketname = msrketname;
	this.pruductrange = pruductrange;
	this.profit_range = profit_range;
}
public void setMsrketname(String msrketname) {
	this.msrketname = msrketname;
}
   public void setSellers_name(String sellers_name) {
	this.sellers_name = sellers_name;
}
   public void setPruductrange(long pruductrange) {
	this.pruductrange = pruductrange;
}
   public void setProfit_range(long profit_range) {
	this.profit_range = profit_range;
}
   public String getMsrketname() {
	return msrketname;
}
   public long getProfit_range() {
	return profit_range;
}
   public long getPruductrange() {
	return pruductrange;
}
   public String getSellers_name() {
	return sellers_name;
}
   
}
