package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "permitted")
public class Permitted {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int orgId;
	private String imageId;
	private String orgName;
	private Timestamp regesteredTime;
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "id")
//	private Organizations organizations;
	
	
	public Permitted() {
	}
	
	public Permitted(String name, int orgId, String imageId, Timestamp regesteredTime) {
		this.name = name;
		this.orgId = orgId;
		this.imageId = imageId;
//		this.organizations = organizations;
		this.regesteredTime = regesteredTime;
		
	}

	
	public Permitted(int id, String name, int orgId, String imageId, Timestamp regesteredTime, Organizations organizations) {
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
	public Timestamp getRegesteredTime() {
		return regesteredTime;
	}
	public void setRegesteredTime(Timestamp regesteredTime) {
		this.regesteredTime = regesteredTime;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

//	public Organizations getOrganizations() {
//		return organizations;
//	}
//
//	public void setOrganizations(Organizations organizations) {
//		this.organizations = organizations;
//	}
	
	
	
}
