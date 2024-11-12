<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="EmployeeController" method="post">
		<br>Enter Employee Id <input type="text" name="eid" /><br>
		<br> <br>Enter Employee Name <input type="text" name="ename" /><br>
		<br> <br>Enter Employee Salary<input type="text" name="esalary" /><br>
		<br> <input type="submit" value="Insert" name="btn" /><br>
		<br> <input type="submit" value="Update" name="btn" /><br>
		<br> <input type="submit" value="Delete" name="btn" /><br>
		<br> <input type="submit" value="Find" name="btn" /><br>
		<br> <input type="submit" value="FindAll" name="btn" />
	</form>

</body>
</html>