package com.board.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.model.*;
import java.text.SimpleDateFormat;

/**
 * Servlet implementation class AddCowServlet
 */
@WebServlet("/AddCowServlet")
public class AddCowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cow cow;
	CowList cl;
	String url;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCowServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nick");
		String tag = request.getParameter("addtagno");
		
		try {
			
            cow= new Cow(name, tag);
            cl =(CowList) request.getServletContext().getAttribute("cowList");
            cl.add(cow);
            url = "/managesys.jsp";
            
		}catch(Exception e){
			url = "/landing.jsp";
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	public boolean optionCheck(String s) {
		if (s=="Yes") {
			return true;
		}
		else
			return false;
	}

}
