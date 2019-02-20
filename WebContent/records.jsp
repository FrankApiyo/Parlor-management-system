<%@page import="java.text.ParseException"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>cow records</title>
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

<%@ include file="/DairyTemplate.jsp"  %>
<div class="container">
	<div class="mx-auto" style="width:600px">
    <h1>Individual Cow Records</h1>
    <br>
    <form action="records.jsp" class="form-inline">
                     <div class="row">
                         <div class="col-sm-6">
                         <label for="tag">Tag: <span><%=request.getParameter("tagname")%> </span> </label>
                         
                        </div>
                     
                        <div class="col-sm-6">
                            <label for="name">Name: <span><%=request.getParameter("cowname") %></span></label>
                          
						</div>
                     </div>
                </form>
    <!--NAV TABS -->
    <ul class="nav nav-tabs" role="tablist">
        <!-- li class="nav-item">
            <a href="#home" class="nav-link active" data-toggle="tab">Milk Records</a>
        </li -->

        <li class="nav-item">
            <a href="#disease" class="nav-link" data-toggle="tab">Ailment Records</a>
        </li>

        <li class="nav-item">
            <a href="#calving" class="nav-link" data-toggle="tab">Calving Records</a>
        </li>
    </ul>

    <!--TAB PANES -->
    <div class="tab-content">

        <div id="home" class="container tab-pane active"><br>
            <h3>Milk Records:</h3>
            <div class="container">
                <h5>Select period:</h5>
                <form action="records.jsp" class="form-inline">
                <div class="row">
                <div class="col-6">
					<label>From:</label>
					<input class="form-control" type="date" name="start-date">
                </div>

                <div class="col-6">
					<label>To:</label>
					<input class="form-control" type="date" name="end-date" >
                </div>
                </div>
                <button type="submit" value="submit">submit</button>
                </form>
            </div>
        </div>

        <div id="disease" class="container tab-pane fade"><br>
            <h3>Ailment History:</h3>
            <div class="container">
                    <form action="#" class="form-inline">
                        <div class="form-group">
                            <label>sample date:</label>
                            <label>sample case.....................................</label>
                        </div>
                    </form>
                    <form action="#" class="form-inline">
                        <div class="form-group">
                            <label>sample date:</label>
                            <label>sample case.....................................</label>
                        </div>
                    </form>
                </div>
        </div>

        <div id="calving" class="container tab-pane fade"><br>
            <h3>Calving Records:</h3>
            <div class="container">
                    <form action="#" class="form-inline">
                        <div class="form-group">
                            <label>sample date:</label>
                            <label>sample bull,</label>
                            <label>sample expected due date,</label>
                            <label>sample ..........</label>
                        </div>
                    </form>
                    <form action="#" class="form-inline">
                        <div class="form-group">
                            <label>sample date:</label>
                            <label>sample bull,</label>
                            <label>sample expected due date,</label>
                            <label>sample ..........</label>
                        
                        	<%
	String date = (String)request.getParameter("start_date");
	if (date == null){date="2019-01-01";}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar calendar = Calendar.getInstance();
		try{
			calendar.setTime(sdf.parse(date));
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		String endDate = (String)request.getParameter("end_date");
		if (endDate == null){endDate="2019-01-03";}
		
		String newDate = sdf.format(calendar.getTime());
		while(newDate.equals(endDate)){
			out.println(
					"<label>"+newDate+"</label>"
					);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		
%>
                        
                        </div>
                    </form>
                </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
