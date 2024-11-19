<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- declaration tag --%>
	<%!int a = 10, b = 20;
	String name = "Gowtham";%>
	<%-- Scriptlet tag --%>
	<%
	int sum = a + b;
	if (a > b)
		out.println("A is Big");
	else
		out.println("B is Big");
	%>
	<%-- Expression Tag --%>
	<br>
	
	Addition <%=sum %>
	<br>
	Welcome <%= name  %>
	<br>
	
	Today date <%= new Date() %>

</body>
</html>