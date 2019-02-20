package com.board.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.Cow;
import com.board.model.DeseaseInsidentPK;
import com.board.model.DeseaseInsidentsList;

@WebServlet("/AilmentServlet")

public class AilmentServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	
	DeseaseInsidentsList dil;
	
	public AilmentServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String cow = request.getParameter("cow");
		String date = request.getParameter("ill_date");
		String disease = request.getParameter("disease");
		String time = request.getParameter("amorpm");
		String attended = request.getParameter("attended");
		String symptom = request.getParameter("simptom");
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/records.jsp");
		dispatcher.forward(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
}
