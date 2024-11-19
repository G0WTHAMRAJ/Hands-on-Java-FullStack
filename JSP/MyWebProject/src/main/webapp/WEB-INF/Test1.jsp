<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%--Jsp Use Bean --%>
	<jsp:useBean id="emp" class=com.day1.Employee></jsp:useBean>
	<jsp:setProperty name="emp" property="eid" value="101"/>
	<jsp:setProperty name="emp" property="ename" value="Raj"/>
	<jsp:setProperty name="emp" property="esalary" value="40000"/>
	<br>
	
	<jsp:getProperty property="eid" name="emp"/>
	<jsp:getProperty property="ename" name="emp"/>
	<jsp:getProperty property="esalary" name="emp"/>
	
	
	

</body>
</html>