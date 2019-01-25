package com.board.model;

import java.sql.Date;

public class DataEntry {
	private Date date;
	private boolean am;
	private boolean pm;
	private Personel personOnDuty;
	private String remark;
	
	public DataEntry(Date date, boolean am, boolean pm, Personel personOnDuty, String remark) {
		super();
		this.date = date;
		this.am = am;
		this.pm = pm;
		this.personOnDuty = personOnDuty;
		this.remark = remark;
	}

	public Date getDate() {
		return date;
	}

	public boolean isAm() {
		return am;
	}

	public boolean isPm() {
		return pm;
	}

	public Personel getPersonOnDuty() {
		return personOnDuty;
	}

	public String getRemark() {
		return remark;
	}
	
}
