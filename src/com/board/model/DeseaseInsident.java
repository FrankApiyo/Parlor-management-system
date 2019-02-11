package com.board.model;

import javax.persistence.*;

@Table
@Entity
public class DeseaseInsident {
	@EmbeddedId
	private DeseaseInsidentPK pk;
	
	@Column
	private boolean attended;
	
	@Column
	private String amOrPm;
	
	@Column
	private String simptom; 
	
	public DeseaseInsident() {
		
	}

	public DeseaseInsident(boolean attended, String amOrPm, String simptom) {
		super();
		this.attended = attended;
		this.amOrPm = amOrPm;
		this.simptom = simptom;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}


	public String getAmOrPm() {
		return amOrPm;
	}

	public void setAmOrPm(String amOrPm) {
		this.amOrPm = amOrPm;
	}

	public String getSimptom() {
		return simptom;
	}

	public void setSimptom(String simptom) {
		this.simptom = simptom;
	}

	public DeseaseInsidentPK getPk() {
		return pk;
	}

	public void setPk(DeseaseInsidentPK pk) {
		this.pk = pk;
	}
	
}
