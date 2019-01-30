<%-- 
    Document   : login
    Created on : 30-Jan-2019, 14:48:34
    Author     : brianbett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tatton Park</title>
    </head>
    <body>
        <script language="JavaScript">
            function validate(form) {
                if (form.uname.value == "") {
                    alert("Please fill in The Staff who was on duty");
                    form.uname.focus();
                } else if (form.pass.value == "") {
                    alert("Please fill in The feed amount");
                    form.pass.focus();
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
        <div align="center">
            <form action="landing.jsp" method="POST" class="grid-container">
                <div>
                    <p>Username</p>
                </div>
                <div>
                    <input type="text" name="uname"/><br>
                </div>
                <div>
                    <p>Please enter your password</p>
                </div>
                <div>
                    <input type="password" name="pass">
                </div>
                <div>
                    <input type="button" value="LOGIN" onclick="validate(this.form)">
                </div>

            </form>
        </div>
        <%@ include file="/footer.jsp" %>
