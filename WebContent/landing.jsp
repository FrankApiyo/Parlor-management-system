<!DOCTYPE html>
<html>
    <head>
        <title>Tatton Park</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="cow2.jpg">
        <script language="JavaScript">
            function validate(form) {
                if (form.staffOnDuty.value == "") {
                    alert("Please fill in The Staff who was on duty");
                    form.staffOnDuty.focus();
                } else if (form.feed.value == "") {
                    alert("Please fill in The feed amount");
                    form.feed.focus();
                } else {
                    form.submit();
                }
            }
        </script>
        <style>
            .grid-container {
                display: grid;
                grid-template-columns: auto auto;
                background-color: #8bc34a;
                padding: 80px;
                margin-left: 150px;
                margin-right: 150px; 
                opacity: 0.9;
                filter: alpha(opacity=90);
            }
        </style>
        
        <%@ include file="/DairyTemplate.jsp"  %>
        <%@ page import="com.board.model.*, java.util.Date" %>
        <div align="center">
            <h1>WELCOME!!</h1><br>
            <!-- TODO we need to add url encoding on all links to allow for support of browsers that have deactivated cookies -->
            <form action="showMilk.jsp" method="POST" class="grid-container">
                <div>
                    <p>Enter Milking session</p>
                </div>
                <div>
             
                    <select name="period">
                    	<!--  add code to check if am or pm has been filled today -->
                    	<% 
                    		DataEntryList l = (DataEntryList)request.getServletContext().getAttribute("dataEntryList");
            				if(!l.getEntered("am", new java.sql.Date(new Date().getTime())))
            					out.print("<option>A.M</option>");
           					if(!l.getEntered("pm", new java.sql.Date(new Date().getTime())))
           						out.print("<option>P.M</option>");
                    	%>
                        
                    </select>
                    <br>
                </div>
                <%
                	if(((String)request.getAttribute("problem")) != null){
                		out.print((String)request.getAttribute("problem"));
                	}
                %>
                <div>
                    <p>Staff member on duty</p>
                </div>
                <div>
                    <input type="text" name="staffOnDuty" value=""/><br>
                </div>
                <div>
                    <p>Enter amount of Feed (in KG)</p>
                </div>
                <div>
                    <input type="text" name="feed"/>
                </div>
                <div>
                    <input type="button" name="" value="NEXT" onclick="validate(this.form)">
                </div>
            </form>
        </div>
        <%@ include file="/footer.jsp" %>
