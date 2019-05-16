<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<!-- -----------------------HOME PAGE-------------------------------------- -->

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

<link href="./styles/mainkitty.css" rel="stylesheet" type="text/css">


</head>

<body>
	<header>

		<!-- --------------------NAV BAR--------------------- -->

		<nav class="navbar navbar-expand-md navbar-dark bg-dark">
			<!-- 	<img class="logo" src="./images/saxophone-1287911__340.png"/> -->
			<button type="button" class="navbar-toggler" data-toggle="collapse"
				data-target="#navbarCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarCollapse">
				<div class="navbar-nav">
					<a href="/CaseStudy/about" class="nav-item nav-link ">About
						Contest</a> <a href="/CaseStudy/contactus" class="nav-item nav-link ">Contact
						Us</a> <a href="#" class="nav-item nav-link ">All Winners</a>

				</div>

			</div>
		</nav>

		<!-- ----------------------------INTRO COPY------------------------------- -->
	</header>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8 col-sm-6 mt-4 px-4 border-right">
				<h1>Whose Kitty's Cuter?</h1>
				<h2 style="color: red;">${noCurrentContest}</h2>
				<p class="p1">You decide. This week's contest?
					${currentContest.contestName } ${currentContest.contestBlurb }</p>

				<!--------------- Button (to Trigger Modal) FOR REGISTRATION --------------------------->

				<a href="#joinContest" class="btn btn-lg btn-info mb-3"
					data-toggle="modal">Join Contest</a>


				<h4 class="leader ml-5">Current Leader: ${leader}&nbsp;, Votes:
					${mostVotes}</h4>

				<!------------------------ MODAL Form to Register Cat & Owner ------------------>
				<div id="joinContest" class="modal fade">
					<div class="modal-dialog modal-lg">
						<div class="modal-content px-3 py-3">


							<div class="modal-body">
								<div>
									<h3 style="float: left;" class="modal-title text-info">Ready
										to join the Contest?</h3>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<br>
								</div>
								<p style="clear: both;">Register your info below to enter.
									You can only vote once per contest, so, only one cat can enter
									this time. You can enter your other pet next time.</p>

								<!----------- Form Start, Owner Info  --------->
								<form action="/CaseStudy/registrationsuccess" method="POST"
									enctype="multipart/form-data">
									<div class="form-group">
										<input type="text" name="name" class="form-control"
											id="inputName" placeholder="First Name" />

									</div>
									<div class="form-group">
										<input type="email" name="email" class="form-control"
											id="inputEmail" placeholder="Email" />
									</div>

									<!------------- Cat INFO ---------------------->

									<h5 class="text-info">Your Cat's Information</h5>
									<div class="form-group">
										<input type="text" name="cName" class="form-control"
											placeholder="Cat Name" />
									</div>
									<div class="form-group">
										<input type="file" name="file" class="form-control"
											placeholder="No file chosen" />
									</div>

									<div class="form-group">
										<label for="inputcBlurb" name="cBlurb"> Tell us about
											your cat!</label>
										<textarea class="form-control" name="cBlurb" rows="3"
											cols="80" maxlength="100"></textarea>
									</div>

									<button type="submit" class="btn btn-info">Register</button>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!-- end of Modal -->

				<!---------------------------- show entered cats in gallery ------------------------------>
				<div class="row ">

					<c:forEach items="${catList }" var="cat">

						<div class="col-lg-4 col-md-6 col-sm-12  img-group">

							<div class="img-item">
								<img class="pix" src="./images/${cat.photo}" />
							</div>

							<h5 class="mt-1">${cat.cName }</h5>
							<p class="blurb">${cat.blurb }</p>

							<div class="abs">
								<p class="votes">&nbsp;Votes:&nbsp;${cat.numVotes}</p>
	<!-- button onclick to vote is HERE -->
								<input type="button" name="pickme"
									onclick="window.location.href='${pageContext.request.contextPath}/voterRegistration/${cat.id }';"
									value="Pick Me!"></input>
							</div>
						</div>
					</c:forEach>

					<!----------------------------- Filler pictures  ---------------------------->

					<div class="col-lg-4 col-md-6 col-sm-12 img-group">
						<div class="img-item">
							<img class="pix" src="./images/sleep-zhan-zhang-1402682.jpg" />
						</div>

						<div class="abs">
							<p class="votes">${numVotes}Votes</p>
							<button class="pick-me">Pick Me</button>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 col-sm-12 img-group">
						<div class="img-item">
							<img class="pix" src='./images/sleep-ioana-tabarcea-1131016.jpg' />
						</div>
						<div class="abs">
							<p class="votes">${numVotes}Votes</p>
							<button class="pick-me">Pick Me</button>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 col-sm-12 img-group">
						<div class="img-item">
							<img class="pix" src='./images/sleep-jonathan-fink-294000.jpg' />
						</div>
						<div class="abs">
							<p class="votes">${numVotes}Votes</p>
							<button class="pick-me">Pick Me</button>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 col-sm-12 img-group">
						<div class="img-item">
							<img class="pix" src='./images/sleep-joop-vd-schaaf-1337213.jpg' />
						</div>
						<div class="abs">
							<p class="votes">${numVotes}Votes</p>
							<button class="pick-me">Pick Me</button>
						</div>
					</div>
				</div>
			</div>

			<!---------------------- beginning of side bar,  Next Contest Info ---------------------->


			<div class="col-md-4 col-sm-6 mt-4 px-4">
				<sidebar id="join-contest">
				<h2>Next week: ${nextContest.contestName }</h2>
				<h2 style="color: red;">${noNextContest}</h2>
				<p>${nextContest.contestBlurb }</p>
				<p>Join the contest! Post your kitty's picture in the gallery
					for others to admire. (And by kitty, we mean cats of any age --
					"kitty" just makes for a more euphonious tag line.)</p>

				<h4>
					Next Contest Starts:
					<fmt:formatDate value="${nextContest.deadline}"
						pattern="MM/dd/yyyy" />
				</h4>



				<!------------------- pictures of past contest winners ------------------------------->

				<div class="past-winners mt-4">
					<h3>Past Winners</h3>
					<p>Here are some very cute kitties from past contests. Enjoy!</p>
					<div class="winner ">
						<img class="winner"
							src="./images/myrnas-cat.jpg" />
					</div>
					<p class="caption mb-4">"Black Beauty" Winner</p>
					<div class="winner">
						<img class="winner"
							src="./images/face-martina-misar-tummeltshammer-103131-unsplash.jpg" />
					</div>
					<p class="caption mb-4">"What Big Teeth You Have" Winner</p>
					<div class="winner">
						<img class="winner" src="./images/home-cat-leaping.jpg" />
					</div>
					<p class="caption mb-4">"Watch Me Jump" Winner
				</div>
				</sidebar>
			</div>
		</div>

	</div>

	<footer>Copyright 2019 Meg Parsons </footer>

	

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