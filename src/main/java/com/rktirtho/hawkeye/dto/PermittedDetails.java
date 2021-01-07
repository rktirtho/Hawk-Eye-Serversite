package com.rktirtho.hawkeye.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;

public class PermittedDetails {
	private int id;
	private String name;
	private int orgId;
	private String imageId;
	private String orgName;
	private Timestamp regesteredTime;
			
	public PermittedDetails() {
		super();
	}
	
	public PermittedDetails(String name, int orgId, String imageId, String orgName) {
		super();
		this.name = name;
		this.orgId = orgId;
		this.imageId = imageId;
		this.orgName = orgName;
	}
	
	
	
	public PermittedDetails(int id, String name, int orgId, String imageId, String orgName, Timestamp regesteredTime) {
		super();
		this.id = id;
		this.name = name;
		this.orgId = orgId;
		this.imageId = imageId;
		this.orgName = orgName;
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
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Timestamp getRegesteredTime() {
		return regesteredTime;
	}
	public void setRegesteredTime(Timestamp regesteredTime) {
		this.regesteredTime = regesteredTime;
	}
	

}
