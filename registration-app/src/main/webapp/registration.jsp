<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Welcome to Registration Page</h1>
<pre>
<form action = "reg.do" method="post">
UserName         : <input type ="text" name="username">
Password         : <input type ="password" name="password">
Confirm Password : <input type ="password" name="confirmpassword">
MobileNo         : <input type ="text" name="mobileno">
Age              : <input type ="text" name="age">
<input type="submit" value = "Register">
</form>
</pre>
<h1>Login</h1>
<pre>
<form action="login.do" method="post">
UserName:         : <input type="text" name="username">
Password:         : <input type="password" name="password">
<input type="submit" value = "Login">
</form>
</pre>
<h1>Update</h1>
<pre>
<form action="update.do" method="post">
UserName:         : <input type="text" name="username">
Age     :         : <input type="number" name="age">
<input type="submit" value = "update">
</form>
</pre>
<h1>Delete</h1>
<pre>
<form action="delete.do" method="post">
UserName:         : <input type="text" name="username">
Password:         : <input type="password" name="password">
MobileNo          : <input type="text" name="mobileno">
<input type="submit" value = "delete">
</form>
</pre>
</body>
</html>