package classes;

public class Sim
{
   private int sim_id;
   private String sim_name;
   private String sim_state;
   private Woner woner;
   
   public Sim()
       {
	   
       }

public Sim(int sim_id, String sim_name, String sim_state) {
	super();
	this.sim_id = sim_id;
	this.sim_name = sim_name;
	this.sim_state = sim_state;
}

public int getSim_id() {
	return sim_id;
}

public void setSim_id(int sim_id) {
	this.sim_id = sim_id;
}

public String getSim_name() {
	return sim_name;
}

public void setSim_name(String sim_name) {
	this.sim_name = sim_name;
}

public String getSim_state() {
	return sim_state;
}

public void setSim_state(String sim_state) {
	this.sim_state = sim_state;
}

public Woner getWoner() {
	return woner;
}

public void setWoner(Woner woner) {
	this.woner = woner;
}
   
}
