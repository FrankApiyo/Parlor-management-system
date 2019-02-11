package com.board.model;

import javax.persistence.*;

@Entity
@Table
public class ServiceIncident {
	
	@EmbeddedId
	private ServiceIncidentPK service;
	
	@Column
	private int heatId;
	//TODO ensure there's a heatId and cowtag and sessionId
	public ServiceIncident(int heatId) {
		super();
		this.heatId = heatId;
	}
	public ServiceIncident() {
		
	}
	
	public int getHeatId() {
		return heatId;
	}
	public void setHeatId(int heatId) {
		this.heatId = heatId;
	}
	public ServiceIncidentPK getService() {
		return service;
	}
	public void setService(ServiceIncidentPK service) {
		this.service = service;
	}
	
}
