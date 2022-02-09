package com.webapi.racetracker.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Race {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer race_id;
	
	private Date date;
	
	private Float distance;
	
	private String type;

	private String zip;
	
	private String name;
	
	private  String race_link;

	public Integer getRace_id() {
		return race_id;
	}

	public void setRace_id(Integer race_id) {
		this.race_id = race_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace_link() {
		return race_link;
	}

	public void setRace_link(String race_link) {
		this.race_link = race_link;
	}

	@Override
	public String toString() {
		return "Race [race_id=" + race_id + ", date=" + date + ", distance=" + distance + ", type=" + type + ", zip="
				+ zip + ", name=" + name + ", race_link=" + race_link + "]";
	}

	
}
