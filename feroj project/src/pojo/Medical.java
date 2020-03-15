package pojo;

public class Medical
{
  private int id;
  private String username;
  private String pwd;
  
  public Medical()
  {
  
  }
  
  public Medical(int id, String username, String pwd) {
	super();
	this.id = id;
	this.username = username;
	this.pwd = pwd;
}

public void setId(int id) {
	this.id = id;
}
  public void setPwd(String pwd) {
	this.pwd = pwd;
}
  public void setUsername(String username) {
	this.username = username;
}
  public int getId() {
	return id;
}
  public String getUsername() {
	return username;
}
  public String getPwd() {
	return pwd;
}
  
}
