<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Cat Registration</title>
<!-- Bootstrap style -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!--  my styles -->
<link rel="stylesheet" type="text/css" href="../styles/register.css">




<style>
.highlight {
	border: 10px solid gray;
}
</style>

</head>

<body>
	<header>
		<div class="bs-example">
			<nav class="navbar navbar-expand-md navbar-dark bg-dark">
				<a href="#" class="navbar-brand">Brand</a>
				<button type="button" class="navbar-toggler" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<div>Message goes here!!! ${msg }</div>

				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav">
						<a href="#" class="nav-item nav-link active">About Contest</a> <a
							href="#" class="nav-item nav-link">Contact Us</a> <a
							href="../index.html" class="nav-item nav-link">Home</a>
						<!-- for now, will be winners -->
					</div>
					<form class="form-inline ml-auto">
						<input type="text" class="form-control mr-sm-2"
							placeholder="Search">
						<button type="submit" class="btn btn-outline-light">Search</button>
					</form>
				</div>
			</nav>
		</div>
	</header>
	<div id="main-container" class="row">
		<div class="col-8 offset-2">
			<h2>Now we need some info about your kitty.</h2>
			<p>Tell us a little about your cat (in 150 characters or less) --
				age, breed, personality, favorite toy, whatever you care to share.
				Then upload your photo and we will add her/him to our gallery for
				the voting -- with your vote counted of course!</p>

			<!-- Contestant Registration Form  -->

			<div class="form_container">
				<h1>Your Cat's Information</h1>
				<form class="form" method="post" action="re" id="form" autocomplete="on">
					<div class="field_container">
						<img src="../images/black-cat-icon-18787.png" /> 
						<input type="text" name="catName" placeholder="Cat Name" required />
					</div>
					<div class="field_container">
						<img src="../images/photo.png" /> 
						<input type="file"	name="photoLink"  required />
					</div>
					<label>Tell us about your cat!</label>
					<div class="field_container2">
					
						<textarea name="catBlurb" rows=3 cols=80 maxlength=150 placeholder="Tell us more...">
						</textarea>
					</div>
					<div class="button_container">
						<input type="submit" value="Submit" />
					</div>
				</form>

			</div>
			<div id="feedback"></div>
		</div>
	</div>
	<!-- javascript jquery  -->
	<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	<script src="../scripts/regex.js"></script>

	<footer>Copyright 2019 Meg Parsons</footer>

</body>

</html>