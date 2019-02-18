package com.board.model;

import java.util.Date;
import javax.persistence.*;

@Table
@Entity
@IdClass(DataEntryPK.class)
public class DataEntry {
	@Column
	private double profitableMilk;
	
	@Column
	private double discardedMilk;
	
	@Column
	private int numberOfCows;
	
	@Column
	private int feeds;
	

	@Id
	@Column
	private Date date;
	
	@Id
	@Column
	private boolean amorpm;
	
	private boolean am;
	
	private boolean pm;
	
	@JoinColumn
	@ManyToOne
	private Personel personOnDuty;
	
	@Column
	private String remark;
	
	public DataEntry() {}
	
	public void setProfitableMilk(double profitableMilk) {
		this.profitableMilk = profitableMilk;
	}

	public void setDiscardedMilk(double discardedMilk) {
		this.discardedMilk = discardedMilk;
	}

	public void setNumberOfCows(int numberOfCows) {
		this.numberOfCows = numberOfCows;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public void setPm(boolean pm) {
		this.pm = pm;
	}

	public void setPersonOnDuty(Personel personOnDuty) {
		this.personOnDuty = personOnDuty;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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
		
		//set value of amorpm
		this.amorpm = this.am;
	}
	
	public void setAmorpm(boolean b) {
		amorpm = b;
		if(b) {
			am = true;
		}else {
			pm = true;
		}
	}
	
	public boolean getAmorpm() {
		return amorpm;
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
	
	public int getFeeds() {
		return feeds;
	}

	public void setFeeds(int feeds) {
		this.feeds = feeds;
	}
}
