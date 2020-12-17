package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Monitoning {
	@Id
	private int id;
	private int personId;
	private String area;
	private Timestamp timestamp;
	private boolean isPermitted;
	
	
	public Monitoning() {
	}


	public Monitoning(int personId, boolean isPermitted) {
		this.personId = personId;
		this.isPermitted = isPermitted;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public boolean isPermitted() {
		return isPermitted;
	}
	public void setPermitted(boolean isPermitted) {
		this.isPermitted = isPermitted;
	}
	
	


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Monitoning [id=" + id + ", personId=" + personId + ", timestamp=" + timestamp + ", isPermitted="
				+ isPermitted + "]";
	}
	
	
	
	
}
