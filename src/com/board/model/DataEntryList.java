package com.board.model;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class DataEntryList extends ArrayList<DataEntry>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean getEntered(String period, java.util.Date date)throws Exception {
		period = period.trim().toLowerCase();
		//if period is neither pm nor am we will throw and exception so far high it touches the sky
		//TODO convert between java.util.Date and java.sql.Date
		if(period != "am" && period != "pm")
			throw new Exception();
		for(DataEntry i : this) {
			if(i.getDate() == new Date(date.getTime())) {
				boolean am = period == "am";
				boolean pm = period == "pm";
				if(i.isAm() && am)
					return true;
				if(i.isPm() && pm)
					return false;
			}
		}
		return false;
	}
	
	public boolean add(DataEntry entry) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(entry);
		session.getTransaction().commit();
		return super.add(entry);
	}
	
	public boolean remove(DataEntry entry) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(entry);
		session.getTransaction().commit();
		return super.remove(entry);
	}
	
	public boolean addInit(DataEntry e) {
		return super.add(e);
	}
}
