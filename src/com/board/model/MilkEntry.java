package com.board.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table
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
	
	public MilkEntry() {
		
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
