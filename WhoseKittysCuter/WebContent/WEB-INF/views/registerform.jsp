<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Register</title>
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
	                <a href="#" class="nav-item nav-link active">About Contest</a>
	                <a href="contactus.html" class="nav-item nav-link">Contact Us</a>
	                <a href="../../index.html" class="nav-item nav-link">Home</a><!-- for now, will be winners -->
	            </div>
	            <form class="form-inline ml-auto">
	                <input type="text" class="form-control mr-sm-2" placeholder="Search">
	                <button type="submit" class="btn btn-outline-light">Search</button>
	            </form>
	        </div>
	    </nav>
    </div>
    </header>
    <div id="main-container" class="row">
	    <div class="col-8 offset-2">
	        <h2>Got the cutest kitty ever?</h2>
	        <p> Register below with your name and email and upload a cat-tastic photo. Share your adorable animal with the world.</p>
	        
	        <!-- Contestant Registration Form  -->
	        
	        <div class="form_container">
		        <h1>Contest Registration</h1>
		            <form class="form" method="post" action="re" id="form">
		                <div class="field_container">
		                    <img src="../images/person.png" />
		                    <input type="text" id="firstname" name="cName" placeholder="Name" pattern="^[a-zA-Z_.-]*$[a-zA-Z_.-]*$"
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