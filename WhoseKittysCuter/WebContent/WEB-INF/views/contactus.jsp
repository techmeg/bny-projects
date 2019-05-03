<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Contact Us</title>
    <!-- Bootstrap style -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  
  	<!--  my styles -->
    <link rel="stylesheet" type="text/css" href="../styles/register.css">



</head>

<body>
    <header>
	<div class="bs-example">
	    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
	        <a href="#" class="navbar-brand">Brand</a>
	        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
	            <span class="navbar-toggler-icon"></span>
	        </button>
	
	        <div class="collapse navbar-collapse" id="navbarCollapse">
	            <div class="navbar-nav">
	                <a href="about.html" class="nav-item nav-link active">About Contest</a>
	                <a href="#" class="nav-item nav-link">All Winners</a>
	            </div>
			<form class="form-inline ml-auto">
				<a class="vote" href="/index.jsp" class="nav-item nav-link">Vote</a>
			</form>
	        </div>
	    </nav>
    </div>
    </header>
    <div id="main-container" class="row">
	    <div class="col-8 offset-2">
	        <h2>Got ideas for future contest themes? </h2>
	        <p> We'd like to hear them. Or really anything you'd like to tell us about our site. Please complete the form below and we'll be in touch.  Thanks!</p>
	        
	        <!-- Contestant Registration Form  -->
	        
	        <div class="form_container">
		        <h1>Contact Us</h1>
		            <form class="form" method="post" action="re" id="form">
		                <div class="field_container">
		                    <img src="../images/person.png" />
		                    <input type="text" id="firstname" name="firstname" placeholder="First Name" pattern="^[a-zA-Z_.-]*$[a-zA-Z_.-]*$"
		                        required />
		                </div>
		                <div class="field_container">
		                    <img src="../images/person.png" />
		                    <input type="text" id="lastname" name="lastname" placeholder="Last Name" pattern="^[a-zA-Z_.-]*$[a-zA-Z_.-]*$"
		                        required />
		                </div>
		                
		                <div class="field_container">
		                      <img src="../images/email-icon.png" />
		                    <input type="email" name="cEmail" id="email" value="" placeholder="Email" required />
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