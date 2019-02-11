package com.board.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;


@Embeddable
public class CalvingIncidentPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//date and calver's tag
	@Column
	protected String calverTag;
	
	@Column
	protected Date date;
	
	public CalvingIncidentPK() {}
	
	public CalvingIncidentPK(String tag, Date date) {
		this.calverTag = tag;
		this.date = date;
	}

	public String getCalverTag() {
		return calverTag;
	}

	public void setCalverTag(String calverTag) {
		this.calverTag = calverTag;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
