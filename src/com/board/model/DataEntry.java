package com.board.model;

import java.util.Date;

public class DataEntry {
	private double profitableMilk;
	private double discardedMilk;
	private int numberOfCows;
	private Date date;
	private boolean am;
	private boolean pm;
	private Personel personOnDuty;
	private String remark;
	
	public DataEntry(Date date, String amorpm, Personel personOnDuty, String remark, double profitableMilk, double discardedMilk) {
		super();
		this.profitableMilk = profitableMilk;
		this.discardedMilk = discardedMilk;
		this.date = date;
		amorpm = amorpm.toLowerCase().trim();
		if(amorpm == "am")
			this.am = true;
		else this.pm = true;
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

	public double getProfitableMilk() {
		return profitableMilk;
	}

	public double getDiscardedMilk() {
		return discardedMilk;
	}

	public int getNumberOfCows() {
		return numberOfCows;
	}
	
}
