package com.board.listeners;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.board.model.Cow;

import sun.util.logging.resources.logging;

/**
 * Application Lifecycle Listener implementation class TheServletContextListener
 *
 */
@WebListener
public class TheServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent e)  {
    	ServletContext c = e.getServletContext();

		//now we will put an ArrayList<Cow> object in the servlet context, c,
		ArrayList<Cow> l = new ArrayList<>();
		c.setAttribute("cowList", l);
		
		//create a mock arraylist containing all the milk produced by one cow for the last 10 days
		ArrayList<Double> milkList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			milkList.add(i+1.1);
		}
		for(int i = 0; i < 10; i++)
			l.add(new Cow("Frank", "FR2019", milkList));
		
		//we will add an object called filled status that tells us if the records for the morning or evening are filled already or not
		
    }
	
}
