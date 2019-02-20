<!doctype = html>
<html>
<head>
    <title>ailment and calving</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial scale=1 ">


</head>
<body>
	<%@ include file="/DairyTemplate.html"  %>
	
    <div class="mx-auto" style="width:600px">
        
        <!--NAV TABS -->
    	<ul class="nav nav-tabs" role="tablist">
        	<li class="nav-item">
          	  	<a href="#calving" class="nav-link active" data-toggle="tab">Calving</a>
       	 	</li>

       	 	<li class="nav-item">
           	 	<a href="#ailments" class="nav-link" data-toggle="tab">Ailments</a>
        	</li>
    	</ul>
    	
    	<!--TAB PANES -->
    	<div class="tab-content">

        <div id="calving" class="container tab-pane active"><br>
            
            <div class="container">
                <form>
            	<table>
                	<tr>
                    	<td><label>Cow:</label></td>
                    	<td><select class="form-control">
                    		<%@ page import="com.board.model.*" %>
                        	<% 
                        		CowList list = (CowList)request.getServletContext().getAttribute("cowList");
                        		for(Cow cow: list){
                        			out.print("<option>" + cow.getTag() + "</option>" );
                        		}
                        	%>
                    	</select></td>
                	</tr>
                	<tr>
                    	<td><label>Date:</label></td>
                    	<td><input type="date" name="date" class="form-control"></td>
                	</tr>
                	<tr>
                    	<td><label>Bull:</label></td>
                   	 	<td><input type="text" name="bull" class="form-control"></td>
                	</tr>
            	</table>
            	<input type="submit" value="submit">
        		</form>
            </div>
        </div>
        
        <div id="ailments" class="container tab-pane fade"><br>
            
            <div class="container">
                <form action="AilmentServlet" method="post">
            	<table>
                	<tr>
                    	<td><label>Cow:</label></td>
                    	<td><select class="form-control">
                        	<option>
                            	<!-- a jsp to fetch from database-->
                        	</option>
                    	</select></td>
                	</tr>
                	<tr>
                    	<td><label>Date:</label></td>
                    	<td><input type="date" name="ill_date" class="form-control"></td>
                	</tr>
                	<tr>
                    	<td><label>Case:</label></td>
                   	 	<td><textarea class="form-control" rows="5" name="case"></textarea></td>
                	</tr>
            	</table>
            	<input type="submit" value="submit">
        		</form>
            </div>
        </div>
        
    	</div>
    </div>
</body>
</html>