package com.board.model;

import java.util.Date;

public class MilkEntry {
	private Date date;
	private double milkInKgs;
	private boolean discardedMilk;
	
	public MilkEntry(Date date2, double milkInKgs, boolean discardedMilk) {
		super();
		this.date = date2;
		this.milkInKgs = milkInKgs;
		this.discardedMilk = discardedMilk;
	}
	
	public void setDiscardedMIlk(boolean discardedMilk) {
		this.discardedMilk = discardedMilk;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setMilkInKgs(double milkInKgs) {
		this.milkInKgs = milkInKgs;
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
