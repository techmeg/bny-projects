<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edit Contest</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<!-- Bootstrap styling -->
		
		<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
		
	</head>
	<body>
	<section>
		<div class="row">
			<div class="col-6 offset-3">
			
			<h1>Edit Application</h1>

					<!--  use taglib with prefix -->
					
					<form:form action="/CaseStudy/admin/editContest" method="POST"
						modelAttribute="contest">
						<!--  model Attribute is passed from the controller showEditContest -->
						
						<table class="table">
							<tr>
								<td class="left"><label>ID:</label></td>
								<td class="right"><form:hidden path="id" />
							</tr>
							<tr>
								<td class="left"><label>Contest Name:</label></td>
								<td class="right"><form:input type="text" path="contestName" /> 

							</tr>
			
							<tr>
								<td><label>Contest Description:</label></td>
								<td><form:input type="text" path="contestBlurb"/> 

							</tr>
			
							<tr>
								<td><label>Status:</label></td>
								<td><form:input type="text" path="status" /> 
							</tr>
			
							<tr>
								<td><label>Deadline</label></td>
								<td><form:input type="date" path="deadline"/> 
							</tr>
							</table>
						<input id="btn" type="submit" value="Update" />
					</form:form>
				</section>
			
			</div>
		
		</div>
		
	</body>
</html>