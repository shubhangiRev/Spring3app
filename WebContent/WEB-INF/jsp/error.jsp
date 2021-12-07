<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>your Username and Password are incorrect</title>
</head>
<body>
<form action="/demo">
		<table>
			<tr> <td>Username: </td> <td>${index.username} </td></tr>
			<tr> <td>Password: </td> <td>${index.password} </td></tr>
		</table>
for employee imformation please login again<input type="submit" value="clik login">

</form>
</body>
</html>