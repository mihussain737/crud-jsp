<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
text-align:center;
}
h1 {
	text-align: center;
	text-transform: uppercase;
}
div{
background-color: #38C6AE;

}
</style>
<body>
<div>
	<h1>Saving a lead</h1>
	<form action="saveLead">
		<table border='1'>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</div>
		${msg}
	</form>
</body>
</html>