package beans;

public class Veichle {

	private String veichle_Regdno;
	private String veichleName;
	private String milage;
	
	public Veichle() {
		// TODO Auto-generated constructor stub
	}

	public Veichle(String veichle_Regdno, String veichleName, String milage) {
		super();
		this.veichle_Regdno = veichle_Regdno;
		this.veichleName = veichleName;
		this.milage = milage;
	}

	public String getVeichle_Regdno() {
		return veichle_Regdno;
	}

	public void setVeichle_Regdno(String veichle_Regdno) {
		this.veichle_Regdno = veichle_Regdno;
	}

	public String getVeichleName() {
		return veichleName;
	}

	public void setVeichleName(String veichleName) {
		this.veichleName = veichleName;
	}

	public String getMilage() {
		return milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}
	
	
}
