<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Applications</title>
</head>
<body>
	<div align="center">
		<h2>All Applications</h2>

		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Course</th>
				<th>Date of Birth</th>
			</tr>
			<c:forEach items="${allApplicants}" var="applicant">
				<tr>
					<td>${applicant.id}</td>
					<td>${applicant.sName}</td>
					<td>${applicant.sCourse}</td>
					<td>${applicant.sDOB}</td>
					<td><a href="/CustomerManager/showApplicant/${applicant.id}">More Info</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>