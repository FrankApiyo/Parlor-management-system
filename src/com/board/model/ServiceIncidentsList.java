package com.board.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class ServiceIncidentsList extends ArrayList<ServiceIncident>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean add(ServiceIncident si) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(si);
		session.getTransaction().commit();
		return super.add(si);
	}
	
	public boolean remove(ServiceIncident si) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(si);
		session.getTransaction().commit();
		return super.remove(si);
	}
	
	public boolean addInit(ServiceIncident d) {
		return super.add(d);
	}
}
