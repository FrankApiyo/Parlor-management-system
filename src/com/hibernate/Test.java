package com.hibernate;

import org.hibernate.SessionFactory;
import com.board.model.*;
import java.util.*;
import org.hibernate.*;

public class Test{
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		
		Cow cow = new Cow();
		
		session.save(cow);
	}
}
