package com.board.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.model.*;

/**
 * Servlet implementation class AddCowServlet
 */
@WebServlet("/AddCowServlet")
public class AddCowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Cow cow;
	CowList cl;
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
		//Date doB =  request.getParameter("bday");
		
		//cow= new Cow(name, tag, doB);
		cl =(CowList) request.getServletContext().getAttribute("CowList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
