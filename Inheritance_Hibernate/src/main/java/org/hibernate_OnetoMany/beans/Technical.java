package org.hibernate_OnetoMany.beans;

import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technical extends Employee
{
    @Id
    private int id;
    private double salary;
    static String[] names=
    	{"Abhi","roger","steve","zen","boyoka","poul","gambler","roudelf","brayan","brenddy"};
    static String[] address=
    	{"New Delhi","kongo","philipines","Sanghai","France","Jermany","Kanada","South America",
    			"Berlin","Manhattan"};
    
    public Technical() {
	}
	public Technical(int id, double salary) {
		super(names[ThreadLocalRandom.current().nextInt(0,10)],
				address[ThreadLocalRandom.current().nextInt(0,10)]);
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
