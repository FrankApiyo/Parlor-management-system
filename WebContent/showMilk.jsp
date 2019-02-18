<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.board.model.*" %>

<%@ include file="header.jsp" %>
<main>
	<%@ include file="/DairyTemplate.jsp"  %>
	<%
		String staff = request.getParameter("staffOnDuty");
		if(staff == null){
			staff = ((DataEntry)request.getServletContext().getAttribute("entry")).getPersonOnDuty().getId();
		}
		String feed = request.getParameter("feed");
		if(feed == null){
			feed = ((Integer)((DataEntry)request.getServletContext().getAttribute("entry")).getFeeds()).toString();
		}
		//first make sure there is staff with that Id
		PersonelList list = (PersonelList) request.getServletContext().getAttribute("personelList");
		DataEntry entry = null;
		if(request.getServletContext().getAttribute("entry") == null){
			entry = new DataEntry();
		}else{
			entry = (DataEntry)request.getServletContext().getAttribute("entry");
		}
		request.getServletContext().setAttribute("entry", entry);
		for(Personel p: list){
			if(p.getId().trim().equals(staff.trim())){
				if(entry == null)
					System.out.println("\n\n\n"+"entry is null"+"\n\n\n");
				else
					entry.setPersonOnDuty(p);
			}
		}
		//for loop ends and we dont find a single personel
		if(entry.getPersonOnDuty() == null){
			request.setAttribute("problem", "enter correct person on duty");
			RequestDispatcher view = request.getServletContext().getRequestDispatcher("/landing.jsp");
			view.forward(request, response);
		}
		
		//set am or pm
		String period = request.getParameter("period");
		if(period==null){
			if(((DataEntry)request.getServletContext().getAttribute("entry")).isAm()){
				period = "am";
			}else if(((DataEntry)request.getServletContext().getAttribute("entry")).isPm()){
				period = "pm";
			}
		}
		if(period == null){
			request.setAttribute("problem", "enter period, either am or pm");
			RequestDispatcher view = request.getServletContext().getRequestDispatcher("/landing.jsp");
			view.forward(request, response);
		}
		if(period.toLowerCase().trim().equals("am")){
			entry.setAm(true);
		}else{
			entry.setPm(true);
		}
		
		entry.setDate(new Date());
		
	%>
	<form method="POST" action="ShowMilkAndStore">
	<table>	
		<tr>
   			<th>tag</th>
    		<th>name</th>
    		<th>milk</th>
    		<th>discarded</th>
  		</tr>
		<%
		/*enter table rows here depending on the number of cows in Cows object found in the Application Context*/
			CowList cows = (CowList) request.getServletContext().getAttribute("cowList");
			for(Cow c: cows){
				out.print("<tr>");
				out.print("<td>"+c.getTag()+"</td>");
				out.print("<td>"+c.getName()+"</td>");
				//the name of input field is same as the tag name of  cow
				out.print("<td><input  type=\"text\" name=\""+c.getTag()+"milk\"></td>");
				out.print("<td><input  type=\"checkbox\" name=\""+c.getTag()+"\" value=\"discarded\"></td>");
				out.print("</tr>");
			}
		%>
	</table>
	<input type="submit" />
	</form>
</main>
<%@ include file="footer.jsp" %>
