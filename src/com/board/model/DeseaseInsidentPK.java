package com.board.model;

import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class DeseaseInsidentPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumns({
		  @JoinColumn(name = "name", insertable = false, updatable = false),
		  @JoinColumn(name = "tag", insertable = false, updatable = false)
		})
	@ManyToOne
	private Cow cow;

	@JoinColumn
	@ManyToOne
	private Desease desease;
	
	@Column
	private Date date;
	
	public DeseaseInsidentPK() {
		
	}
	
	public DeseaseInsidentPK(Cow cow, Desease desease, Date date) {
		super();
		this.cow = cow;
		this.desease = desease;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Cow getCow() {
		return cow;
	}

	public void setCow(Cow cow) {
		this.cow = cow;
	}

	public Desease getDesease() {
		return desease;
	}

	public void setDesease(Desease desease) {
		this.desease = desease;
	}
		
}
