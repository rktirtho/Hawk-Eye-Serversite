package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "security_officer")
public class SecurityOfficer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "org_id")
	private int orgId;
	
	@Column(name = "is_active")
	private int isActive;

	@Column(name = "last_excess")
	private Timestamp lastExcess;

	@Column(name = "joid_date")
	private Timestamp joidDate;


	public SecurityOfficer() {
	}

	public SecurityOfficer(int id, String name, String email, int orgId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
//		this.orgId = orgId;
	}

	public SecurityOfficer(String name, String email, String username, String password, int orgId) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
//		this.orgId = orgId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public Timestamp getLastExcess() {
		return lastExcess;
	}

	public void setLastExcess(Timestamp lastExcess) {
		this.lastExcess = lastExcess;
	}

	public Timestamp getJoidDate() {
		return joidDate;
	}

	public void setJoidDate(Timestamp joidDate) {
		this.joidDate = joidDate;
	}

//	public Organizations getOrganizations() {
//		return organizations;
//	}
//
//	public void setOrganizations(Organizations organizations) {
//		this.organizations = organizations;
//	}

}
