package com.board.model;

import java.util.Date;

public class CalvingIncident {
	private Date date;
	private String calverTag;
	private String personel;
	private String calfTag;
	private int serviceId;
	public CalvingIncident(Date date, String calverTag, String personel, String calfTag, int serviceId) {
		super();
		this.date = date;
		this.calverTag = calverTag;
		this.personel = personel;
		this.calfTag = calfTag;
		this.serviceId = serviceId;
	}
	public CalvingIncident() {
		
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCalverTag() {
		return calverTag;
	}
	public void setCalverTag(String calverTag) {
		this.calverTag = calverTag;
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
	
}
