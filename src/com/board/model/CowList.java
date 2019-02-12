package com.board.model;

import java.util.ArrayList;

import org.hibernate.*;

import com.board.model.Cow;
import com.hibernate.HibernateUtil;

public class CowList extends ArrayList<Cow>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean add(Cow cow) {
		//ensure the database is updated after any of these two operations
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session  = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(cow);
		session.getTransaction().commit();
		return super.add(cow);
	}
	
	public boolean remove(Cow cow) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(cow);
		session.getTransaction().commit();
		return super.remove(cow);
	}
	
	public boolean addInit(Cow c) {
		return super.add(c);
	}
}
