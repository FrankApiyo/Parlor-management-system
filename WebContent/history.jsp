<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse:collapse;
  padding: 25px; 
	}
}
</style>
<meta charset="UTF-8">
<title>History</title>

</head>
<body>
<h1>This page displays the History of <br>milk production in 10 days</h1>>
<table border = "0">
  <tr>
    <th ><span style="font-weight:bold">Name</span></th>
    <th>Tag</th>
    <th>1</th>
    <th>2</th>
    <th>3</th>
    <th>4</th>
    <th>5</th>
    <th>6</th>
    <th>7</th>
    <th>8</th>
    <th>9</th>
    <th>10</th>
  </tr>
  <% 
  	// At this stage we iterate through the data received
  	for(int i = 0; i < 30; i++){
			out.println("<tr>"
				    +"<td>Some Name</td>"
				    +"<td>Some Tag</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"<td>N/A</td>"
				    +"</tr>"
				    );
		}
  %>
</table>

</body>
</html>