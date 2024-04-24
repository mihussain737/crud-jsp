<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of All Leads</title>
<style>
body{
text-align:center;
}
th{
background-color: #1146EC;
color: #E5EE62;
}
tr:nth-child(even) {
    background-color: #4ED3BD;
    color: #49044F;
}


</style>
</head>
<body>
	<h1>List Of All Leads</h1>
	<table border='1'>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="lead" items="${leads}">
			<tr>
				<td>${lead.firstName}</td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.mobile}</td>
				<td><a href="delete?id=${lead.id}">delete</a> <a
					href="update?id=${lead.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
