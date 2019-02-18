package com.board.Controller;

import java.io.IOException;
import com.board.model.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EntryProcessing
 */
@WebServlet("/EntryProcessing")
public class EntryProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntryProcessing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		DataEntry entry = (DataEntry)request.getServletContext().getAttribute("entry");
		String remark = request.getParameter("remark");
		entry.setRemark(remark);
		ArrayList<MilkEntry> milkEntryList = (ArrayList<MilkEntry>)request.getServletContext().getAttribute("milkEntryListDataEntry");
		MilkEntryList list = (MilkEntryList)request.getServletContext().getAttribute("milkEntryList");
		for(MilkEntry e: milkEntryList) {
			list.add(e);
		}
		DataEntryList dataEntryList = (DataEntryList) request.getServletContext().getAttribute("dataEntryList");
		dataEntryList.add(entry);
		
		response.sendRedirect("landing.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
