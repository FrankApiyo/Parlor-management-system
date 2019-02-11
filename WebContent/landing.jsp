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
        
        <%@ include file="/DairyTemplate.html"  %>
        <div align="center">
            <h1>WELCOME!!</h1><br>
            <form action="showMilk.jsp" method="POST" class="grid-container">
                <div>
                    <p>Enter Milking session</p>
                </div>
                <div>
             
                    <select name="period">
                        <option>A.M</option>
                        <option>P.M</option>
                    </select>
                    <br>
                </div>
                <div>
                    <p>Staff member on duty during session</p>
                </div>
                <div>
                    <input type="text" name="staffOnDuty" value=""/><br>
                </div>
                <div>
                    <p>Enter amount of Feed for session(in KG)</p>
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
