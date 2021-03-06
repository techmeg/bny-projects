<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html>
<html> <!-- ------------PAGE TO CREATE CONTEST INFO------------- -->
	<head>
		<meta charset="ISO-8859-1">
		<title>Create Contest</title>
		<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- Bootstrap CSS file -->
			<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
			
		<style>
			.errormsg {
			font-size: .8rem;
			color: red;
			}
		</style>
		
	</head>
	<body>
	<div class="center">
		<h1 class="text-center mt-5">Create Contest</h1>
		<h2>${message}</h2>
		<div class="row">
			<div class="col-6 offset-3 mt-3">
			
				<form:form action="/CaseStudy/admin/saveContest" method="post" class="form-group" modelAttribute="contest" >
				
					<div class="form-group">
						<form:label for="contestName" path="contestName">Contest Name</form:label>
						<form:input class="form-control" type="text" path="contestName" 
						placeholder="Contest Name" />
						<form:errors path="contestName"	cssClass="errormsg" />
					</div>	
					
					<div class="form-group">
						<form:label for="contestBlurb" path="contestBlurb">Contest Blurb</form:label>
						<form:textarea class="form-control" path="contestBlurb" rows="3" cols="5" 
						placeholder="Contest Description" ></form:textarea>
						<form:errors path="contestBlurb" cssClass="errormsg" />
					</div>
						
					<div class="form-group">
						<form:label for="deadline" path="deadline">Contest Deadline</form:label>
						<form:input class="form-control" type="date" path="deadline" 
						placeholder="Contest Deadline" />
						<form:errors path="deadline" cssClass="errormsg"/>
					</div>
					
					<div class="form-group">
						<form:label for="status" path="status">Contest Status</form:label>
						<form:input class="form-control" type="text" path="status" 
						placeholder="Contest Status" />
						<form:errors path="status" cssClass="errormsg"/>
					</div>
					
					<div class="form-group">
						<button class="btn btn-primary" type="submit" value="Create">Create</button>
					</div>				
					
				</form:form>
			
			</div>
		</div>
	
	</div>



	</body>
</html>