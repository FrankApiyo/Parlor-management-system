package com.board.model;

import java.util.ArrayList;
import org.hibernate.*;
import com.hibernate.*;

public class CalvingIncidentsList extends ArrayList<CalvingIncident>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean add(CalvingIncident ci) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(ci);
		session.getTransaction().commit();
		return super.add(ci);
	}
	
	public boolean remove(CalvingIncident ci) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(ci);
		session.getTransaction().commit();
		return super.remove(ci);
	}
	public boolean addInit(CalvingIncident ci) {
		return super.add(ci);
	}
}
