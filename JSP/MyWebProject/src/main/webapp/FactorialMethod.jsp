<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.math.BigInteger" %>
	<%@ include file="Factorial.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
     
        String numberStr = request.getParameter("number");
        if (numberStr != null) {
         
            int number = Integer.parseInt(numberStr);

            
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

         
            out.println("<h3>Factorial of " + number + " is: " + factorial + "</h3>");
        }
    %>

</body>
</html>