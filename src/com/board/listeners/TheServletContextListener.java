package com.board.listeners;

import com.board.model.*;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.board.model.Cow;
import com.board.model.CowList;

/**
 * Application Lifecycle Listener implementation class TheServletContextListener
 *
 */
@WebListener
public class TheServletContextListener implements ServletContextListener {
	
	private ServletContext servletContext = null;
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent e)  {
    	servletContext  = e.getServletContext();

		//now we will put an ArrayList<Cow> object in the servlet context, c,
		CowList l = new CowList();
		servletContext.setAttribute("cowList", l);
		
		//create a mock arraylist containing all the milk produced by one cow for the last 10 days
		//MilkList milkList = new MilkList();
		
		for(int i = 0; i < 10; i++)
			l.add(new Cow("Frank", "FR2019"));
		MilkEntryList list = new MilkEntryList();
		servletContext.setAttribute("milkEntryList", list);
		for(int i = 0; i < 10; i++) {
			list.add(new MilkEntry(new Date(), 20.2, false, l.get(i)));
		}
		//for(int i = 0; i < 10; i++) {
			//milkList.add(new MilkEntry(new Date(), 11.1, true, l.get(i)));
		//}
		
		//we will add an object called filled status that tells us if the records for the morning or evening are filled already or not
		
    }
	
    public void loadCalvingIncidentsList() {
    	
    }
    
}
