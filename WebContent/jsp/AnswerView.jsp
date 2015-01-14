<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
	String des = request.getParameter("description");
	int like = Integer.parseInt(request.getParameter("like"));
%>
<html>
<head>
<title>Answer</title>
</head>
<body>
<p><%= des %></p><br />
<p>Like of this Answer is <%= like %></p><br />
</body>
</html>
