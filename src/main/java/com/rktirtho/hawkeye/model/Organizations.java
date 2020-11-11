package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Organizations {
	@Id
//	@PrimaryKeyJoinColumn
	private int id;
	private String name;
	private String woner;
	private String address;
	private Timestamp regDate;
	
	
	public Organizations() {
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
	public String getWoner() {
		return woner;
	}
	public void setWoner(String woner) {
		this.woner = woner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "id=" + id + "\tname=" + name + "\twoner=" + woner + "\taddress=" + address + "\tregDate="
				+ regDate + "]";
	}
	
	
	

}
