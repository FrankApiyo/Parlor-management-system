package com.board.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.model.*;

/**
 * Servlet implementation class AddPersonelServelt
 */
@WebServlet("/AddPersonelServelt")
public class AddPersonelServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Personel person;
	PersonelList pl;

    public AddPersonelServelt() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uName = request.getParameter("addusername");
		String empId = request.getParameter("addID");
		String password = request.getParameter("pass");
		String role = request.getParameter("role");
		try {
			person=new Personel(uName, empId, role, password);
			pl = (PersonelList)request.getServletContext().getAttribute("personelList");
			pl.add(person);
		}catch (Exception e) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/managesys.jsp");
	        dispatcher.forward(request, response);
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/managesys.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
