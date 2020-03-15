package classes;

import java.util.Set;

public class Actor
{
   private int act_id;
   private String act_name;
   private Set movies;
   public Actor()
     {
	   
     }
public int getAct_id() {
	return act_id;
}
public void setAct_id(int act_id) {
	this.act_id = act_id;
}
public String getAct_name() {
	return act_name;
}
public void setAct_name(String act_name) {
	this.act_name = act_name;
}
public Set getMovies() {
	return movies;
}
public void setMovies(Set movies) {
	this.movies = movies;
}
   
}
