<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html><!-- ------ FORM TO UPDATE CONTEST DETAILS ----------->
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
		
		<style>
		.bg-taupe {
		 background-color: #afa19e;
		}
			
		</style>
	</head>
	<body>
	<section class="my-5">
		<div class="row">
			<div class="card bg-taupe text-white col-6 offset-3 mb-2">
			
			<h2 class="mt-3 ml-2">Edit Contest</h2>

					<!--  use taglib with prefix -->
	<!-- ------ FORM TO UPDATE CONTEST DETAILS ----------->				
					<form:form action="/CaseStudy/admin/editContest" method="POST"
						modelAttribute="contest">
						<!--  model Attribute is passed from the controller showEditContest -->
						
						<table class="table table-borderless text-white ml-7">
							<tr>
								<td class="right"><form:hidden path="id" />
							</tr>
							<tr>
								<td class="left"><label>Contest Name:</label></td>
								<td class="right"><form:input type="text" path="contestName" /> 
								<form:errors path="contestName"	cssClass="errormsg" />

							</tr>
			
							<tr>
								<td><label>Contest Description:</label></td>
								<td><form:input type="text" path="contestBlurb"/> 
								<form:errors path="contestBlurb" cssClass="errormsg" />

							</tr>
			
							<tr>
								<td><label>Status:</label></td>
								<td><form:input type="text" path="status" /> 
								<form:errors path="status" cssClass="errormsg"/>
								
							</tr>
			
							<tr>
								<td><label>Deadline</label></td>
								<td><form:input type="date" path="deadline"/> 
								<form:errors path="deadline" cssClass="errormsg"/>
							</tr>
							
							</table>
						<input class="mb-3 ml-2" id="btn" type="submit" value="Update" />
					</form:form>
			
			</div>
		</div>
	</section>	
	</body>
</html>