<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Emp Data</h1>
<%for(String s:(List<String>)session.getAttribute("data")){
out.print(s);	
}%>
}
</body>
</html>