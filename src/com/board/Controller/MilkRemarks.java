package com.board.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.Cow;
import com.board.model.CowList;
import com.board.model.DataEntry;
import com.board.model.MilkEntry;
import com.board.model.Personel;

/**
 * Servlet implementation class MilkRemarks
 */
@WebServlet(description = "takes entry and forwards to Remarks.jsp from showMilk.jsp", urlPatterns = { "/MilkRemarks" })
public class MilkRemarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MilkRemarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//calculate profitable milk and discarded milk
		double profitableMilk = 0;
		double discardedMilk = 0;
		CowList cows = (CowList) request.getServletContext().getAttribute("cowList");
		for(Cow c: cows) {
			//add up all the cows milk here
		}
		//here i passed am because i dont know how to get the period for now
		//TODO -- GET TO KNOW HOW TO ADD THE PERIOD 
		//TODO --get to know how to add person on duty
		//String name, String id, String role, String password
		//Personel p = new Personel("guy", "id", "manager", "password");
		//DataEntry e = new DataEntry(new Date(), "am", p, "", profitableMilk, discardedMilk);
		DataEntry e = (DataEntry) request.getServletContext().getAttribute("entry");
		System.out.println("\n\n\n\n"+e+"n\n\n\n");
		request.setAttribute("entry", e);
		RequestDispatcher view = request.getRequestDispatcher("Remarks.jsp");
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
