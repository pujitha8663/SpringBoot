<%@page import="com.Module.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> employee =(List<Employee>) request.getAttribute("employee");;
	%>
	
	
	
	<%String msg=(String)request.getAttribute("msg");%>

	<% %>
	
	<table border="3px">
	<tr><th>Employee ID</th> <th>Name</th><th>Salary</th><th>Update</th>
	<th>Delete</th>
	<%for(Employee emp:employee){%>
	<tr><td><%= emp.getId() %></td>
	<td><%= emp.getName() %></td>
	<td><%= emp.getSalary() %></td>
	
	<td><a href="./updateEmp?id=<%=emp.getId()%>">Update</a></td>
	<td><a href="./delete?id=<%=emp.getId()%>">Delete</a></td>
	</tr><% } %>

	</table>
	<a href="./Welcome">Welcome</a>
</body>
</html>