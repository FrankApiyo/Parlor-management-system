package com.board.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String username = request.getParameter("username").toString();
		String password = request.getParameter("pass").toString();
		
		//Validate if user is in our Database
		//The Logic of the entry clerk and manager are contained here.
		if(username.equals("brian") && password.equals("1234")) {
			session.setAttribute("username", username);
			//Redirect to an appropriate page
			response.sendRedirect("landing.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
