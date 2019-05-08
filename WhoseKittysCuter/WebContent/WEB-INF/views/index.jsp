<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Whose Kitty's Cuter</title>
<!-- Bootstrap CSS file -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!-- whose kitty styles -->

<link href="./styles/mainkitty.css" rel="stylesheet">
</head>

<body>
	<header>

		<nav class="navbar navbar-expand-md navbar-dark bg-dark">
			<a href="#" class="navbar-brand">Brand</a>
			<button type="button" class="navbar-toggler" data-toggle="collapse"
				data-target="#navbarCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarCollapse">
				<div class="navbar-nav">
					<a href="/about.jsp" class="nav-item nav-link ">About Contest</a> <a
						href="/contactus.jsp" class="nav-item nav-link ">Contact	Us</a> 
					<a href="#"	class="nav-item nav-link ">All Winners</a>
					
				</div>

			</div>
		</nav>

	</header>
	<div class="container-fluid">
		<div class="row">
			<div class="col-8 mt-4 px-4 border-right">
				<h1>Whose Kitty's Cuter?</h1>
				<p>You decide. This week's contest? Sweet sleepers (awwww)! If
					you don't want to curl up and pet these purr-fect cats, well you
					just aren't cat-parent material. Choose the one you'd most like to
					snuggle up with."</p>
					
	<!-- show list of cats in gallery -->
				<div class="row ">

				<c:forEach items="${catList }" var="cat">
					
					<div class="col-4  img-group">
	
						<div class="pix" style="background-color: rosybrown;   
						background-position: center background-repeat: no-repeat; background-size: cover)">
							<img class="pix" style="object-fit: cover; width: 100%;" src="./images/${cat.photo}"/>
						</div>
						<h5 class="mt-1">${cat.name }</h5>
						<p class="blurb">${cat.blurb }</p>
						<p class="votes">${cat.numVotes}&nbsp;Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
				</c:forEach>

		
					<div class="col-4  img-group">
						<div class="pix" id="img-2"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4  img-group">
						<div class="pix" id="img-3"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4 img-group">
						<div class="pix" id="img-4"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4 img-group">
						<div class="pix" id="img-5"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4 img-group">
						<div class="pix" id="img-6"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4  img-group">
						<div class="pix" id="img-1"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
					<div class="col-4  img-group">
						<div class="pix" id="img-2"></div>
						<p class="votes">${numVotes}Votes</p>
						<button class="pick-me">Pick Me</button>
					</div>
				</div>
			</div>
<!-- beginning of sidebar -->


			<div class="col-4 mt-4 px-4">
				<sidebar id="join-contest">
				<h2>Next week: Fiercest Kitty Face!</h2>
				<p>Cats can make some pretty mean faces when they are upset. Got
					a snap of your kitty making the most of her ferocious feline
					features? Join the contest! Post your kitty's picture in the
					gallery for others to admire. (And by kitty, we mean cats of any
					age -- "kitty" just makes for a more euphonious tag line.)</p>
					<h4>Submission Deadline: ${deadline}</h4>

			<!-- Modal with Form to Register Cat Owner as Voter -->	

				<!-- Button HTML (to Trigger Modal) --> <a href="#joinContest"
					class="btn btn-lg btn-info" data-toggle="modal">Join Contest</a> <!-- Modal HTML -->
				<div id="joinContest" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title">Ready to join the Contest?</h5>
								<button type="button" class="close" data-dismiss="modal">&times;</button>
							</div>
							<div class="modal-body">
								<p>Register your info below to enter. You can only vote once
									per contest, so, only one cat can enter this time. You can
									enter your other pet next time.</p>
									
				<!----------- Form to Register  --------->					
								<form action="/CaseStudy/registrationsuccess" method="POST" enctype="multipart/form-data">
									<div class="form-group">
										<label for="inputName" name="name">Name</label>
										<input type="text" name="name" class="form-control"
											id="inputName" placeholder="First Name" />
									</div>
									<div class="form-group">
										<label for="inputEmail" name="email">Email</label> 
										<input type="email"
											name="email" class="form-control" id="inputEmail"
											placeholder="Email"/>
									</div>
				<!-- Cat INFO -->
									<h5>Your Cat's Information</h5>
									<div class="form-group">
										<label for="inputcName" name="cName">Cat Name</label>
										<input type="text" name="cName" class="form-control" 
											placeholder="Cat Name"  />
									</div>
									<div class="form-group">
										<input type="file"	name="file"  class="form-control" placeholder="No file chosen"/>
									</div>
										
									<div class="form-group">
										<label for="inputcBlurb" name="cBlurb">
										Tell us about your cat!</label>
										<textarea class="form-control" name="cBlurb" rows="3" cols="80" maxlength="150"></textarea>
									</div>
											
									<button type="submit" class="btn btn-primary">Register</button>
								</form>
							</div>
	
							<div class="modal-footer"></div>
						</div>
					</div>
				</div><!-- end of Model -->
				
				<div class="past-winners mt-4">
					<h3>Past Winners</h3>
					<p>Here are some very cute kitties from past contests. Enjoy!</p>
					<div class="winner1 "  ></div>
					<p class="caption mb-4">"Curious Kitty" Winner</p>
					<div class="winner2"></div>
					<p class="caption mb-4">"What Big Teeth You Have" Winner</p>
					<div class="winner3 "></div>
					<p class="caption mb-4">"Watch Me Jump" Winner
					
				</div>
				</sidebar>
			</div>
		</div>

	</div>

    <footer>Copyright 2019 Meg Parsons
    </footer>

	<!-- JS files: jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>


</html>