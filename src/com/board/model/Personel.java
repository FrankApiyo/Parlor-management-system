package com.board.model;

public class Personel {
	private String name, id, role, password;
	
	public Personel() {
	}
	
	public Personel(String name, String id, String role, String password) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
