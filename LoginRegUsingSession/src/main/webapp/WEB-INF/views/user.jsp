<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>
  <h1>Welcome to User Dashboard</h1>
	   
    <h4>User name: ${user.fname} ${user.mname} ${user.mname}</h4>
    <h4>User Age: ${user.age}</h4>
    <h4>User Email: ${user.email}</h4>

    <a href="/LoginRegUsingSession/logout">Log out</a><br>
    
  
</body>
</html>