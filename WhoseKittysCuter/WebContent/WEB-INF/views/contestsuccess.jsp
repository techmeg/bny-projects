<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Contest Success</title>
	
				<!-- Bootstrap CSS file -->
			<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
	
	</head>
	<body>
		<div class="row">
			<div class="col-6 offset-3 justify-content-center">
				<h2 class="text-center">${createsuccess}</h2>
				<br>
				 <input type="button" class="btn"
				onclick="window.location.href='${pageContext.request.contextPath}/admin/showContests';"
				value="Show Contests" /> 
			</div>
		</div>

	</body>
</html>