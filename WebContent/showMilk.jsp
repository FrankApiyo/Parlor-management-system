<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.board.model.*" %>
<%@ include file="header.jsp" %>
<main>
	<form method="POST" action="MilkRemarks">
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
				out.print("<td><input  type=\"checkbox\" name=\""+c.getTag()+"discarded\" value=\"discarded\"></td>");
				out.print("</tr>");
			}
		%>
	</table>
	<input type="submit" />
	</form>
</main>
<%@ include file="footer.jsp" %>