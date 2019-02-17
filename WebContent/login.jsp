<%-- 
    Document   : login
    Created on : 30-Jan-2019, 14:48:34
    Author     : brianbett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style type="text/css">
    
    body {
    background: #76b852; /* fallback for old browsers */
  	background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  	background: -moz-linear-gradient(right, #76b852, #8DC26F);
  	background: -o-linear-gradient(right, #76b852, #8DC26F);
  	background: linear-gradient(to left, #76b852, #8DC26F);
  	font-family: "Roboto", sans-serif;
  	-webkit-font-smoothing: antialiased;
  	-moz-osx-font-smoothing: grayscale;      
}
    
    .login-page {
    width: 360px;
    padding: 8% 0 0;
    margin: auto;
    }
    
    .form {
    position: relative;
  	z-index: 1;
  	background: #FFFFFF;
  	max-width: 360px;
  	margin: 0 auto 100px;
  	padding: 45px;
  	text-align: center;
  	box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  	}

.form input {
	font-family: "Roboto", sans-serif;
	outline: 0;
  	background: #f2f2f2;
  	width: 100%;
  	border: 0;
  	margin: 0 0 15px;
  	padding: 15px;
  	box-sizing: border-box;
  	font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
    
    
    
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tatton Park</title>
    </head>
    
    <body>
        <script language="JavaScript">
            function validate(form) {
                if (form.username.value == "") {
                    alert("Please fill in The Staff who was on duty");
                    form.username.focus();
                } else if (form.pass.value == "") {
                    alert("Password Required");
                    form.pass.focus();
                } else {
                    form.submit();
                }
            }
        </script>
 
  <div class="login-page">
  <div class="form">
    <form class="login-form" action="LoginProcess" method="post">
      <input type="text" name="username" placeholder="Username"/>
      <input type="password" name="pass" placeholder="Password"/>
      <button onclick="validate(this.form)" >Login</button>
    </form>
  </div>
</div>
        <%@ include file="/footer.jsp" %>
        
</body>
</html>
