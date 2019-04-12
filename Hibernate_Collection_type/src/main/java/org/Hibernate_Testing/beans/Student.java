package org.Hibernate_Testing.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name="TestingTable")
public class Student
{
    @Id
    private int rono;
    
    private String name;
    
    @CollectionOfElements
    private Set<String> books;
    
    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rono, String name,Set<String> books) {
		super();
		this.rono = rono;
		this.name = name;
		this.books = books;
	}

	public int getRono() {
		return rono;
	}

	public void setRono(int rono) {
		this.rono = rono;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBooks() {
		return books;
	}

	public void setBooks(Set<String> books) {
		this.books = books;
	}
}
