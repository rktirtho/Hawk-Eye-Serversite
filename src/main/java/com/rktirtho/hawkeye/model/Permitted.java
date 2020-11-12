package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Permitted {
	@Id
	private int id;
	private String name;
	private String orgId;
	private String imageId;
	private Timestamp regesteredTime;
	
	public Permitted() {
	}
	
	public Permitted(String name, String orgId, String imageId, Timestamp regesteredTime) {
		this.name = name;
		this.orgId = orgId;
		this.imageId = imageId;
		this.regesteredTime = regesteredTime;
	}

	
	public Permitted(int id, String name, String orgId, String imageId, Timestamp regesteredTime) {
		this(name, orgId, imageId, regesteredTime);
		this.regesteredTime = regesteredTime;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public Timestamp getRegesteredTime() {
		return regesteredTime;
	}
	public void setRegesteredTime(Timestamp regesteredTime) {
		this.regesteredTime = regesteredTime;
	}
	
	
	
}
