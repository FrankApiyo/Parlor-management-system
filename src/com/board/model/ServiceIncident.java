package com.board.model;

public class ServiceIncident {
	private int serviceId;
	private int sessionId;
	private String cowtag;
	private int heatId;
	public ServiceIncident(int serviceId, int sessionId, String cowtag, int heatId) {
		super();
		this.serviceId = serviceId;
		this.sessionId = sessionId;
		this.cowtag = cowtag;
		this.heatId = heatId;
	}
	public ServiceIncident() {
		
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getCowtag() {
		return cowtag;
	}
	public void setCowtag(String cowtag) {
		this.cowtag = cowtag;
	}
	public int getHeatId() {
		return heatId;
	}
	public void setHeatId(int heatId) {
		this.heatId = heatId;
	}
	
}
