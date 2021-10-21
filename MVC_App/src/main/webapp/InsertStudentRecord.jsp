<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
<form  method="post" action="StudentController">
<h2>Insert Student Record</h2>
<lable> Login ID :</lable><input type="text" name="sid" size="30"><br/>
<lable> name :</lable><input type="text" name="name" size="30"><br/>
<lable> Age :</lable><input type="text" name="age" size="30"><br/>

<p><input type="submit" value="Submit"></p>
<p><input type="submit" value="Reset"></p>
</form>

</body>
</html>