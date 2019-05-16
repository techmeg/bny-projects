<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin Menu</title>
		<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
		
		<!-- Bootstrap CSS file -->
		<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
		
		<!-- whose kitty styles -->
		<style>

		.vote {
			width: 150px;
			color: white;
			font-size: 1.25rem;
			padding: 4px 8px;
			border: 1px solid white;
			text-align: center;
			border-radius: 5px;
		}
		a:hover {
			color: rgba(255, 255, 255, .75);
			text-decoration: none;
		}
		.taupe {
			color: #afa19e;
		}
		</style>

		
	</head>
	
	
	
	<body style="color: gray">
	
	    <header>
		<div class="bs-example">
			<nav class="navbar navbar-expand-md navbar-dark bg-dark">
				<a href="#" class="navbar-brand">Brand</a>
				<button type="button" class="navbar-toggler" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav">
						<a href="/CaseStudy/about" class="nav-item nav-link">About
							Contest</a> <a href="#" class="nav-item nav-link">All Winners</a>
					</div>
					<form class="form-inline ml-auto">
						<a class="vote" href="/CaseStudy/index" class="nav-item nav-link">Vote</a>
					</form>
				</div>
			</nav>
		</div>
	</header>
	
		<div  >
		<div class="text-center">
			<h2 class="mt-3">Contest Management</h2>
			
			<div class="text-center">
				<a href="/CaseStudy/admin/createContest"><button
						class="btn-info py-1 my-2">Create a new contest.</button></a>
			</div>
			
			<h3>Search for a contest</h3>
			<br>
			<form action = "search" method = "post">
				<input type = "text" name = "contestName" placeholder="Contest Name">&nbsp; 
				<input type = "submit" value = "Search">
			</form>
			
			<h4>${noRecord}</h4>
			<h4>${recordFound }</h4>
			<h4>${linktoAllAppls }</h4>
		</div>
		
		<div class="row">
			<div class="col-10 offset-1 mt-3" >
					<table class="table table-sm table-hover" >
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
							<td><fmt:formatDate value="${contest.deadline}"
						pattern="MM/dd/yyyy" /></td>


							<td><a class="taupe" href="/CaseStudy/admin/updateContest/${contest.id}">Update Contest Info</a>
							<td><a class="taupe" href="/CaseStudy/admin/deleteContest/${contest.id}">Delete Contest</a>
												
							</td> 	
						</tr>
					</c:forEach>
				</table>
			
			</div>
		
		</div>
		
	</div>

		
	</body>
</html>