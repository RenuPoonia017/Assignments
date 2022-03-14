<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome on WebPage</h1>
<form action="controller" method="Post"><!-- http://localhost:8080/servlet-app -->
<span style="margin-bottom:20px">PID</span><input style="margin: 0px 0px 20px 20px " type="text" name="id"><br/>
<span style="margin-bottom:20px">Name</span><input style="margin:0px 0px 20px 20px" type="text" name="name"><br/>
<span style="margin-bottom:20px">City</span><input style="margin:0px 0px 20px 20px" type="text" name="city"><br/>
<span style="margin-bottom:20px">Task</span><input style="margin: 0px 0px 20px 20px " type="text" name="task"><br/>
<p>Task:findEmployeeById</p>
<p>Task:createEmployee</p>
<p>Task:list</p>
<p>Task:update</p>
<p>Task:delete</p>
<input type="submit" value="Send"><br/>
</form>
</center>
</body>
</html>