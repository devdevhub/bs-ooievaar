<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tafels Next and Back</title>
</head>
<body>
	<form action="index.jsp" method="get">
		<input type="text" name="invul">
		<input type="submit" name="verstuur" value="verstuur">

		
		<p>
			<!-- here comes jsp  -->
			<%
			if(request.getParameter("verstuur") != null) {
				int input = Integer.parseInt(request.getParameter("invul"));
				
				for (int i = 1; i <= 10; i++) {
					out.println(i + " x " + input + " = " + (i*input) + "<br>");
				}
			
			}
			%>
		</p>
	
		
		<!-- here ends jsp -->
		
		
		
	</form>
</body>
</html>