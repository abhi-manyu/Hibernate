package classes;

public class Library
{
  private int book_id;
  private String book_name;
  private int pages;
  private int cost;
  public Library() {
}
public Library(int book_id, String book_name, int pages, int cost) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.pages = pages;
	this.cost = cost;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
  
  
  
}
