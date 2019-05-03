<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Applications</title>

<!-- Bootstrap styling -->
	  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=EB+Garamond" rel="stylesheet">

</head>
<body>
	<div align="center">
		<h2>All Applications</h2>
		
		<h3>Search for a record</h3>
		<br>
		<form action = "search" method = "post">
			<input type = "text" name = "name" placeholder="Name">&nbsp; 
			<input type = "text" name = "city" placeholder="City">&nbsp;
			<input type = "submit" value = "Search">
		</form>
		
		<h4>${noRecord}</h4>
		<h4>${recordFound }</h4>
		<h4>${linktoAllAppls }</h4>
		<div class="row">
			<div class="col-10 offset-1 mt-3">
					<table class="table" >
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Course</th>
						<th>Date of Birth</th>
						<th>Skills</th>
						<th>Street</th>
						<th>City</th>
						<th>State</th>
						<th>Zipcode</th>
					</tr>
					<c:forEach items="${applicationList}" var="applicant">
						<tr>
							<td>${applicant.id}</td>
							<td>${applicant.sName}</td>
							<td>${applicant.sCourse}</td>
							<td>${applicant.sDOB}</td>
							<td>${applicant.sSkills }</td>
							<td>${applicant.sAddress.street }</td>
							<td>${applicant.sAddress.city }</td>
							<td>${applicant.sAddress.state }</td>
							<td>${applicant.sAddress.zip }</td>
							<td><a href="/BNYMApplication/editApplication/${applicant.id}">Edit</a>
							<!-- you can either send the applicant.id as a PathVariable (above; in the url) or as below -->
								&nbsp;&nbsp;&nbsp; <a href="/BNYMApplication/deleteApplicant?id=${applicant.id}">Delete</a>
								<!-- if you have more than one variable, you send as list id, name, etc. -->
							
							</td> 	
						</tr>
					</c:forEach>
				</table>
			
			</div>
		
		</div>
		
	</div>
</body>
</html>