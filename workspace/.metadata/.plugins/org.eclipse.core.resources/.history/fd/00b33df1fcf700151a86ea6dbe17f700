<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>

<body>
	<%
int cijfer1 = (int)(Math.random()*100);
int cijfer2 = (int)(Math.random()*100);
int opdracht = 1;
int punten = 0;
int antwoord = cijfer1-cijfer2;

String rekenen = "-";



try {
	if (request.getParameter("knop") != null) {
		int invoer = Integer.parseInt(request.getParameter("getal"));
		opdracht = Integer.parseInt(request.getParameter("vraag"));
		punten = Integer.parseInt(request.getParameter("punten"));
		antwoord = Integer.parseInt(request.getParameter("antwoord"));
		 while  (cijfer2 > cijfer1) {	
cijfer1 = (int)(Math.random()*100);
 cijfer2 = (int)(Math.random()*100);
 
 while  (cijfer2 > cijfer1) {
	 cijfer2 = (int)(Math.random()*100);
 }
		System.out.println("invoer: "+invoer+", antwoord: "+antwoord);
		if (antwoord == invoer) {
			punten++;
			opdracht ++;
		} else {
			opdracht ++;
		}
		  antwoord = cijfer1-cijfer2;
		 }
	}
} catch (NumberFormatException e) {
	out.println("");
}
%>
<div id = "reken">
<div id = "title"><h1>Reken Opdrachten</h1> </div>
	<form action="reken.jsp" method="post" id="form">
	<div id="score"> <p>Score: <%=punten %> </p> </div>
				<p> <%=cijfer1%> <%=rekenen %> <%=cijfer2 %> =</p>
			<input type="text" name="getal"> 
			<input type="submit" name="knop" value="OK">			
			<input type="hidden" name ="vraag" value="<%=opdracht %>">		
			<input type="hidden" name ="punten" value="<%=punten %>">
			<input type="hidden" name ="antwoord" value="<%=antwoord %>">		

	</form>
</div>
</body>
</html>