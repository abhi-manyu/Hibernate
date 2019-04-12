package org.hibernate_OnetoMany.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="College_details")
public class College {

	@Id
	private String colName;
	
	@Column(name="colID")
	private int colRegdNo;
	
	private String colAddress;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Students> studs;
	
	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(String colName, int colRegdNo, String colAddress) {
		super();
		this.colName = colName;
		this.colRegdNo = colRegdNo;
		this.colAddress = colAddress;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public int getColRegdNo() {
		return colRegdNo;
	}

	public void setColRegdNo(int colRegdNo) {
		this.colRegdNo = colRegdNo;
	}

	public String getColAddress() {
		return colAddress;
	}

	public void setColAddress(String colAddress) {
		this.colAddress = colAddress;
	}

	public Set<Students> getStuds() {
		return studs;
	}

	public void setStuds(Set<Students> studs) {
		this.studs = studs;
	}
	
	
}
