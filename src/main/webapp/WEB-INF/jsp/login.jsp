<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My first Jsp</title>
</head>
<body>

<form method="post">

Name : <input type="text" name="name"/> 

Password : <input type="password" name="password"/> 
<input type="submit" name="Submit" value="Submit Query"/	>
<p style="color:Tomato;"> ${errorMessage} </p>
</form>
<!-- <h1>This is first JSP login page , Welcome ${name} you are number ${id }</h1> -->
</body>
</html>