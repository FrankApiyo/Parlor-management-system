package com.board.model;

import java.util.Date;
import javax.persistence.*;

@Table
@Entity
public class MilkEntry {
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private Date date;
	
	@Column
	private double milkInKgs;
	
	@Column
	private boolean discardedMilk;
	
	
	@JoinColumns({
		  @JoinColumn(name = "name", insertable = false, updatable = false),
		  @JoinColumn(name = "tag", insertable = false, updatable = false)
		})
	@ManyToOne
	private Cow cow;
	
	public MilkEntry(Date date2, double milkInKgs, boolean discardedMilk, Cow cow) {
		super();
		this.date = date2;
		this.milkInKgs = milkInKgs;
		this.discardedMilk = discardedMilk;
		this.cow = cow;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cow getCow() {
		return cow;
	}

	public void setCow(Cow cow) {
		this.cow = cow;
	}

	public void setDiscardedMilk(boolean discardedMilk) {
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
