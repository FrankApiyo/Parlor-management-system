package com.board.model;


import javax.persistence.*;

@Table
@Entity
public class CalvingIncident {
	@EmbeddedId
	private CalvingIncidentPK pk;
	
	@Column(nullable=false)
	private String personel;
	
	//calf tag can be null because maybe the calf is totally dead
	@Column
	private String calfTag;
	
	@Column(nullable=false)
	private int serviceId;
	public CalvingIncident(String personel, String calfTag, int serviceId) {
		//TODO ensure there is a cow whose calver tag (and also personel whose id is added here) is added here and in any other methods in existence
		super();;
		this.personel = personel;
		this.calfTag = calfTag;
		this.serviceId = serviceId;
	}
	public CalvingIncident() {
		
	}

	public String getPersonel() {
		return personel;
	}
	public void setPersonel(String personel) {
		this.personel = personel;
	}
	public String getCalfTag() {
		return calfTag;
	}
	public void setCalfTag(String calfTag) {
		this.calfTag = calfTag;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public CalvingIncidentPK getPk() {
		return pk;
	}
	public void setPk(CalvingIncidentPK pk) {
		this.pk = pk;
	}
	
	
}
