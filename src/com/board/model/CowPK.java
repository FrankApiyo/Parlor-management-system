package com.board.model;

import java.io.Serializable;

public class CowPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//name and tag
	protected String name;
	protected String tag;
	public CowPK() {}
	public CowPK(String name, String tag) {
		this.name = name;
		this.tag = tag;
	}
}
