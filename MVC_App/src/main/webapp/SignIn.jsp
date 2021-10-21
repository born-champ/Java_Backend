<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form  method="get" action="LoginController">
<B> Email ID :</B><input type="email" name="email" size="30">
<p><B> Password :</B><input type="password" name="password" size="30"></p>
<p><input type="submit" value="Submit"></p>
<p><input type="submit" value="Reset"></p>
</form>
<a href="SignUp.jsp">SignUp</a>


</body>
</html>