package com.board.Controller;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.model.*;

/**
 * Servlet implementation class RemoveCowServlet
 */
@WebServlet("/RemoveCowServlet")
public class RemoveCowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tag = request.getParameter("deltagno");
		
		CowList cl = (CowList) request.getServletContext().getAttribute("cowList");
		Cow cow = null;
		
		for(Cow c: cl) {
			if(c.getTag().trim().equals(tag.trim())) {
				cow = c;
			}
		}
		//first delete all its milk entries
		MilkEntryList milkEntryList = (MilkEntryList) request.getServletContext().getAttribute("milkEntryList");
		ArrayList<MilkEntry> milkEntriesToRemove = new ArrayList<>();
		for(MilkEntry e: milkEntryList) {
			if(e.getCow().getTag().equals(cow.getTag())) {
				milkEntriesToRemove.add(e);
			}
		}
		for(int i = 0; i < milkEntriesToRemove.size(); i++) {
			milkEntryList.remove(milkEntriesToRemove.get(i));
		}
		
		cl.remove(cow);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void removeCow(String tag) {
		
	}

}
