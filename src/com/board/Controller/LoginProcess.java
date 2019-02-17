package com.board.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.model.Personel;
import com.board.model.PersonelList;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginProcess() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		//Get the user details
		String id = request.getParameter("username").toString().trim();
		String password = request.getParameter("pass").toString().trim();
		
		//Validate if user is in our Database
		PersonelList list = (PersonelList)request.getServletContext().getAttribute("personelList");
		Personel p = null;
		for(Personel personel : list) {
			if(personel.getId().trim().equals(id) && personel.getPassword().trim().equals(password)) {
				//set p to personel so its not null
				p = personel;
				session.setAttribute("personel", p);
				
				//now add the personel to session context so we can keep always know who's logged in through out the sessio.
				session.setAttribute("username", id);
				
				//redirect to landing page
				response.sendRedirect("landing.jsp");
			}
		}
		
		//this can be changed later to do some other thing
		if(session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
		//The Logic of the entry clerk and manager are contained here.
		//if(username.equals("brian") && password.equals("1234")) {
			
	//	}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
