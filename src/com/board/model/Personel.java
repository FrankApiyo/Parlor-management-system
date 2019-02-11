package com.board.model;

import javax.persistence.*;

@Entity
@Table
public class Personel {
	@Column
	private String name;
	
	@Id
	@Column
	private String id;
	
	@Column
	private String role;
	
	@Column
	private String password;
	
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
