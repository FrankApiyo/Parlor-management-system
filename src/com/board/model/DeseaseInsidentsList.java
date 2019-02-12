package com.board.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class DeseaseInsidentsList extends ArrayList<DeseaseInsident>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public boolean add(DeseaseInsident deseaseInsident) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(deseaseInsident);
		session.getTransaction().commit();
		return super.add(deseaseInsident);
	}
	
	public boolean remove(DeseaseInsident deseaseInsident) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(deseaseInsident);
		session.getTransaction().commit();
		return super.remove(deseaseInsident);
	}
	
	public boolean addInit(DeseaseInsident d) {
		return super.add(d);
	}
}
