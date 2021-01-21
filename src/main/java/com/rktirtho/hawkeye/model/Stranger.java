package com.rktirtho.hawkeye.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stranger")
public class Stranger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String image;
	private Timestamp time;
	private int visited;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = 0;
	}
	
	
}
