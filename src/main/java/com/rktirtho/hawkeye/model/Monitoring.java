package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Monitoring {
	@Id
	private int id;
	private int personId;
	private String area;
	private Timestamp time;
	
	private boolean isPermitted; // -1 for strangers, 0 for unauthorized access, 1 for authorized access
	
	
	public Monitoring() {
	}


	public Monitoring(int personId, boolean isPermitted) {
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp timestamp) {
		this.time = timestamp;
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

	
}
