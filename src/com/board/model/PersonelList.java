package com.board.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class PersonelList extends ArrayList<Personel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean add(Personel personel) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(personel);
		session.getTransaction().commit();
		return super.add(personel);
	}
	
	public boolean remove(Personel personel) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(personel);
		session.getTransaction().commit();
		return super.remove(personel);
	}
	public boolean addInit(Personel d) {
		return super.add(d);
	}
}
