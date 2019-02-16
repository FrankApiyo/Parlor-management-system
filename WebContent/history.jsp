<%@page import="java.util.ArrayList"%>
<%@page import="com.board.model.*"%>
<%@page import="com.board.model.Cow"%>
<%@page import="com.board.model.CowList"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 5px;
}

tr:nth-child(even) {
  background-color: #f2f2f2
}
tr:nth-child(odd) {
  background-color: #d7ead8

}
</style>
<meta charset="UTF-8">
<title>History</title>

</head>
<body bgcolor="#e8f5e9">
	
<%@ include file="/DairyTemplate.html"  %>
	
<h1 align="center">This page displays the History of milk production in 10 days</h1>
<form align="center" action="history.jsp">
  Begin from this Date:<br>
  <input type="date" name="start_date">
  <input type="submit" value="Select">
</form>
<br>
<table border = "0" align="center">
  <tr>
   
    <th rowspan="2"><span style="font-weight:bold">Name</span></th>
    <th rowspan ="2">Tag</th>
    <%
    String date = (String) request.getParameter("start_date");
    if (date==null){date="2019-01-25";}
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    try{
    	calendar.setTime(sdf.parse(date));
    	
    }catch(ParseException e){
    	e.printStackTrace();
    }
    for (int i=0; i<10; i++){
    String newDate = sdf.format(calendar.getTime());
    out.println("<th colspan='2'>"+newDate+"</th>");
    calendar.add(Calendar.DAY_OF_MONTH, 1);
    }
   
    %>
  </tr>
  <tr>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	<th>Morn.</th>
  	<th>Even.</th>
  	
  
  </tr>
  <% 
  	//TODO something is just not finished here
  	// At this stage we iterate through the data received
  	//ServletContext sc = request.getServletContext();
  	//CowList cowList = (CowList) sc.getAttribute("cowList");
  	CowList cows = (CowList)request.getServletContext().getAttribute("cowList");
  	MilkEntryList list = (MilkEntryList)request.getServletContext().getAttribute("milkEntryList");
  	for(Cow cow: cows){
  			//out.println(list.get(0).getCow().getTag().equals(cow.getTag()));
			out.println("<tr>"
				    +"<td>"+cow.getName()+"</td>"
				    +"<td><a href=\"records.jsp?tagname="+cow.getTag()+"\">"+cow.getTag()+"</a></td>");
						//loop through list and find out the entries that belong to cow
						MilkEntry e = null;
						for(MilkEntry entry: list){
							
							if(entry.getCow().getTag().equals(cow.getTag())){
								out.println(entry.getCow().getTag()+" "+cow.getTag());
								e = entry;
								break;
							}
						}
						if(e != null)
				    		for(int i = 0; i < 10; i++){
				    			out.println(
				    				"<td>"+e.getMilkInKgs()+"</td>"
				    				+"<td>"+e.getMilkInKgs()+"</td>");
				    			}			out.println("</tr>");	    
		}
  %>
</table>

</body>
</html>
