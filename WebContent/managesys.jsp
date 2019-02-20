<%@page import="java.text.ParseException"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>cow records</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial scale=1 ">
</head>
<body>
 	<script language="JavaScript">
            function validate(form) {
                if (form.addtagno.value == "") {
                    alert("Please fill in Cow Tag Number");
                    form.username.focus();
                } else if (form.nick.value == "") {
                    alert("Please fill in Cow Nickname");
                    form.nick.focus();
                }else if (form.deltagno.value == "") {
                    alert("Please fill in Cow Tag Number");
                    form.deltagno.focus();
                }else if (form.addID.value == "") {
                    alert("Please fill in Employee ID");
                    form.addID.focus();
                }else if (form.pass.value == "") {
                    alert("Please fill in Password");
                    form.pass.focus();
                } else if (form.name.value == "") {
                    alert("Please fill in Name");
                    form.name.focus();
                }else if (form.id.value == "") {
                    alert("Please fill in Employee ID");
                    form.id.focus();
                }else {
                    form.submit();
                }
            }
    </script>

	<%@ include file="/DairyTemplate.jsp"%>
	<div class="container">
		<div class="mx-auto" style="width: 600px">
			<h1>MANAGE</h1>
			<br>
			<!--NAV TABS -->
			<ul class="nav nav-tabs" role="tablist">
				<li class="nav-item"><a href="#home" class="nav-link active"
					data-toggle="tab">Manage Cow</a></li>

				<li class="nav-item"><a href="#disease" class="nav-link"
					data-toggle="tab">Manage Staff</a></li>
			</ul>

			<!--TAB PANES -->
			<div class="tab-content">

				<div id="home" class="container tab-pane active">
					<br>

					<div class="container">
						<form action="AddCowServlet" class="form-inline" method="post">
							<div class="row">
								<div class="col-6">
									<h3>Add Cow</h3>
									<label>Tag Number:</label> 
									<input class="form-control" type="text" name="addtagno"> <br> <br> 
									<label>Nick Name:</label> 
									<input class="form-control" type="text" name="nick">
									<br> <br> 
									<input type="button" onclick="validate(this.form)"value="Add">
								</div>
							</div>

						</form>


						<form action="RemoveCowServlet" class="form-inline" method="post">
							<div class="row">
								<div class="col-6">
									<h3>Delete Cow</h3>
									<label>Tag no:</label> <input class="form-control" type="text" name="deltagno">
									<br>
									<input type="button" onclick="validate(this.form)" value="Delete">
								</div>
							</div>

						</form>
					</div>
				</div>

				<div id="disease" class="container tab-pane fade">
					<br>
					<div class="container">
						<form action="AddPersonelServelt" class="form-inline" method="post">
							<div class="row">
								<div class="col-6">
									<h3>Add Staff</h3>
									<label>employee id:</label> 
									<input class="form-control" type="text" name="addID"> 
									<br> <br> 
									<label>name:</label>
									<input class="form-control" type="text" name="name">
									<br> <br> 
									<label>Password:</label>
									<input class="form-control" type="password" name="pass"> 
									<br> <br> 
									<label>Role:</label> <select name="role">
										<option>Manager</option>
										<option>Staff</option>
									</select> 
									<br> <br>
									<input type="button" onclick="validate(this.form)" value="Add">
								</div>
							</div>
						</form>

						<form action="RemovePersonelServlet" class="form-inline" method="post">
							<div class="row">
								<div class="col-6">
									<h3>Delete Staff</h3>
									<label>Employee ID:</label> 
									<input class="form-control" type="text" name="id"> <br> <br> 
									<input type="button" onclick="validate(this.form)" value="Delete">
								</div>
							</div>

						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
