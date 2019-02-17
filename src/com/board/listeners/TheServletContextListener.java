package com.board.listeners;

import com.board.model.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.hibernate.HibernateUtil;

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
		//CowList l = new CowList();
		//servletContext.setAttribute("cowList", l);
		
		//create a mock arraylist containing all the milk produced by one cow for the last 10 days
		//MilkList milkList = new MilkList();
		/*
		for(int i = 0; i < 10; i++)
			l.add(new Cow("adfadsf", "sadfadsf", new Date()));
		MilkEntryList list = new MilkEntryList();
		servletContext.setAttribute("milkEntryList", list);
		for(int i = 0; i < 10; i++) {
			list.add(new MilkEntry(new Date(), 20.2, false, l.get(i)));
		}
		*/
		//for(int i = 0; i < 10; i++) {z
			//milkList.add(new MilkEntry(new Date(), 11.1, true, l.get(i)));
		//}
		
		//we will add an object called filled status that tells us if the records for the morning or evening are filled already or not
    	System.out.println("\n\n\n\nhere the changes have no efffect"+new MilkEntry());
		loadCalvingIncidentsList();
		loadCowList();
		loadDataEntryList();
		loadDeseaseList();
		loadDeseaseInsidentsList();
		loadHeatIncidentList();
		loadMilkEntryList();
		loadServiceIncidentsList();
		loadPersonelList();
		
    }
	//TODO make more of these for all the lists
    public void loadCalvingIncidentsList() {
    	ArrayList<CalvingIncident> list = (ArrayList<CalvingIncident>) HibernateUtil.getList(CalvingIncident.class);
    	CalvingIncidentsList l = new CalvingIncidentsList();
    	for(CalvingIncident i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("calvingIncidentsList", l);
    }
    
    public void loadCowList() {
    	ArrayList<Cow> list = (ArrayList<Cow>) HibernateUtil.getList(Cow.class);
    	CowList l = new CowList();
    	for(Cow i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("cowList",  l);
    }
    
    public void loadDataEntryList() {
    	ArrayList<DataEntry> list = (ArrayList<DataEntry>) HibernateUtil.getList(DataEntry.class);
    	DataEntryList l = new DataEntryList();
    	for(DataEntry i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("dataEntryList", l);
    }
    
    public void loadDeseaseInsidentsList() {
    	ArrayList<DeseaseInsident> list = (ArrayList<DeseaseInsident>) HibernateUtil.getList(DeseaseInsident.class);
    	DeseaseInsidentsList l = new DeseaseInsidentsList();
    	for(DeseaseInsident i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("deseaseIncidentsList", l);
    }
    
    public void loadDeseaseList() {
    	ArrayList<Desease> list = (ArrayList<Desease>) HibernateUtil.getList(Desease.class);
    	DeseaseList l = new DeseaseList();
    	for(Desease i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("deseaseList", l);
    }
    
    public void loadHeatIncidentList() {
    	ArrayList<HeatIncident> list = (ArrayList<HeatIncident>) HibernateUtil.getList(HeatIncident.class);
    	HeatIncidentList l = new HeatIncidentList();
    	for(HeatIncident i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("heatIncidentList", l);
    }
    
    public void loadMilkEntryList() {
    	ArrayList<MilkEntry> list = (ArrayList<MilkEntry>) HibernateUtil.getList(MilkEntry.class);
    	MilkEntryList l = new MilkEntryList();
    	for(MilkEntry i: list) {
    		System.out.println("\n\n\nthis is the data entry: "+i.getCow().getTag()+"\n\n\n");
    		l.addInit(i);
    	}
    	servletContext.setAttribute("milkEntryList", l);
    }
    
    public void loadPersonelList() {
    	ArrayList<Personel> list = (ArrayList<Personel>) HibernateUtil.getList(Personel.class);
    	PersonelList l = new PersonelList();
    	for(Personel i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("personelList", l);
    }
    
    public void loadServiceIncidentsList() {
    	ArrayList<ServiceIncident> list = (ArrayList<ServiceIncident>) HibernateUtil.getList(ServiceIncident.class);
    	ServiceIncidentsList l = new ServiceIncidentsList();
    	for(ServiceIncident i: list) {
    		l.addInit(i);
    	}
    	servletContext.setAttribute("serviceIncidentsList", l);
    }
}
