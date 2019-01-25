package com.board.model;

import java.sql.Date;

public class MilkEntry {
	private Date date;
	private double milkInKgs;
	private boolean discardedMilk;
	
	public MilkEntry(Date date, double milkInKgs, boolean discardedMilk) {
		super();
		this.date = date;
		this.milkInKgs = milkInKgs;
		this.discardedMilk = discardedMilk;
	}

	public Date getDate() {
		return date;
	}

	public double getMilkInKgs() {
		return milkInKgs;
	}

	public boolean isDiscardedMilk() {
		return discardedMilk;
	}
	
}
