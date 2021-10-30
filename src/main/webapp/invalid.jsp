<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer errorCode = Integer.parseInt(request.getParameter("error"));
		if (errorCode == 1) {
	%>
	<script>
		alert("Please Enter Username");
	</script>
	<%
		} else if (errorCode == 2) {
			out.println("Please enter password"); 
		} else if (errorCode == 3){
			out.println("<h1>Invalid credentials</h1>");
		}
	%>

	<a href="login.jsp">
		Login</a>
</body>
</html>