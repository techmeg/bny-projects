<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html >

<!-- ------Part of Spring Security -- not using as most users do not need to log in -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BNYM</title>
</head>
<body>
	<h2>Spring Security 4 - Hello World Example</h2>
	<hr />
	<h3>User dashboard</h3>
	<security:authorize access="isAuthenticated()">
		<b>Welcome! <security:authentication property="principal.username" /></b>
	</security:authorize>
	<br />
	<security:authorize access="isAuthenticated()">
		<a href="/">Home</a> | <a href="logout">Logout</a>
	</security:authorize>
</body>
</html>