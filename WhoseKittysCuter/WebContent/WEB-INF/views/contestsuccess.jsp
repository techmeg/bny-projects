<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html> <!-- ----------- PAGE TO CONFIRM SUCCESS IN CREATING A CONTEST---------- -->
	<head>
	<meta charset="ISO-8859-1">
	<title>Contest Success</title>
	
	<!-- Bootstrap CSS file -->
			<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
	
	</head>
	<body style="color: gray">
		<div class="row">
			<div class="col-6 offset-3 card text-center mt-5">
				<h2 class="text-center mt-3">${createsuccess}</h2>
				<br>
				 <button class=" btn btn-info mb-3 mx-5" type="button" 
				onclick="window.location.href='${pageContext.request.contextPath}/admin/showContests';"
				value="Show Contests"> Show Contests</button>
			</div>
		</div>

	</body>
</html>