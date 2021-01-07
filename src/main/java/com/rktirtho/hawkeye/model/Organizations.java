package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "organizations")
public class Organizations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String woner;
	private String address;
	private Timestamp regDate;
	

//	private List<Permitted> permitteds;
	
	
	
	
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
	
	
	

//	public List<Permitted> getPermitteds() {
//		return permitteds;
//	}
//
//
//	public void setPermitteds(List<Permitted> permitteds) {
//		this.permitteds = permitteds;
//	}


	@Override
	public String toString() {
		return "id=" + id + "\tname=" + name + "\twoner=" + woner + "\taddress=" + address + "\tregDate="
				+ regDate + "]";
	}
	
	
	

}
