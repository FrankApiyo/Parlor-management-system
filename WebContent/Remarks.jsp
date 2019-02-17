<%-- 
    Document   : Remarks
    Created on : Jan 24, 2019, 3:47:14 PM
    Author     : Kogie
--%>

<%@page import="com.board.model.DataEntry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
      <title>Remarks</title>
        <style>
            .milk{
                float: left;
                width: 350px;
                
                height: 100px;
            }
            .cows{
                float: right;
                width: 250px;
                
                height: 100px;
            }
            .discarded{
                float: left;
               
            }
            #main{
                margin-top: 200px;
                width: 850px;
                height: 550px;
                margin: auto;
                background-color: #8bc34a;
                border-radius: 10px;
            }
            #remarks{
                
                margin-top: 50px ;
                width: 800px;
                height: 300px;
            }
            textarea{
                width: 750px;
                height: 200px;
                padding: 20px;
                margin: 10px auto 10px 10px;
                border: 1px solid black;
                border-radius: 20px;
            }
            #submit{
                float: right;
                margin-right: 100px;
                margin-top: 20px;
            }
            #up{
                width: 900px;
                height: 100px;
               
            }
            #back{
                margin-left: 10px;
                margin-top: 20px;
            }
            body{
                background-color: aliceblue;
                
               
            }
        </style>
        
    </head>
    <body>
        
        <%@ include file="/DairyTemplate.jsp"  %>
        <div id="main">
            <div id="up">
            <div class="milk">encodeUrl(
                <h2>Profitable milk</h2> 
                <h2> <%= ((DataEntry)request.getAttribute("entry")).getProfitableMilk()%> litres</h2>
            </div>
            
             <!--div class="cows">
                <h2>Nuber of ows</h2> 
                <h2> 56</h2>
            </div-->
            <div class="discarded">
                <h2>Discarded milk</h2> 
                <h2>  <%= ((DataEntry)request.getAttribute("entry")).getDiscardedMilk()%> litres</h2>
            </div>
             </div>
            <div id="remarks">
                <h1 style="align-content: flex-start">Remarks</h1>
                <textarea form="usrform" placeholder="Enter your remarks here..."></textarea>
                 <form action="landing.jsp">
                <div id="submit">
                    <input type="submit" value="Submit">
                </div>
                 </form>
                <form action="showMilk.jsp">
                    <div id="back">
                        <input type="submit" value="Back">
                    </div>
                </form>
            </div>
           
            
        </div>
    </body>
</html>
