<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Calculator.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String requestFrom = request.getParameter("btn");
	int n1 = Integer.parseInt(request.getParameter("n1"));
	int n2 = Integer.parseInt(request.getParameter("n2"));

	if (requestFrom.equals("addition")) {
		out.println("<br> Addition : " + (n1 + n2));
	}
	if (requestFrom.equals("subraction")) {
		out.println("<br> Subraction : " + (n1 - n2));
	}
	if (requestFrom.equals("multiplication")) {
		out.println("<br> Multiply : " + (n1 * n2));
	}
	if (requestFrom.equals("division")) {
		out.println("<br> division : " + (n1 + n2));
	}
	%>

</body>
</html>