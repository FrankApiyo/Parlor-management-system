<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bootstrap</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <meta name="viewport" content="width=device-width, initial scale=1 ">
    <style type="text/css">
    	nav{
    		position: relative;
    	}
    	#logout{
    		position: relative;
    		left: 50px;
    	}
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">

         <!-- logo -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#topNavBar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="landing.jsp" class="nabar-brand">TAP</a>
        </div>

        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="landing.jsp" class="nav-link active">Daily Operations</a>
            </li>
            <li class="nav-item">
                <a href="history.jsp" class="nav-link">Record Management</a>
            </li>

            <%@ page import="com.board.model.*, javax.servlet.http.*" %>
            <%	
				HttpSession s = request.getSession(false);	
				if(s.getAttribute("username") == null || s== null)
					response.sendRedirect("login.jsp");
 
				//if user is manager add a third link here for manage system
				//System.out.println("\n\n\n\npersonel: "+((Personel)s.getAttribute("personel")).getRole().toLowerCase().equals("manager")+"\n\n\n");
				else if(s.getAttribute("username") != null && s != null && ((Personel)s.getAttribute("personel")).getRole().toLowerCase().equals("manager")){
					out.print(" <li class='nav-item'>"+
                				"<a href='managesys.jsp' class='nav-link'>parlor management</a>"+
            					"</li>");
				}
			%>
        </ul>
        <li id="logout">
        	<a href="login.jsp">logout</a>
        <li>
    </nav>
    <br>

    <!-- Body goes here -->
</body>
</html>
