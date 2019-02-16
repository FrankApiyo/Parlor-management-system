package com.board.model;

import java.util.*;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class MilkEntryList extends ArrayList<MilkEntry>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean add(MilkEntry entry) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(entry);
		session.getTransaction().commit();
		return super.add(entry);
	}
	
	public boolean remove(MilkEntry entry) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(entry);
		session.getTransaction().commit();
		return super.remove(entry);
	}
	
	public boolean addInit(MilkEntry d) {
		return super.add(d);
	}
}

