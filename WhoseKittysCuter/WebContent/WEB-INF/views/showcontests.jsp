<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin Menu</title>
		
		<!-- Bootstrap CSS file -->
		<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
		
	</head>
	
	
	
	<body class="text-center">
		<div align="center">
		<h1>Contest Management</h1>
		
		<h2>All Contests</h2>
		
		<h3>Search for a contest</h3>
		<br>
		<form action = "search" method = "post">
			<input type = "text" name = "contestName" placeholder="Contest Name">&nbsp; 
			<input type = "submit" value = "Search">
		</form>
		
		<h4>${noRecord}</h4>
		<h4>${recordFound }</h4>
		<h4>${linktoAllAppls }</h4>
		<div class="row">
			<div class="col-10 offset-1 mt-3">
					<table class="table" >
					<tr>
						<th>Contest ID</th>
						<th>Contest Name</th>
						<th>Contest Description</th>
						<th>Status</th>
						<th>Deadline</th>

					</tr>
					<c:forEach items="${contestList}" var="contest">
						<tr>
							<td>${contest.id}</td>
							<td>${contest.contestName}</td>
							<td>${contest.contestBlurb}</td>
							<td>${contest.status}</td>
							<td>${contest.deadline }</td>


							<td><a href="/CaseStudy/admin/updateContest/${contest.id}">Update Contest Info</a>
							<td><a href="/CaseStudy/admin/deleteContest/${contest.id}">Delete Contest</a>
												
							</td> 	
						</tr>
					</c:forEach>
				</table>
			
			</div>
		
		</div>
		
	</div>
		<div>
				<a href="/CaseStudy/admin/createContest"><button class="btn-primary">Create a new contest.</button></a>

		
		</div>
		
	</body>
</html>