package com.example.demo;

public class Team {
	
	Long id;
	String name;
	String location;
	String mascotte;
	
	public Team(String name, String location, String mascotte) {
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
	}
	
	public Team() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}

}
