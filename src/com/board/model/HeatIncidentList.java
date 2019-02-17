package com.board.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class HeatIncidentList extends ArrayList<HeatIncident>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean add(HeatIncident heatIncident) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(heatIncident);
		session.getTransaction().commit();
		return super.add(heatIncident);
	}
	
	public boolean remove(HeatIncident heatIncident) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(heatIncident);
		session.getTransaction().commit();
		return super.remove(heatIncident);
	}
	public boolean addInit(HeatIncident d) {
		return super.add(d);
	}
}
