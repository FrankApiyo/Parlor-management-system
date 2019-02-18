package com.board.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.model.*;
import java.io.PrintWriter;
import java.util.*;

/**
 * Servlet implementation class ShowMildAndStore
 */
@WebServlet("/ShowMilkAndStore")
public class ShowMilkAndStore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMilkAndStore() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//get all the milk entries
		DataEntry dataEntry = (DataEntry)request.getServletContext().getAttribute("entry");
		System.out.println("\n\n\n\n"+dataEntry+"\n\n\n");
		CowList list = (CowList)request.getServletContext().getAttribute("cowList");
		double totalDiscarded = 0;
		double totalProfitable = 0;
		ArrayList<MilkEntry> milkEntryList = new ArrayList<>();
		for(Cow cow: list) {
			MilkEntry entry = new MilkEntry();
			entry.setCow(cow);
			entry.setDate(dataEntry.getDate());
			String milkInKgsString = request.getParameter(cow.getTag()+"milk");
			double milkInKgs = 0;
			try{
				milkInKgs = Double.parseDouble(milkInKgsString);
			}catch(Exception ex){
				milkInKgs = 0;
			}
			entry.setMilkInKgs(milkInKgs);
			//now get if milk was discarded
			String discardedMilk = request.getParameter(cow.getTag());
			if(request.getParameter(cow.getTag()) == null) {
				System.out.println("\n\n\n\n"+"not discarded"+"\n\n\n\n");
				entry.setDiscardedMilk(false);
			}else {
				System.out.println("\n\n\n\n"+"discarded"+"\n\n\n\n");
				entry.setDiscardedMilk(true);
			}
			if(entry.isDiscardedMilk()) {
				totalDiscarded += entry.getMilkInKgs();
			}else {
				totalProfitable += entry.getMilkInKgs();
			}
			milkEntryList.add(entry);
			
			//PrintWriter writer = response.getWriter();
			//writer.println(discardedMilk); 
			
		}
		//now we must forward this request to the remarks page as it is out duty
		//MilkEntryList milkEntryList = (MilkEntryList)request.getServletContext().getAttribute("milkEntryList")		
		request.getServletContext().setAttribute("milkEntryListDataEntry", milkEntryList);
		dataEntry.setDiscardedMilk(totalDiscarded);
		dataEntry.setProfitableMilk(totalProfitable);
		RequestDispatcher view = request.getServletContext().getRequestDispatcher("/Remarks.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
