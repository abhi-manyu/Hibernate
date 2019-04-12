package org.Hibernate_Spring.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
    
	@Id
	private int country_id;
	private String country_Name;
	private long population;
	private String capital;
	public Country() {
		// TODO Auto-generated constructor stub
	}
	public Country(int country_id, String country_Name, long population, String capital) {
		super();
		this.country_id = country_id;
		this.country_Name = country_Name;
		this.population = population;
		this.capital = capital;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
}
