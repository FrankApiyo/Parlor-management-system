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
 * Servlet implementation class RemovePersonelServlet
 */
@WebServlet("/RemovePersonelServlet")
public class RemovePersonelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemovePersonelServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id =request.getParameter("id");
		System.out.println("\n\n\nid"+id+"\n\n\n");
		Personel person;
		PersonelList pl = (PersonelList)request.getServletContext().getAttribute("personelList");
		
		for(Personel p : pl) {
			if(p.getId().trim().equals(id.trim())) {
				pl.remove(p);
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/managesys.jsp");
				dispatcher.forward(request,response);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
