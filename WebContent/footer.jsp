<%-- 
    Document   : footer
    Created on : 23-Jan-2019, 18:47:12
    Author     : brianbett
--%>

<%@page import="java.util.*"%>
<%
    GregorianCalendar cal = new GregorianCalendar();
    int year= cal.get(Calendar.YEAR);
%>

<p align = "center" style="vertical-align: bottom">
    <small>
        &copy; Copyright <%= year %> THE BOARD
    </small>
</p>
</body>
</html>
