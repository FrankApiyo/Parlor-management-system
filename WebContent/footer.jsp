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
<style>
.site-footer {
  background: white;
}
</style>

<div class="site-footer">
<p align = "center" style="vertical-align: bottom">
    <small>
        &copy; Copyright <%= year %> THE BOARD
    </small>
</p>
</div>
</body>
</html>
