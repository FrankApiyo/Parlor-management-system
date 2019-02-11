package com.board.model;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class ServiceIncidentPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//cowTag, sessionId, serviceId
	@Column
	protected int cowTag;
	
	@Column
	protected int sessionId;
	
	@Column
	protected int serviceId;
	public ServiceIncidentPK() {}
	public ServiceIncidentPK(int cowTag, int sessionId, int serviceId) {
		super();
		this.cowTag = cowTag;
		this.sessionId = sessionId;
		this.serviceId = serviceId;
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
	public int getCowtag() {
		return cowTag;
	}
	public void setCowtag(int cowtag) {
		this.cowTag = cowtag;
	}
}
