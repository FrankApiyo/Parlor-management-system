package com.board.model;

import javax.persistence.*;

@Entity
@Table
public class Desease {
	@Id
	@Column
	String name;
	public Desease(String name) {
		super();
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
}
