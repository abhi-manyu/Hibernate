package beans;

import java.util.Set;

public class Woner {

	private int wonerID;
	private String wonerName;
	private String wonerPhNo;
	private String wonerAddress;
	private Set veichles;
	public Woner() {
		// TODO Auto-generated constructor stub
	}
	public Woner(int wonerID, String wonerName, String wonerPhNo, String wonerAddress, Set veichles) {
		super();
		this.wonerID = wonerID;
		this.wonerName = wonerName;
		this.wonerPhNo = wonerPhNo;
		this.wonerAddress = wonerAddress;
		this.veichles = veichles;
	}
	public int getWonerID() {
		return wonerID;
	}
	public void setWonerID(int wonerID) {
		this.wonerID = wonerID;
	}
	public String getWonerName() {
		return wonerName;
	}
	public void setWonerName(String wonerName) {
		this.wonerName = wonerName;
	}
	public String getWonerPhNo() {
		return wonerPhNo;
	}
	public void setWonerPhNo(String wonerPhNo) {
		this.wonerPhNo = wonerPhNo;
	}
	public String getWonerAddress() {
		return wonerAddress;
	}
	public void setWonerAddress(String wonerAddress) {
		this.wonerAddress = wonerAddress;
	}
	public Set getVeichles() {
		return veichles;
	}
	public void setVeichles(Set veichles) {
		this.veichles = veichles;
	}
	
	
}
