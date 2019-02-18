package com.hibernate;

import org.hibernate.SessionFactory;

import com.board.model.*;
import org.hibernate.*;
import java.util.Date;

public class Test{
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
		session.getTransaction().begin();
		Cow cow = new Cow("name", "tag");
		session.save(cow);
		
		session.getTransaction().commit();
		session.close();
		
	}
}
